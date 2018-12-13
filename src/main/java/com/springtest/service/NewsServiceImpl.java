package com.springtest.service;

import com.springtest.model.Author;
import com.springtest.model.News;
import com.springtest.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private AuthorService authorService;

    @Override
    public List<News> getAll() {
//		метод findAll (Один из стандартных методов всех репозиторий) возвращает все записи из соответствующей модели таблице из БД
        return (List<News>) newsRepository.findAll();
    }


    @Override
    public void saveRecordFromRequest(HttpServletRequest request) {
        News news = new News();

        String title = request.getParameter("title");
        String content = request.getParameter("content");


        news.setTitle(title);
        news.setContent(content);

//		метод save (Один из стандартных методов всех репозиторий) кладёт объект в БД в соответствующиую этой модели таблицу
        newsRepository.save(news);
    }

    @Override
    public void saveEditFromRequest(HttpServletRequest request) {
        News news = new News();
        Long id = Long.valueOf(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Long authorId = Long.valueOf(request.getParameter("author"));

        Author author =  authorService.getOne(authorId);

        news.setId(id);
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);

//		метод save (Один из стандартных методов всех репозиторий) кладёт объект в БД в соответствующиую этой модели таблицу
        newsRepository.save(news);
    }

    @Override
    public News getOne(Long id) {
        return newsRepository.findOne(id);

    }

    @Override
    public void delete(Long id) {
        newsRepository.delete(id);
    }

    @Override
    public HashMap<String, List<Object>> getComboboxOptions() {	//тут будут все доступные варианты для разных выпадающих списков при редактировании новостей
        HashMap<String, List<Object>> options = new HashMap<>();
        List<Object> authors = new ArrayList<>(authorService.getAll());

        options.put("authors", authors);
        return options;
    }
}