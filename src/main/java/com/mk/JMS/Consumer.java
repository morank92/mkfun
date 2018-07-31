package com.mk.JMS;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

//消费者
@Component
public class Consumer {
	
	@Resource
	private Producer producer;
	
	// 使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "mytest.queue")  
    @SendTo("out.queue") //实现双向队列
    public void receiveQueue(String text) {
        if(StringUtils.isNotBlank(text)){
            System.out.println("收到的报文为:"+text);  
            System.out.println("");
            text = "我是反馈的信息";
            producer.consumerMessage(text);
        }
    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
