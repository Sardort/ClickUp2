package org.example.clickup.dto;

import jakarta.persistence.Column;

public class CategoryDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String access_type;
    @Column(nullable = false)
    private String archived;
    @Column(nullable = false)
    private String color;

    public CategoryDto(String name, String access_type, String archived, String color) {
        this.name = name;
        this.access_type = access_type;
        this.archived = archived;
        this.color = color;
    }

    public CategoryDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "CategoryDto{" +
                "name='" + name + '\'' +
                ", access_type='" + access_type + '\'' +
                ", archived='" + archived + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
