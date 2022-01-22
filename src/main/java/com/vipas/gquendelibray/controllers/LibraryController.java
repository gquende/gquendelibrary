package com.vipas.gquendelibray.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {




@RequestMapping("/")
public String home(){
    return "home";
}



}