package org.example.clickup.service;

import org.example.clickup.model.Click_apps;
import org.example.clickup.model.Result;
import org.example.clickup.model.Space;
import org.example.clickup.model.Space_click_apps;
import org.example.clickup.repository.Click_appsRepository;
import org.example.clickup.repository.SpaceRepository;
import org.example.clickup.repository.Space_click_appsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RelationSupport;
import java.util.List;
import java.util.Optional;

@Service
public class Space_click_appsService {
    @Autowired
    Space_click_appsRepository space_click_appsRepository;

    @Autowired
    SpaceRepository spaceRepository;

    @Autowired
    Click_appsRepository click_appsRepository;

    //getAll
    public List<Space_click_apps> getAll(){
        return space_click_appsRepository.findAll();
    }

    //getById
    public Space_click_apps getById(Integer id){
        return space_click_appsRepository.findById(id).get();
    }

    //create
    public Result create(Space_click_apps space_click_apps){
        Space_click_apps space_click_apps1 = new Space_click_apps();
        Optional<Space> spaceOptional = spaceRepository.findById(space_click_apps.getId());
        Space space = spaceOptional.get();
        space_click_apps1.setSpace_id((List<Space>) space);

        Optional<Click_apps> click_appsOptional = click_appsRepository.findById(space_click_apps.getId());
        Click_apps clickApps = click_appsOptional.get();
        space_click_apps1.setClick_apps_id(clickApps);

        space_click_appsRepository.save(space_click_apps1);
        return new Result(true, "Saqlandi");
    }
}
