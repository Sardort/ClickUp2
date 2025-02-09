package org.example.clickup.controller;

import org.example.clickup.dto.ProjectDto;
import org.example.clickup.model.Project;
import org.example.clickup.model.Result;
import org.example.clickup.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    private Object ProjectDto;

    @GetMapping
    public List<Project> getAll(){
        List<Project> list = projectService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Project getById(@PathVariable Integer id){
        Project project = projectService.getById(id);
        return project;
    }

    @PostMapping
    public Result create(@RequestBody ProjectDto projectDto){
        Result result = projectService.create(projectDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ProjectDto projectDto){
        Result result = projectService.update(id, projectDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = projectService.delete(id);
        return result;
    }
}
