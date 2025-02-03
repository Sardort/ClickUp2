package org.example.clickup.service;

import org.example.clickup.dto.AttachmentDto;
import org.example.clickup.model.Attachment;
import org.example.clickup.model.Result;
import org.example.clickup.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;

    //getAll
    public List<Attachment> getAll(){
        return attachmentRepository.findAll();
    }

    //getById
    public Attachment getById(Integer id){
        return attachmentRepository.findById(id).get();
    }

    //create
    public Result create(AttachmentDto attachmentDto){
        Attachment attachment = new Attachment();
        attachment.setName(attachmentDto.getName());
        attachment.setOriginal_name(attachmentDto.getOriginal_name());
        attachment.setSize(attachmentDto.getSize());
        attachment.setContent_type(attachmentDto.getContent_type());
        attachmentRepository.save(attachment);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, AttachmentDto attachmentDto){
        Optional<Attachment> attachmentOptional = attachmentRepository.findById(id);
        if (attachmentOptional.isPresent()){
            Attachment attachment = attachmentOptional.get();
            attachment.setName(attachmentDto.getName());
            attachment.setOriginal_name(attachment.getOriginal_name());
            attachment.setSize(attachmentDto.getSize());
            attachment.setContent_type(attachmentDto.getContent_type());
            attachmentRepository.save(attachment);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        attachmentRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }


}

