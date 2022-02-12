package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {


    @Autowired
    Greeting greeting;

    AtomicLong counter= new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greetingGet(@RequestParam (value = "name") String name){

greeting.setId(counter.incrementAndGet());
greeting.setContent("Hey I am Learning Spring Boot from"+ name);

return greeting;


    }



}