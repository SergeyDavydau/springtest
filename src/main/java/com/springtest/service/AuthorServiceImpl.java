package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.model.News;
import com.springtest.repo.AuthorRepository;
import com.springtest.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Qualifier("authorRepository")
    @Autowired
    private AuthorRepository authorRepository;

    @Qualifier("newsRepository")
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<Author> getAll() {

        return authorRepository.findAll();
    }

    @Override
    public void saveRecordFromRequest(HttpServletRequest request) {
        Author author = new Author();


        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");


        author.setFirstName(firstName);
        author.setSecondName(secondName);


        authorRepository.save(author);
    }

    @Override
    public void saveEditFromRequest(HttpServletRequest request) {
        Author author = new Author();
        Long id = Long.valueOf(request.getParameter("id"));

        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");

        author.setId(id);
        author.setFirstName(firstName);
        author.setSecondName(secondName);


        authorRepository.save(author);
    }

    @Override
    public Author getOne(Long id) {
        return authorRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        authorRepository.delete(id);
    }

    @Override
    public List<News> getNewsByAuthor(Long id) {
        return newsRepository.findByAuthor(id);
    }
}
