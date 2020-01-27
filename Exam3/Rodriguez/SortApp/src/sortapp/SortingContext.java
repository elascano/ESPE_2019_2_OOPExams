/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapp;

import java.util.Random;

/**
 *
 * @author Matitisxd
 */
public class SortingContext {

    private SortingContext ss;

    public int[] sort(int [] data) {
        int size = data.length();
        ss = setSortStrategy(size, data);
        return ss.sort(data);

    }

    public SortingStrategy setSortStrategy(int n, int data[]) {
        if (n >= 0 && n <= 3) {
            ss = new BubbleSort();
            System.out.println("Using BubbleSort");
        }
        else if (n >= 4 && n <= 7) {
            ss = new InsertionSort();
            System.out.println("Using InsertionSort");
        }
        else if (n >= 7) {
            ss = new QuickSort();
            System.out.println("Using QuickSort");
        }

        return ss;

    }
}
