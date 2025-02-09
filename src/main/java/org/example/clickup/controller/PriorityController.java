package org.example.clickup.controller;

import org.example.clickup.dto.PriorityDto;
import org.example.clickup.model.Priority;
import org.example.clickup.model.Result;
import org.example.clickup.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityController {
    @Autowired
    PriorityService priorityService;

    @GetMapping
    public List<Priority> getAll(){
        List<Priority> list = priorityService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Priority getById(@PathVariable Integer id){
        Priority priority = priorityService.getById(id);
        return priority;
    }

    @PostMapping
    public Result create(@RequestBody PriorityDto priorityDto){
        Result result = priorityService.create(priorityDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody PriorityDto priorityDto){
        Result result = priorityService.update(id, priorityDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = priorityService.delete(id);
        return result;
    }
}
