package org.example.clickup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import org.example.clickup.model.entity.TypeRole;

public class StatusDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String type;
    @Enumerated
    private TypeRole typeRole;

    public StatusDto(String name, String color, String type, TypeRole typeRole) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.typeRole = typeRole;
    }

    public StatusDto() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TypeRole getTypeRole() {
        return typeRole;
    }

    public void setTypeRole(TypeRole typeRole) {
        this.typeRole = typeRole;
    }

    @Override
    public String toString() {
        return "StatusDto{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", typeRole=" + typeRole +
                '}';
    }
}
