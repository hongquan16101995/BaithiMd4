package com.example.quan.repository;

import com.example.quan.models.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    Page<City> findAllByNameContaining(String name, Pageable pageable);
}
