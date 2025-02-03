package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Workspace_roleDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String extends_role;

    public Workspace_roleDto(String name, String extends_role) {
        this.name = name;
        this.extends_role = extends_role;
    }

    public Workspace_roleDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtends_role() {
        return extends_role;
    }

    public void setExtends_role(String extends_role) {
        this.extends_role = extends_role;
    }

    @Override
    public String toString() {
        return "Workspace_roleDto{" +
                "name='" + name + '\'' +
                ", extends_role='" + extends_role + '\'' +
                '}';
    }
}
