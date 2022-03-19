package com.vipas.gquendelibray.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder //Serve para fazer construcao de um objecto dessa classe
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Anime(String name) {
        this.name = name;
    }
    public Anime(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}