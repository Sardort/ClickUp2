package org.example.clickup.service;

import org.example.clickup.dto.WorkspaceDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Workspace;
import org.example.clickup.repository.WorkspaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkspaceService {
    @Autowired
    WorkspaceRepository workspaceRepository;

    //getAll
    public List<Workspace> getAll(){
        return workspaceRepository.findAll();
    }

    public Workspace getById(Integer id){
        return workspaceRepository.findById(id).get();
    }

    public Result create(WorkspaceDto workspaceDto){
        Workspace workspace = new Workspace();
        workspace.setName(workspaceDto.getName());
        workspace.setColor(workspaceDto.getColor());
        workspace.setInitial_letter(workspaceDto.getInitial_letter());
        workspace.setAvatar_id(workspaceDto.getAvatar_id());
        workspaceRepository.save(workspace);
        return new Result(true, "Saqlandi");
    }

    public Result update(Integer id, WorkspaceDto workspaceDto){
        Optional<Workspace> workspaceOptional = workspaceRepository.findById(id);
        if (workspaceOptional.isPresent()){
            Workspace workspace = workspaceOptional.get();
            workspace.setName(workspaceDto.getName());
            workspace.setColor(workspaceDto.getColor());
            workspace.setInitial_letter(workspaceDto.getInitial_letter());

            workspace.setAvatar_id(workspaceDto.getAvatar_id());
            workspaceRepository.save(workspace);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false, "Not found");
    }


}
