package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Task_history {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Task task_id;
    @Column(nullable = false)
    private String change_field_name;
    @Column(nullable = false)
    private String before;
    @Column(nullable = false)
    private String after;
    @Column(nullable = false)
    private String date;

    public Task_history(Integer id, Task task_id, String change_field_name, String before, String after, String date) {
        this.id = id;
        this.task_id = task_id;
        this.change_field_name = change_field_name;
        this.before = before;
        this.after = after;
        this.date = date;
    }

    public Task_history() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Task getTask_id() {
        return task_id;
    }

    public void setTask_id(Task task_id) {
        this.task_id = task_id;
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
        return "Task_history{" +
                "id=" + id +
                ", task_id=" + task_id +
                ", change_field_name='" + change_field_name + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
