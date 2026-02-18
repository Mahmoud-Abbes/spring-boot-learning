package com.learning.springfundamentals.service;

import com.learning.springfundamentals.model.SoftwareEngineer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SoftwareEngineerService {

    private final List<SoftwareEngineer> engineers = new ArrayList<>();

    public SoftwareEngineerService() {
        engineers.add(new SoftwareEngineer(1, "James", "angular, spring boot, CSS"));
        engineers.add(new SoftwareEngineer(2, "Alex", "react, node.js, tailwindCSS"));
    }

    public List<SoftwareEngineer> getAllEngineers() {
        return engineers;
    }

    public void addEngineer(SoftwareEngineer engineerParam) {
        if (engineerParam != null) {
            engineers.add(engineerParam);
        }
    }

    public void updateEngineer(SoftwareEngineer engineerParam) {
        if (engineerParam != null) {
            for (int i = 0; i < engineers.size(); i++) {
                if (Objects.equals(engineers.get(i).getId(), engineerParam.getId())) {
                    engineers.set(i, engineerParam);
                }
            }
        }
    }

    public void removeEngineer(SoftwareEngineer engineerParam) {
        if (engineerParam != null) {
            // Equals overridden therefor the remove method will work
            engineers.remove(engineerParam);
        }
    }
}
