package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String original_name;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String content_type;

    public Attachment(Integer id, String name, String original_name, String size, String content_type) {
        this.id = id;
        this.name = name;
        this.original_name = original_name;
        this.size = size;
        this.content_type = content_type;
    }

    public Attachment() {
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

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", original_name='" + original_name + '\'' +
                ", size='" + size + '\'' +
                ", content_type='" + content_type + '\'' +
                '}';
    }
}
