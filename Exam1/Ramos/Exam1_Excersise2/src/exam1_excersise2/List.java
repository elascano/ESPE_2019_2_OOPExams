
package exam1_excersise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lenovo
 */
public class List {
    private java.util.List<Book> books;
    
    public List(){
        books = new ArrayList<>();
    }
    
    public void addToBooks(Book book){
        books.add(book);
    }
    
    public void showBooks(){
        Iterator<Book> it = books.iterator();
        Book b = null;
        while(it.hasNext()){
            b = it.next();
            b.printBook();
        }
    }
    
    public void showBooksByEd(String ed){
        Iterator<Book> it = books.iterator();
        Book b = null;
        while(it.hasNext()){
            b = it.next();
            if(ed.equals(b.getEditorial())){
                b.printBook();
            }
        }
    }
    
    public void showBooksByYear(int year){
        Iterator<Book> it = books.iterator();
        Book b = null;
        while(it.hasNext()){
            b = it.next();
            if(b.getYear() == year){
                b.printBook();
            }
        }
    }
    
    public void countByEd(String ed){
        Iterator<Book> it = books.iterator();
        Book b = null;
        int countEd = 0;
        while(it.hasNext()){
            b = it.next();
            if(ed.equals(b.getEditorial())){
                countEd++;
            }
        }
        System.out.println("Total number: " + countEd);
    }
}
