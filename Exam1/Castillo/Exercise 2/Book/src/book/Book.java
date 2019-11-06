/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);
        FileManage ListBook =new FileManage();
        while(true){
            System.out.println("Ingrese titulo: ");
            String tit = scn.nextLine();
            System.out.println("Ingrese author: ");
            String aut = scn.nextLine();
            System.out.println("Ingrese ditorial: ");
            String edit = scn.nextLine();
            System.out.println("Ingrese año de publicacion: ");
            int year = Integer.parseInt(scn.nextLine());
            DateBook bk = new DateBook(tit,aut,edit,year);
            ListBook.addBook(bk);
            System.out.println("Quiere añadir otro libro? y=si,n=no ");
            String confirm=scn.nextLine();
            if(confirm.equals("y")){
            }
            if(confirm.equals("n")){
                break;
            }           
        }
        while(true){
        System.out.print("\n");
        ListBook.MostrarLibros();
        System.out.println("Ingrese el año de publicacion que quiere buscar: ");
        int year=Integer.parseInt(scn.nextLine());
        ListBook.BuscarPorAño(year);
        System.out.println("Quiere seguir buscando? y=si,n=no ");
        String confirm=scn.nextLine();
        if(confirm.equals("y")){
            }
        if(confirm.equals("n")){
            break;
            }           
        }
        while(true){
        System.out.println("Ingrese la editorial del libro  que quiere buscar: ");
        String editorial=scn.nextLine();
        ListBook.BuscarPorEditorial(editorial);
        System.out.println("Quiere seguir buscando? y=si,n=no ");
        String confirm=scn.nextLine();
        if(confirm.equals("y")){
            }
        if(confirm.equals("n")){
            break;
            }           
        }
    }
    
    
}
