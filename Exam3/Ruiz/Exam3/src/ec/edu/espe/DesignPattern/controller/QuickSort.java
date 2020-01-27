/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DesignPattern.controller;

/**
 *
 * @author camyt
 */
public class QuickSort implements SortingStrategy{
    
    public int[ ] sort( int data[ ], int begin, int end ) { 
        int pivot = data[begin];
    int i = (end);
 
    for (int j = begin; j < end; j++) {
        if (data[j] <= pivot) {
            i++;
 
            int swapTemp = data[i];
            data[i] = data[j];
            data[j] = swapTemp;
        }
    }
 
    int swapTemp = data[i+1];
    data[i+1] = data[end];
    data[end] = swapTemp;
    System.out.println("--QUICK SORT--"); 
         for(int k=0 ; k< data.length; k++){
             System.out.println(">> "+data[k]);
         }
         
       return data;
        
    }

    @Override
    public int[] sort(int[] data) {
        int [] sortArray = sort(data, 0, data[data.length-1]);
        return sortArray;
    }

    
}

