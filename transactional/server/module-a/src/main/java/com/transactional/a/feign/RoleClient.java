package com.transactional.a.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/10/10 11:17
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@FeignClient(name = "server-b")
public interface RoleClient {

    /**
     * Description:新增角色
     * <>
     * @author songcx
     * @date 11:19 2020/10/10
     **/
    @GetMapping("role/addRole")
    void addRole();
}
