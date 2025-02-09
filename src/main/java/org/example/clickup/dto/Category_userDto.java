package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Category_userDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String task_permission;

    public Category_userDto(String name, String task_permission) {
        this.name = name;
        this.task_permission = task_permission;
    }

    public Category_userDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTask_permission() {
        return task_permission;
    }

    public void setTask_permission(String task_permission) {
        this.task_permission = task_permission;
    }

    @Override
    public String toString() {
        return "Category_userDto{" +
                "name='" + name + '\'' +
                ", task_permission='" + task_permission + '\'' +
                '}';
    }
}
