package org.example.clickup.controller;

import org.example.clickup.dto.Workspace_permissionDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_permission;
import org.example.clickup.service.Workspace_permissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspace_permission")
public class Workspace_permissionController {
    @Autowired
    Workspace_permissionService workspace_permissionService;

    @GetMapping
    public List<Workspace_permission> getAll(){
        List<Workspace_permission> list = workspace_permissionService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Workspace_permission getById(@PathVariable Integer id){
        Workspace_permission workspace_permission = workspace_permissionService.getById(id);
        return workspace_permission;
    }

    @PostMapping
    public Result create(@RequestBody Workspace_permissionDto workspace_permissionDto){
        Result result = workspace_permissionService.create(workspace_permissionDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Workspace_permissionDto workspace_permissionDto){
        Result result = workspace_permissionService.update(id, workspace_permissionDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = workspace_permissionService.delete(id);
        return result;
    }
}
