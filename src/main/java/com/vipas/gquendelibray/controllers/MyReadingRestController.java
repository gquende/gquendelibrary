package com.vipas.gquendelibray.controllers;
import com.vipas.gquendelibray.models.MyReading;
import com.vipas.gquendelibray.models.MyReadingAnnotation;
import com.vipas.gquendelibray.repository.MyReadingAnnotationRepository;
import com.vipas.gquendelibray.repository.MyReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/myreading/api")
public class MyReadingRestController {

    @Autowired
    MyReadingRepository myReadingRepository;

    @Autowired
    MyReadingAnnotationRepository myReadingAnnotationRepository;

    @PostMapping("/reading/new")
    public ResponseEntity addReading(@RequestBody MyReading myReading)
    {
        myReadingRepository.save(myReading);
        return new ResponseEntity("Saved Successful", HttpStatus.CREATED);
    }

    @GetMapping("/reading/{id}")
    public ResponseEntity getReading(@PathVariable("id") long id)
    {
        Optional<MyReading> optional= myReadingRepository.findById(id);
        if (optional.isPresent())
        {
            return new ResponseEntity(optional.get(),HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity("Object not Found",HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/reading/all")
    public ResponseEntity getAllReadings()
    {
        List<MyReading> myReadingList=myReadingRepository.findAll();
        return new ResponseEntity(myReadingList,HttpStatus.OK);
    }

    @DeleteMapping("/reading/{id}")
    public ResponseEntity deleteReading(@PathVariable("id") long id)
    {
        Optional<MyReading> optional=myReadingRepository.findById(id);
        if (optional.isPresent())
        {
            return new ResponseEntity("",HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity("Object not found", HttpStatus.NOT_FOUND);
        }
    }


  //Todo `Annotations functions...


    @GetMapping("/reading/{reading_id}/annotations")
public ResponseEntity getAllAnnotations(@PathVariable(value = "reading_id" ) long id){
Optional<MyReading> optional= myReadingRepository.findById(id);
        List<MyReadingAnnotation> annotations=new ArrayList<>();
if (optional.isPresent()){
    annotations= myReadingAnnotationRepository.findAll();
}
return new ResponseEntity(annotations,HttpStatus.OK);


}


}