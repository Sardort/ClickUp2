package org.example.clickup.dto;

import jakarta.persistence.Column;

public class PriorityDto {
    @Column(nullable = false)
    private String name;

    public PriorityDto(String name) {
        this.name = name;
    }

    public PriorityDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PriorityDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
