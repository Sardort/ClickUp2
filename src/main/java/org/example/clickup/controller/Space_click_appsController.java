package org.example.clickup.controller;

import org.example.clickup.model.Space_click_apps;
import org.example.clickup.service.Space_click_appsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/space_click_apps")
public class Space_click_appsController {

    @Autowired
    Space_click_appsService space_click_appsService;

    @GetMapping
    public List<Space_click_apps> getAll(){
        List<Space_click_apps> list = space_click_appsService.getAll();
        return list;
    }
    
}
