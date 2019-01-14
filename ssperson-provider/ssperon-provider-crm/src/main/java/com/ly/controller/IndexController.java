package com.ly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RequestMapping(value = "")
@RestController
public class IndexController {

    @GetMapping("")
    public String helloWorld() {
        return "hello world";
    }
}
