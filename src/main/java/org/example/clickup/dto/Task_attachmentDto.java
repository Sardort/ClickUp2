package org.example.clickup.dto;

import jakarta.persistence.Column;

public class Task_attachmentDto {
    @Column(nullable = false)
    private boolean pin_cover_image;

    public Task_attachmentDto(boolean pin_cover_image) {
        this.pin_cover_image = pin_cover_image;
    }

    public Task_attachmentDto() {
    }

    public boolean isPin_cover_image() {
        return pin_cover_image;
    }

    public void setPin_cover_image(boolean pin_cover_image) {
        this.pin_cover_image = pin_cover_image;
    }

    @Override
    public String toString() {
        return "Task_attachmentDto{" +
                "pin_cover_image=" + pin_cover_image +
                '}';
    }
}
