package com.vipas.gquendelibray.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {

    @Column(name = "book_name")
    private String book_name;
    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "isbn")
    private String isbn;
    @Column(name = "aisle")
    private String aisle;
    @Column(name = "author")
    private String author;


    public Library(String book_name, String isbn, String aisle, String author) {
        this.book_name = book_name;
        this.isbn = isbn;
        this.aisle = aisle;
        this.author = author;
    }
    public Library(){

    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}