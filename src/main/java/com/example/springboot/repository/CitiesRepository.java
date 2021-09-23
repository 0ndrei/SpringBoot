package com.example.springboot.repository;

import com.example.springboot.model.Cities;

import java.util.ArrayList;

public class CitiesRepository {
    ArrayList<String> city = new ArrayList<>();
    ArrayList<Cities> cityModel = new ArrayList<Cities>();

    public CitiesRepository(){
        this.city.add("Balti");
        this.city.add("Chisinau");
        this.city.add("Ocnita");
        this.city.add("Falesti");
    }

    public String create(String cityName){
        Cities cities = new Cities(cityName);
        this.cityModel.add(cities);
        System.out.println(this.cityModel);

        this.city.add(cityName);
        System.out.println(cityModel);
        return "City created";1
    }

    public String read(Integer id){
        try {
            return id + ":" + this.city.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.city.toString();
    }

    public String update(Integer id, String cityName){
        try {
            this.city.set(id, cityName);
            return "City updated";
        } catch (Exception exception){
            return "City not found";
        }
    }
    public String delete(Integer id) {
        try {
            this.city.remove(this.city.get(id));
            return "City deleted";
        } catch (Exception exception) {
            return "City not found";
        }
    }

}
