package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Click_apps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Icon icon_id;

    public Click_apps(Integer id, String name, Icon icon_id) {
        this.id = id;
        this.name = name;
        this.icon_id = icon_id;
    }

    public Click_apps() {
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

    public Icon getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(Icon icon_id) {
        this.icon_id = icon_id;
    }

    @Override
    public String toString() {
        return "Click_apps{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon_id=" + icon_id +
                '}';
    }
}
