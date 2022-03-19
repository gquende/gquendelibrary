package com.vipas.gquendelibray.request;


/*Esta classe serve para evitar com que o utilizador passa o id da classe Anime na API atraves dos metodo POST*/

import lombok.Data;

@Data
public class AnimePostRequestBody {
    String name;
}