package org.example.clickup.service;

import org.example.clickup.dto.Project_userDto;
import org.example.clickup.model.Project_user;
import org.example.clickup.model.Result;
import org.example.clickup.model.entity.Task_permissionRole;
import org.example.clickup.repository.Project_userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Project_userService {
    @Autowired
    Project_userRepository project_userRepository;

    //getAll
    public List<Project_user> getAll(){
        return project_userRepository.findAll();
    }

    //getById
    public Project_user getById(Integer id){
        return project_userRepository.findById(id).get();
    }

    //create
    public Result create(Project_userDto project_userDto){
        Project_user projectUser = new Project_user();
        projectUser.setTask_permission(String.valueOf(Task_permissionRole.ACTIVE));
        project_userRepository.save(projectUser);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Project_userDto project_userDto){
        Optional<Project_user> project_userOptional = project_userRepository.findById(id);
        if (project_userOptional.isPresent()){
            Project_user projectUser = project_userOptional.get();
            projectUser.setTask_permission(String.valueOf(Task_permissionRole.ACTIVE));
            project_userRepository.save(projectUser);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        project_userRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
