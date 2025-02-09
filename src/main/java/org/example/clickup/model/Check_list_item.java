package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Check_list_item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Check_list check_list_id;
    @Column(nullable = false)
    private String resolved;
    @OneToOne
    private User assigned_user_id;

    public Check_list_item(Integer id, String name, Check_list check_list_id, String resolved, User assigned_user_id) {
        this.id = id;
        this.name = name;
        this.check_list_id = check_list_id;
        this.resolved = resolved;
        this.assigned_user_id = assigned_user_id;
    }

    public Check_list_item() {
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

    public Check_list getCheck_list_id() {
        return check_list_id;
    }

    public void setCheck_list_id(Check_list check_list_id) {
        this.check_list_id = check_list_id;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public User getAssigned_user_id() {
        return assigned_user_id;
    }

    public void setAssigned_user_id(User assigned_user_id) {
        this.assigned_user_id = assigned_user_id;
    }

    @Override
    public String toString() {
        return "Check_list_item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", check_list_id=" + check_list_id +
                ", resolved='" + resolved + '\'' +
                ", assigned_user_id=" + assigned_user_id +
                '}';
    }
}
