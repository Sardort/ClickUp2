package org.example.clickup.model;

import jakarta.persistence.*;
import org.example.clickup.model.entity.Task_permissionRole;

@Entity
public class Category_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Category category_id;
    @OneToOne
    private User user_id;
    @Column(nullable = false)
    private String task_permission;
    @Enumerated(EnumType.STRING)
    private Task_permissionRole task_permissionRole;

    public Category_user(Integer id, String name, Category category_id, User user_id, String task_permission, Task_permissionRole task_permissionRole) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.user_id = user_id;
        this.task_permission = task_permission;
        this.task_permissionRole = task_permissionRole;
    }

    public Category_user() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getTask_permission() {
        return task_permission;
    }

    public void setTask_permission(String task_permission) {
        this.task_permission = task_permission;
    }

    public Task_permissionRole getTask_permissionRole() {
        return task_permissionRole;
    }

    public void setTask_permissionRole(Task_permissionRole task_permissionRole) {
        this.task_permissionRole = task_permissionRole;
    }

    @Override
    public String toString() {
        return "Category_user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category_id=" + category_id +
                ", user_id=" + user_id +
                ", task_permission='" + task_permission + '\'' +
                ", task_permissionRole=" + task_permissionRole +
                '}';
    }
}
