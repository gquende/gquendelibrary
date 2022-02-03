package com.vipas.gquendelibray.models;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(nullable = false)
    public String title;


    public String authors;

    @Column(nullable = false)
    public String publish;
    public int year;
    @Column(nullable = false)
    public String edition;

    public Book(){


    }

    public Book(String title, String authors, String publish, int year, String edition) {
        this.title = title;
        this.authors = authors;
        this.publish = publish;
        this.year = year;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }


}