package org.example.clickup.controller;

import org.example.clickup.dto.TaskDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task;
import org.example.clickup.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping
    public List<Task> getAll(){
        List<Task> list = taskService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Integer id){
        Task task = taskService.getById(id);
        return task;
    }

    @PostMapping
    public Result create(@RequestBody TaskDto taskDto){
        Result result = taskService.create(taskDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody TaskDto taskDto){
        Result result = taskService.update(id, taskDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = taskService.delete(id);
        return result;
    }
}
