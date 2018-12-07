package com.springtest.repo;

import com.springtest.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AuthorRepository extends CrudRepository<Author,Long > {


}
