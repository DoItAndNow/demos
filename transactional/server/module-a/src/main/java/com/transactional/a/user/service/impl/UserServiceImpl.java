package com.transactional.a.user.service.impl;

import bean.po.TxUser;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.transactional.a.feign.RoleClient;
import com.transactional.a.user.mapper.UserMapper;
import com.transactional.a.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description: 用户service实现类
 *
 * @author songcx
 * @date 2020/10/9 17:06
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    private RoleClient roleClient;

    /**
     * Description:新增用户
     * <>
     * @author songcx
     * @date 17:07 2020/10/9
     * @param user 1
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    @LcnTransaction
    public void addUser(TxUser user) throws Exception {
        roleClient.addRole();
        userMapper.addUser(user);
    }

}
