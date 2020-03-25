package com.atguigu.springcloud.alibaba;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * @author wsk
 * @date 2020/3/25 22:03
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@AllArgsConstructor
@NoArgsConstructor
public class SeataAccountMainApp2003 {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMainApp2003.class,args);
    }
}