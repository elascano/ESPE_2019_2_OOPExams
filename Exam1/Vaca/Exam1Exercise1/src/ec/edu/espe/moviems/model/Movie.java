/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.moviems.model;

import java.util.Scanner;

/**
 *
 * @author Edison Vaca
 */
public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genere;
    private String country;
    private Director director;

    public Movie() {
    }
    
    public void dataEntry(){
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\tMovie Information\n");
        try{
           
            System.out.println("Title: ");
            this.title = scn.nextLine(); 
            System.out.println("Synopsis: ");
            this.synopsis = scn.nextLine();
            System.out.println("Year: ");
            this.year = Integer.parseInt(scn.nextLine());
            System.out.println("Genere: ");
            this.genere = scn.nextLine();
            System.out.println("Country: ");
            this.country = scn.nextLine();
        
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
        Director director = new Director();
        director.dataEntryDirector();
        this.director = director;
    }
    public void showInformation(){
        System.out.println("\n\tMovie Information");
        System.out.println("Title     : "+this.title);
        System.out.println("Synopsis  : "+this.synopsis);
        System.out.println("Year      : "+this.year);
        System.out.println("Genere    : "+this.genere);
        System.out.println("Country   : "+this.country);
        this.director.showInformationA();
    }
}
