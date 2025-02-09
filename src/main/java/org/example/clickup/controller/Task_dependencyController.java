package org.example.clickup.controller;

import org.example.clickup.dto.Task_dependencyDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task_dependency;
import org.example.clickup.service.Task_dependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task_dependency")
public class Task_dependencyController {
    @Autowired
    Task_dependencyService task_dependencyService;

    @GetMapping
    public List<Task_dependency> getAll(){
        List<Task_dependency> list = task_dependencyService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Task_dependency getById(@PathVariable Integer id){
        Task_dependency task_dependency = task_dependencyService.getById(id);
        return task_dependency;
    }

    @PostMapping
    public Result create(@RequestBody Task_dependencyDto task_dependencyDto){
        Result result = task_dependencyService.create(task_dependencyDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Task_dependencyDto task_dependencyDto){
        Result result = task_dependencyService.update(id, task_dependencyDto);
        return result;
    }
}
