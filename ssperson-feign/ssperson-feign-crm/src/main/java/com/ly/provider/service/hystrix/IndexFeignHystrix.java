package com.ly.provider.service.hystrix;

import com.ly.provider.service.IndexFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author zyl
 */
@Component
public class IndexFeignHystrix implements IndexFeignClient {
    @Override
    public String helloWorld() {
        return "sorry,hello world(hystrix)";
    }
}
