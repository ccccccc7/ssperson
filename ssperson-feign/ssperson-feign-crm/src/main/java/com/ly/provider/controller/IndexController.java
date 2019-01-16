package com.ly.provider.controller;

import com.ly.provider.service.IndexFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private IndexFeignClient indexFeignClient;

    @GetMapping("/helloworld")
    public String index() {
        return indexFeignClient.helloWorld();
    }
}
