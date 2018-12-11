package com.springtest.repo;

import com.springtest.model.Author;
import com.springtest.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorRepository extends CrudRepository<Author,Long > {


}
