package com.springtest.repo;

import com.springtest.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.management.QueryEval;

@Repository
public interface NewsRepository extends BaseRepository<News> {

	@Query("UPDATE News SET views_amount = views_amount + 1 WHERE id = ?1")
	void increaseViewsAmount(Long newsId);
}