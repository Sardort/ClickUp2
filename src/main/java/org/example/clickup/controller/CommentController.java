package org.example.clickup.controller;

import org.example.clickup.dto.CommentDto;
import org.example.clickup.model.Comment;
import org.example.clickup.model.Result;
import org.example.clickup.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment>getAll(){
        List<Comment> list = commentService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Comment getById(@PathVariable Integer id){
        Comment comment = commentService.getById(id);
        return comment;
    }

    @PostMapping
    public Result create(@RequestBody CommentDto commentDto){
        Result result = commentService.create(commentDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CommentDto commentDto){
        Result result = commentService.update(id, commentDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Result result = commentService.delete(id);
        return result;
    }
}
