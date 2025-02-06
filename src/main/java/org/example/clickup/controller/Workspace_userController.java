package org.example.clickup.controller;

import org.example.clickup.dto.Workspace_userDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_user;
import org.example.clickup.repository.Workspace_userRepository;
import org.example.clickup.service.Workspace_roleService;
import org.example.clickup.service.Workspace_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspace_user")
public class Workspace_userController {
    @Autowired
    Workspace_userService workspace_userService;

    @GetMapping
    public List<Workspace_user> getAll(){
        List<Workspace_user> list = workspace_userService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Workspace_user getById(@PathVariable Integer id){
        Workspace_user workspace_user = workspace_userService.getById(id);
        return workspace_user;
    }

    @PostMapping
    public Result create(@RequestBody Workspace_userDto workspace_userDto){
        Result result = workspace_userService.create(workspace_userDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Workspace_userDto workspace_userDto){
        Result result = workspace_userService.update(id, workspace_userDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = workspace_userService.delete(id);
        return result;
    }
}
