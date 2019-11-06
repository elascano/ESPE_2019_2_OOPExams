
package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<DataBook> Book = new ArrayList<DataBook>();
        Book.add(new DataBook("Juan", "Principito", "Editor",12,2018));
        Book.add(new DataBook("Juan", "Principito", "Editor",12,2018));
        Book.add(new DataBook("Juan", "Principito", "Editor",12,2018));
        
        CsvWriter csvWriter = new CsvWriter("Book.csv");
        
        for(DataBook databook : Book){
            String datos[] = databook.getArray();
            
            csvWriter.writeRecord(datos);
        }
       csvWriter.close();
    }
    
    
}
