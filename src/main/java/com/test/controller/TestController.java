package com.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuwei
 * @description
 * @since 2018/8/6 10:16
 */
@RestController
@RequestMapping("/test")
@Api(value = "test", tags = "test")
public class TestController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello", notes = "say hello")
    public String hello() {
        return "Hello World!";
    }
}
