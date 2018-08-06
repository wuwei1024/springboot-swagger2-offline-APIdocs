package com.test.controller;

import com.test.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuwei
 * @since 2018/8/6 14:16
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户", tags = "用户")
public class UserController {

    @GetMapping("/findUser")
    @ApiOperation(value = "查询用信息", notes = "查询用户信息")
    public User findUser(@RequestParam("name") String name) {
        return new User(1, name, 30, "浙江省杭州市西湖区曙光路999号");
    }
}
