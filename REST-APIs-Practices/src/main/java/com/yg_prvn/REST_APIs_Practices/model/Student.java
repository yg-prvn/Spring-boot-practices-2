package com.yg_prvn.REST_APIs_Practices.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {

    private int id;

    @NotBlank(message = "Title is required")
    @Size(min = 4, message = "Title must be at least 4 characters long")
    private String name;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
