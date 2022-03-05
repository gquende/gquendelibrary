package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.Book;
import com.vipas.gquendelibray.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/library")
public class LibraryRestController{

    @Autowired
    LibraryService libraryService;

    @GetMapping("/books/get/{id}")
    public ResponseEntity getBook(@PathVariable Long id){
//        return new ResponseEntity<>(new Book("Inovacao- A arte de Steve Jobs","Carmine Gallo","Lua de Papel",2010,"1ª"), HttpStatus.OK);
    return new ResponseEntity(libraryService.getBookWithID(id), HttpStatus.OK);


    }

}