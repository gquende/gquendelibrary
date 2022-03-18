package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.Anime;
import com.vipas.gquendelibray.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("anime")
@AllArgsConstructor //Cria um construtor automaticamente para todos atributos que a classe possui
//@RequiredArgsConstructor //Cria um construtor com todos os atributos que sao finais
public class AnimeController {

    private DateUtil dateUtil;

    @GetMapping("/list")
    public List<Anime> list(){
        List<Anime> animeList= new ArrayList<>();
        animeList.add(new Anime("DBZ"));
        animeList.add(new Anime("Naruto"));
        animeList.add(new Anime("Kimetsu no Yaiba"));
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeList;
    }




}