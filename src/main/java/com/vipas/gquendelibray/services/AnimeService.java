package com.vipas.gquendelibray.services;


import com.vipas.gquendelibray.exception.BadRequestException;
import com.vipas.gquendelibray.models.Anime;
import com.vipas.gquendelibray.repository.AnimeRepository;
import com.vipas.gquendelibray.request.AnimePostRequestBody;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor //Cria automaticamente construtor com atributos finais
//@AllArgsConstructor
public class AnimeService {

//    @Autowired
    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findById(long id){
//        throw new BadRequestException("Erro");
       return animeRepository.findById(id).orElseThrow(()->new BadRequestException("Anime not Found"));
    }

    @Transactional // Serve para levar em consideracao as excessoes ou seja a operacao na base de dados nao vai concluir sem o metodo ter concluid porem isso nao funciona para excessoes Checked, para essas excessoes use: @Transaccional(rollbackFor=Exception.class)
    public void save(AnimePostRequestBody animePostRequestBody){
        Anime anime= Anime.builder().name(animePostRequestBody.getName()).build();
        animeRepository.save(anime);
    }



}