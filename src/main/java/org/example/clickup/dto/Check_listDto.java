package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Check_listDto {
    @Column(nullable = false)
    private String name;

    public Check_listDto(String name) {
        this.name = name;
    }

    public Check_listDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Check_listDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
