package com.cache.moudle.user.controller;

import com.cache.bean.User;
import com.cache.moudle.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/12/1 21:19
 */
@RequestMapping("/user/")
@Slf4j
@RestController
@Api("用户")
@AllArgsConstructor
public class UserController {

    /**
     * 用户service
     */
    private UserService userService;

    /**
     * Description:根据用户id查询用户
     * @author songcx
     * @date 14:30 2020/2/27
     * @param id 1
     * @return java.util.List<com.cache.bean.User>
     **/
    @ApiOperation(value = "根据用户id查询用户", notes = "根据用户id查询用户")
    @GetMapping("queryUser")
    @ApiImplicitParam(name = "id",value = "主键",paramType = "query",dataType = "String",required = true)
    public List<User> querUserById(String id){

        List<User> userList = userService.queryUserById(id);
        return userList;
    }
}
