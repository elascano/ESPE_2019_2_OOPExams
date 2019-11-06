package ec.edu.espe.Exam_1_Excersise_2.model;

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
        Book show = null;
        while(it.hasNext()){
            show = it.next();
            show.printBook();
        }
    }
    
    
}
