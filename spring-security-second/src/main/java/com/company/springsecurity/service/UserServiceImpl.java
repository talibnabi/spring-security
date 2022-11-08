package com.company.springsecurity.service;

import com.company.springsecurity.domain.Role;
import com.company.springsecurity.domain.User;
import com.company.springsecurity.repository.RoleRepository;
import com.company.springsecurity.repository.UserRepository;
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
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Save user {} ", user);
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Save role {} ", role);
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Add role {} to user {} ", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Get user {} ", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAllUser() {
        log.info("Get all user ");
        return userRepository.findAll();
    }
}
