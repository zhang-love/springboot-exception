package com.zl.springbootexception.controller;

import com.zl.springbootexception.exception.UserNotExistException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 14:01
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        throw new UserNotExistException();
    }
}
