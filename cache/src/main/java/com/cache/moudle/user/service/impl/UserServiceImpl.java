package com.cache.moudle.user.service.impl;

import com.cache.bean.User;
import com.cache.moudle.user.mapper.UserMapper;
import com.cache.moudle.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/12/1 21:23
 */
@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    /**
     * 用户mapper
     */
    private UserMapper userMapper;

    /**
     * Description:查询所有用户
     * @author songcx
     * @date 21:24 2019/12/1
     * @return java.util.List<com.cache.bean.User>
     **/
    @Override
    @Cacheable(cacheNames = "user")
    public List<User> queryUserById(String id) {
        log.info(id);
        return userMapper.queryUserById(id);
    }
}
