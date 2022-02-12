package com.vipas.gquendelibray.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Greeting {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}