package com.vipas.gquendelibray.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryControllerTest {

    @Test
    void index() {

LibraryController controller= new LibraryController();
String response= controller.index();

assertEquals("home",response);





    }
}