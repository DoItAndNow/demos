package com.transactional.b.role.controller;

import bean.po.TxRole;
import com.transactional.b.role.service.RoleService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 角色controller
 *
 * @author songcx
 * @date 2020/10/10 11:06
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@Api
@AllArgsConstructor
@RestController
@RequestMapping("/role/")
@Slf4j
public class RoleController {

    private RoleService roleService;

    @GetMapping("addRole")
    public void addRole() throws Exception {
        roleService.addRole(TxRole.builder().id(1234L).description("miaoshu").name("juese").build());
    }
}
