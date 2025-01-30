package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @OneToOne
    private User owner_id;
    @Column(nullable = false)
    private String initial_letter;
    @Column(nullable = false)
    private String avatar_id;

    public Workspace(Integer id, String name, String color, User owner_id, String initial_letter, String avatar_id) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.owner_id = owner_id;
        this.initial_letter = initial_letter;
        this.avatar_id = avatar_id;
    }

    public Workspace() {
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

    public User getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(User owner_id) {
        this.owner_id = owner_id;
    }

    public String getInitial_letter() {
        return initial_letter;
    }

    public void setInitial_letter(String initial_letter) {
        this.initial_letter = initial_letter;
    }

    public String getAvatar_id() {
        return avatar_id;
    }

    public void setAvatar_id(String avatar_id) {
        this.avatar_id = avatar_id;
    }

    @Override
    public String toString() {
        return "Workspace{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", owner_id=" + owner_id +
                ", initial_letter='" + initial_letter + '\'' +
                ", avatar_id='" + avatar_id + '\'' +
                '}';
    }
}
