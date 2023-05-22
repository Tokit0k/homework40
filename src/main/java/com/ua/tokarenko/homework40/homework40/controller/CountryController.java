package com.ua.tokarenko.homework40.homework40.controller;

import com.ua.tokarenko.homework40.homework40.domain.Country;
import com.ua.tokarenko.homework40.homework40.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/country")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @GetMapping("/country/{id}")
    public Optional<Country> findById(int id) {
        return countryService.findById(id);
    }
    @PostMapping("/country")
    public void save(Country country) {
        countryService.save(country);
    }

}
