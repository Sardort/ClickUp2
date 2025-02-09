package org.example.clickup.service;

import org.example.clickup.dto.Check_list_itemDto;
import org.example.clickup.model.Check_list_item;
import org.example.clickup.model.Result;
import org.example.clickup.repository.Check_list_itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Check_list_itemService {
    @Autowired
    Check_list_itemRepository check_list_itemRepository;

    //getAll
    public List<Check_list_item>getAll(){
        return check_list_itemRepository.findAll();
    }

    //getById
    public Check_list_item getById(Integer id){
        return check_list_itemRepository.findById(id).get();
    }

    //create
    public Result create(Check_list_itemDto check_list_itemDto){
        Check_list_item check_list_item = new Check_list_item();
        check_list_item.setName(check_list_itemDto.getName());
        check_list_item.setResolved(check_list_itemDto.getResolved());
        check_list_itemRepository.save(check_list_item);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Check_list_itemDto check_list_itemDto){
        Optional<Check_list_item> check_list_itemOptional = check_list_itemRepository.findById(id);
        if (check_list_itemOptional.isPresent()){
            Check_list_item check_list_item = check_list_itemOptional.get();
            check_list_item.setName(check_list_itemDto.getName());
            check_list_item.setResolved(check_list_itemDto.getResolved());
            check_list_itemRepository.save(check_list_item);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        check_list_itemRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
