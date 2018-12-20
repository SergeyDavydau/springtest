package com.springtest.repo;


import com.springtest.model.Author;
import com.springtest.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorRepository extends BaseRepository<Author> {


    @Query("SELECT*FROM News  WHERE author=?1")
    List<News> getNewsForAuthor(Long newsId);
}




