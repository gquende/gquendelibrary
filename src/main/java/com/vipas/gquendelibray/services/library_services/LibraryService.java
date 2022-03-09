package com.vipas.gquendelibray.services.library_services;


import com.vipas.gquendelibray.models.library_models.Book;
import com.vipas.gquendelibray.repository.library_repository.BookRepository;
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