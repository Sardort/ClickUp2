package org.example.clickup.dto;

import jakarta.persistence.Column;

public class IconDto {
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String initial_letter;
    @Column(nullable = false)
    private String icon;

    public IconDto(String color, String initialLetter, String icon) {
        this.color = color;
        this.initial_letter = initialLetter;
        this.icon = icon;
    }

    public IconDto() {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "IconDto{" +
                "color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
