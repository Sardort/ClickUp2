package org.example.clickup.controller;

import org.example.clickup.dto.Check_list_itemDto;
import org.example.clickup.model.Check_list;
import org.example.clickup.model.Check_list_item;
import org.example.clickup.model.Result;
import org.example.clickup.service.Check_list_itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/check_list_item")
public class Check_list_itemController {
    @Autowired
    Check_list_itemService check_list_itemService;

    @GetMapping
    public List<Check_list_item> getAll(){
        List<Check_list_item> list = check_list_itemService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Check_list_item getById(@PathVariable Integer id){
        Check_list_item check_list_item = check_list_itemService.getById(id);
        return check_list_item;
    }

    @PostMapping
    public Result create(@RequestBody Check_list_itemDto check_list_itemDto){
        Result result = check_list_itemService.create(check_list_itemDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Check_list_itemDto check_list_itemDto){
        Result result = check_list_itemService.update(id, check_list_itemDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = check_list_itemService.delete(id);
        return result;
    }
}
