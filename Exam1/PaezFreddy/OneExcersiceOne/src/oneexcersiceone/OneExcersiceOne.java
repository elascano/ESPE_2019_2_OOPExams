/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneexcersiceone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Labs-DCCO
 */
public class OneExcersiceOne {
   /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        File estudiante = new File ("C:\\Users\\Labs-DCCO\\Desktop\\PruebaConjunta_PaezBFreddy\\OneExcersiceOne\\Peliculas.csv");
        Scanner enter= new Scanner(System.in);
        String name1,sypnosis1,genre1,name2,sypnosis2,genre2;
        int year1,year2;
        // TODO code application logic here
        
    if(!estudiante.exists()){
        try {
        System.out.println("Ingrese el nombre de una película: ");
        name1 = enter.next();
        System.out.println("Ingrese la sipnosis de una película: ");
        sypnosis1 = enter.next();
        System.out.println("Ingrese el año de una película: ");
        year1 = enter.nextInt();
        System.out.println("Ingrese el genero de una película: ");
        genre1 = enter.next();
        System.out.println("Ingrese el nombre de una película: ");
        name2 = enter.next();
        System.out.println("Ingrese la sipnosis de una película: ");
        sypnosis2 = enter.next();
        System.out.println("Ingrese el año de una película: ");
        year2 = enter.nextInt();
        System.out.println("Ingrese el genero de una película: ");
        genre2 = enter.next();
        System.out.println("\n\nImpresion datos: " + name1 + genre1 + sypnosis1 + year1 );
        System.out.println("\n\nImpresion datos: " + name2 + genre2 + sypnosis2 + year2 );

            
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name1 + name2 );
                mostrar.println("Year: " + year1 + year2 );
                mostrar.println("genre: " + genre1 + genre2 );
                mostrar.println("sypnosis: " + sypnosis1 + sypnosis2);
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
        System.out.println("Ingrese el nombre de una película: ");
        name1 = enter.next();
        System.out.println("Ingrese la sipnosis de una película: ");
        sypnosis1 = enter.next();
        System.out.println("Ingrese el año de una película: ");
        year1 = enter.nextInt();
        System.out.println("Ingrese el genero de una película: ");
        genre1 = enter.next();
        System.out.println("Ingrese el nombre de una película: ");
        name2 = enter.next();
        System.out.println("Ingrese la sipnosis de una película: ");
        sypnosis2 = enter.next();
        System.out.println("Ingrese el año de una película: ");
        year2 = enter.nextInt();
        System.out.println("Ingrese el genero de una película: ");
        genre2 = enter.next();
        System.out.println("\n\nImpresion datos: " + name1 + genre1 + sypnosis1 + year1 );
        System.out.println("\n\nImpresion datos: " + name2 + genre2 + sypnosis2 + year2 );
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name1 + name2 );
                mostrar.println("Year: " + year1 + year2);
                //mostrar.println("notes: " + fist_note + " / " + second_note + " / " + third_note + " / "  );
                mostrar.println("sypnosis: " + sypnosis1+  sypnosis2);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
}

        
