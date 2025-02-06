package org.example.clickup.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Space_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Space> space_id;
    @OneToOne
    private User member_id;

    public Space_user(Integer id, List<Space> space_id, User member_id) {
        this.id = id;
        this.space_id = space_id;
        this.member_id = member_id;
    }

    public Space_user() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Space> getSpace_id() {
        return space_id;
    }

    public void setSpace_id(List<Space> space_id) {
        this.space_id = space_id;
    }

    public User getMember_id() {
        return member_id;
    }

    public void setMember_id(User member_id) {
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        return "Space_user{" +
                "id=" + id +
                ", space_id=" + space_id +
                ", member_id=" + member_id +
                '}';
    }
}
