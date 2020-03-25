package com.atguigu.springcloud.alibaba.handler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
/**
 * @author wsk
 * @date 2020/3/24 22:04
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----2");
    }
}