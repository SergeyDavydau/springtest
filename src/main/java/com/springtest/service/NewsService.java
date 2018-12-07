package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.model.News;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface NewsService {

    <T> List<T> getAll();

     <T> void save(T obj);

    void saveRecordFromRequest(HttpServletRequest request);

    <T> T getOne(Long id);

    void delete(Long id);


}