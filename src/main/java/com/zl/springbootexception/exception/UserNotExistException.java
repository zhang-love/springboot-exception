package com.zl.springbootexception.exception;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 14:12
 */
public class UserNotExistException extends RuntimeException{
    private String id;
    public UserNotExistException(){
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
