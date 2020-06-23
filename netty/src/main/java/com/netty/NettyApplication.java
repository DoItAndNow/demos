package com.netty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/6/23 11:41
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.netty"})
public class NettyApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(NettyApplication.class,args);
    }


    @Override
    public void run(String... args) throws Exception {
        new NettyServer().bind(8030);
    }
}
