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
public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] arrayList) {
        int aux;
        for (int i = 0; i < arrayList.length - 1; i++) {
            for (int j = 0; j < arrayList.length - i - 1; j++) {
                if (arrayList[j + 1] < arrayList[j]) {
                    aux = arrayList[j + 1];
                    arrayList[j + 1] = arrayList[j];
                    arrayList[j] = aux;
                }
            }
        }
    }
}
