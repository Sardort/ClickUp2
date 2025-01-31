package org.example.clickup.dto;

import jakarta.persistence.Column;

public class AttachmentDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String original_name;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String content_type;

    public AttachmentDto(String name, String original_name, String size, String content_type) {
        this.name = name;
        this.original_name = original_name;
        this.size = size;
        this.content_type = content_type;
    }

    public AttachmentDto() {
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
        return "AttachmentDto{" +
                "name='" + name + '\'' +
                ", original_name='" + original_name + '\'' +
                ", size='" + size + '\'' +
                ", content_type='" + content_type + '\'' +
                '}';
    }
}
