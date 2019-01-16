package com.ly.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * the config server.
 * @author zyl
 */
@EnableConfigServer
@SpringBootApplication
public class SspersonConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SspersonConfigServerApplication.class, args);
    }
}
