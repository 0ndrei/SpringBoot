package com.example.springboot.model;

import com.example.springboot.controller.CountryController;

public class City extends Country{
    private Integer id = null;
    private String nameCity= null;

    private Integer countryId = null;
    private String countryName = null;
    public static Integer autoincrementId = 0;

    City(){

    }

    public City(String name, Integer countryId){
        City.autoincrementId++;
        this.id = City.autoincrementId;
        this.nameCity = name;
        this.countryId = countryId;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nameCity;
    }

    public void setName(String name) {
        this.nameCity = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    //todo
    public String getCountryName(){
        //todo to implement this method
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + nameCity + '\'' +
                ", countryId=" + countryId +
                ", countryName=" + countryName +
                '}';
    }
}
