package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.Book;
import com.vipas.gquendelibray.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Controller
public class LibraryController {


    @Autowired
    BookRepository bookRepository;

@RequestMapping({"/","/home"})
public String index(){
    return "home";
}

@RequestMapping("/login")
    public String login(){
    return "login";
}

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }


    @GetMapping("/books/new")
    public String addBook(Model model){
    model.addAttribute("book", new Book());
    return "register_book";
    }

    @PostMapping("/books/save")
    public String saveBook(Book book, BindingResult result){
        if (result.hasErrors())
            return "register_book";
        bookRepository.save(book);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public ModelAndView listBooks(){
    ModelAndView mv= new ModelAndView("book/list");
        List<Book> books= bookRepository.findAll();
        mv.addObject("books",books);
        return  mv;
    }

    @GetMapping("/books/author")
    public void getAuthorBooks(@RequestParam(value="authorname") String authorname){

    


    }


}