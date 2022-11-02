package com.company.springsecurity.service;

import com.company.springsecurity.domain.Role;
import com.company.springsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getAllUser();
}
