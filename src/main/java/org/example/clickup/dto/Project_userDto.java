package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Project_userDto {
    @Column(nullable = false)
    private String task_permission;

    public Project_userDto(String task_permission) {
        this.task_permission = task_permission;
    }

    public Project_userDto() {
    }

    public String getTask_permission() {
        return task_permission;
    }

    public void setTask_permission(String task_permission) {
        this.task_permission = task_permission;
    }

    @Override
    public String toString() {
        return "Project_userDto{" +
                "task_permission='" + task_permission + '\'' +
                '}';
    }
}