/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

public class Movie {
    
    private String title; 
    private String synopsis;
    private String genre;
    private int year;
    
    
    public Movie(String title, String synopsis, String genre, int year) {
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
        public void print(){
        System.out.println("Title: "+this.title);
        System.out.println("Synosis: "+this.synopsis);
        System.out.println("Genero: "+this.genre);
        System.out.println("Year: "+this.year);
        System.out.println("\n");
    }
}
