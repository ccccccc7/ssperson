package com.ly.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyl
 */
@Configuration
@MapperScan("com.ly.mapper.*")
public class MybatisPlusConfig {

}
