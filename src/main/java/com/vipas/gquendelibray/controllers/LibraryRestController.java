package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/library")
public class LibraryRestController{

    @GetMapping
    public ResponseEntity<Book> getBook(){
        return new ResponseEntity<>(new Book("Inovacao- A arte de Steve Jobs","Carmine Gallo","Lua de Papel",2010,"1ª"), HttpStatus.OK);
    }

}