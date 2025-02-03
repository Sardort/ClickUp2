package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Icon icon_id;

    public View(Integer id, String name, Icon icon_id) {
        this.id = id;
        this.name = name;
        this.icon_id = icon_id;
    }

    public View() {
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
        return "View{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon_id=" + icon_id +
                '}';
    }
}
