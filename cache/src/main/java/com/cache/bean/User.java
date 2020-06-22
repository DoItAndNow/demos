package com.cache.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/10/26 21:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private static final long serialVersionUID = 8822818790694831649L;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
