package org.example.clickup.service;

import org.example.clickup.dto.ProjectDto;
import org.example.clickup.model.Project;
import org.example.clickup.model.Result;
import org.example.clickup.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    //getAll
    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    //getById
    public Project getById(Integer id){
        return projectRepository.findById(id).get();
    }

    //create
    public Result create(ProjectDto projectDto){
        Project project = new Project();
        project.setName(projectDto.getName());
        project.setAccess_type(projectDto.getAccess_type());
        project.setArchived(projectDto.getArchived());
        project.setColor(projectDto.getColor());
        projectRepository.save(project);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, ProjectDto projectDto){
        Optional<Project> projectOptional = projectRepository.findById(id);
        if (projectOptional.isPresent()){
            Project project = projectOptional.get();
            project.setName(projectDto.getName());
            project.setAccess_type(projectDto.getAccess_type());
            project.setArchived(projectDto.getArchived());
            project.setColor(projectDto.getColor());
            projectRepository.save(project);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        projectRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
