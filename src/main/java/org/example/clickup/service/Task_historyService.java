package org.example.clickup.service;

import org.example.clickup.dto.Task_historyDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task_history;
import org.example.clickup.repository.Task_historyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Task_historyService {
    @Autowired
    Task_historyRepository task_historyRepository;

    //getAll
    public List<Task_history> getAll(){
        return task_historyRepository.findAll();
    }

    //getById
    public Task_history getById(Integer id){
        return task_historyRepository.findById(id).get();
    }

    //create
    public Result create(Task_historyDto task_historyDto){
        Task_history task_history = new Task_history();
        task_history.setChange_field_name(task_historyDto.getChange_field_name());
        task_history.setBefore(task_historyDto.getBefore());
        task_history.setAfter(task_historyDto.getAfter());
        task_history.setDate(task_historyDto.getDate());
        task_historyRepository.save(task_history);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, Task_historyDto task_historyDto){
        Optional<Task_history> task_historyOptional = task_historyRepository.findById(id);
        if (task_historyOptional.isPresent()){
            Task_history task_history = task_historyOptional.get();
            task_history.setChange_field_name(task_historyDto.getChange_field_name());
            task_history.setBefore(task_historyDto.getBefore());
            task_history.setAfter(task_historyDto.getAfter());
            task_history.setDate(task_historyDto.getDate());
            task_historyRepository.save(task_history);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        task_historyRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
