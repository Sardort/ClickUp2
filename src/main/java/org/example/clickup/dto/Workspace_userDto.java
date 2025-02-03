package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Workspace_userDto {
    @Column(nullable = false)
    private String date_invited;
    @Column(nullable = false)
    private String date_joined;

    public Workspace_userDto(String date_invited, String date_joined) {
        this.date_invited = date_invited;
        this.date_joined = date_joined;
    }

    public Workspace_userDto() {
    }

    public String getDate_invited() {
        return date_invited;
    }

    public void setDate_invited(String date_invited) {
        this.date_invited = date_invited;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }

    @Override
    public String toString() {
        return "Workspace_userDto{" +
                "date_invited='" + date_invited + '\'' +
                ", date_joined='" + date_joined + '\'' +
                '}';
    }
}
