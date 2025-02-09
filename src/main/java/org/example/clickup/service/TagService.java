package org.example.clickup.service;

import org.example.clickup.dto.TagDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Tag;
import org.example.clickup.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    //getAll
    public List<Tag>getAll(){
        return tagRepository.findAll();
    }

    //getById
    public Tag getById(Integer id){
        return tagRepository.findById(id).get();
    }

    //create
    public Result create(TagDto tagDto){
        Tag tag = new Tag();
        tag.setName(tagDto.getName());
        tag.setColor(tagDto.getColor());
        tagRepository.save(tag);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, TagDto tagDto){
        Optional<Tag> tagOptional = tagRepository.findById(id);
        if (tagOptional.isPresent()){
            Tag tag = tagOptional.get();
            tag.setName(tagDto.getName());
            tag.setColor(tagDto.getColor());
            tagRepository.save(tag);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "O'zgartirildi");
    }

    //delete
    public Result delete(Integer id){
        tagRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
