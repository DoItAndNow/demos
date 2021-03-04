package com.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/12/23 15:33
 */

public class Test {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup accept = new EpollEventLoopGroup(1);
        EventLoopGroup dealWith = new EpollEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                .group(accept,dealWith)
                .handler(new LoggingHandler(LogLevel.INFO))
                .channel(EpollServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline p = ch.pipeline();
                        p.addLast(new LoggingHandler(LogLevel.INFO));
                    }
                });

        ChannelFuture f = serverBootstrap.bind(8013).sync();
        f.channel().closeFuture().sync();
        accept.shutdownGracefully();
        dealWith.shutdownGracefully();
    }
}
