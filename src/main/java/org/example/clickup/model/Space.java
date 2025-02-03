package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @OneToOne
    private Workspace workspace_id;
    @Column(nullable = false)
    private String initial_letter;
    @OneToOne
    private Icon icon_id;
    @OneToOne
    private Attachment avatar_id;
    @OneToOne
    private User owner_id;
    @Column(nullable = false)
    private String access_type;

    public Space(Integer id, String name, String color, Workspace workspace_id, String initial_letter, Icon icon_id, Attachment avatar_id, User owner_id, String access_type) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.workspace_id = workspace_id;
        this.initial_letter = initial_letter;
        this.icon_id = icon_id;
        this.avatar_id = avatar_id;
        this.owner_id = owner_id;
        this.access_type = access_type;
    }

    public Space() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Workspace getWorkspace_id() {
        return workspace_id;
    }

    public void setWorkspace_id(Workspace workspace_id) {
        this.workspace_id = workspace_id;
    }

    public String getInitial_letter() {
        return initial_letter;
    }

    public void setInitial_letter(String initial_letter) {
        this.initial_letter = initial_letter;
    }

    public Icon getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(Icon icon_id) {
        this.icon_id = icon_id;
    }

    public Attachment getAvatar_id() {
        return avatar_id;
    }

    public void setAvatar_id(Attachment avatar_id) {
        this.avatar_id = avatar_id;
    }

    public User getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(User owner_id) {
        this.owner_id = owner_id;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    @Override
    public String toString() {
        return "Space{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", workspace_id=" + workspace_id +
                ", initial_letter='" + initial_letter + '\'' +
                ", icon_id=" + icon_id +
                ", avatar_id=" + avatar_id +
                ", owner_id=" + owner_id +
                ", access_type='" + access_type + '\'' +
                '}';
    }
}
