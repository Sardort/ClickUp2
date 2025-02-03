package org.example.clickup.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.clickup.dto.Workspace_roleDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_role;
import org.example.clickup.service.Workspace_roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/workspace_role")
public class Workspace_roleController {
    @Autowired
    Workspace_roleService workspace_roleService;

    @GetMapping
    public List<Workspace_role> getAll(){
        List<Workspace_role> list = workspace_roleService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Workspace_role getById(@PathVariable Integer id){
        Workspace_role workspace_role = workspace_roleService.getById(id);
        return workspace_role;
    }

    @PostMapping
    public Result create(@RequestBody Workspace_roleDto workspace_roleDto){
        Result result = workspace_roleService.create(workspace_roleDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Workspace_roleDto workspace_roleDto){
        Result result = workspace_roleService.update(id, workspace_roleDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = workspace_roleService.delete(id);
        return result;
    }
}
