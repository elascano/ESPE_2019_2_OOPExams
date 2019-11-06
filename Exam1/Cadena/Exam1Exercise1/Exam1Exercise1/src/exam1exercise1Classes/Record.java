/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1exercise1Classes;

import java.util.Scanner;

/**
 *
 * @author Pablo Cadena
 */
public class Record {
    private String title;
    private String synopsis;
    private String year;
    private String gnre;
    private String country;
    private String directorName;
    private String directorLast;
    private String directorCountry;
    
    public Record(){
        
    }
    public Record(String title, String synopsis, String year, String gnre, String country){
        this.title = title;
        this.synopsis = synopsis;
        this.year =year;
        this.gnre = gnre;
        this.country = country;
       
    }

    public void entryData(){
        Scanner leer = new Scanner(System.in);
        System.out.println("titulo: ");
        this.title = leer.nextLine();
        System.out.println("sinopsis: ");
        this.synopsis = leer.nextLine();
        System.out.println("Año: ");
        this.year = leer.nextLine();
        System.out.println("Genero: ");
        this.gnre = leer.nextLine();
        System.out.println("Pais de la pelicula: ");
        this.country = leer.nextLine();
        System.out.println("Nombre autor: ");
        this.directorName = leer.nextLine();
        System.out.println("Apellido autor: ");
        this.directorLast = leer.nextLine();
        System.out.println("Pais autor: ");
        this.directorCountry = leer.nextLine();
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGnre() {
        return gnre;
    }

    public void setGnre(String gnre) {
        this.gnre = gnre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorLast() {
        return directorLast;
    }

    public void setDirectorLast(String directorLast) {
        this.directorLast = directorLast;
    }

    public String getDirectorCountry() {
        return directorCountry;
    }

    public void setDirectorCountry(String directorCountry) {
        this.directorCountry = directorCountry;
    }
    
}
