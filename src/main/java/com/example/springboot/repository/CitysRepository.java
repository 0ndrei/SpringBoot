package com.example.springboot.repository;

import java.util.ArrayList;

public class CitysRepository {
    ArrayList<String> city = new ArrayList<>();

    public CitysRepository(){
        this.city.add("Balti");
        this.city.add("Chisinau");
        this.city.add("Ocnita");
        this.city.add("Falesti");
    }

    public String create(String countryName){
        this.city.add(countryName);
        return "City created";
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

    public String update(Integer id, String countryName){
        try {
            this.city.set(id, countryName);
            return "Country updated";
        } catch (Exception exception){
            return "Country not found";
        }
    }

}
