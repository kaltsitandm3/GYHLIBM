package com.lyx.bookmanager.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

public class GloableExceptionHandler {

    /**
     * 全局异常处理方法
     * @param ex
     * @return
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public String exceptionHandler(SQLIntegrityConstraintViolationException ex){
        ex.getMessage();

        if (ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            String msg = split[2] + "已被占用";

            return msg;
        }

        return "未知错误";
    }

}
