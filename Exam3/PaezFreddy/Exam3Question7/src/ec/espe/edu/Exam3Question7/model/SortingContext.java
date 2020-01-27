/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Exam3Question7.model;

/**
 *
 * @author H304
 */
public class SortingContext {

    public SortingStrategy setSortStrategy(int index) {
        SortingStrategy strategy = null;
        if (index <= 3) {
            strategy = new BubbleSort();
        } else if (index <= 7 && index >= 4) {
            strategy = new InsertionSort();
        } else if (index >= 8) {
            strategy = new QuickSort();
        }

        return strategy;
    }

}