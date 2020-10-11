package com.transactional.a.user.service;

import bean.po.TxUser;

/**
 * Description: 用户service
 *
 * @author songcx
 * @date 2020/10/9 16:58
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public interface UserService {

    /**
     * Description:新增用户
     * <>
     * @author songcx
     * @date 17:02 2020/10/9
     * @param user 1
     **/
    void addUser(TxUser user) throws Exception;
}
