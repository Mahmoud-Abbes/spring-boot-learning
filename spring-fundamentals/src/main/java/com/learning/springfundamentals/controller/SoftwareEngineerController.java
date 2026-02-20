package com.learning.springfundamentals.controller;

import com.learning.springfundamentals.model.SoftwareEngineer;
import com.learning.springfundamentals.repository.SoftwareEngineerRepository;
import com.learning.springfundamentals.service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/software-engineers")
public class SoftwareEngineerController {

    SoftwareEngineerService service;

    public SoftwareEngineerController(SoftwareEngineerService service){
        this.service = service;
    }

    @GetMapping
    List<SoftwareEngineer> getEngineers(){
        return service.getAllEngineers();
    }

    @GetMapping("{id}")
    SoftwareEngineer getEngineerById(@PathVariable Integer id){
        return service.getEngineerById(id);
    }

    @PostMapping
    void addEngineer(@RequestBody SoftwareEngineer engineer){
        service.addEngineer(engineer);
    }

    @DeleteMapping
    void deleteEngineer(@RequestBody SoftwareEngineer engineer){
        service.removeEngineer(engineer);
    }

    @PutMapping
    void updateEngineer(@RequestBody SoftwareEngineer engineer){
        service.updateEngineer(engineer);
    }
}