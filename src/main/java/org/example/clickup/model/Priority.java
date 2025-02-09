package org.example.clickup.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToMany
    private List<Icon> icon_id;

    public Priority(Integer id, String name, List<Icon> icon_id) {
        this.id = id;
        this.name = name;
        this.icon_id = icon_id;
    }

    public Priority() {
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

    public List<Icon> getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(List<Icon> icon_id) {
        this.icon_id = icon_id;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon_id=" + icon_id +
                '}';
    }
}
