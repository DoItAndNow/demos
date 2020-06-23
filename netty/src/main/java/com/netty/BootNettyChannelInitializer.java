package com.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/6/23 14:05
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class BootNettyChannelInitializer<SocketChannel>  extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel channel) throws Exception {

        channel.pipeline().addLast("encoder", new StringEncoder());

        channel.pipeline().addLast("decoder", new StringDecoder());

        channel.pipeline().addLast(new BootNettyChannelInboundHandlerAdapter());

    }
}
