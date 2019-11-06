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
public class Director {
    private String name;
    private String lastName;
    private String country;

    public Director() {
    }
    
    public void dataEntryDirector(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tDirector Information\n");
        try{
            
            System.out.println("Name   : ");
            this.name = sc.nextLine(); 
            System.out.println("Last Name  : ");
            this.lastName = sc.nextLine();
            System.out.println("Country  : ");
            this.country = sc.nextLine();
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
    }
    
    public void showInformationA(){
        System.out.println("\n\tDirector Information");
        System.out.println("Name     : "+this.name);
        System.out.println("Last Name: "+this.lastName);
        System.out.println("Country  : "+this.country);
    }
}
