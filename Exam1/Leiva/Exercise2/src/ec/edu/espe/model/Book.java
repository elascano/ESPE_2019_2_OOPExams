/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author Steven
 */
public class Book {
    private String title;
    private String editorial;
    private String author;
    private int publicYear;
    
    
    public Book(){
    
    }
    
     public Book(String title, String editorial, String author, int publicYear ){
        
        this.title = title;
        this.editorial = editorial;
        this.author = author;
        this.publicYear = publicYear;
    }
     
    @Override
    public String toString(){
        String information;
        information = "Title: " + title +
                      "\nAuthor " + author +
                      "\nEditorial " + editorial +
                      "\nYear Publication " + publicYear;
        return information;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
    

    
}

