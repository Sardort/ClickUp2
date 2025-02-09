package org.example.clickup.controller;

import org.example.clickup.dto.Category_userDto;
import org.example.clickup.model.Category_user;
import org.example.clickup.model.Result;
import org.example.clickup.service.Category_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category_user")
public class Category_userController {
    @Autowired
    Category_userService category_userService;

    @GetMapping
    public List<Category_user> getAll(){
        List<Category_user> list = category_userService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Category_user getById(@PathVariable Integer id){
        Category_user category_user = category_userService.getById(id);
        return category_user;
    }

    @PostMapping
    public Result create(@RequestBody Category_userDto category_userDto){
        Result result = category_userService.create(category_userDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Category_userDto category_userDto){
        Result result = category_userService.update(id, category_userDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = category_userService.delete(id);
        return result;
    }
}
