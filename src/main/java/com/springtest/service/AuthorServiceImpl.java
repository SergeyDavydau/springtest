package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {

        return (List<Author>) authorRepository.findAll();
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


}
