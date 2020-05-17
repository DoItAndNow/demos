package com.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: 这是缓存模块的demo
 *
 * @author songcx
 * @date 2019/12/1 20:36
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.cache"})
@MapperScan({"com.cache.moudle.*.mapper"})
@EnableCaching
public class CacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class,args);
    }
}
