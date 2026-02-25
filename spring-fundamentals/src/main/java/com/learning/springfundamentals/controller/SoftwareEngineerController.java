package com.learning.springfundamentals.controller;

import com.learning.springfundamentals.model.SoftwareEngineer;
import com.learning.springfundamentals.repository.SoftwareEngineerRepository;
import com.learning.springfundamentals.service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/software-engineers")
@CrossOrigin(origins = "http://localhost:4200")
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
    SoftwareEngineer addEngineer(@RequestBody SoftwareEngineer engineer){
        return service.addEngineer(engineer);
    }

    @DeleteMapping("{id}")
    void deleteEngineer(@PathVariable Integer id){
        service.removeEngineer(id);
    }

    @PutMapping
    void updateEngineer(@RequestBody SoftwareEngineer engineer){
        service.updateEngineer(engineer);
    }
}