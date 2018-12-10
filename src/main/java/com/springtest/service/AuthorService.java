package com.springtest.service;

import org.springframework.data.jpa.repository.Query;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sazon_sa
 * Date: 07.12.18
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public interface AuthorService {
    <T> List<T> getAll();

    <T> void save(T obj);




    void saveRecordFromRequest(HttpServletRequest request);
     void saveEditFromRequest(HttpServletRequest request);
    <T> T getOne(Long id);

    void delete(Long id);

}
