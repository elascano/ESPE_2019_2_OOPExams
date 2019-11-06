
package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Movie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       // director direct = new director();
        int op;
        
        List movie = new ArrayList();
        do{
        System.out.println("MOVIE");
        System.out.println("Enter title: ");
        String title = in.nextLine();
        movie.add(title);
        director();
        //direct.getName();
        //direct.getCountry();
        System.out.println("Enter synopsis: ");
        String sy = in.nextLine();
        movie.add(sy);
        System.out.println("Enter year: ");
        int year = in.nextInt();
        movie.add(year);
        in.nextInt();
        System.out.println("Enter genre: ");
        String genre = in.nextLine();
        movie.add(genre);
        System.out.println(movie);
        System.out.println(" Enter 1 to add another movie");
        op = in.nextInt();
       }while(op==1);
        
      
    }

    private static void director() {
        Scanner in = new Scanner(System.in);
        System.out.println("Director: ");
        String na = in.nextLine();
        System.out.println("Country: ");
        String cou = in.nextLine();
    }


    
}
