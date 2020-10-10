package com.transactional.a.user.controller;

import bean.po.TxUser;
import com.transactional.a.user.service.UserService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 用户controller
 *
 * @author songcx
 * @date 2020/10/9 16:56
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@Api
@RequestMapping("/user/")
@Slf4j
@AllArgsConstructor
@RestController
public class UserController {

    private UserService userService;

    /**
     * Description:新增用户
     * <>
     * @author songcx
     * @date 17:28 2020/10/9
     **/
    @GetMapping("addUser")
    public void addUser(){
        userService.addUser(TxUser.builder().id(123L).username("test").password("password123").build());
    }
}
