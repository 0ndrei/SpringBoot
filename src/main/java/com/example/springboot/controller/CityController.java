package com.example.springboot.controller;

import com.example.springboot.repository.CitysRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    CitysRepository citysRepository = new CitysRepository();

    @PostMapping("countries")
    public String create(@RequestParam String cityName){
        return citysRepository.create(cityName);
    }
}
