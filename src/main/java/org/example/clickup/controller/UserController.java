package org.example.clickup.controller;

import org.example.clickup.dto.UserDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.User;
import org.example.clickup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        List<User> list = userService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return user;
    }

    @PostMapping
    public Result create(@RequestBody UserDto userDto){
        Result result = userService.create(userDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody UserDto userDto){
        Result result = userService.update(id, userDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = userService.delete(id);
        return result;
    }
}
