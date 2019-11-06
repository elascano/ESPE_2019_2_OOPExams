
package ec.edu.espe.createbook.mode;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<Book>();
        while(true){
            System.out.println("title: ");
            String title = scn.nextLine();
            System.out.println("Author: ");
            String author = scn.nextLine();
            System.out.println("Editorial: ");
            String editorial = scn.nextLine();
            System.out.println("publicationyear: ");
            int publicationYear = Integer.parseInt(scn.nextLine());
            Book book = new Book(title, author, editorial, publicationYear);
            list.add(book);
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(aux.getTitle() + " - " + aux.getAuthor() +" - " + aux.getEditorial()+" - " + aux.getpublicationYear());
    }               
    }
}
        
        
    
    