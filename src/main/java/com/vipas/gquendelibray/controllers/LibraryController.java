package com.vipas.gquendelibray.controllers;

import com.vipas.gquendelibray.models.Library;
import com.vipas.gquendelibray.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

@Autowired
LibraryRepository libraryRepository;


@PostMapping("/addBook")
public void addBookImplentation(@RequestBody Library library)
{
library.setId(library.getIsbn()+library.getAisle());
libraryRepository.save(library);


}





}