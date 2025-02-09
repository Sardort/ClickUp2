package org.example.clickup.service;

import org.example.clickup.dto.PriorityDto;
import org.example.clickup.model.Priority;
import org.example.clickup.model.Result;
import org.example.clickup.repository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriorityService {
    @Autowired
    PriorityRepository priorityRepository;

    //getAll
    public List<Priority> getAll(){
        return priorityRepository.findAll();
    }

    //getById
    public Priority getById(Integer id){
        return priorityRepository.findById(id).get();
    }

    //create
    public Result create(PriorityDto priorityDto){
        Priority priority = new Priority();
        priority.setName(priorityDto.getName());
        priorityRepository.save(priority);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, PriorityDto priorityDto){
        Optional<Priority> priorityOptional = priorityRepository.findById(id);
        if (priorityOptional.isPresent()){
            Priority priority = priorityOptional.get();
            priority.setName(priorityDto.getName());
            priorityRepository.save(priority);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        priorityRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
