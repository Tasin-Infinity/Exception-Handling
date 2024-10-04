package com.practice.practicespringboot.controller;

import com.practice.practicespringboot.dto.UserRequest;
import com.practice.practicespringboot.entity.User;
import com.practice.practicespringboot.exception.UserFoundException;
import com.practice.practicespringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Validated UserRequest request) throws UserFoundException {
        return new ResponseEntity<>(userService.saveUser(request), HttpStatus.CREATED);
    }
}
