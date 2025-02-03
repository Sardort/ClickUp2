package org.example.clickup.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.clickup.dto.ViewDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.View;
import org.example.clickup.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/view")
public class ViewController {
    @Autowired
    ViewService viewService;

    @GetMapping
    public List<View> getAll(){
        List<View> list = viewService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public View getById(@PathVariable Integer id){
        View view = viewService.getById(id);
        return view;
    }

    @PostMapping
    public Result create(@RequestBody ViewDto viewDto){
        Result result = viewService.create(viewDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ViewDto viewDto){
        Result result = viewService.update(id, viewDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = viewService.delete(id);
        return result;
    }
}
