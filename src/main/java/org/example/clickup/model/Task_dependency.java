package org.example.clickup.model;

import jakarta.persistence.*;
import org.example.clickup.model.entity.Depency_typeRole;

@Entity
public class Task_dependency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Task task_id;
    @Column(nullable = false)
    private String dependency_task_id;
    @Column(nullable = false)
    private String depency_type;
    @Enumerated(EnumType.STRING)
    private Depency_typeRole depency_typeRole;

    public Task_dependency(Integer id, Task task_id, String dependency_task_id, String depency_type, Depency_typeRole depency_typeRole) {
        this.id = id;
        this.task_id = task_id;
        this.dependency_task_id = dependency_task_id;
        this.depency_type = depency_type;
        this.depency_typeRole = depency_typeRole;
    }

    public Task_dependency() {
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

    public String getDependency_task_id() {
        return dependency_task_id;
    }

    public void setDependency_task_id(String dependency_task_id) {
        this.dependency_task_id = dependency_task_id;
    }

    public String getDepency_type() {
        return depency_type;
    }

    public void setDepency_type(String depency_type) {
        this.depency_type = depency_type;
    }

    public Depency_typeRole getDepency_typeRole() {
        return depency_typeRole;
    }

    public void setDepency_typeRole(Depency_typeRole depency_typeRole) {
        this.depency_typeRole = depency_typeRole;
    }

    @Override
    public String toString() {
        return "Task_dependency{" +
                "id=" + id +
                ", task_id=" + task_id +
                ", dependency_task_id='" + dependency_task_id + '\'' +
                ", depency_type='" + depency_type + '\'' +
                ", depency_typeRole=" + depency_typeRole +
                '}';
    }
}
