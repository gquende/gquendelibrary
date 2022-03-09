package com.vipas.gquendelibray.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningTestUnitTest {

    @Test
    void home() {

        LearningTestUnit learningTestUnit=new LearningTestUnit();
        String response= learningTestUnit.home();
        assertEquals("Hello", response);

    }
}