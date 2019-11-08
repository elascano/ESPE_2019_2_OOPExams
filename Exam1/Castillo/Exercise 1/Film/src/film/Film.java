/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class Film {
  
    private List<Movie> librari;
    private List<Director> librar;

    public Film() {
        librari = new ArrayList<Movie>();
        librar = new ArrayList<Director>();
        
    }
    public void addBook(Movie bk,Director bm){
        librari.add(bk);
        librar.add(bm);
    }

    public void MostrarLibros() {
        Iterator<Movie> it = librari.iterator();
        Movie bk = null;
        while (it.hasNext()) {
            bk = it.next();
            bk.print();
        }
        Iterator<Director> im = librar.iterator();
        Director bm = null;
        while (im.hasNext()) {
            bm = im.next();
            bm.print();
        }

    }
    public static void main(String[] args) {        

        Scanner scn = new Scanner(System.in);
        Film ListBook =new Film();
        while(true){
            System.out.println("Ingrese titulo: ");
            String tit = scn.nextLine();
            System.out.println("Ingrese spynosis: ");
            String spy = scn.nextLine();
            System.out.println("Ingrese genero: ");
            String gen = scn.nextLine();
            System.out.println("Ingrese año : ");
            int year = Integer.parseInt(scn.nextLine());
            System.out.println("Ingrese nombre: ");
            String nom = scn.nextLine();
            System.out.println("Ingrese apellido: ");
            String ape = scn.nextLine();
            System.out.println("Ingrese pais: ");
            String pai = scn.nextLine();
            Movie bk = new Movie(tit,spy,gen,year);
            Director bm = new Director(nom,ape,pai);
            ListBook.addBook(bk,bm);
            System.out.println("Quiere añadir mas? s=si,n=no ");
            String confirm=scn.nextLine();
            if(confirm.equals("s")){
            }
            if(confirm.equals("n")){
                break;
            }    
        }
        System.out.print("\n");
        ListBook.MostrarLibros();
    }
    
}
