package com.springtest.repo;


import com.springtest.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends BaseRepository<News> {


//   @Query("Update  news   SET quantityRead = quantityRead+1  WHERE id =?1")
//    public void updateQuantity(Long idNews);
}