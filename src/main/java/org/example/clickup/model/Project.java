package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Space space_id;
    @Column(nullable = false)
    private String access_type;
    @Column(nullable = false)
    private String archived;
    @Column(nullable = false)
    private String color;

    public Project(Integer id, String name, Space space_id, String access_type, String archived, String color) {
        this.id = id;
        this.name = name;
        this.space_id = space_id;
        this.access_type = access_type;
        this.archived = archived;
        this.color = color;
    }

    public Project() {
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
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", space_id=" + space_id +
                ", access_type='" + access_type + '\'' +
                ", archived='" + archived + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
