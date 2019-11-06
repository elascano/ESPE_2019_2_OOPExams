package ec.edu.espe.Exam_1_Excersise_2.model;

import java.util.Scanner;

public class Exam_1_Excersise_2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Book [] book = new Book [3];
        book[0] = new Book("Origen","Dan Brown","Times",2001);
        book[1] = new Book("Titanic","James Cameron","Sony Books",1996);
        book[2] = new Book("Avengers","Stan Lee","Marvel Comics",2006);
        SystemList list = new SystemList();
        
    }
}
