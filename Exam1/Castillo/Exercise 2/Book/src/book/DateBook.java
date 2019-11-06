/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Angel castillo
 */
public class DateBook {
    private String title; 
    private String author;
    private String editorial;
    private int year;

    public DateBook(String title, String author, String editorial, int year) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Editorial: "+this.editorial);
        System.out.println("Publication year: "+this.year);
        System.out.println("\n");
    }
}
