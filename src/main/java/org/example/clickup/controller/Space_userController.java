package org.example.clickup.controller;

import org.example.clickup.model.Space_user;
import org.example.clickup.service.Space_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/space_user")
public class Space_userController {
    @Autowired
    private Space_userService space_userService;

    @GetMapping
    public List<Space_user> getAll(){
        List<Space_user> list = space_userService.getAll();
        return list;
    }
}
