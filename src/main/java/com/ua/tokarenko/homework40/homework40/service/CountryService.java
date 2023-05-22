package com.ua.tokarenko.homework40.homework40.service;

import com.ua.tokarenko.homework40.homework40.domain.Country;
import com.ua.tokarenko.homework40.homework40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    public void save(Country country) {
        countryRepository.save(country);
    }


}
