/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exercise.model;

/**
 *
 * @author ASUS
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public void sort(int[] array1) {
        int newArray = array1.length;
        for (int j = 1; j < newArray; j++) {
            int array2 = array1[j];
            int i = j - 1;
            while ((i > -1) && (array1[i] > array2)) {
                array1[i + 1] = array1[i];
                i--;
            }
            array1[i + 1] = array2;
        }

    }
}
