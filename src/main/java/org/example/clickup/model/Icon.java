package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Icon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Attachment attachment_id;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String initial_letter;
    @Column(nullable = false)
    private String icon;

    public Icon(Integer id, Attachment attachment_id, String color, String initial_letter, String icon) {
        this.id = id;
        this.attachment_id = attachment_id;
        this.color = color;
        this.initial_letter = initial_letter;
        this.icon = icon;
    }

    public Icon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Attachment getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(Attachment attachment_id) {
        this.attachment_id = attachment_id;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Icon{" +
                "id=" + id +
                ", attachment_id=" + attachment_id +
                ", color='" + color + '\'' +
                ", initial_letter='" + initial_letter + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
