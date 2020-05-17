package com.cache.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/10/26 21:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
