package nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: 服务提供方启动类
 *
 * @author songcx
 * @date 2020/10/19 14:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }
}
