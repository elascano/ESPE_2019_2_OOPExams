package ec.edu.espe.moviems.vist;

import ec.edu.espe.moviems.model.Movie;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edison Vaca
 */
public class MovieMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Movie> listMovie = new ArrayList<Movie>();
        Scanner scn = new Scanner(System.in);
    
       
        boolean exit = false;
        int option;
        while(!exit){
           System.out.println("\n\t Small Movie System\n");
           System.out.println("1| Add Movie");
           System.out.println("2| Show Movies");;
           System.out.println("3| Exit");
           
           System.out.println("\nInput an Option: ");
           option = scn.nextInt();
           
           switch(option){
               case 1:
                   Movie movie = new Movie();
                   movie.dataEntry();
                   listMovie.add(movie);
                   break;
               case 2:
                   for (int i = 0; i < listMovie.size(); i++) {
                       listMovie.get(i).showInformation();
                   }

                   break;
                case 3:
                   exit = true;
                   break;
                default:
                   System.out.println("Input an Valid Option");
            }
        }
    }
    }
    

