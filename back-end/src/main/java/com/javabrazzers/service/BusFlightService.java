package com.javabrazzers.service;

import com.javabrazzers.domain.BusFlight;
import com.javabrazzers.repository.BusFlightRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;
import org.springframework.stereotype.Service;

@Service
public class BusFlightService extends AbstractBaseService<BusFlight> {
    public final BusFlightRepository repository;
    @Override
    protected BaseRepository<BusFlight, Long> getRepository() {
        return repository;
    }

    public BusFlightService(BusFlightRepository repository) {
        this.repository = repository;
    }
}
