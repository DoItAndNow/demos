package com.transactional.b;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: 模块B启动类
 *
 * @author songcx
 * @date 2020/9/29 15:19
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication( scanBasePackages = {"com.transactional.b"})
@EnableFeignClients(basePackages = "com.transactional.b")
@MapperScan({"com.transactional.b.*.module.*.mapper"})
@EnableDistributedTransaction
public class ApplicationB {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationB.class,args);
    }
}

