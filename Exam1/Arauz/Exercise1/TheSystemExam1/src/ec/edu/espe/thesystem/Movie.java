/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.thesystem;

/**
 *
 * @author Cristian Arauz
 */
public class Movie {
    
   private String name;
   private String title;
   private int year;
   private String genre;
   private String sysnopsis;
  
    public Movie() {

    }

    public Movie (String name, String title, String genre, String sysnopsis, int year){
        this.name = name;
        this.genre = genre;
        this.title = title;
        this.year = year;
        this.sysnopsis = sysnopsis;
    }

    Movie(String name, int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSysnopsis() {
        return sysnopsis;
    }

    public void setSysnopsis(String sysnopsis) {
        this.sysnopsis = sysnopsis;
    }
       
}
