/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Labs-DCCO
 */
public class SortManage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array[];
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int lengthArray = read.nextInt();
        array = new int[lengthArray];

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Ingrese un número en " + "[" + i + "]" + ":");
                array[i] = read.nextInt();
            }
            SortingContext context = new SortingContext();
            context.setSortStrategy(lengthArray).sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");                
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ingrese solo número enteros");
        }

    }

}
