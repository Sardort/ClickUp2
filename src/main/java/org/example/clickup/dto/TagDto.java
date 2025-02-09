package org.example.clickup.dto;

import jakarta.persistence.Column;

public class TagDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;

    public TagDto(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public TagDto() {
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

    @Override
    public String toString() {
        return "TagDto{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
