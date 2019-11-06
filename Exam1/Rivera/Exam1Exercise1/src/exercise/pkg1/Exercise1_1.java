/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA y DENNIS PARRA
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name, last_name;
        int number;
        int suma = 0;
        int prom = 0; 
        int nota = 0;
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner enter= new Scanner(System.in);
        int notas;
    
        File estudiante = new File ("Estudiante.csv");
        do{
            
        
        System.out.println("*********Menu de opciones*******");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Salir");
        
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("Ingrese los datos");
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Type a name: ");
            name = enter.next();
            System.out.println("Type a last name: ");
            last_name = enter.next();   
            System.out.print("Enter the grade:");
            notas = enter.nextInt();

            for(int i=1; i<= notas; i++){
                System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
                nota = enter.nextInt();          
                suma = suma + nota;
            }
                prom = suma / notas;
                System.out.print("Enter number of phone: ");
                number = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("Number: " + number);
                mostrar.println("promedio: " + prom);
                System.out.println("promedio de las notas:" + prom);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();            
            System.out.print("Enter a card number: ");
            number = enter.nextInt();
            System.out.print("ingrese cantidad de notas:");
            notas = enter.nextInt();
            
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                mostrar.println("Number: "+ number);
                mostrar.println("promedio:"+ prom);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
                
                
                
                break;
                
            case 2:
                System.out.println("Muestra los datos");
                
            default :
                System.out.println("Selecion una opcion");
                break;
        }
        
        }while(opcion !=3);
    }
    
}
