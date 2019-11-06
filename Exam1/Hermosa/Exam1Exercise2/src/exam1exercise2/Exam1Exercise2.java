
package exam1exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam1Exercise2 {


    public static void main(String[] args) throws IOException {
        
        FileWriter ficher = new FileWriter ("C:/Users/User/Desktop/Exam1Exercise2/books.csv");
        
        System.out.println("Title of the book ");
        String title = "";
        Scanner scanner = new Title (System.in);
        title= scanner.nextLine ();
        
        System.out.println("Author of the book ");
        String author = "";
        Scanner scanner = new Author (System.in);
        author= scanner.nextLine ();
        
        System.out.println("Editorial of the book ");
        String editorial = "";
        Scanner scanner = new Editorial (System.in);
        editorial= scanner.nextLine ();
        
        System.out.println("Year of the book ");
        String year = "";
        Scanner scanner = new Year (System.in);
        year= scanner.nextLine ();
        }
    
    
       
    }
     

    
  
