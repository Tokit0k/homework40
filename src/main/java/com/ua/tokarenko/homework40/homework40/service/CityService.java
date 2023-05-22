package com.ua.tokarenko.homework40.homework40.service;

import com.ua.tokarenko.homework40.homework40.domain.City;
import com.ua.tokarenko.homework40.homework40.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public Optional<City> findById(int id) {
        return cityRepository.findById(id);
    }


    public void save(City city) {
        cityRepository.save(city);
    }
}
