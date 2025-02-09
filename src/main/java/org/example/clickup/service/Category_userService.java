package org.example.clickup.service;

import org.example.clickup.dto.Category_userDto;
import org.example.clickup.model.Category_user;
import org.example.clickup.model.Result;
import org.example.clickup.model.entity.Task_permissionRole;
import org.example.clickup.repository.CategoryRepository;
import org.example.clickup.repository.Category_userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Category_userService {
    @Autowired
    Category_userRepository category_userRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    //getAll
    public List<Category_user> getAll(){
        return category_userRepository.findAll();
    }

    //getById
    public Category_user getById(Integer id){
        return category_userRepository.findById(id).get();
    }

    //create
    public Result create(Category_userDto category_userDto){
        Category_user category_user = new Category_user();
        category_user.setName(category_userDto.getName());
        category_user.setTask_permission(String.valueOf(Task_permissionRole.ACTIVE));
        category_userRepository.save(category_user);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, Category_userDto category_userDto){
        Optional<Category_user> category_userOptional = category_userRepository.findById(id);
        if (category_userOptional.isPresent()){
            Category_user category_user = category_userOptional.get();
            category_user.setName(category_userDto.getName());
            category_user.setTask_permission(String.valueOf(Task_permissionRole.ACTIVE));
            category_userRepository.save(category_user);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        categoryRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
