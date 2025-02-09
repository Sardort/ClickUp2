package org.example.clickup.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @ManyToMany
    private List<Task> task_id;

    public Comment(Integer id, String name, List<Task> task_id) {
        this.id = id;
        this.name = name;
        this.task_id = task_id;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTask_id() {
        return task_id;
    }

    public void setTask_id(List<Task> task_id) {
        this.task_id = task_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", task_id=" + task_id +
                '}';
    }
}
