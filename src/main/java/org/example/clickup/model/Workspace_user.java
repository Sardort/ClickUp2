package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Workspace_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Workspace workspace_id;
    @OneToOne
    private User user_id;
    @OneToOne
    private Workspace_role workspace_role_id;
    @Column(nullable = false)
    private String date_invited;
    @Column(nullable = false)
    private String date_joined;

    public Workspace_user(Integer id, Workspace workspace_id, User user_id, Workspace_role workspace_role_id, String date_invited, String date_joined) {
        this.id = id;
        this.workspace_id = workspace_id;
        this.user_id = user_id;
        this.workspace_role_id = workspace_role_id;
        this.date_invited = date_invited;
        this.date_joined = date_joined;
    }

    public Workspace_user() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Workspace getWorkspace_id() {
        return workspace_id;
    }

    public void setWorkspace_id(Workspace workspace_id) {
        this.workspace_id = workspace_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Workspace_role getWorkspace_role_id() {
        return workspace_role_id;
    }

    public void setWorkspace_role_id(Workspace_role workspace_role_id) {
        this.workspace_role_id = workspace_role_id;
    }

    public String getDate_invited() {
        return date_invited;
    }

    public void setDate_invited(String date_invited) {
        this.date_invited = date_invited;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }

    @Override
    public String toString() {
        return "Workspace_user{" +
                "id=" + id +
                ", workspace_id=" + workspace_id +
                ", user_id=" + user_id +
                ", workspace_role_id=" + workspace_role_id +
                ", date_invited='" + date_invited + '\'' +
                ", date_joined='" + date_joined + '\'' +
                '}';
    }
}
