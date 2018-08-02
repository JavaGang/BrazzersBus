package com.javabrazzers.service;

import com.javabrazzers.domain.Region;
import com.javabrazzers.repository.RegionRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class RegionService extends AbstractBaseService<Region> {

    public final RegionRepository repository;

    protected BaseRepository<Region, Long> getRepository() {
        return repository;
    }

    public RegionService(RegionRepository repository) {
        this.repository = repository;
    }
}
