package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Workspace_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Workspace workspace_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String extends_role;

    public Workspace_role(Integer id, Workspace workspace_id, String name, String extends_role) {
        this.id = id;
        this.workspace_id = workspace_id;
        this.name = name;
        this.extends_role = extends_role;
    }

    public Workspace_role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Workspace getWorkspace_id() {
        return workspace_id;
    }

    public void setWorkspace_id(Workspace workspace_id) {
        this.workspace_id = workspace_id;
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
        return "Workspace_role{" +
                "id=" + id +
                ", workspace_id=" + workspace_id +
                ", name='" + name + '\'' +
                ", extends_role='" + extends_role + '\'' +
                '}';
    }
}
