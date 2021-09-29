package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description
 * @Author lao
 * @Date 2021/9/26 13:42
 */
@Configuration
@MapperScan("com.example.mall.mbg.mapper")
public class MyBatisConfig {
}
