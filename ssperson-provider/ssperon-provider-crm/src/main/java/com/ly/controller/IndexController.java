package com.ly.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RequestMapping(value = "")
@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @GetMapping("")
    public String helloWorld() {
        return "hello world from port:" + port;
    }
}
