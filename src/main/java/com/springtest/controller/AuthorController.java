package com.springtest.controller;

import com.springtest.model.Author;
import com.springtest.repo.AuthorRepository;
import com.springtest.repo.NewsRepository;
import com.springtest.service.AuthorServiceImpl;
import com.springtest.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/author")
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;

    @Qualifier("newsRepository")
    @Autowired
    private NewsRepository newsRepository;


    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView authorView() {
        ModelAndView authorViews = new ModelAndView("author/authorView.jsp");
        List<Author> authors = authorService.getAll();
        authorViews.addObject("authorName", authors);
        return authorViews;

    }

    @RequestMapping(value ="/add", method=RequestMethod.GET)
    public ModelAndView modelAndView (){
        return new ModelAndView("author/authorAddForm.jsp");
    }
    @RequestMapping(value ="/add", method=RequestMethod.POST)
    public String model (HttpServletRequest request){
        authorService.saveRecordFromRequest(request);
        return "redirect:/author";
    }
    @RequestMapping(value ="/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editRequest (@PathVariable("id") Long id){
        ModelAndView modelEdit = new ModelAndView("author/authorEdit.jsp");
        modelEdit.addObject("authorName",authorService.getOne(id));
        modelEdit.addObject("authorNews",newsRepository.findByAuthor(id));

        return modelEdit;
    }
    @RequestMapping(value ="/edit/{id}", method=RequestMethod.POST)
    public String editResponse(@PathVariable("id") Long id,HttpServletRequest request){
        authorService.saveEditFromRequest(request);
        return "redirect:/author";
    }
    @RequestMapping(value ="/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable("id") Long id){
        authorService.delete(id);
        return"redirect:/author";
    }

}
