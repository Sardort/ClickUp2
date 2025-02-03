package org.example.clickup.controller;

import org.example.clickup.dto.SpaceDto;
import org.example.clickup.model.Result;
import org.example.clickup.model.Space;
import org.example.clickup.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/space")
public class SpaceController {
    @Autowired
    SpaceService spaceService;

    @GetMapping
    public List<Space> getAll(){
        List<Space> list = spaceService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Space getById(@PathVariable Integer id){
        Space space = spaceService.getById(id);
        return space;
    }

    @PostMapping
    public Result create(@RequestBody SpaceDto spaceDto){
        Result result = spaceService.create(spaceDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody SpaceDto spaceDto){
        Result result = spaceService.update(id, spaceDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = spaceService.delete(id);
        return result;
    }
}
