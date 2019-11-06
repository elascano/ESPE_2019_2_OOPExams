/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cristian Arauz
 */
public class FileManager {

    private List<Book> librari;

    public FileManager() {
        librari = new ArrayList<Book>();
    }
    public void addBook(Book bk){
        librari.add(bk);
    }

    public void MostrarLibros() {
        Iterator<Book> it = librari.iterator();
        Book bk = null;
        while (it.hasNext()) {
            bk = it.next();
            bk.print();
        }

    }

    public void BuscarPorEditorial(String editorial) {
        Iterator<Book> it = librari.iterator();
        Book bk = null;
        int count = 0;
        System.out.println("De la editorial " + editorial + " existen los siguietes libros:\n");
        while (it.hasNext()) {
            bk = it.next();

            if (bk.getEditorial().equals(editorial)) {

                System.out.println("Titulo: " + bk.getTitle());
                System.out.println("Autor: " + bk.getAuthor());
                System.out.println("Ano de publicacion: " + bk.getYear());
                count = count + 1;
            }

        }
        if (count == 0) {
            System.out.println("!No existe la editorial buscada!!!!");
        }
    }
    public void BuscarPorAño(int año) {
        Iterator<Book> it = librari.iterator();
        Book bk = null;
        int count = 0;
        System.out.println("Del año " + año + " existen los siguietes libros:\n");
        while (it.hasNext()) {
            bk = it.next();
            
            
            if (bk.getYear()== año) {

                System.out.println("Titulo: " + bk.getTitle());
                System.out.println("Autor: " + bk.getAuthor());
                System.out.println("Editorial: " + bk.getEditorial());
                count = count + 1;
            }

        }
        if (count == 0) {
            System.out.println("!No existe libros del año buscado!!!!");
        }
    }
}
