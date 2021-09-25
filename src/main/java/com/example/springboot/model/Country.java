package com.example.springboot.model;

public class Country {
    private Integer id = null;
    String nameCountry = null;
    public static Integer autoincrementId = 0;

    Country() {

    }

    public Country(String name){
        Country.autoincrementId++;
        this.id = Country.autoincrementId;
        this.nameCountry = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nameCountry;
    }

    public void setName(String name) {
        this.nameCountry = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + nameCountry + '\'' +
                '}';
    }
}