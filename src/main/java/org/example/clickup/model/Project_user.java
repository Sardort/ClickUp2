package org.example.clickup.model;

import jakarta.persistence.*;
import org.example.clickup.model.entity.Task_permissionRole;

@Entity
public class Project_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Project project_id;
    @OneToOne
    private User user_id;
    @Column(nullable = false)
    private String task_permission;
    @Enumerated
    private Task_permissionRole task_permissionRole;

    public Project_user(Integer id, Project project_id, User user_id, String task_permission, Task_permissionRole task_permissionRole) {
        this.id = id;
        this.project_id = project_id;
        this.user_id = user_id;
        this.task_permission = task_permission;
        this.task_permissionRole = task_permissionRole;
    }

    public Project_user() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
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
        return "Project_user{" +
                "id=" + id +
                ", project_id=" + project_id +
                ", user_id=" + user_id +
                ", task_permission='" + task_permission + '\'' +
                ", task_permissionRole=" + task_permissionRole +
                '}';
    }
}
