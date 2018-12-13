package com.springtest.repo;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BaseRepository<T> extends CrudRepository<T, Long> {


    @Override
    List<T> findAll();
}
