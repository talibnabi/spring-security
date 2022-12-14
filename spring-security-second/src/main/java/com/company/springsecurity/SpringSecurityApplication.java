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
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(UserService userService) {
//        return args -> {
//
//            userService.saveRole(new Role(null, "USER_MARKET"));
//
//
//
//            userService.saveUser(new User(null,"Nasimi Hashimov","nasimi","nasimi@gmail.com","12345",new ArrayList<>()));
//            userService.saveUser(new User(null,"Namiq Nazarov","namiq","namiq@gmail.com","12345",new ArrayList<>()));
//
//            userService.addRoleToUser("nasimi","USER_MARKET");
//            userService.addRoleToUser("tural","USER_MARKET");
//        };
//    }
}

