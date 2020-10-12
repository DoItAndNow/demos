package com.transactional.b.role.service;

import bean.po.TxRole;

/**
 * Description: 角色service
 *
 * @author songcx
 * @date 2020/10/10 11:08
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public interface RoleService {

    /**
     * Description: 新增角色
     * <>
     * @author songcx
     * @date 11:11 2020/10/10
     * @param role 1
     **/
    void addRole(TxRole role) throws Exception;
}
