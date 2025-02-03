package org.example.clickup.service;

import org.example.clickup.dto.Workspace_roleDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_role;
import org.example.clickup.repository.Workspace_roleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Workspace_roleService {
    @Autowired
    Workspace_roleRepository workspace_roleRepository;

    //getAll
    public List<Workspace_role> getAll(){
        return workspace_roleRepository.findAll();
    }

    //getById
    public Workspace_role getById(Integer id){
        return workspace_roleRepository.findById(id).get();
    }

    //create
    public Result create(Workspace_roleDto workspace_roleDto){
        Workspace_role workspaceRole = new Workspace_role();
        workspaceRole.setName(workspace_roleDto.getName());
        workspaceRole.setExtends_role(workspace_roleDto.getExtends_role());
        workspace_roleRepository.save(workspaceRole);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, Workspace_roleDto workspace_roleDto){
        Optional<Workspace_role> workspace_roleOptional = workspace_roleRepository.findById(id);
        if (workspace_roleOptional.isPresent()){
            Workspace_role workspaceRole = workspace_roleOptional.get();
            workspaceRole.setName(workspace_roleDto.getName());
            workspaceRole.setExtends_role(workspace_roleDto.getExtends_role());
            workspace_roleRepository.save(workspaceRole);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        workspace_roleRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
