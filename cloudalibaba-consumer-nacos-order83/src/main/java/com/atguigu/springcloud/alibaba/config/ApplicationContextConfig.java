package com.atguigu.springcloud.alibaba.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author wsk
 * @date 2020/3/23 11:07
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced   //RestTemplate结合Ribbon做负载均衡一定要加@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}