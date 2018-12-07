package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.model.News;
import com.springtest.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class AuthorServiceImpl implements NewsService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {

        return  (List<Author>) authorRepository.findAll();
    }


    @Override
    public <T> void save(T obj) {
        authorRepository.save((Author)obj);
    }

    @Override
    public void saveRecordFromRequest(HttpServletRequest request) {
        Author author = new Author();

        String firstName = request.getParameter("title");
        String secondName = request.getParameter("content");

        author.setFirstName(firstName);
        author.setSecondsName(secondName);


        authorRepository.save(author);
    }

    @Override
    public Author getOne(Long id) {
        return authorRepository.findOne(id); }

    @Override
    public void delete(Long id) {
        authorRepository.delete(id);
    }
}
