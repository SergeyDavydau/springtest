package com.springtest.service;

import com.springtest.model.Author;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


public interface AuthorService {
    List<Author> getAll();

    void saveRecordFromRequest(HttpServletRequest request);

    void saveEditFromRequest(HttpServletRequest request);

    Author getOne(Long id);

    void delete(Long id);

    HashMap<String, List<Object>> getComboboxOptions();
}
