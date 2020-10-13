package com.example.quan.service.impl;

import com.example.quan.models.City;
import com.example.quan.repository.CityRepository;
import com.example.quan.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Page<City> findAll(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    @Override
    public Page<City> findAllByName(String name, Pageable pageable) {
        return cityRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public City findCity(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCity(City city) {
        cityRepository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
