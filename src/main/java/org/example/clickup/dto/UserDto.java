package org.example.clickup.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public class UserDto {
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

    public UserDto(String fullname, String email, String password, String color, String initial_letter) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.color = color;
        this.initial_letter = initial_letter;
    }

    public UserDto() {
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

    @Override
    public String toString() {
        return "UserDto{" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                '}';
    }
}
