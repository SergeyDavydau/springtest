package com.springtest.controller;

import com.springtest.model.News;
import com.springtest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "test.jsp";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("news.jsp");
		List<News> news = newsService.getStaticNewsList();
		modelAndView.addObject("records", news);
		return modelAndView;
	}
}
