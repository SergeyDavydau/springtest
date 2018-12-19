package com.springtest.controller;

import com.springtest.model.News;
import com.springtest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView summary() {

        ModelAndView modelAndView = new ModelAndView("news/newsSummary.jsp");
        List<News> data = newsService.getAll();

        modelAndView.addObject("recordsList", data);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView modelAndView =new ModelAndView("news/newsAddForm.jsp");
        modelAndView.addObject("options", newsService.getComboboxOptions());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPost(HttpServletRequest request) {
        newsService.saveRecordFromRequest(request);


        return "redirect:/news/view";
    }

    //Рэдакціраванне  навін
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("news/newsEdit.jsp");
        modelAndView.addObject("editNews", newsService.getOne(id));
        modelAndView.addObject("options", newsService.getComboboxOptions());	// доступные варианты для выпадающего списка
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(@PathVariable("id") Long id, HttpServletRequest request) {
        newsService.saveEditFromRequest(request);
        return "redirect:/news/view";
    }

    //Выдаденне навін
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") Long id) {
        newsService.delete(id);
        return "redirect:/news";
    }

    @RequestMapping(value = "/view/{id}", method=RequestMethod.GET)
    public ModelAndView view(@PathVariable("id") Long id){
        ModelAndView modelAndView =new ModelAndView("/news/newsView.jsp");
        modelAndView.addObject("news", newsService.getOne(id));
        return modelAndView;
    }
}
