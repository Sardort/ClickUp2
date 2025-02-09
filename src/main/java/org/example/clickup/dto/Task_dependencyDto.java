package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Task_dependencyDto {
    @Column(nullable = false)
    private String dependency_task_id;
    @Column(nullable = false)
    private String depency_type;

    public Task_dependencyDto(String dependency_task_id, String depency_type) {
        this.dependency_task_id = dependency_task_id;
        this.depency_type = depency_type;
    }

    public Task_dependencyDto() {
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

    @Override
    public String toString() {
        return "Task_dependencyDto{" +
                "dependency_task_id='" + dependency_task_id + '\'' +
                ", depency_type='" + depency_type + '\'' +
                '}';
    }
}
