package com.mk.netty;

import io.netty.channel.Channel;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class Constants {

	public static ConcurrentHashMap<String, List<Channel>> cmap = new ConcurrentHashMap<String, List<Channel>>();
	
	
}
