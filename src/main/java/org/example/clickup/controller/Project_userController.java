package org.example.clickup.controller;

import org.example.clickup.dto.Project_userDto;
import org.example.clickup.model.Project_user;
import org.example.clickup.model.Result;
import org.example.clickup.service.Project_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project_user")
public class Project_userController {
    @Autowired
    Project_userService project_userService;

    @GetMapping
    public List<Project_user> getAll(){
        List<Project_user> list = project_userService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Project_user getById(@PathVariable Integer id){
        Project_user project_user = project_userService.getById(id);
        return project_user;
    }

    @PostMapping
    public Result create(@RequestBody Project_userDto project_userDto){
        Result result = project_userService.create(project_userDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Project_userDto project_userDto){
        Result result = project_userService.update(id, project_userDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = project_userService.delete(id);
        return result;
    }
}
