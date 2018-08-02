package com.javabrazzers.service;

import com.javabrazzers.domain.BusStation;
import com.javabrazzers.repository.BusStationRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class BusStationService extends AbstractBaseService<BusStation> {

    final public BusStationRepository repository;

    protected BaseRepository<BusStation, Long> getRepository() {
        return repository;
    }

    public BusStationService(BusStationRepository repository) {
        this.repository = repository;
    }
}
