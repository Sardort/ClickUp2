package org.example.clickup.controller;

import org.example.clickup.model.Task_attachment;
import org.example.clickup.service.Task_attachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task_attachment")
public class Task_attachmentController {
    @Autowired
    Task_attachmentService task_attachmentService;

    @GetMapping
    public List<Task_attachment> getAll(){
        List<Task_attachment> list = task_attachmentService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Task_attachment getById(@PathVariable Integer id){
        Task_attachment task_attachment = task_attachmentService.getById(id);
        return task_attachment;
    }
}
