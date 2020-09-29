package com.transactional.c;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: 模块C启动类
 *
 * @author songcx
 * @date 2020/9/29 15:20
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication( scanBasePackages = {"com.transactional.c"})
@EnableFeignClients(basePackages = "com.transactional.c")
@MapperScan({"com.transactional.c.*.module.*.mapper"})
@EnableDistributedTransaction
public class ApplicationC {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationC.class,args);
    }
}
