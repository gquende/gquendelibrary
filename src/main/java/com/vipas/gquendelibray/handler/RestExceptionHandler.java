package com.vipas.gquendelibray.handler;


import com.vipas.gquendelibray.exception.BadRequestException;
import com.vipas.gquendelibray.exception.BadRequestExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


/*Esta classe fara com os controllers usem ele como uma flag*/


@ControllerAdvice
public class RestExceptionHandler {


    @ExceptionHandler(BadRequestException.class) /*Informa aos controladores toda vez que houver uma excessao */
    public ResponseEntity<BadRequestExceptionDetails> handlerBadException(BadRequestException badRequestException){
        return new ResponseEntity<>(BadRequestExceptionDetails.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("Bad Request Exception, Check the Documentation")
                .details(badRequestException.getMessage())
                .developerMessage(badRequestException.getClass().getName())
                .build(),HttpStatus.BAD_REQUEST);
    }


}