package com.learning.springfundamentals.repository;

import com.learning.springfundamentals.model.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository extends
        JpaRepository<SoftwareEngineer, Integer> {

}
