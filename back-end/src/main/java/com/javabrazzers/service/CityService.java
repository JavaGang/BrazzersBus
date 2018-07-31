package com.javabrazzers.service;

import com.javabrazzers.domain.City;
import com.javabrazzers.repository.CityRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class CityService extends AbstractBaseService<City> {

    final public CityRepository repository;

    protected BaseRepository<City, Long> getRepository() {
        return repository;
    }

    public CityService(CityRepository repository) {
        this.repository = repository;
    }
}
