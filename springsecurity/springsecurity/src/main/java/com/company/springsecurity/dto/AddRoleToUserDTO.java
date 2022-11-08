package com.company.springsecurity.dto;

import lombok.Data;

@Data
public class AddRoleToUserDTO {
    private String username;
    private String roleName;
}
