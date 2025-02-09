package org.example.clickup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import org.example.clickup.model.Check_list;

public class Check_list_itemDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String resolved;

    public Check_list_itemDto(String name, String resolved) {
        this.name = name;
        this.resolved = resolved;
    }

    public Check_list_itemDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Check_list_itemDto{" +
                "name='" + name + '\'' +
                ", resolved='" + resolved + '\'' +
                '}';
    }
}
