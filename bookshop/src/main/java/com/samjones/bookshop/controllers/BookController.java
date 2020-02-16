package com.samjones.bookshop.controllers;

import com.samjones.bookshop.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping
    public String showAllBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "viewbook";
    }
}
