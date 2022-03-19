package com.vipas.gquendelibray.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*Esta é uma classe de Excessão costumizada e sempre que é instanciada ela retorna um BAD_REQUEST*/


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}