package com.example.quan.service.impl;

import com.example.quan.models.Country;
import com.example.quan.repository.CountryRepository;
import com.example.quan.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
