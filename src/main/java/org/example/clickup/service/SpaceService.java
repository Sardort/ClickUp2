package org.example.clickup.service;

import org.example.clickup.dto.SpaceDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Space;
import org.example.clickup.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpaceService {
    @Autowired
    SpaceRepository spaceRepository;

    //getAll
    public List<Space> getAll(){
        return spaceRepository.findAll();
    }

    //getById
    public Space getById(Integer id){
        return spaceRepository.findById(id).get();
    }

    //create
    public Result create(SpaceDto spaceDto){
        Space space = new Space();
        space.setName(spaceDto.getName());
        space.setColor(spaceDto.getColor());
        space.setInitial_letter(spaceDto.getInitial_letter());
        space.setAccess_type(spaceDto.getAccess_type());
        spaceRepository.save(space);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, SpaceDto spaceDto){
        Optional<Space> spaceOptional = spaceRepository.findById(id);
        if (spaceOptional.isPresent()){
            Space space = spaceOptional.get();
            space.setName(spaceDto.getName());
            space.setColor(spaceDto.getColor());
            space.setInitial_letter(spaceDto.getInitial_letter());
            space.setAccess_type(spaceDto.getAccess_type());
            spaceRepository.save(space);
            return new Result(true, "O'zgartirlidi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        spaceRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
