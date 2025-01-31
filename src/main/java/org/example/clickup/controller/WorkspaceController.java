package org.example.clickup.controller;

import org.example.clickup.dto.WorkspaceDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace;
import org.example.clickup.service.WorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController {


    @Autowired
    WorkspaceService workspaceService;

    @GetMapping
    public List<Workspace> getAll(){
        List<Workspace> list = workspaceService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Workspace getById(@PathVariable Integer id){
        Workspace workspace = workspaceService.getById(id);
        return workspace;
    }

    @PostMapping
    public Result create(@RequestBody WorkspaceDto workspaceDto){
        Result result = workspaceService.create(workspaceDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody WorkspaceDto workspaceDto){
        Result result = workspaceService.update(id, workspaceDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = workspaceService.delete(id);
        return result;
    }
}
