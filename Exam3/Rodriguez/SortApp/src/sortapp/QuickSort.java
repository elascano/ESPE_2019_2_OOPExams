/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapp;

/**
 *
 * @author Matitisxd
 */
public class QuickSort implements SortingStrategy {


    public int[] sort(int data[]) {
        
        int n = data.length;
        for (int part = n / 2; part > 0; part /= 2) {
            for (int i = part; i < n; i += 1) {
                int temp = data[i];
                int j;
                for (j = i; j >= part && data[j - part]
                        > temp; j -= part) {
                    data[j] = data[j - part];
                }
                data[j] = temp;
            }
        }
        System.out.println("Quick Sort");
        for (int k= 0;k<data.length;k++){
            System.out.println("--"+ data[k]);
        
    }
        return data;
}
}

