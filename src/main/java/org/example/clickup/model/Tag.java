package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @OneToOne
    private Workspace workspace_id;

    public Tag(Integer id, String name, String color, Workspace workspace_id) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.workspace_id = workspace_id;
    }

    public Tag() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Workspace getWorkspace_id() {
        return workspace_id;
    }

    public void setWorkspace_id(Workspace workspace_id) {
        this.workspace_id = workspace_id;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", workspace_id=" + workspace_id +
                '}';
    }
}
