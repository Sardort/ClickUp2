package org.example.clickup.service;

import org.example.clickup.dto.Task_attachmentDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task_attachment;
import org.example.clickup.repository.Task_attachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task_attachmentService {
    @Autowired
    Task_attachmentRepository task_attachmentRepository;

    //getAll
    public List<Task_attachment> getAll(){
        return task_attachmentRepository.findAll();
    }

    //getById
    public Task_attachment getById(Integer id){
        return task_attachmentRepository.findById(id).get();
    }

}
