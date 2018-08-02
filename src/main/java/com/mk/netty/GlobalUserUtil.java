package com.mk.netty;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class GlobalUserUtil {
	//保存全局的  连接上服务器的客户
    public static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    
    //保存用户对应的聊天用户
    public static ConcurrentHashMap<String, List<Channel>> cmap = new ConcurrentHashMap<String, List<Channel>>();
}
