package nacos.provider.service.impl;

import nacos.provider.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2021/3/4 15:18
 */

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "你可以的！！！";
    }
}
