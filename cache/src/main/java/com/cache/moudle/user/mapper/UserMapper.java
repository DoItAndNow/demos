package com.cache.moudle.user.mapper;

import com.cache.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/12/1 21:19
 */
@Repository
public interface UserMapper {

    /**
     * Description:根据用户id查询用户
     * @author songcx
     * @date 14:32 2020/2/27
     * @param id 1
     * @return java.util.List<com.cache.bean.User>
     **/
    List<User> queryUserById(String id);

}
