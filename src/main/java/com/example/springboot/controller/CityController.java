package com.example.springboot.controller;

import com.example.springboot.repository.CitysRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CitysRepository citysRepository = new CitysRepository();

    @PostMapping("countries")
    public String create(@RequestParam String cityName){
        return citysRepository.create(cityName);
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return citysRepository.read(id);
    }

    @GetMapping("countries")
    public String readAll(){ return citysRepository.readAll();
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable Integer id, @RequestParam String countryName){
        return citysRepository.update(id, countryName);
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable Integer id){ return citysRepository.delete(id); }
}
