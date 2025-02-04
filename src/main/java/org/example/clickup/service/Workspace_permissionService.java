package org.example.clickup.service;

import org.example.clickup.dto.Workspace_permissionDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace_permission;
import org.example.clickup.repository.Workspace_permissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Workspace_permissionService {
    @Autowired
    Workspace_permissionRepository workspace_permissionRepository;

    public List<Workspace_permission> getAll(){
        return workspace_permissionRepository.findAll();
    }

    public Workspace_permission getById(Integer id){
        return workspace_permissionRepository.findById(id).get();
    }

    public Result create(Workspace_permissionDto workspace_permissionDto){
        Workspace_permission workspacePermission = new Workspace_permission();
        workspacePermission.setPermission(workspace_permissionDto.getPermission());
        workspace_permissionRepository.save(workspacePermission);
        return new Result(true, "Saqlandi");
    }

    public  Result update(Integer id, Workspace_permissionDto workspace_permissionDto){
        Optional<Workspace_permission> workspace_permissionOptional = workspace_permissionRepository.findById(id);
        if (workspace_permissionOptional.isPresent()){
            Workspace_permission workspace_permission = workspace_permissionOptional.get();
            workspace_permission.setPermission(workspace_permissionDto.getPermission());
            workspace_permissionRepository.save(workspace_permission);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }
    public Result delete(Integer id){
        workspace_permissionRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
