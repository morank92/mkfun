package com.mk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    public String hello() {
        return "hello world~~; springboot!!";
    }
}
