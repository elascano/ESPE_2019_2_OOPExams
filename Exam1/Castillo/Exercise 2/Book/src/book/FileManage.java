/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Angel castillo
 */
public class FileManage {
    
        private List<DateBook> librari;

    public FileManage() {
        librari = new ArrayList<DateBook>();
    }
    public void addBook(DateBook bk){
        librari.add(bk);
    }

    public void MostrarLibros() {
        Iterator<DateBook> it = librari.iterator();
        DateBook bk = null;
        while (it.hasNext()) {
            bk = it.next();
            bk.print();
        }

    }

    public void BuscarPorEditorial(String editorial) {
        Iterator<DateBook> it = librari.iterator();
        DateBook bk = null;
        int count = 0;
        System.out.println("De la editorial " + editorial + " existen los siguietes libros:\n");
        while (it.hasNext()) {
            bk = it.next();

            if (bk.getEditorial().equals(editorial)) {

                System.out.println("Titulo: " + bk.getEditorial());
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
        Iterator<DateBook> it = librari.iterator();
        DateBook bk = null;
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

