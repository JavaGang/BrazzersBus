package com.javabrazzers.service;

import java.util.List;
import java.util.Optional;

/*
  UserService, тут собраны методы,
  которые реализуются в UserServiceImpl
  и используются в Controller-e
*/

public interface UserService<T> {

    List<?> listAll();

    Optional<?> getById(Long id);

    T saveOrUpdate(T domainObject);

    void delete(Long id);

}
