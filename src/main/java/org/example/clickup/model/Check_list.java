package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Check_list {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Task task_id;

    public Check_list(Integer id, String name, Task task_id) {
        this.id = id;
        this.name = name;
        this.task_id = task_id;
    }

    public Check_list() {
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

    public Task getTask_id() {
        return task_id;
    }

    public void setTask_id(Task task_id) {
        this.task_id = task_id;
    }

    @Override
    public String toString() {
        return "Check_list{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", task_id=" + task_id +
                '}';
    }
}
