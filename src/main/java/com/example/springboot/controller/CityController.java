package com.example.springboot.controller;

import com.example.springboot.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("City")
    public String create(@RequestParam String cityName){
        return citiesRepository.create(cityName);
    }

    @GetMapping("City/{id}")
    public String read(@PathVariable Integer id){
        return citiesRepository.read(id);
    }

    @GetMapping("City")
    public String readAll(){ return citiesRepository.readAll();
    }

    @PutMapping("City/{id}")
    public String update(@PathVariable Integer id, @RequestParam String countryName){
        return citiesRepository.update(id, countryName);
    }

    @DeleteMapping("City/{id}")
    public String delete(@PathVariable Integer id){ return citiesRepository.delete(id); }
}
