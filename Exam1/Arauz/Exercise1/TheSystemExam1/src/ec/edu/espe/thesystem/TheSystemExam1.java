/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.thesystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Arauz
 */
public class TheSystemExam1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        ArrayList<Movie> list = new ArrayList<>();
        
        while(true){
            System.out.println("ingrese la pelicual: ");
            String aux = scn.nextLine();
            String[] vector =aux.split("");
            if (aux.equals("")) {
                break;
            }
            String name = vector[0];
            int year = Integer.parseInt(vector[1]);

            Movie movie = new Movie(name, year);
            list.add(movie);
        }
         System.out.println("\n\nLa pelicula es: ");
         list.forEach((aux) -> {
             System.out.println(aux.getName() + " - " + aux.getYear());
        });
    }
}
  
 

