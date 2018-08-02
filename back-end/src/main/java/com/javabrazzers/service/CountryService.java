package com.javabrazzers.service;

import com.javabrazzers.domain.Country;
import com.javabrazzers.repository.CountryRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class CountryService extends AbstractBaseService<Country> {
public final CountryRepository repository;
@Override
protected BaseRepository<Country, Long> getRepository() {
        return repository;
        }

public CountryService(CountryRepository repository) {
        this.repository = repository;
        }
        }
