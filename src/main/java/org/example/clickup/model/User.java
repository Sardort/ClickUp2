package org.example.clickup.model;

import jakarta.persistence.*;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String initial_letter;
    @OneToOne
    private Attachment avater_id;

    public User(Integer id, String fullname, String email, String password, String color, String initial_letter, Attachment avater_id) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.color = color;
        this.initial_letter = initial_letter;
        this.avater_id = avater_id;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInitial_letter() {
        return initial_letter;
    }

    public void setInitial_letter(String initial_letter) {
        this.initial_letter = initial_letter;
    }

    public Attachment getAvater_id() {
        return avater_id;
    }

    public void setAvater_id(Attachment avater_id) {
        this.avater_id = avater_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", avater_id=" + avater_id +
                '}';
    }
}
