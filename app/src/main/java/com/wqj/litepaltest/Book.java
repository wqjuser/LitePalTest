package com.wqj.litepaltest;


import org.litepal.crud.DataSupport;

public class Book extends DataSupport {
    private int id;
    private String name;
    private String author;
    private double price;
    private int pages;
    private String press;

    public Book( String name, String author, double price, int pages, String press) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.press = press;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}
