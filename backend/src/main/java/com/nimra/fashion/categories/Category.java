package com.nimra.fashion.categories;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int price;

    public long getId() {
        return id;
    }
    public String getName(String name) {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
} //finish off the variables
//fix the Id to return name instead
