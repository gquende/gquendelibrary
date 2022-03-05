package com.vipas.gquendelibray.services;


import com.vipas.gquendelibray.models.Book;
import com.vipas.gquendelibray.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {


@Autowired
    BookRepository bookRepository;


public Book getBookWithID(Long id){

    Optional<Book> optionalBook= bookRepository.findById(id);

    if (optionalBook.isPresent()){
        return  optionalBook.get();
    }
    else
        return null;





}





}