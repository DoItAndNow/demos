package nacos.consumer.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import nacos.provider.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 服务消费controller
 *
 * @author songcx
 * @date 2020/10/19 17:05
 */

@RestController
@RequestMapping("/consumer/")
@Api
public class ConsumerController {


    @Reference
    private TestService testService;

    @GetMapping("user")
    public String getUser(){
        return testService.test();
    }
}
