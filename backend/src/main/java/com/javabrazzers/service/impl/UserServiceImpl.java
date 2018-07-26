package com.javabrazzers.service.impl;

import com.javabrazzers.domain.User;
import com.javabrazzers.repository.UserRepository;
import com.javabrazzers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService<User> {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<?> listAll() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add); // add - это метод из List
        return users;
    }

    // Поиск по идентификатору
    @Override
    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    // Сохранение в домеиновском объекте(Классе User)
    @Override
    public User saveOrUpdate(User domainObject) {
        return userRepo.save(domainObject);
    }

    // Удаление
    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
