package com.atguigu.springcloud.alibaba;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author wsk
 * @date 2020/3/24 13:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class,args);
    }
}