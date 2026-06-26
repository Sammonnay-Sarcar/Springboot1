package org.example.springboot1;

import java.util.Objects;

public class SoftwareEngineering {
    private Integer id;
    private String name;
    private String techStack;
    public SoftwareEngineering(){
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineering that = (SoftwareEngineering) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }

    public SoftwareEngineering(Integer id, String techStack, String name) {
        this.id = id;
        this.techStack = techStack;
        this.name = name;
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
}
