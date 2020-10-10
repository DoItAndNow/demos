package com.transactional.b.role.service.impl;

import bean.po.TxRole;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.transactional.b.role.mapper.RoleMapper;
import com.transactional.b.role.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description: 角色service实现类
 *
 * @author songcx
 * @date 2020/10/10 11:09
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

@Service
@AllArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private RoleMapper roleMapper;

    /**
     * Description:新增角色
     * <>
     * @author songcx
     * @date 11:14 2020/10/10
     * @param role 1
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    @TxcTransaction
    public void addRole(TxRole role) {
        roleMapper.addRole(role);
    }
}
