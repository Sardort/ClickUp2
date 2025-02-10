package org.example.clickup.controller;

import org.example.clickup.dto.UserDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.User;
import org.example.clickup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public HttpEntity<?> getAll() {
        List<User> list = userService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        return ResponseEntity.status(200).body(user);
    }

    @PostMapping
    public HttpEntity<?> create(@RequestBody UserDto userDto) {
        Result result = userService.create(userDto);

        //return new ResponseEntity<>(result,HttpStatus.CREATED);
        return ResponseEntity.status(201).body(result);
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody UserDto userDto) {
        Result result = userService.update(id, userDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Result result = userService.delete(id);
        return result;
    }
}
