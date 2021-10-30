package com.addbook;

public class Employee {
    private String title;
    private String genre;
    private String write;
    public Employee(){}
    public Employee(String title, String genre, String write) {
        this.title = title;
        this.genre = genre;
        this.write = write;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }
}
