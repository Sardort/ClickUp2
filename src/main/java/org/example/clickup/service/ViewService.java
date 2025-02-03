package org.example.clickup.service;

import org.example.clickup.dto.ViewDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.View;
import org.example.clickup.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViewService {
    @Autowired
    ViewRepository viewRepository;

    //getAll
    public List<View> getAll(){
        return viewRepository.findAll();
    }

    //getById
    public View getById(Integer id){
        return viewRepository.findById(id).get();
    }

    //create
    public Result create(ViewDto viewDto){
        View view = new View();
        view.setName(viewDto.getName());
        viewRepository.save(view);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, ViewDto viewDto){
        Optional<View> viewOptional = viewRepository.findById(id);
        if (viewOptional.isPresent()){
            View view = viewOptional.get();
            view.setName(viewDto.getName());
            viewRepository.save(view);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        viewRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
