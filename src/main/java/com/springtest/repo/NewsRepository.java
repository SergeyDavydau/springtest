package com.springtest.repo;

import com.springtest.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {

	/* TODO: Дальше 2 выборки делающих одно и то же двумя разными путями */



    /* Выборка на spring data jpa. Выборка сформируется на основе названия метода (главное писать без ошибок).
         * в данном случае - find All - значит найти все записи в таблице News
         * (так как репозитория относитлся к сущности NEWS)*/
    List<News> findAll();

//    News findOne(Long id);

    /* То же самое, но выборка написанная вручную*/
    @Query("SELECT id, content, title FROM News")
    List<News> getAllNews();    //НАЗВАНИЕ МЕТОДА ПРИДУМЫВАЕМ САМИ (КАКОЕ ХОТИМ)

	/* TODO: Пример посложнее. Тоже две выборки делающих одно и то же*/

    /* Выборка по spring data jpa:
     * в данном случае - find top 5 - значит найти 5 последних записей в таблице News
     * TODO: почитать можно здесь: https://habr.com/post/139421 */
    List<News> findTop5By();

	/* То же самое, но выборка написанная вручную*/
//	@Query(value = "SELECT id, content, title FROM News ORDER BY Id DESC LIMIT 5", nativeQuery = true)
//	List<News> getLast5News();
}