package exam1excersise2;

import java.util.Scanner;

public class Exam1Excersise2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Show books:");
        System.out.println("2. Add books");
        System.out.println("3. Show books by a year");
        System.out.println("4. Show books by editorial:");
        

        Book[] book = new Book[3];
        book[0] = new Book("The Chronicles of Narnia","C.S. Lewis","Geoffrey Bles",1950);
        book[1] = new Book("The Lord of Rings","J.R.R.Tolkin","George Allen & Unwin",1954);
        book[2] = new Book("Harry Potter and The Philosopher's Stone","J.K.ROWLING","SALAMANDRA",1997);
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
                System.out.println("Write the book information: ");
                ed = scan.next();
                list.showBooksByEd(ed);
                break;
            case 3:
                year = scan.nextInt();
                list.showBooksByYear(year);
                break;
            case 4:
                year = scan.nextInt();
                list.countByEd(String ed);
                break;
                
                
            default:
                System.out.println("Invalid Option");
                break;
            
        }
    }
}
