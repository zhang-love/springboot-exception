package com.zl.springbootexception.exception.hanler;

import com.zl.springbootexception.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 14:10
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    @ResponseBody
    public Map<String,Object> handlerUserNotExistException(UserNotExistException exception){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",exception.getId());
        map.put("message",exception.getMessage());
        return map;
    }
}
