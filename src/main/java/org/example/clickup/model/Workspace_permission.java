package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Workspace_permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Workspace_role workspace_role;
    @Column(nullable = false)
    private String permission;

    public Workspace_permission(Integer id, Workspace_role workspace_role, String permission) {
        this.id = id;
        this.workspace_role = workspace_role;
        this.permission = permission;
    }

    public Workspace_permission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Workspace_role getWorkspace_role() {
        return workspace_role;
    }

    public void setWorkspace_role(Workspace_role workspace_role) {
        this.workspace_role = workspace_role;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Workspace_permission{" +
                "id=" + id +
                ", workspace_role=" + workspace_role +
                ", permission='" + permission + '\'' +
                '}';
    }
}
