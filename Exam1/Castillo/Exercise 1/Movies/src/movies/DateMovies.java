/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

/**
 *
 * @author Angel castillo
 */
public class DateMovies {
    
    private String litle;
    private String year;
    private String genre;
    private String author;
    
    public  DateMovies(String litle,String year ,String genre,String author ){
        this.litle = litle;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }

    /**
     * @return the litle
     */
    public String getLitle() {
        return litle;
    }

    /**
     * @param litle the litle to set
     */
    public void setLitle(String litle) {
        this.litle = litle;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
}
