package org.example.clickup.service;

import org.example.clickup.model.Result;
import org.example.clickup.model.Space;
import org.example.clickup.model.Space_user;
import org.example.clickup.model.User;
import org.example.clickup.repository.SpaceRepository;
import org.example.clickup.repository.Space_userRepository;
import org.example.clickup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Space_userService {

    @Autowired
    Space_userRepository space_userRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    SpaceRepository spaceRepository;

    //getAll
    public List<Space_user> getAll(){
        return space_userRepository.findAll();
    }

    //getById
    public Space_user findById(Integer id){
        return space_userRepository.findById(id).get();
    }

    //create
    public Result create(Space_user space_user){
        Space_user space_user1 = new Space_user();

        Optional<Space> spaceOptional = spaceRepository.findById(space_user.getId());
        Space space = spaceOptional.get();
        space_user1.setSpace_id((List<Space>) space);

        Optional<User> userOptional = userRepository.findById(space_user.getId());
        User user = userOptional.get();
        space_user1.setMember_id(user);
        space_userRepository.save(space_user1);

        return new Result(true,"Saqlandi");
    }
}
