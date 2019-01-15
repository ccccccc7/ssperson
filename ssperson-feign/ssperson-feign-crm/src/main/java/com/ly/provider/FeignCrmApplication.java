package com.ly.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zyl
 */
@EnableFeignClients
@SpringBootApplication
public class FeignCrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignCrmApplication.class, args);
    }
}
