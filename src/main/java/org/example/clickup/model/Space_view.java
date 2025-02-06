package org.example.clickup.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Space_view {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Space> space_id;
    @OneToMany
    private View view_id;

    public Space_view(Integer id, List<Space> space_id, View view_id) {
        this.id = id;
        this.space_id = space_id;
        this.view_id = view_id;
    }

    public Space_view() {
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

    public View getView_id() {
        return view_id;
    }

    public void setView_id(View view_id) {
        this.view_id = view_id;
    }

    @Override
    public String toString() {
        return "Space_view{" +
                "id=" + id +
                ", space_id=" + space_id +
                ", view_id=" + view_id +
                '}';
    }
}
