package com.javabrazzers.service;

import com.javabrazzers.domain.BusRoute;
import com.javabrazzers.repository.BusRouteRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;
import org.springframework.stereotype.Service;

@Service
public class BusRouteService extends AbstractBaseService<BusRoute> {
    private final BusRouteRepository repository;

    public BusRouteService(BusRouteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected BaseRepository<BusRoute, Long> getRepository() {
        return repository;
    }
}
