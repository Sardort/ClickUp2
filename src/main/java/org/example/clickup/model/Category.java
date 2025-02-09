package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Project project_id;
    @Column(nullable = false)
    private String access_type;
    @Column(nullable = false)
    private String archived;
    @Column(nullable = false)
    private String color;

    public Category(Integer id, String name, Project project_id, String access_type, String archived, String color) {
        this.id = id;
        this.name = name;
        this.project_id = project_id;
        this.access_type = access_type;
        this.archived = archived;
        this.color = color;
    }

    public Category() {
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

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project_id=" + project_id +
                ", access_type='" + access_type + '\'' +
                ", archived='" + archived + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
