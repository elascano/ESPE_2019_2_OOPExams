/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam1exercise2.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jerico Ruiz
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        String title;
        String author;
        String editorial;
        int year;
        int opc;
        int opc2;
        int bookCounter = 0;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            menu();
            opc = sc.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("Title");
                    title = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Author");
                    author = sc.nextLine();
                    
                    System.out.println("Editorial");
                    editorial = sc.nextLine();
                    
                    System.out.println("Year publicaton");
                    year = sc.nextInt();
                    sc.nextLine();
                    books.add(new Book(title, author, editorial, year));
                    break;
                case 2:
                    menu1();
                    opc2 = sc.nextInt();

                    switch (opc2) {
                        case 1:
                            for (int i = 0; i < books.size(); i++) {
                                System.out.println(books.get(i).toString());
                            }
                            break;

                        case 2:
                            System.out.println("Search by year");
                            year = sc.nextInt();
                            for (int i = 0; i < books.size(); i++) {
                                if (year == books.get(i).getYearPublication()) {
                                    System.out.println(books.get(i).toString());
                                }
                            }
                            break;

                        case 3:
                            System.out.println("Search by editorial");
                            editorial = sc.nextLine();
                            for (int i = 0; i < books.size(); i++) {
                                if (editorial.equals(books.get(i).getYearPublication())) {
                                    System.out.println(books.get(i).toString());
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Search by editorial");
                            editorial = sc.nextLine();
                            for (int i = 0; i < books.size(); i++) {
                                if (editorial.equals(books.get(i).getYearPublication())) {
                                    bookCounter++;
                                }
                            }
                            System.out.println("The number books of  " + editorial + "is: "
                                    + bookCounter);
                            break;

                    }
                case 3:
                    end = true;

            }
        }


        /*while (!end) {

            System.out.println("Title");
            title = sc.nextLine();
            System.out.println("Author");
            author = sc.nextLine();
            System.out.println("Editorial");
            editorial = sc.nextLine();
            System.out.println("Year publicaton");
            year = sc.nextInt();
            books.add(new Book(title, author, editorial, year));

            System.out.println("1 -Exit");
            year = sc.nextInt();
            if (year == 1) {
                end = true;
            }
            sc.nextLine();
        }*/
    }

    private static void menu() {
        System.out.println("Library System");
        System.out.println("1) Insert");
        System.out.println("2) Show");
        System.out.println("3) Exit");

    }

    private static void menu1() {
        System.out.println("Show by");
        System.out.println("1) Show all");
        System.out.println("2) Show by editorial");
        System.out.println("3) Show by year");
        System.out.println("4) Show books by editorial");
    }
}
