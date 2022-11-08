package com.company.springsecurity.domain.dto;

import lombok.Data;

@Data
public class AddRoleToUserDTO {
    private String username;
    private String roleName;
}
