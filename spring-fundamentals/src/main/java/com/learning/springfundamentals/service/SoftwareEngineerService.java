package com.learning.springfundamentals.service;

import com.learning.springfundamentals.model.SoftwareEngineer;
import com.learning.springfundamentals.repository.SoftwareEngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void addEngineer(SoftwareEngineer engineerParam) {
        if (engineerParam != null) {
            softwareEngineerRepository.save(engineerParam);
        }
    }

    public void updateEngineer(SoftwareEngineer engineerParam) {
        // Make sure to not add element if not present
        if (softwareEngineerRepository.findById(engineerParam.getId()).isPresent()){
            softwareEngineerRepository.save(engineerParam);
        }
    }

    public void removeEngineer(SoftwareEngineer engineerParam) {
        if (engineerParam != null) {
            // Equals overridden therefor the remove method will work
            softwareEngineerRepository.deleteById(engineerParam.getId());
        }
    }

    public SoftwareEngineer getEngineerById(Integer id){
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Could not find id: "+ id));
    }
}