package org.example.clickup.service;

import org.example.clickup.dto.Task_dependencyDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task_attachment;
import org.example.clickup.model.Task_dependency;
import org.example.clickup.model.entity.Depency_typeRole;
import org.example.clickup.repository.Task_dependencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Task_dependencyService {
    @Autowired
    Task_dependencyRepository task_dependencyRepository;

    //getAll
    public List<Task_dependency> getAll(){
        return task_dependencyRepository.findAll();
    }

    //getById
    public Task_dependency getById(Integer id){
        return task_dependencyRepository.findById(id).get();
    }

    //create
    public Result create(Task_dependencyDto task_dependencyDto){
        Task_dependency task_dependency = new Task_dependency();
        task_dependency.setDepency_type(String.valueOf(Depency_typeRole.WAITING));
        task_dependencyRepository.save(task_dependency);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Task_dependencyDto task_dependencyDto){
        Optional<Task_dependency> task_dependencyOptional = task_dependencyRepository.findById(id);
        if (task_dependencyOptional.isPresent()){
            Task_dependency task_dependency = task_dependencyOptional.get();
            task_dependency.setDepency_type(String.valueOf(Depency_typeRole.WAITING));
            task_dependencyRepository.save(task_dependency);
            return new Result(true,"Saqlandi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        task_dependencyRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
