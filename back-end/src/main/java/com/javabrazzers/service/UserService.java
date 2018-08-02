package com.javabrazzers.service;

import com.javabrazzers.repository.UserRepository;
import com.javabrazzers.repository.common.BaseRepository;
import com.javabrazzers.service.common.AbstractBaseService;

public class UserService extends AbstractBaseService {
    //comment
    public final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected BaseRepository getRepository() {
        return repository;
    }
}
