package com.springtest.repo;

import com.springtest.model.News;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface NewsRepository extends BaseRepository<News> {
	// обычный Spring'овый Query (на JPQL)
	@Modifying
	@Transactional
	@Query("UPDATE News SET viewsAmount = viewsAmount + 1 WHERE id = ?1")
	void increaseViewsAmount(Long newsId);

	// Native Query (на обычном SQL)
	// Как пример - параметры можно использовать по имени (удобно когда параметров много)

	@Modifying
	@Transactional
	@Query(value = "UPDATE News SET views_amount = views_amount + 1 WHERE id = :newsId", nativeQuery = true)
	void increaseViewsAmountNative(@Param("newsId") Long newsId);

	// обычный Spring'овый Query (на JPQL)
	@Query("SELECT n FROM News n WHERE n.author.id = ?1")
	List<News> findByAuthor(Long authorId);

	// Native Query (на обычном SQL)
	@Query(value = "SELECT n FROM News n WHERE n.author_id = ?1", nativeQuery = true)
	List<News> findByAuthorNative(Long authorId);


}