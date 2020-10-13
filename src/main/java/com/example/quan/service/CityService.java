package com.example.quan.service;

import com.example.quan.models.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {
    Page<City> findAll(Pageable pageable);

    Page<City> findAllByName(String name,Pageable pageable);

    City findCity(Long id);

    void saveCity(City city);

    void deleteCity(Long id);
}
