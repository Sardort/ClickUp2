package org.example.clickup.dto;

import jakarta.persistence.Column;
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
    @Column(nullable = false)
    private Integer avater_id;

    public UserDto(String fullname, String email, String password, String color, String initial_letter, Integer avater_id) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.color = color;
        this.initial_letter = initial_letter;
        this.avater_id = avater_id;
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

    public Integer getAvater_id() {
        return avater_id;
    }

    public void setAvater_id(Integer avater_id) {
        this.avater_id = avater_id;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", avater_id=" + avater_id +
                '}';
    }
}
