package com.atguigu.springcloud.lb;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Ribbon 手写轮询算法
 * @author wsk
 * @date 2020/3/13 17:16
 */
@Component
public class MyLB implements LoadBalancer {
    //原子类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            //超过最大值，为0，重新计数 2147483647 Integer.MAX_VALUE，不直接写方法是因为方法运行时每次都会创建一个栈区，而写死就不会，涉及Jvm调优
            next = current >= 2147483647 ? 0 : current + 1;
            //自旋锁
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next："+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstance) {
        int index = getAndIncrement() % serviceInstance.size();
        return serviceInstance.get(index);
    }
}