package org.example.clickup.controller;

import org.example.clickup.dto.Check_listDto;
import org.example.clickup.model.Check_list;
import org.example.clickup.model.Result;
import org.example.clickup.service.Check_listService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/check_list")
public class Check_listController {
    @Autowired
    Check_listService check_listService;

    @GetMapping
    public List<Check_list> getAll(){
        List<Check_list> list = check_listService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Check_list getById(@PathVariable Integer id){
        Check_list check_list = check_listService.getById(id);
        return check_list;
    }

    @PostMapping
    public Result create(@RequestBody Check_listDto check_listDto){
        Result result = check_listService.create(check_listDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Check_listDto check_listDto){
        Result result = check_listService.update(id, check_listDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = check_listService.delete(id);
        return result;
    }
}
