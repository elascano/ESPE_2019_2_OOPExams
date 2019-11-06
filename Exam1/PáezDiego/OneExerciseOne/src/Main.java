import java.util.ArrayList;
import java.util.Scanner;
import oneexerciseone.Genre;
import oneexerciseone.Movie;

public class Main {

    public static void main(String[] arg) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Movie> list = new ArrayList<Movie>();
        
        while (true) {
            System.out.println("Enter the tltle, synopsis, year, genre, country, direcctor ");
            String aux = scn.nextLine();
            String[] vector = aux.split(" ");
            
            if (aux.equals("")) {
                break;
            }

            String title = vector[0];
            String synopsis = vector[1];
            int year = Integer.parseInt(vector[2]);
            String genre = vector[3];
            String country = vector[4];
            String director = vector[5];

 
            Movie movie = new Movie(title, synopsis, year, genre, country, director);

            list.add(movie);

        }

        System.out.println("\n\nImpresion  ");
        for (int i = 0; i < list.size(); i++) {
            Movie aux = list.get(i);
            System.out.println(aux.getTitle() + " - " + aux.getSynopsis() +" - " + aux.getYear()+" - " + aux.getGenre()+" - " + aux.getCountry()+" - " + aux.getDirector());
        }
    }
}