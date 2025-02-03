package org.example.clickup.controller;

import org.example.clickup.dto.IconDto;
import org.example.clickup.model.Icon;
import org.example.clickup.model.Result;
import org.example.clickup.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/icon")
public class IconController {
    @Autowired
    IconService iconService;

    @GetMapping
    public List<Icon> getAll(){
        List<Icon> list = iconService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Icon getById(@PathVariable Integer id){
        Icon icon = iconService.getById(id);
        return icon;
    }

    @PostMapping
    public Result create(@RequestBody IconDto iconDto){
        Result result = iconService.create(iconDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody IconDto iconDto){
        Result result = iconService.update(id, iconDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = iconService.delete(id);
        return result;
    }
}
