package com.vipas.gquendelibray.services;


import com.vipas.gquendelibray.models.MyReading;
import com.vipas.gquendelibray.repository.MyReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyReadingServices {

    @Autowired
    MyReadingRepository myReadingRepository;

    public void save(MyReading myReading){
        myReadingRepository.save(myReading);
    }




}