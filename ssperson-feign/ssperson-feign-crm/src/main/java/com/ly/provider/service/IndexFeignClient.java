package com.ly.provider.service;

import com.ly.provider.service.hystrix.IndexFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zyl
 */
@FeignClient(value = "provider-crm", fallback = IndexFeignHystrix.class)
public interface IndexFeignClient {

    @GetMapping("/")
    String helloWorld();
}
