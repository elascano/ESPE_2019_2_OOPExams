package exam1exercise1;


import java.util.Scanner;

/**
 *
 * @author Jerico Ruiz
 */
public class Exam1Exercise1 {

    public static void main(String[] args) {
        for (;;) {
            createMovie();
        }
    }

    private static void createMovie() {

        Scanner scan = new Scanner(System.in);
        Movie data1 = new Movie();
        
        System.out.println("First Name Author: ");
        String fname = scan.nextLine();
        System.out.println("Last Name Author: ");
        String lname = scan.nextLine();
        System.out.println("Country: ");
        String country = scan.nextLine();
        System.out.println("Book title: ");
        String title = scan.nextLine();
        data1.setTitle(title);
        System.out.println("Book Sinopsis: ");
        String sinopsis = scan.nextLine();
        data1.setSinopsis(sinopsis);
        System.out.println("Book Genre: ");
        String genre = scan.nextLine();
        data1.setGenre(genre);
        System.out.println("Post Year: ");
        int year = scan.nextInt();
        data1.setYear(year);
        
        System.out.println("\n The title is: " + data1.getTitle() + "\n Sinopsis: " + data1.getSinopsis() + "\n" + data1.getYear() + "\n" + data1.getGenre() + "\n");
        System.out.println(fname + "\n" + lname + "\n" + country + "\n");

    }

}
