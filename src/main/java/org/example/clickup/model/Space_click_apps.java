package org.example.clickup.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Space_click_apps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Space> space_id;
    @OneToOne
    private Click_apps click_apps_id;

    public Space_click_apps(Integer id, List<Space> space_id, Click_apps click_apps_id) {
        this.id = id;
        this.space_id = space_id;
        this.click_apps_id = click_apps_id;
    }

    public Space_click_apps() {
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

    public Click_apps getClick_apps_id() {
        return click_apps_id;
    }

    public void setClick_apps_id(Click_apps click_apps_id) {
        this.click_apps_id = click_apps_id;
    }

    @Override
    public String toString() {
        return "Space_click_apps{" +
                "id=" + id +
                ", space_id=" + space_id +
                ", click_apps_id=" + click_apps_id +
                '}';
    }
}
