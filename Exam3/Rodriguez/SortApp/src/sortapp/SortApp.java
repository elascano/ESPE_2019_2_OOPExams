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
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {3,6,4,6,7};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
    }

}
