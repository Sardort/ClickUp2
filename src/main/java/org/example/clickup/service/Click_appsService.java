package org.example.clickup.service;

import org.example.clickup.dto.Click_appsDto;
import org.example.clickup.model.Click_apps;
import org.example.clickup.model.Result;
import org.example.clickup.repository.Click_appsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Click_appsService {
    @Autowired
    Click_appsRepository click_appsRepository;

    //getAll
    public List<Click_apps> getAll(){
        return click_appsRepository.findAll();
    }

    //getById
    public Click_apps getById(Integer id){
        return click_appsRepository.findById(id).get();
    }

    //create
    public Result create(Click_appsDto click_appsDto){
        Click_apps clickApps = new Click_apps();
        clickApps.setName(click_appsDto.getName());
        click_appsRepository.save(clickApps);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, Click_appsDto click_appsDto){
        Optional<Click_apps> click_appsOptional = click_appsRepository.findById(id);
        if (click_appsOptional.isPresent()){
            Click_apps clickApps = click_appsOptional.get();
            clickApps.setName(click_appsDto.getName());
            click_appsRepository.save(clickApps);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false, "not found");
    }

    //delete
    public Result delete(Integer id){
        click_appsRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
