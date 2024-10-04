package com.practice.practicespringboot.repository;

import com.practice.practicespringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    User findByName(String name);
}
