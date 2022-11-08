package com.company.springsecurity;


import com.company.springsecurity.domain.Role;
import com.company.springsecurity.domain.User;
import com.company.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;


@SpringBootApplication
public class SpringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ADMIN"));
//            userService.saveRole(new Role(null,"USER"));
//            userService.saveUser(new User(null, "Ramiz Osmanov", "ramiz", "ramiz@gmail.com", "12345", new ArrayList<>()));
//            userService.saveUser(new User(null, "Alisa Aslanova", "alisa", "alisa@gmail.com", "12345", new ArrayList<>()));
//            userService.addRoleToUser("ramiz", "ADMIN");
//            userService.addRoleToUser("alisa", "USER");
//        };
//    }


}
