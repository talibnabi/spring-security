package com.company.springsecurity.service;

import com.company.springsecurity.domain.Role;
import com.company.springsecurity.domain.User;
import com.company.springsecurity.repository.RoleRepo;
import com.company.springsecurity.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;


    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        Role role = roleRepo.findByName(roleName);
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}
