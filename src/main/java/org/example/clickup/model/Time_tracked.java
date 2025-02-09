package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Time_tracked {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Task task_id;
    @Column(nullable = false)
    private String started_at;
    @Column(nullable = false)
    private String stopped_at;

    public Time_tracked(Integer id, Task task_id, String started_at, String stopped_at) {
        this.id = id;
        this.task_id = task_id;
        this.started_at = started_at;
        this.stopped_at = stopped_at;
    }

    public Time_tracked() {
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
        return "Time_tracked{" +
                "id=" + id +
                ", task_id=" + task_id +
                ", started_at='" + started_at + '\'' +
                ", stopped_at='" + stopped_at + '\'' +
                '}';
    }
}
