package nacos.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: 调用服务client
 *
 * @author songcx
 * @date 2020/10/19 17:10
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("provider/username")
    String getUserName();
}
