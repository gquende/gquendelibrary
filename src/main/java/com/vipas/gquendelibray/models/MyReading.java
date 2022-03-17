package com.vipas.gquendelibray.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "my_readings")
public class MyReading{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String title;
    private String authors;
    private String readingMode;
    private int numberOfPages;
    private int numberOfChapters;
    private boolean alreadyRead;
    private String planningMode;
    private int goalOfDailyPagesOrChapter;
    private String goalOfEndDate;
    private String bookCover;
    private int pagesOrChapterRead;
    private String previewToEnd;


    @OneToMany(mappedBy = "myReading")
    private List<MyReadingAnnotation> annotations;


    public MyReading(){}

    public MyReading(String title, String authors, String readingMode, int numberOfPages, boolean alreadyRead, String planningMode, int goalOfDailyPagesOrChapter, String bookCover) {
        this.title = title;
        this.authors = authors;
        this.readingMode = readingMode;
        this.numberOfPages = numberOfPages;
        this.alreadyRead = alreadyRead;
        this.planningMode = planningMode;
        this.goalOfDailyPagesOrChapter = goalOfDailyPagesOrChapter;
        this.bookCover = bookCover;
    }

    public MyReading(String title, String authors, String readingMode, int numberOfPages, int numberOfChapters, boolean alreadyRead, String planningMode, int goalOfDailyPagesOrChapter, String goalOfEndDate, String bookCover) {
        this.title = title;
        this.authors = authors;
        this.readingMode = readingMode;
        this.numberOfPages = numberOfPages;
        this.numberOfChapters = numberOfChapters;
        this.alreadyRead = alreadyRead;
        this.planningMode = planningMode;
        this.goalOfDailyPagesOrChapter = goalOfDailyPagesOrChapter;
        this.goalOfEndDate = goalOfEndDate;
        this.bookCover = bookCover;
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

    public String getReadingMode() {
        return readingMode;
    }

    public void setReadingMode(String readingMode) {
        this.readingMode = readingMode;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(int numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    public boolean isAlreadyRead() {
        return alreadyRead;
    }

    public void setAlreadyRead(boolean alreadyRead) {
        this.alreadyRead = alreadyRead;
    }

    public String getPlanningMode() {
        return planningMode;
    }

    public void setPlanningMode(String planningMode) {
        this.planningMode = planningMode;
    }

    public int getGoalOfDailyPagesOrChapter() {
        return goalOfDailyPagesOrChapter;
    }

    public void setGoalOfDailyPagesOrChapter(int goalOfDailyPagesOrChapter) {
        this.goalOfDailyPagesOrChapter = goalOfDailyPagesOrChapter;
    }

    public String getGoalOfEndDate() {
        return goalOfEndDate;
    }

    public void setGoalOfEndDate(String goalOfEndDate) {
        this.goalOfEndDate = goalOfEndDate;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public int getPagesOrChapterRead() {
        return pagesOrChapterRead;
    }

    public void setPagesOrChapterRead(int pagesOrChapterRead) {
        this.pagesOrChapterRead = pagesOrChapterRead;
    }

    public String getPreviewToEnd() {
        return previewToEnd;
    }

    public void setPreviewToEnd(String previewToEnd) {
        this.previewToEnd = previewToEnd;
    }

    public long getId() {
        return id;
    }

}