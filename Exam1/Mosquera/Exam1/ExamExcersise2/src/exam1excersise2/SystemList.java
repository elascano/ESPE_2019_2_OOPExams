package exam1excersise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SystemList {
    private List<Book> books;
    
    public SystemList(){
        books = new ArrayList<Book>();
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
        System.out.println("Total Number: " + countEd);
    }
    
}
