package com.javabrazzers.service;

import com.javabrazzers.domain.Ticket;
import com.javabrazzers.repository.TicketRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;
import org.springframework.stereotype.Service;

@Service
public class TicketService extends AbstractBaseService<Ticket> {
    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    protected BaseRepository<Ticket, Long> getRepository() {
        return repository;
    }
}
