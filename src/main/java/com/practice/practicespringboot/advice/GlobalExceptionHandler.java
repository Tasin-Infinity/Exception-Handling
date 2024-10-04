package com.practice.practicespringboot.advice;

import com.practice.practicespringboot.exception.UserFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(UserFoundException.class)
    public Map<String, String> handleGlobalException(UserFoundException ex){
        Map<String, String> error = new HashMap<>();
        error.put("message",ex.getMessage());
        return error;
    }
}
