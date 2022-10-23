package com.company.springsecurity.security;

public enum ApplicationUserPermission {
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write"),
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write");
    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
