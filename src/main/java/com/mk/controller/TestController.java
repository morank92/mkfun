package com.mk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mk.JMS.Producer;
import com.mk.po.Student;
import com.mk.service.TestService;

@RestController
@RequestMapping("testt")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private Producer producer;
	
	@RequestMapping(value="getStudents",method=RequestMethod.GET)
	public List<Student> getStudents(){
		
		return testService.getStudents();
	}
	
	@RequestMapping(value="updateStudent",method=RequestMethod.POST)
	public Map<String,String> updateStudent(@RequestParam("id") int id){
		System.out.println("id------------------------->>>>>>>>>  "+id);
		return new HashMap<String, String>();
	}
	
	@RequestMapping(value="sendMessageMQ",method=RequestMethod.POST)
	public Map<String,String> sendMessageMQ(@RequestParam("msg") String msg){
		System.out.println("------------msg------------->>>>>>>>>  "+msg);
		
		//目的地址队列
		Destination dest = new ActiveMQQueue("mytest.queue");
		//由生产者发送
		producer.sendMessage(dest, msg);
		
		return new HashMap<String, String>();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
