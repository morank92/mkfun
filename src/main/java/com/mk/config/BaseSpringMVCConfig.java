package com.mk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mk.filter.BaseFilter;


//注册自定义配置类
@SpringBootConfiguration
public class BaseSpringMVCConfig extends WebMvcConfigurerAdapter{
	
	@Autowired
	private BaseFilter baseFilter;
	
	
	//自定义拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(baseFilter).addPathPatterns("/**");
	}
	
	
	
	
}
