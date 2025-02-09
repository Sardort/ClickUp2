package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Task_historyDto {
    @Column(nullable = false)
    private String change_field_name;
    @Column(nullable = false)
    private String before;
    @Column(nullable = false)
    private String after;
    @Column(nullable = false)
    private String date;

    public Task_historyDto(String change_field_name, String before, String after, String date) {
        this.change_field_name = change_field_name;
        this.before = before;
        this.after = after;
        this.date = date;
    }

    public Task_historyDto() {
    }

    public String getChange_field_name() {
        return change_field_name;
    }

    public void setChange_field_name(String change_field_name) {
        this.change_field_name = change_field_name;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task_historyDto{" +
                "change_field_name='" + change_field_name + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
