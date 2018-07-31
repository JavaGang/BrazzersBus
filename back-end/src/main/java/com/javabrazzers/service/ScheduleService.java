package com.javabrazzers.service;

import com.javabrazzers.domain.Schedule;
import com.javabrazzers.repository.ScheduleRepositories;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends AbstractBaseService<Schedule> {
    private final ScheduleRepositories repositories;

    public ScheduleService(ScheduleRepositories repositories) {
        this.repositories = repositories;
    }

    @Override
    protected BaseRepository<Schedule, Long> getRepository() {
        return repositories;
    }
}
