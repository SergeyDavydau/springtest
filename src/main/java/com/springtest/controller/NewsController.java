package com.springtest.controller;

import com.springtest.model.News;
import com.springtest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "news/newsAddForm.jsp";
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("news/newsSummary.jsp");

		List<News> data = newsService.getAll();
		modelAndView.addObject("recordsList", data);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String postNews(HttpServletRequest request) {
		newsService.saveRecordFromRequest(request);

		return "redirect:/news/view";
	}
}
