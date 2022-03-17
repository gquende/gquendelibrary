package com.vipas.gquendelibray.models;


import javax.persistence.*;

@Entity
@Table(name = "reading_annotations")
public class MyReadingAnnotation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private long id;
    private String anontation;
    private String date;


    @ManyToOne
    @JoinColumn(name = "my_reading_id")
    private MyReading myReading;

    public MyReadingAnnotation(String anontation, String date) {
        this.anontation = anontation;
        this.date = date;
    }
    public  MyReadingAnnotation(){

    }

    public long getId() {
        return id;
    }
    public String getAnontation() {
        return anontation;
    }

    public void setAnontation(String anontation) {
        this.anontation = anontation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}