package org.example.clickup.dto;

import jakarta.persistence.Column;

public class TaskDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String parent_task_id;
    @Column(nullable = false)
    private String started_date;
    @Column(nullable = false)
    private String start_time_has;
    @Column(nullable = false)
    private String due_date;
    @Column(nullable = false)
    private String due_time_has;
    @Column(nullable = false)
    private Long estimate_time;
    @Column(nullable = false)
    private String actived_time;

    public TaskDto(String name, String description, String parent_task_id, String started_date, String start_time_has, String due_date, String due_time_has, Long estimate_time, String actived_time) {
        this.name = name;
        this.description = description;
        this.parent_task_id = parent_task_id;
        this.started_date = started_date;
        this.start_time_has = start_time_has;
        this.due_date = due_date;
        this.due_time_has = due_time_has;
        this.estimate_time = estimate_time;
        this.actived_time = actived_time;
    }

    public TaskDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParent_task_id() {
        return parent_task_id;
    }

    public void setParent_task_id(String parent_task_id) {
        this.parent_task_id = parent_task_id;
    }

    public String getStarted_date() {
        return started_date;
    }

    public void setStarted_date(String started_date) {
        this.started_date = started_date;
    }

    public String getStart_time_has() {
        return start_time_has;
    }

    public void setStart_time_has(String start_time_has) {
        this.start_time_has = start_time_has;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getDue_time_has() {
        return due_time_has;
    }

    public void setDue_time_has(String due_time_has) {
        this.due_time_has = due_time_has;
    }

    public Long getEstimate_time() {
        return estimate_time;
    }

    public void setEstimate_time(Long estimate_time) {
        this.estimate_time = estimate_time;
    }

    public String getActived_time() {
        return actived_time;
    }

    public void setActived_time(String actived_time) {
        this.actived_time = actived_time;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parent_task_id='" + parent_task_id + '\'' +
                ", started_date='" + started_date + '\'' +
                ", start_time_has='" + start_time_has + '\'' +
                ", due_date='" + due_date + '\'' +
                ", due_time_has='" + due_time_has + '\'' +
                ", estimate_time=" + estimate_time +
                ", actived_time='" + actived_time + '\'' +
                '}';
    }
}
