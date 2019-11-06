/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1excercise1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Exam1Excercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String title = null, sypnosis = null , genre = null;
        int year = 0;

        Scanner read = new Scanner(System.in);
        int opcion;
        
        List<String> list = new ArrayList<String>();
        
        list.add("Drama");
        list.add("Comedy");
        list.add("Action");
        list.add("Horror");
        list.add("Romance");
        list.add("Adventure");

        File movie = new File("Movie.csv");
        Scanner enter = new Scanner(System.in);
   
        do {

            System.out.println("*********Menu de opciones*******");
            System.out.println("1.- Ingresar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos");

                    if (!movie.exists()) {
                        try {
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();

                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(movie, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + title);
                                mostrar.println("Synopsis: " + sypnosis);
                                mostrar.println("Año: " + year);
                                mostrar.println("Genero: "+genre);

                            }
                            mostrar.close();
                        } catch (IOException ex) {
                        }

                    } else {
                        try {
                            //arch.createNewFile();
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();
                            System.out.println("Nombre de una película: ");
                            title = enter.next();
                            System.out.println("Synopsis de una película: ");
                            sypnosis = enter.next();
                            System.out.println("Año de una película: ");
                            year = enter.nextInt();
                            System.out.println("Genero: " + list);
                            genre = enter.next();

                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(movie, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + title);
                                mostrar.println("Synopsis: " + sypnosis);
                                mostrar.println("Año: " + year);
                                mostrar.println("Genero: "+genre);


                                mostrar.println("");
                            }
                            mostrar.close();
                        } catch (IOException ex) {
                        }
                    }
                    
                case 2:
                    
                   
                    System.out.println("Muestra de los datos");
                    System.out.println("");
                    System.out.println("Nombre: " + title);
                    System.out.println("Synopsis: " + sypnosis);
                    System.out.println("Año: " + year);
                    System.out.println("Genero: "+genre);
                    break;
                    
                    
                default:
                    System.out.println("Gracias por utilizar este programa, hasta pronto!");
                    break;
            }

        } while (opcion != 3);
    }

}

