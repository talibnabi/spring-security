package com.company.springsecurity.api;

import com.company.springsecurity.domain.Role;
import com.company.springsecurity.domain.User;
import com.company.springsecurity.domain.dto.AddRoleToUserDTO;
import com.company.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserResource {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/saveUser").toUriString());
        //return ResponseEntity.created(uri).body(userService.saveUser(user));
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @PostMapping("/saveRole")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/saveRole").toUriString());
        //return ResponseEntity.created(uri).body(userService.saveRole(role));
        return ResponseEntity.ok().body(userService.saveRole(role));
    }

    @PostMapping("/addToUser")
    public ResponseEntity<?> addRoleToUser(@RequestBody AddRoleToUserDTO roleToUser) {
        userService.addRoleToUser(roleToUser.getUsername(), roleToUser.getRoleName());
        return ResponseEntity.ok().build();
    }


}
