package com.learning.springfundamentals.model;

import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SoftwareEngineer that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
