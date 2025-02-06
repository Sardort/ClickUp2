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
        //return space_viewRepository.findById(id);
    }

}
