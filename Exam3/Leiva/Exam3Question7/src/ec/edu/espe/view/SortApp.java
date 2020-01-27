/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class SortApp {
    public static void main(String args[]){
    

        int array[];
        
        Scanner scn = new Scanner(System.in);
        
        

        System.out.print("Ingrese el tamaño del Arreglo ");
        int lengthArray = scn.nextInt();
        array = new int[lengthArray];

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("[" + i + "]" + ":");
                array[i] = scn.nextInt();
            }
            
            SortingContext context = new SortingContext();
            context.setSortStrategy(lengthArray).sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");                
            }
            
     
        } catch (Exception e) {
            System.out.println("Ingrese numeros enteros y tampoco letras ");
        }
 

    
    }

    
}
