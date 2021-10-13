package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.example.mall.mbg.mapper", "com.example.mall.dao"})
public class MyBatisConfig {
}
