package org.example.clickup.service;

import org.example.clickup.dto.Check_listDto;
import org.example.clickup.model.Check_list;
import org.example.clickup.model.Result;
import org.example.clickup.repository.Check_listRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Check_listService {
    @Autowired
    Check_listRepository check_listRepository;

    //getAll
    public List<Check_list> getAll(){
        return check_listRepository.findAll();
    }

    //getById
    public Check_list getById(Integer id){
        return check_listRepository.findById(id).get();
    }

    //create
    public Result create(Check_listDto checkListDto){
        Check_list check_list = new Check_list();
        check_list.setName(checkListDto.getName());
        check_listRepository.save(check_list);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Check_listDto check_listDto){
        Optional<Check_list> check_listOptional = check_listRepository.findById(id);
        if (check_listOptional.isPresent()){
            Check_list check_list = check_listOptional.get();
            check_list.setName(check_listDto.getName());
            check_listRepository.save(check_list);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        check_listRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
