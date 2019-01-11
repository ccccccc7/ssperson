package com.ly.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * the class eureka application
 * @author zyl
 */
@SpringBootApplication
@EnableEurekaServer
public class SspersonEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SspersonEurekaApplication.class, args);
    }
}
