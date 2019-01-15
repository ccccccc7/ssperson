package com.ly.provider.controller;

import com.ly.provider.model.UserDTO;
import com.ly.provider.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public UserDTO selectById(@PathVariable Long id) {
        return userFeignClient.selectById(id);
    }
}
