package exam1exercise2;

import java.util.Scanner;

/**
 *
 * @author Jerico Ruiz
 */
public class Exam1Exercise2 {

    public static void main(String[] args) {
        menu();
        
    }

    private static void menu() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Library System");
        System.out.println("1) Create a new book");
        System.out.println("2) Show a book by...");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                create();
            case 2:
                show();
        }

    }

    private static void create() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Title: ");
        String title = sc.nextLine();
        book.setTitle(title);
        System.out.println("Author: ");
        String author = sc.nextLine();
        book.setAuthor(author);
        System.out.println("Editorial: ");
        String editorial = sc.nextLine();
        book.setAuthor(editorial);
        System.out.println("Year Publication: ");
        int yearPublication = sc.nextInt();
        book.setYearPublication(yearPublication);

    }

    private static void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Show by Editorial");
        System.out.println("2) Show by year");
        int opc2 = sc.nextInt();

    }
}
