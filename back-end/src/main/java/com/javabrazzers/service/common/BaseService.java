package com.javabrazzers.service.common;

import com.javabrazzers.domain.BaseEntity;

import java.util.Optional;

public interface BaseService <E extends BaseEntity>{
    Optional<E> getById(Long id);
    boolean exists(Long id);
    E create(E entity);
    Long count();
    E update(E entity);
    void delete(Long id);
    void delete(E entity);
    Iterable<E> getAll(Iterable<Long> ids);
}
