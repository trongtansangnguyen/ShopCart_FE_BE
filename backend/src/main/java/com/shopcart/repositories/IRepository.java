package com.shopcart.repositories;

import java.util.List;

public interface IRepository<T> {
    T save(T entity);
    T findById(Long id);
    void deleteById(Long id);
    List<T> findAll();
}
