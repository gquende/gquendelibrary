package com.vipas.gquendelibray.controllers;


import com.vipas.gquendelibray.models.Book;
import com.vipas.gquendelibray.models.UploadFileResponse;
import com.vipas.gquendelibray.services.FileStorageService;
import com.vipas.gquendelibray.services.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/api/library")
public class LibraryRestController{

    @Autowired
    LibraryService libraryService;

    @Autowired
    FileStorageService strservice;

    private static final Logger logger= LoggerFactory.getLogger(LibraryRestController.class);


    @GetMapping("/books/get/{id}")
    public ResponseEntity getBook(@PathVariable Long id){

    return new ResponseEntity(libraryService.getBookWithID(id), HttpStatus.OK);


    }


    @PostMapping("/uploadfile")
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file){

        String fileName= strservice.storeFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/library/downloadFile/").path(fileName).toUriString();
        UploadFileResponse uploadFileResponse=new UploadFileResponse(fileName, fileDownloadUri,file.getContentType(), file.getSize());
        return  new ResponseEntity<>(uploadFileResponse,HttpStatus.CREATED);


    }



    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request){
        Resource resource= strservice.loadFileAsResource(fileName);

        String contentType=null;

        try{
            contentType=request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        }catch (IOException ex){

            logger.info("Could not determine file type.");

        }
        if (contentType==null){
            contentType="appliction/octet-stream";
        }

        return  ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+resource.getFilename()+"\"").body(resource);


    }


}