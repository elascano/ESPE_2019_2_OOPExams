/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String litle = null, synopsis = null, genre = null;
        int year = 0;
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner enter= new Scanner(System.in);
        File movie = new File ("MOVIE.csv");
        do{
            
        
        System.out.println("*********Menu de opciones*******");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Salir");
        
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("Ingrese los datos");
    if(!movie.exists()){
        try {
            movie.createNewFile();
            System.out.println("Type a litle: ");
            litle = enter.next();
            System.out.println("Type a synopsis: ");
            synopsis = enter.next();   
            System.out.print("Type a genre: ");
            genre = enter.next();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(movie, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + litle );
                mostrar.println("synopsis: " + synopsis );
                mostrar.println("Genre: " + genre);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Type a litle: ");
            litle = enter.next();
            System.out.print("Type a synopsis: ");
            synopsis = enter.next();   
            System.out.print("Enter the year of the movie: ");
            year = enter.nextInt();
            System.out.print("Type a genre: ");
            genre = enter.next();
            
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(movie, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("litle: "+ litle);
                mostrar.println("synopsis: "+ synopsis);
                mostrar.println("Year: "+ year);
                mostrar.println("Genre: "+ genre);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
                
                
                
                break;
                
            case 2:
                System.out.println("Muestra los datos");
                
            default :
                System.out.println("Selecion una opcion");
                System.out.println("");
                System.out.println("Litle: " + litle);
                System.out.println("Synopsis: " + synopsis);              
                System.out.println("Year: " + year);
                System.out.println("Genre: " + genre);
                
                break;
        }
        
        }while(opcion !=3);
    }

    
}