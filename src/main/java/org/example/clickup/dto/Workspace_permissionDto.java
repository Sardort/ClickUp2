package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Workspace_permissionDto {
    @Column(nullable = false)
    private String permission;

    public Workspace_permissionDto(String permission) {
        this.permission = permission;
    }

    public Workspace_permissionDto() {
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Workspace_permissionDto{" +
                "permission='" + permission + '\'' +
                '}';
    }
}
