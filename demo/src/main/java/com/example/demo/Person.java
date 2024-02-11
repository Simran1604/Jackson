package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    // using @JsonProperty to rename the attribute. The output will now have "Full
    // Name" in place of "name"
    @JsonProperty("Full Name")
    private String name;
    private int age;
    private String profession;

    // Constructor
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Getter for name (with READ_ONLY access)
    public String getName() {
        return name;
    }

    // Getter for profession (with PRIVATE scope)
    public String getProfession() {
        return profession;
    }

    // Getter for profession (with PRIVATE scope)
    public int getAge() {
        return age;
    }
}
