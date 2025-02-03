package org.example.clickup.dto;

import jakarta.persistence.Column;

public class SpaceDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String initial_letter;
    @Column(nullable = false)
    private String access_type;

    public SpaceDto(String name, String color, String initial_letter, String access_type) {
        this.name = name;
        this.color = color;
        this.initial_letter = initial_letter;
        this.access_type = access_type;
    }

    public SpaceDto() {
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

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    @Override
    public String toString() {
        return "SpaceDto{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", access_type='" + access_type + '\'' +
                '}';
    }
}
