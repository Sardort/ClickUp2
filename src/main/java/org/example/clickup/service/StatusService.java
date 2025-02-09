package org.example.clickup.service;

import org.example.clickup.dto.StatusDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Status;
import org.example.clickup.model.entity.TypeRole;
import org.example.clickup.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {
    @Autowired
    StatusRepository statusRepository;

    //getAll
    public List<Status> getAll(){
        return statusRepository.findAll();
    }

    //getById
    public Status getById(Integer id){
        return statusRepository.findById(id).get();
    }

    //create
    public Result create(StatusDto statusDto){
        Status status = new Status();
        status.setName(statusDto.getName());
        status.setColor(statusDto.getColor());
        status.setType(String.valueOf(TypeRole.OPEN));
        statusRepository.save(status);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, StatusDto statusDto){
        Optional<Status> statusOptional = statusRepository.findById(id);
        if (statusOptional.isPresent()){
            Status status = statusOptional.get();
            status.setName(statusDto.getName());
            status.setColor(statusDto.getColor());
            status.setType(String.valueOf(TypeRole.OPEN));
            statusRepository.save(status);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        statusRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
