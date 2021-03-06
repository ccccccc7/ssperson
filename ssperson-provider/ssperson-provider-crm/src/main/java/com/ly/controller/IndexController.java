package com.ly.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RefreshScope
@RequestMapping(value = "")
@RestController
public class IndexController {

    @Value("${ssperson.version}")
    String version;

    @GetMapping("")
    public String helloWorld() {
        return "hello world from version:" + version;
    }
}
