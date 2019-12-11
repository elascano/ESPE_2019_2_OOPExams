package ec.edu.espe.exam_1_excersise_1.model;
import java.util.Scanner;

public class Exam1_Excersise1{

    
    public static void main(String[]args){
        
       String title = null, synopsis = null, genre = null;
       String country = null;
       int year;
       Scanner read = new Scanner(System.in);
       Scanner enter= new Scanner(System.in);
       
        System.out.println("Escriba el nombre de la pelicula: ");
        title= enter.next();
        System.out.println("Describa la sinopsis de la pelicula: ");
        synopsis = enter.next();
        System.out.println("Digite el año de publicacion de la pelicula: ");
        year = enter.nextInt();
        System.out.println("Ingrese el genero: ");
        genre = enter.next();
        System.out.println("Ingrese el pais: ");
        country = enter.next();
        
    }
    
    
    public void showMovie (){
        System.out.println("Informacion de las peliculas.");
        
    }
    private void title(){
        System.out.println("");
    }
}


    

    



 