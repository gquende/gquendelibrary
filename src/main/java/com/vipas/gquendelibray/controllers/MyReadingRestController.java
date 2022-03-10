package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.MyReading;
import com.vipas.gquendelibray.repository.MyReadingRepository;
import com.vipas.gquendelibray.services.MyReadingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/myreading/api")
public class MyReadingRestController {

    @Autowired
    MyReadingRepository myReadingRepository;

    @PostMapping("/reading/new")
    public ResponseEntity addReading(@RequestBody MyReading myReading)
    {
        myReadingRepository.save(myReading);
        return new ResponseEntity("Saved Successful", HttpStatus.CREATED);

    }


    @GetMapping("/reading/{id}")
    public ResponseEntity getReading(@PathVariable("id") long id)
    {
        Optional<MyReading> optional= myReadingRepository.findById(id);
        if (optional.isPresent())
        {
            return new ResponseEntity(optional.get(),HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity("Object not Found",HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/reading/all")
    public ResponseEntity getAllReadings()
    {
        List<MyReading> myReadingList=myReadingRepository.findAll();
        return new ResponseEntity(myReadingList,HttpStatus.OK);

    }

    @DeleteMapping("/reading/{id}")
    public ResponseEntity deleteReading(@PathVariable("id") long id)
    {
        Optional<MyReading> optional=myReadingRepository.findById(id);
        if (optional.isPresent()){
            return new ResponseEntity("",HttpStatus.OK);
        }
        else{
            return  new ResponseEntity("Object not found", HttpStatus.NOT_FOUND);
        }
    }

//    @PutMapping("/reading/update/{id}")
//    public ResponseEntity updateReading(@RequestBody MyReading myReading){
//
//    }


}