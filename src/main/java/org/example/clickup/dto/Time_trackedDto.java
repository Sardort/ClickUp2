package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Time_trackedDto {
    @Column(nullable = false)
    private String started_at;
    @Column(nullable = false)
    private String stopped_at;

    public Time_trackedDto(String started_at, String stopped_at) {
        this.started_at = started_at;
        this.stopped_at = stopped_at;
    }

    public Time_trackedDto() {
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getStopped_at() {
        return stopped_at;
    }

    public void setStopped_at(String stopped_at) {
        this.stopped_at = stopped_at;
    }

    @Override
    public String toString() {
        return "Time_trackedDto{" +
                "started_at='" + started_at + '\'' +
                ", stopped_at='" + stopped_at + '\'' +
                '}';
    }
}
