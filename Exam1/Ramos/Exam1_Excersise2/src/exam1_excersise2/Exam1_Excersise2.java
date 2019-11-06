
package exam1_excersise2;

import java.util.*;

public class Exam1_Excersise2 {

    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        
        System.out.println("---OPTIOS---");
        
        System.out.println("1. Show");
        System.out.println("2. search by year\n");
        System.out.print("Type a option: ");
        
        Book[] book = new Book[4];
        book[0] = new Book("La Odisea","Anotine","Aventura",1990);
        book[1] = new Book("Los puentes de madison","Clint","Accion",1991);
        book[2] = new Book("Anarcosindicalismo baasico","Thalos","Aventura",2001);
        book[3] = new Book("Viaje a la última selva","Mundo","Drama",2002);
        
        List list = new List();
        for(int i = 0; i < 4; i++){
            list.addToBooks(book[i]);
        }
        String ed;
        int year;
        int op = enter.nextInt();
        switch(op){
            case 1:
                list.showBooks();
                break;
            case 2:
                System.out.println("Type a year");
                year = enter.nextInt();
                list.showBooksByYear(year);
                break;
            default:
                System.out.println("Invalid option ");
                break;
            
                    
    }
    
}
}