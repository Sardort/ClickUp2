package org.example.clickup.service;

import org.example.clickup.dto.CategoryDto;
import org.example.clickup.model.Category;
import org.example.clickup.model.Result;
import org.example.clickup.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    //getall
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    //getById
    public Category getById(Integer id){
        return categoryRepository.findById(id).get();
    }

    //create
    public Result create(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setAccess_type(categoryDto.getAccess_type());
        category.setArchived(categoryDto.getArchived());
        category.setColor(categoryDto.getColor());
        categoryRepository.save(category);
        return new Result(true,"Saqlandi");
    }

    public Result update(Integer id, CategoryDto categoryDto){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()){
            Category category = categoryOptional.get();
            category.setName(categoryDto.getName());
            category.setAccess_type(categoryDto.getAccess_type());
            category.setArchived(categoryDto.getArchived());
            category.setColor(categoryDto.getColor());
            categoryRepository.save(category);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(true, "Not found");
    }
    public Result delete(Integer id){
        categoryRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
