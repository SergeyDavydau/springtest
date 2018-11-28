package com.springtest.service;

import com.springtest.model.News;
import com.springtest.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;

	public List<News> getAll() {
//		метод findAll (Один из стандартных методов всех репозиторий) возвращает все записи из соответствующей модели таблице из БД
		return (List<News>) newsRepository.findAll();
	}

	public void saveRecordFromRequest(HttpServletRequest request) {
		News news = new News();

		String title = request.getParameter("title");
		String content = request.getParameter("content");

		news.setTitle(title);
		news.setContent(content);

//		метод save (Один из стандартных методов всех репозиторий) кладёт объект в БД в соответствующиую этой модели таблицу
		newsRepository.save(news);
	}
}