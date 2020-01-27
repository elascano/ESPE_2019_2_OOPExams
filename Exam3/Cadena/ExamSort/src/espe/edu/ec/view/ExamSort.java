package espe.edu.ec.view;

import espe.edu.ec.controller.SortingContext;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Cadena
 */
public class ExamSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        ArrayList nums = new ArrayList();
        System.out.println("Ingrese elementos del arreglo a ser ordenados (-1 para salir):");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        //reading the array
        while (input>= 0){
            nums.add(input);
            input = scan.nextInt();
        }
        //sorting the array
        SortingContext sortContext = new SortingContext(nums);
        ArrayList numsSorted = sortContext.sort(nums);
        //showing the array
        System.out.println("EL ARREGLO ORDENADO:");
        for (int i = 0 ; i<numsSorted.size() ; i++){
            System.out.println(numsSorted.get(i));
        }
    }
    
}
