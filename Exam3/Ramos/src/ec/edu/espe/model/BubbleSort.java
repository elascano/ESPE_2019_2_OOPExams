/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Labs-DCCO
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        int i, j, aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }

            }
        }

        JOptionPane.showMessageDialog(null, "Método búrbuja");
    }
}
