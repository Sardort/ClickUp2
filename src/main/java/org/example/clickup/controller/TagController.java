package org.example.clickup.controller;

import org.example.clickup.dto.TagDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Tag;
import org.example.clickup.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService tagService;

    @GetMapping
    public List<Tag> getAll(){
        List<Tag> list = tagService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Tag getById(@PathVariable Integer id){
        Tag tag = tagService.getById(id);
        return tag;
    }

    @PostMapping
    public Result create(@RequestBody TagDto tagDto){
        Result result = tagService.create(tagDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody TagDto tagDto){
        Result result = tagService.update(id, tagDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = tagService.delete(id);
        return result;
    }
}
