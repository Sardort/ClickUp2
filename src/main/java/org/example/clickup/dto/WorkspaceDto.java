package org.example.clickup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import org.example.clickup.model.User;

public class WorkspaceDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String initial_letter;
    @Column(nullable = false)
    private String avatar_id;

    public WorkspaceDto(String name, String color, String initial_letter, String avatar_id) {
        this.name = name;
        this.color = color;
        this.initial_letter = initial_letter;
        this.avatar_id = avatar_id;
    }

    public WorkspaceDto() {
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
        return "WorkspaceDto{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", avatar_id='" + avatar_id + '\'' +
                '}';
    }
}
