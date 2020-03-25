package com.atguigu.springcloud.service;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author wsk
 * @date 2020/3/25 9:06
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，------------PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
