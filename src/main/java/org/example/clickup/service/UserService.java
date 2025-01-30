package org.example.clickup.service;

import org.example.clickup.dto.UserDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.User;
import org.example.clickup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //getAll
    public List<User> getAll(){
        return userRepository.findAll();
    }

    //getById
    public User getById(Integer id){
        return userRepository.findById(id).get();
    }

    //create
    public Result create(UserDto userDto){
        User user = new User();
        user.setFullname(userDto.getFullname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setColor(userDto.getColor());
        user.setInitial_letter(userDto.getInitial_letter());
        user.setAvater_id(userDto.getAvater_id());
        userRepository.save(user);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, UserDto userDto){
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            User user = userOptional.get();
            user.setFullname(userDto.getFullname());
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            user.setColor(userDto.getColor());
            user.setInitial_letter(userDto.getInitial_letter());
            userRepository.save(user);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false, "Not found");
    }

    //delete
    public Result delete(Integer id){
        userRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
