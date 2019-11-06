/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class FileManager {
    
    public void createBookFile(ArrayList<Book> arrayBook){
        String bookFile= "Book.csv";
        
        File file = new File (bookFile);
        if(file.exists())file.delete();
   
    }
    
    public ArrayList <Book> readBookFile(){
        ArrayList<Book> array = new ArrayList<>();
        try{
            String movieFile= "Book.csv";
            File book=new File(movieFile);
            if(book.exists())
            {
                FileReader fr = new FileReader(book);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Book books = new Book();
                    String[] contact = line.split(";");
                    
                    books.setTitle(contact[0]);
                    books.setAuthor(contact[1]);
                    books.setEditorial(contact[2]);
                    books.setPublicYear(Integer.parseInt(contact[3]));
                    array.add(books);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return array;
    }
    
    
    
}
