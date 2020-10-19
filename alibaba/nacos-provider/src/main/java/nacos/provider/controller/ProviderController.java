package nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 服务提供controller
 *
 * @author songcx
 * @date 2020/10/19 16:50
 */
@RestController
@RequestMapping("/provider/")
@RefreshScope
public class ProviderController {

    @Value("${user.name}")
    private String username;

    @GetMapping("username")
    public String getUsername(){
        return username;
    }
}
