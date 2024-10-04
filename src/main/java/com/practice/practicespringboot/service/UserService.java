package com.practice.practicespringboot.service;

import com.practice.practicespringboot.dto.UserRequest;
import com.practice.practicespringboot.entity.User;
import com.practice.practicespringboot.exception.UserFoundException;
import com.practice.practicespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest) throws UserFoundException {
        User user= User.
                build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                        userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());

        User user1 = repository.findByName(userRequest.getName());

        if(user1 == null){
            return repository.save(user);
        } else {
            throw new UserFoundException("User " + userRequest.getName()+ " already exist");
        }
    }
}
