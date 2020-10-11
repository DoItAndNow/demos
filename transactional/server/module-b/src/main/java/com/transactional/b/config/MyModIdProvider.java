package com.transactional.b.config;

import com.codingapi.txlcn.common.util.id.ModIdProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description: 解决分布式多实例部署事务通知错乱问题
 *
 * @author songcx
 * @date 2020/10/11 16:58
 */
@Component
public class MyModIdProvider implements ModIdProvider {

    @Value("${eureka.instance.ip-address}")
    private String ip;

    @Value("${server.port}")
    private String port;

    @Override
    public String modId() {
        return ip + ":" + port;
    }
}
