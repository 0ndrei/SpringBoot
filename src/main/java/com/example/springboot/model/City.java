package com.example.springboot.model;

import java.net.PortUnreachableException;

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
    public String getCountryName(String countryName) {
        return countryName;
    }

    public void setCountryName() {
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
