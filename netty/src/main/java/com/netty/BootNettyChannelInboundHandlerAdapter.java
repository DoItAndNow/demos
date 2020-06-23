package com.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/6/23 14:07
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class BootNettyChannelInboundHandlerAdapter extends ChannelInboundHandlerAdapter {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception, IOException
    {
        System.out.println("channelRead:read msg:"+msg.toString());
        System.out.println(msg);
        System.out.println(msg.toString().length());
        ctx.writeAndFlush("接收成功" + new Date().toString() + "\r\n");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws IOException
    {
        System.out.println("channelReadComplete");
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws IOException
    {
        System.out.println("exceptionCaught");
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception, IOException
    {
        super.channelActive(ctx);
        ctx.channel().read();
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        System.out.println("channelActive:"+clientIp+ctx.name());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception, IOException
    {
        super.channelInactive(ctx);
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        ctx.close();
        System.out.println("channelInactive:"+clientIp);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception, IOException
    {
        super.userEventTriggered(ctx, evt);
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        ctx.close();
        System.out.println("userEventTriggered:"+clientIp);
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channelRegistered");
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channelUnregistered");
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channelWritabilityChanged");
    }

}
