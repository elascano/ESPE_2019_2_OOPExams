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
public class BubbleSort implements SortingStrategy {

    public int[] sort(int data[]) {
      
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
          System.out.println("Bubble Sort");
          for (int k = 0 ; k<data.length; k++ ){
              System.out.println("--"+ data[k]);
          } 
        return data;

    }

}
