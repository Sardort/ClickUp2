package org.example.clickup.model;

import jakarta.persistence.*;

@Entity
public class Task_attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Task task_id;
    @OneToOne
    private Attachment attachment_id;
    @Column(nullable = false)
    private boolean pin_cover_image;

    public Task_attachment(Integer id, Task task_id, Attachment attachment_id, boolean pin_cover_image) {
        this.id = id;
        this.task_id = task_id;
        this.attachment_id = attachment_id;
        this.pin_cover_image = pin_cover_image;
    }

    public Task_attachment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Task getTask_id() {
        return task_id;
    }

    public void setTask_id(Task task_id) {
        this.task_id = task_id;
    }

    public Attachment getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(Attachment attachment_id) {
        this.attachment_id = attachment_id;
    }

    public boolean isPin_cover_image() {
        return pin_cover_image;
    }

    public void setPin_cover_image(boolean pin_cover_image) {
        this.pin_cover_image = pin_cover_image;
    }

    @Override
    public String toString() {
        return "Task_attachment{" +
                "id=" + id +
                ", task_id=" + task_id +
                ", attachment_id=" + attachment_id +
                ", pin_cover_image=" + pin_cover_image +
                '}';
    }
}
