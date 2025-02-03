package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Click_appsDto {
    @Column(nullable = false)
    private String name;

    public Click_appsDto(String name) {
        this.name = name;
    }

    public Click_appsDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Click_appsDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
