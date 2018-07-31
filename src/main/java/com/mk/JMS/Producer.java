package com.mk.JMS;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;


//生产者
@Component
public class Producer {

	
	@Resource
	private JmsMessagingTemplate jmsm;
	
	public void sendMessage(Destination destination, String message){
			this.jmsm.convertAndSend(destination, message);
		
	}
	
	// 双向队列
	@JmsListener(destination="out.queue") 
	public void consumerMessage(String text){
		System.out.println("从out.queue队列收到的回复报文为:"+text);
	}










	
}
