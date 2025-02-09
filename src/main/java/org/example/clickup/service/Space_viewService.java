package org.example.clickup.service;

import org.example.clickup.model.*;
import org.example.clickup.repository.SpaceRepository;
import org.example.clickup.repository.Space_viewRepository;
import org.example.clickup.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Space_viewService {
    @Autowired
    Space_viewRepository space_viewRepository;

    @Autowired
    ViewRepository viewRepository;

    @Autowired
    SpaceRepository spaceRepository;

    //getAll
    public List<Space_view> getAll(){
        return space_viewRepository.findAll();
    }

    //getById
    public Space_view getById(Integer id){
        return space_viewRepository.findById(id).get();
    }

    //create
    public Result create(Space_view space_view){
        Space_view space_view1 = new Space_view();

        Optional<Space> spaceOptional = spaceRepository.findById(space_view.getId());
        Space space = spaceOptional.get();
        space_view1.setSpace_id((List<Space>) space);

        Optional<View> viewOptional = viewRepository.findById(space_view.getId());
        View view = viewOptional.get();
        space_view1.setView_id(view);
        space_viewRepository.save(space_view1);
        return new Result(true,"Saqlandi");
    }

}
