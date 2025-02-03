package org.example.clickup.controller;

import org.example.clickup.dto.AttachmentDto;
import org.example.clickup.model.Attachment;
import org.example.clickup.model.Result;
import org.example.clickup.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Attachment getById(@PathVariable Integer id){
        Attachment attachment = attachmentService.getById(id);
        return attachment;
    }

    @PostMapping
    public Result create(@RequestBody AttachmentDto attachmentDto){
        Result result = attachmentService.create(attachmentDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody AttachmentDto attachmentDto){
        Result result = attachmentService.update(id, attachmentDto);
        return result;
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = attachmentService.delete(id);
        return result;
    }
}
