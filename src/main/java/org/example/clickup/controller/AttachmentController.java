package org.example.clickup.controller;

import org.example.clickup.dto.AttachmentDto;
import org.example.clickup.model.Attachment;
import org.example.clickup.model.Result;
import org.example.clickup.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @GetMapping
    public List<Attachment> getAll(){
        List<Attachment> list = attachmentService.getAll();
        return list;
    }
}
