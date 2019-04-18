package com.ly.provider.service;

import com.ly.provider.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * the crm user query interface.
 *
 * @FeignClient value 为服务模块名字.
 *
 * @author zyl
 */
@FeignClient(value = "ssperson-provider-crm")
@Component
public interface UserFeignClient {

    /**
     * select By id.
     * @param id    the user id
     *
     * @return  user data
     */
    @GetMapping("/api/users/{id}")
    UserDTO selectById(@PathVariable("id") Long id);
}
