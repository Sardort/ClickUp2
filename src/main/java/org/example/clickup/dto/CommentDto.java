package org.example.clickup.dto;

import jakarta.persistence.Column;

public class CommentDto {
    @Column(nullable = false)
    private String name;

    public CommentDto(String name) {
        this.name = name;
    }

    public CommentDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "name='" + name + '\'' +
                '}';
    }
}