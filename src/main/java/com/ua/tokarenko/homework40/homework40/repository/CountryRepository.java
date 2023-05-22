package com.ua.tokarenko.homework40.homework40.repository;

import com.ua.tokarenko.homework40.homework40.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
