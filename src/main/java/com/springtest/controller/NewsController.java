package com.springtest.controller;

import com.springtest.model.Author;
import com.springtest.model.News;
import com.springtest.service.AuthorServiceImpl;
import com.springtest.service.NewsService;
import com.springtest.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    private AuthorServiceImpl authorService;   //Не разумею як ён будзе праз адзін NewsService
                                               // вызываць розныя метады для News i Author
    @Autowired
    private NewsServiceImpl newsService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addNews() {
        return "news/newsAddForm.jsp";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView viewNews() {

        ModelAndView modelAndView = new ModelAndView("news/newsSummary.jsp");
        List<News> data = newsService.getAll();
        List<Author> author = authorService.getAll();
        modelAndView.addObject("recordsList", data);
        modelAndView.addObject("authorList", author);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postNews(HttpServletRequest request) {
        newsService.saveRecordFromRequest(request);


        return "redirect:/news/view";
    }

    //Рэдакціраванне  навін
    @RequestMapping(value = "/newsEdit/{id}", method = RequestMethod.GET)
    public ModelAndView editNews(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("news/newsEdit.jsp");
        modelAndView.addObject("editNews", newsService.getOne(id));
        modelAndView.addObject("authorName", authorService.getOne(id));

        return modelAndView;
    }

    @RequestMapping(value = "/newsEdit/{id}", method = RequestMethod.POST)
    public String editNewsSave(@PathVariable("id") Long id) {

        newsService.save(newsService.getOne(id));
        authorService.save(authorService.getOne(id));

        return "redirect:/news/view";
    }

    //Выдаденне навін
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deleteNews(@PathVariable("id") Long id) {
        newsService.delete(id);
        return "redirect:/news/view";
    }
}
