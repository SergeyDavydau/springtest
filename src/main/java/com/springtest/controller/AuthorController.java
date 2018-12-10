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
@RequestMapping(value = "/author")
public class AuthorController {

    @Autowired
    AuthorServiceImpl authorService;

    @RequestMapping(value = "/authorView/{id}", method = RequestMethod.POST)
    public String addAuthor(HttpServletRequest request) {
        authorService.saveRecordFromRequest(request);
        return "/AuthorView";

    }

    @RequestMapping(value = "/authorView", method = RequestMethod.GET)
    public ModelAndView authorView() {
        ModelAndView authorViews = new ModelAndView("author/authorView.jsp");
        List<Author> authors = authorService.getAll();
        authorViews.addObject("authorName", authors);
        return authorViews;

    }

    @RequestMapping(value ="/authorAdd", method=RequestMethod.GET)
    public ModelAndView modelAndView (){
        ModelAndView author = new ModelAndView("author/authorAddForm.jsp");
        return author;
    }
    @RequestMapping(value ="/authorAdd", method=RequestMethod.POST)
    public String model (HttpServletRequest request){
        authorService.saveRecordFromRequest(request);
        return "redirect:/author/authorView";
    }
    @RequestMapping(value ="/authorEdit/{id}", method=RequestMethod.GET)
    public ModelAndView editRequest (@PathVariable("id") Long id){
        ModelAndView modelEdit = new ModelAndView("author/authorEdit.jsp");
        modelEdit.addObject("authorName",authorService.getOne(id));
        return modelEdit;
    }
    @RequestMapping(value ="/authorEdit/{id}", method=RequestMethod.POST)
    public String editResponse(@PathVariable("id") Long id,HttpServletRequest request){
        authorService.saveEditFromRequest(request);
        return "redirect:/author/authorView";
    }
    @RequestMapping(value ="/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable("id") Long id){
        authorService.delete(id);
        return"redirect:/author/authorView";
    }

}
