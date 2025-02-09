package org.example.clickup.controller;

import org.example.clickup.dto.StatusDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Status;
import org.example.clickup.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusService statusService;

    @GetMapping
    public List<Status> getAll(){
        List<Status> list = statusService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Status getById(@PathVariable Integer id){
        Status status = statusService.getById(id);
        return status;
    }

    @PostMapping
    public Result create(@RequestBody StatusDto statusDto){
        Result result = statusService.create(statusDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody StatusDto statusDto){
        Result result = statusService.update(id, statusDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = statusService.delete(id);
        return result;
    }

}
