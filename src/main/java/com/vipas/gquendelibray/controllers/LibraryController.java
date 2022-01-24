package com.vipas.gquendelibray.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

@RequestMapping({"/","/home"})
public String index(){
    return "home";
}

@RequestMapping("/login")
    public String login(){
    return "login";
}

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }


}