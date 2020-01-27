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
public class InsertionSort implements SortingStrategy {

    public int[] sort(int data[]) {
        
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int mindex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[mindex]) {
                    mindex = j;
                }
            }
            int temp = data[mindex];
            data[mindex] = data[i];
            data[i] = temp;
        }
        System.out.println("Insertion Sort");
        for (int k= 0;k<data.length;k++){
            System.out.println("--"+ data[k]);
        }
        return data;

    }
}
