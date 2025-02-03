package org.example.clickup.controller;

import org.example.clickup.dto.Click_appsDto;
import org.example.clickup.model.Click_apps;
import org.example.clickup.model.Result;
import org.example.clickup.service.Click_appsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/click_apps")
public class Click_appsController {
    @Autowired
    Click_appsService click_appsService;

    @GetMapping
    public List<Click_apps> getAll(){
        List<Click_apps> list = click_appsService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Click_apps getById(@PathVariable Integer id){
        Click_apps click_apps = click_appsService.getById(id);
        return click_apps;
    }

    @PostMapping
    public Result create(@RequestBody Click_appsDto click_appsDto){
        Result result = click_appsService.create(click_appsDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Click_appsDto click_appsDto){
        Result result = click_appsService.update(id, click_appsDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = click_appsService.delete(id);
        return result;
    }
}
