package com.vipas.gquendelibray.models;

import javax.persistence.*;


@Entity
@Table(name = "greetings")
public class Greeting {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public Greeting() {

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