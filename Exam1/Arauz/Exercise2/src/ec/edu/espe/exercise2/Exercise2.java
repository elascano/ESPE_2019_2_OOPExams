/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Arauz
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        FileManager ListBook =new FileManager();
        while(true){
            System.out.println("Ingrese Titulo: ");
            String tit = scn.nextLine();
            System.out.println("Ingrese Author: ");
            String aut = scn.nextLine();
            System.out.println("Ingrese Editorial: ");
            String edit = scn.nextLine();
            System.out.println("Ingrese año de publicacion: ");
            int year = Integer.parseInt(scn.nextLine());
            Book bk = new Book(tit,aut,edit,year);
            ListBook.addBook(bk);
            
            System.out.println("Quiere añadir otro libro? y=si,n=no ");
            String confirm=scn.nextLine();
            if(confirm.equals("y")){
            }
            if(confirm.equals("n")){
                break;
            }           
        }
        System.out.print("\n");
        ListBook.MostrarLibros();
        System.out.println("Ingrese el año de publicacion que quiere buscar: ");
        int year=Integer.parseInt(scn.nextLine());
        ListBook.BuscarPorAño(year);
        System.out.print("\n");
        System.out.println("Ingrese la editorial del libro  que quiere buscar: ");
        String editorial=scn.nextLine();
        ListBook.BuscarPorEditorial(editorial);
        
    }
    
}
