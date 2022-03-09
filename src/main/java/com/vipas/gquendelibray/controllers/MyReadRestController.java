package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.MyReading;
import com.vipas.gquendelibray.services.MyReadingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/myreading/api")
public class MyReadRestController {

@Autowired
    MyReadingServices myReadingServices;


    @PostMapping("/new")
    public ResponseEntity addReading(@RequestBody MyReading myReading){
        myReadingServices.save(myReading);
        return new ResponseEntity("Saved Successful", HttpStatus.CREATED);

    }
}