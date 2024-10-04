package com.practice.practicespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PracticeSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringBootApplication.class, args);
    }

}
