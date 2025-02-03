package org.example.clickup.dto;

import jakarta.persistence.Column;

public class ViewDto {
    @Column(nullable = false)
    private String name;

    public ViewDto(String name) {
        this.name = name;
    }

    public ViewDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ViewDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
