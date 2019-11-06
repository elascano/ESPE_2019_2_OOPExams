package exam1excersise2;

import java.util.Scanner;

public class Exam1Excersise2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] book = new Book[3];
        book[0] = new Book("El principito","Anotine","OCEANO",1990);
        book[1] = new Book("Los puentes de madison","Clint","Accion",1991);
        book[2] = new Book("Sociedad de los poetas","Robert","OCEANO",1980);
        SystemList list = new SystemList();
        for(int i = 0; i < 3; i++){
            list.addToBooks(book[i]);
        }
        String ed;
        int year;
        int op = scan.nextInt();
        switch(op){
            case 1:
                list.showBooks();
                break;
            case 2:
                System.out.println("Escribe");
                ed = scan.next();
                list.showBooksByEd(ed);
                break;
            case 3:
                year = scan.nextInt();
                list.showBooksByYear(year);
                break;
            case 4:
                System.out.println("Escribe");
                ed = scan.next();
                list.countByEd(ed);
                break;
            default:
                System.out.println("No existe esa opcion");
                break;
            
        }
    }
}
