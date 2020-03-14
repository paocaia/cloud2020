package com.atguigu.springcloud.lb;
import org.springframework.cloud.client.ServiceInstance;
import java.util.List;

/**
 * 模拟 ILoadBalancer 的接口，选择哪一个负载算法和机器
 * @author wsk
 * @date 2020/3/13 17:11
 */
public interface LoadBalancer {
    //获取eureka上的活着的机器总数
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);

}
