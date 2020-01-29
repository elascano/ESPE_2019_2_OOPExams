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
public class SortingContext {

    public SortingStrategy setSortStrategy(int size) {
        SortingStrategy strategy = null;
        if (size <= 3) {
            strategy = new BubbleSort();
        } else if (size <= 7 && size >= 4) {
            strategy = new InsertionSort();
        } else if (size >= 8) {
            strategy = new QuickSort();
        }

        return strategy;
    }

}
