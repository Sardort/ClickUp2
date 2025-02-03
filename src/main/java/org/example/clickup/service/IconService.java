package org.example.clickup.service;

import org.example.clickup.dto.IconDto;
import org.example.clickup.model.Icon;
import org.example.clickup.model.Result;
import org.example.clickup.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IconService {
    @Autowired
    IconRepository iconRepository;

    //getAll
    public List<Icon> getAll(){
        return iconRepository.findAll();
    }

    //getById
    public Icon getById(Integer id){
        return iconRepository.findById(id).get();
    }

    //create
    public Result create(IconDto iconDto){
        Icon icon = new Icon();
        icon.setColor(iconDto.getColor());
        icon.setInitial_letter(iconDto.getInitial_letter());
        icon.setIcon(iconDto.getIcon());
        iconRepository.save(icon);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, IconDto iconDto){
        Optional<Icon> iconOptional = iconRepository.findById(id);
        if (iconOptional.isPresent()){
            Icon icon = iconOptional.get();
            icon.setColor(iconDto.getColor());
            icon.setInitial_letter(iconDto.getInitial_letter());
            icon.setIcon(icon.getIcon());
            iconRepository.save(icon);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        iconRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
