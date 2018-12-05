package com.springtest.controller;

import com.springtest.model.News;
import com.springtest.repo.NewsRepository;
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
	private NewsService newsService;

    @Autowired
    private NewsServiceImpl newsServiceImpl;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNews() {
		return "news/newsAddForm.jsp";
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)

	public ModelAndView viewNews() {

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
    //Рэдакціраванне  навін
    @RequestMapping(value ="news/edit/{id}", method=RequestMethod.GET)
    public String editNews(@PathVariable("id")Long id ,RedirectAttributes rd){

        News newsEdit = newsServiceImpl.getOne(id);

        rd.addFlashAttribute("editNews",newsEdit);
      return "redirect:/news/add" ;
    }
    //Выдаденне навін
    @RequestMapping(value ="news/delete/{id}", method=RequestMethod.GET)
    public String deleteNews(@PathVariable("id") Long id){
      newsServiceImpl.deleteNews(id);
        return "redirect:/news/view";
    }
}
