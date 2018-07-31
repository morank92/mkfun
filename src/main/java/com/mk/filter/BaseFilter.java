package com.mk.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class BaseFilter implements HandlerInterceptor {
	
	private static final Logger log = LoggerFactory.getLogger(BaseFilter.class);
	
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handler) throws Exception {
		log.info("------------------开始拦截-------------------");
		
		
		return true;
	}
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object handler, Exception exception)
			throws Exception {
		log.info("------------------结束拦截-------------------");

	}

	public void postHandle(HttpServletRequest req, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		log.info("------------------??拦截-------------------");

	}

	

}
