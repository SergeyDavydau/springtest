package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.model.News;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface AuthorService {
    List<Author> getAll();

    void saveRecordFromRequest(HttpServletRequest request);

    void saveEditFromRequest(HttpServletRequest request);

    Author getOne(Long id);

    void delete(Long id);

    List<News> getNewsByAuthor(Long id);
}
