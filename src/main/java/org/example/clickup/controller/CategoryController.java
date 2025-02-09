package org.example.clickup.controller;

import org.example.clickup.dto.CategoryDto;
import org.example.clickup.model.Category;
import org.example.clickup.model.Result;
import org.example.clickup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        List<Category> list = categoryService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Integer id){
        Category category = categoryService.getById(id);
        return category;
    }

    @PostMapping
    public Result create(@RequestBody CategoryDto categoryDto){
        Result result = categoryService.create(categoryDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CategoryDto categoryDto){
        Result result = categoryService.update(id, categoryDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = categoryService.delete(id);
        return result;
    }
}
