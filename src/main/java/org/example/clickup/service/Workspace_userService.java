package org.example.clickup.service;

import org.example.clickup.dto.Workspace_userDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_user;
import org.example.clickup.repository.Workspace_userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Workspace_userService {
    @Autowired
    Workspace_userRepository workspace_userRepository;

    //getAll
    public List<Workspace_user> getAll(){
        return workspace_userRepository.findAll();
    }

    //getById
    public Workspace_user getById(Integer id){
        return workspace_userRepository.findById(id).get();
    }

    //create
    public Result create(Workspace_userDto workspace_userDto){
        Workspace_user workspaceUser = new Workspace_user();
        workspaceUser.setDate_invited(workspace_userDto.getDate_invited());
        workspaceUser.setDate_joined(workspace_userDto.getDate_joined());
        workspace_userRepository.save(workspaceUser);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Workspace_userDto workspace_userDto){
        Optional<Workspace_user> workspace_userOptional = workspace_userRepository.findById(id);
        if (workspace_userOptional.isPresent()){
            Workspace_user workspace_user = workspace_userOptional.get();
            workspace_user.setDate_invited(workspace_userDto.getDate_invited());
            workspace_user.setDate_joined(workspace_userDto.getDate_joined());
            workspace_userRepository.save(workspace_user);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        workspace_userRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
