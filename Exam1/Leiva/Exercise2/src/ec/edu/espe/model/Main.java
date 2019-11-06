/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class Main {
     public static void main(String[] args) {
       
         ArrayList<Book> books = new ArrayList<>();
         String title;
         String author;
         String editorial;
         int publicationYear;
         
         Scanner scan = new Scanner(System.in);
         boolean a = false;
         
         while(!a){
             System.out.println("Insert the name of the book");
             title = scan.nextLine();
             System.out.println("Insert the name Editorial");
             author = scan.nextLine();
             System.out.println("Insert yhe name of Author");
             editorial = scan.nextLine();
             System.out.println("Insert year publication");
             publicationYear = scan.nextInt();
             
             books.add(new Book(title,author,editorial,publicationYear));
             
             System.out.println("Insert 0 to stop the program and another number to continue");
             publicationYear = scan.nextInt();
             if(publicationYear == 0){
                 a = true;
             }
             
             scan.nextLine();
             
         
         }
         
         for (int i = 0; i < books.size(); i++) {
             System.out.println(books.get(i).toString());
             
         }
         
         System.out.println("");
         
         //Busqueda 
         System.out.println("Inicia la busqueda");
         
         System.out.println("insert the year to search");
         publicationYear = scan.nextInt();
         for(int i = 0; i< books.size();i++) {
             if (publicationYear == books.get(i).getPublicYear()){
                 
                 System.out.println(books.get(i).toString());    
             
             }
         
         }
         System.out.println("");
         
         
         System.out.println("insert the editorial to search");
         editorial = scan.nextLine();
         for(int i = 0; i< books.size();i++) {
             if (editorial.equals(books.get(i).getPublicYear())){
                 
                 System.out.println(books.get(i).toString());    
             }
         
         }
         
         System.out.println("insert the editorial to search");
         editorial = scan.nextLine();
         for(int i = 0; i< books.size();i++) {
            if (editorial.equals(books.get(i).getPublicYear())){
                int bookCounter = 0;
                 bookCounter++;
                 System.out.println(books.get(i).toString());    
             }
         
         }
                 
    }
    
}
