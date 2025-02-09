package org.example.clickup.service;

import org.example.clickup.dto.TaskDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Task;
import org.example.clickup.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    //getAll
    public List<Task>getAll(){
        return taskRepository.findAll();
    }

    //getById
    public Task getById(Integer id){
        return taskRepository.findById(id).get();
    }

    //create
    public Result create(TaskDto taskDto){
        Task task = new Task();
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        task.setParent_task_id(taskDto.getParent_task_id());
        task.setStarted_date(taskDto.getStarted_date());
        task.setStart_time_has(taskDto.getStart_time_has());
        task.setDue_date(taskDto.getDue_date());
        task.setDue_time_has(taskDto.getDue_time_has());
        task.setEstimate_time(taskDto.getEstimate_time());
        task.setActived_time(taskDto.getActived_time());
        taskRepository.save(task);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, TaskDto taskDto){
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isPresent()){
            Task task = taskOptional.get();
            task.setName(taskDto.getName());
            task.setDescription(taskDto.getDescription());
            task.setParent_task_id(taskDto.getParent_task_id());
            task.setStarted_date(taskDto.getStarted_date());
            task.setStart_time_has(taskDto.getStart_time_has());
            task.setDue_date(taskDto.getDue_date());
            task.setDue_time_has(taskDto.getDue_time_has());
            task.setEstimate_time(taskDto.getEstimate_time());
            task.setActived_time(taskDto.getActived_time());
            taskRepository.save(task);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not false");
    }

    //delete
    public Result delete(Integer id){
        taskRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
