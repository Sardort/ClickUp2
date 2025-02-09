package org.example.clickup.controller;

import org.example.clickup.dto.Task_historyDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task_history;
import org.example.clickup.service.Task_historyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task_history")
public class Task_historyController {
    @Autowired
    Task_historyService task_historyService;

    @GetMapping
    public List<Task_history> getAll(){
        List<Task_history> list = task_historyService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Task_history getById(@PathVariable Integer id){
        Task_history task_history = task_historyService.getById(id);
        return task_history;
    }

    @PostMapping
    public Result create(@RequestBody Task_historyDto task_historyDto){
        Result result = task_historyService.create(task_historyDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Task_historyDto task_historyDto){
        Result result = task_historyService.update(id, task_historyDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = task_historyService.delete(id);
        return result;
    }
}
