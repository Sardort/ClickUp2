package org.example.clickup.model;

import jakarta.persistence.*;
import org.example.clickup.model.entity.TypeRole;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Space space_id;
    @OneToOne
    private Project project_id;
    @OneToOne
    private Category category_id;
    @Column(nullable = false)
    private String color;
    @Enumerated
    private TypeRole typeRole;

    public Status(Integer id, String name, Space space_id, Project project_id, Category category_id, String color, TypeRole typeRole) {
        this.id = id;
        this.name = name;
        this.space_id = space_id;
        this.project_id = project_id;
        this.category_id = category_id;
        this.color = color;
        this.typeRole = typeRole;
    }

    public Status() {
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

    public Space getSpace_id() {
        return space_id;
    }

    public void setSpace_id(Space space_id) {
        this.space_id = space_id;
    }

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TypeRole getTypeRole() {
        return typeRole;
    }

    public void setTypeRole(TypeRole typeRole) {
        this.typeRole = typeRole;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", space_id=" + space_id +
                ", project_id=" + project_id +
                ", category_id=" + category_id +
                ", color='" + color + '\'' +
                ", typeRole=" + typeRole +
                '}';
    }
}
