package org.example.clickup.controller;

import org.example.clickup.dto.Time_trackedDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Time_tracked;
import org.example.clickup.service.Time_trackedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time_tracked")
public class Time_trackedController {
    @Autowired
    Time_trackedService time_trackedService;

    @GetMapping
    public List<Time_tracked> getAll(){
        List<Time_tracked> list = time_trackedService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Time_tracked getById(@PathVariable Integer id){
        Time_tracked time_tracked = time_trackedService.getById(id);
        return time_tracked;
    }

    @PostMapping
    public Result create(@RequestBody Time_trackedDto time_trackedDto){
        Result result = time_trackedService.create(time_trackedDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Time_trackedDto time_trackedDto){
        Result result = time_trackedService.update(id, time_trackedDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = time_trackedService.delete(id);
        return result;
    }
}
