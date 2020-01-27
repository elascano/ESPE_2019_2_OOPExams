/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exercise.view;

import ec.edu.espe.Exercise.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arrayList[];
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the size of the array:\n ");
        int lenghthArrayList = read.nextInt();
        arrayList = new int[lenghthArrayList];
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print("Enter a number in" + "[" + i + "]" + ":");
            arrayList[i] = read.nextInt();
        }
        SortingContext context = new SortingContext();
        context.setSortStrategy(lenghthArrayList).sort(arrayList);
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }

    }

}
