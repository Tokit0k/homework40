package com.ua.tokarenko.homework40.homework40.controller;

import com.ua.tokarenko.homework40.homework40.domain.City;
import com.ua.tokarenko.homework40.homework40.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/city")
@RequiredArgsConstructor
public class CityController {


    private final CityService cityService;


    @GetMapping("/city")
    public List<City> findAll() {
        return cityService.findAll();
    }

    @GetMapping("/city/{id}")
    public Optional<City> findById(@PathVariable int id) {
        return cityService.findById(id);
    }

    @PostMapping("/city")
    public void save(City city) {
        cityService.save(city);
    }


}
