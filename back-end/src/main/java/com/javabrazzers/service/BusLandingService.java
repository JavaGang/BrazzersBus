package com.javabrazzers.service;

import com.javabrazzers.domain.BusLanding;
import com.javabrazzers.repository.BusLandingRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class BusLandingService extends AbstractBaseService<BusLanding> {
    private final BusLandingRepository repository;

    public BusLandingService(BusLandingRepository repository) {
        this.repository = repository;
    }

    @Override
    protected BaseRepository<BusLanding, Long> getRepository() {
        return repository;
    }
}
