/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.controller;

import espe.edu.ec.controller.BubbleSort;
import java.util.ArrayList;

/**
 *
 * @author H304
 */
public class SortingContext {
    private SortingStrategy sortStrategy;

    public SortingContext(ArrayList nums) {
        this.sortStrategy = SortingContext.setSortStrategy(nums);
    }
    
    private static SortingStrategy setSortStrategy(ArrayList nums){
        SortingStrategy sortStrategy;
        if (nums.size()<4) return sortStrategy = new BubbleSort();
        else if (nums.size()>3 && nums.size()<7) return sortStrategy = new InsertionSort();
        else return sortStrategy = new QuickSort();
    }
    
    public  ArrayList sort(ArrayList nums){
        ArrayList numsSorted = this.sortStrategy.sort(nums);
        return numsSorted;
    }
    
}