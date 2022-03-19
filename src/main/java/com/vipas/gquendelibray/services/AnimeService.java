package com.vipas.gquendelibray.services;


import com.vipas.gquendelibray.exception.BadRequestException;
import com.vipas.gquendelibray.models.Anime;
import com.vipas.gquendelibray.repository.AnimeRepository;
import com.vipas.gquendelibray.request.AnimePostRequestBody;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findById(long id){
        return animeRepository.findById(id).orElseThrow(()->new BadRequestException("Anime not Found"));
    }
    public void save(AnimePostRequestBody animePostRequestBody){
        Anime anime= Anime.builder().name(animePostRequestBody.getName()).build();
        animeRepository.save(anime);
    }



}