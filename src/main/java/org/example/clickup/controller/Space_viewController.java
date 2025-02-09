package org.example.clickup.controller;

import org.example.clickup.model.Space_view;
import org.example.clickup.service.Space_viewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class Space_viewController {
    @Autowired
    Space_viewService space_viewService;

    @GetMapping
    public List<Space_view> getAll(){
        List<Space_view> list = space_viewService.getAll();
        return list;
    }

}
