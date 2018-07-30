package com.mk.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication // Spring Boot项目的核心注解，主要目的是开启自动配置
@ComponentScan(basePackages={"com.mk"})
@MapperScan("com.mk.dao")//将项目中对应的mapper类的路径加进来就可以了
public class SpringbootApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}

}
