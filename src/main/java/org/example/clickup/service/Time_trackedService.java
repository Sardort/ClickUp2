package org.example.clickup.service;

import org.example.clickup.dto.Time_trackedDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Time_tracked;
import org.example.clickup.repository.Time_trackedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Time_trackedService {
    @Autowired
    Time_trackedRepository time_trackedRepository;

    //getAll
    public List<Time_tracked> getAll(){
        return time_trackedRepository.findAll();
    }

    //getById
    public Time_tracked getById(Integer id){
        return time_trackedRepository.findById(id).get();
    }

    //create
    public Result create(Time_trackedDto time_trackedDto){
        Time_tracked time_tracked = new Time_tracked();
        time_tracked.setStarted_at(time_trackedDto.getStarted_at());
        time_tracked.setStopped_at(time_trackedDto.getStopped_at());
        time_trackedRepository.save(time_tracked);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, Time_trackedDto time_trackedDto){
        Optional<Time_tracked> time_trackedOptional = time_trackedRepository.findById(id);
        if (time_trackedOptional.isPresent()){
            Time_tracked time_tracked = time_trackedOptional.get();
            time_tracked.setStarted_at(time_trackedDto.getStarted_at());
            time_tracked.setStopped_at(time_trackedDto.getStopped_at());
            time_trackedRepository.save(time_tracked);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        time_trackedRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
