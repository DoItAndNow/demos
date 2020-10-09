/*
 * www.abb.com.cn
 * Copyright (c) 2019. All Rights Reserved.
 */
package com.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * RegisterApplication
 *
 * @author wupanhua
 * @date 2019-03-28
 */
@SpringBootApplication(scanBasePackages = "com.register")
@EnableEurekaServer
public class YkRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(YkRegisterApplication.class, args);
    }

}
