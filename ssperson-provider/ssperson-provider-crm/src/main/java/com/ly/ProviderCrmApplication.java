package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyl
 */
@SpringBootApplication
public class ProviderCrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderCrmApplication.class, args);
    }
}
