package org.example.clickup.service;

import org.example.clickup.dto.CommentDto;
import org.example.clickup.model.Comment;
import org.example.clickup.model.Result;
import org.example.clickup.repository.CommentRepository;
import org.hibernate.engine.spi.Resolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    //getAll
    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    //getById
    public Comment getById(Integer id){
        return commentRepository.findById(id).get();
    }

    //create
    public Result create(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setName(commentDto.getName());
        commentRepository.save(comment);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, CommentDto commentDto){
        Optional<Comment> commentOptional = commentRepository.findById(id);
        if (commentOptional.isPresent()){
            Comment comment = commentOptional.get();
            comment.setName(commentDto.getName());
            commentRepository.save(comment);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        commentRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
