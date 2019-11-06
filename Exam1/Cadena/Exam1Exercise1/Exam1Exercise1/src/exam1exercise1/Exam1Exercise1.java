/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1exercise1;

import exam1exercise1Classes.Menu;
import exam1exercise1Classes.Record;
import java.util.ArrayList;

/**
 *
 * @author Pablo Cadena
 */
public class Exam1Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=1;
        ArrayList<Record> arr= new ArrayList<>();
        while(opc!=2){
           Menu menu = new Menu();
           arr.add(menu.añadirPeli());
           menu.setArrPelis(arr);
            System.out.println("arreglos:  >>>>>>>>>>>>");
            System.out.println(menu.getArrPelis().size());
            for(int i=0; i<menu.getArrPelis().size(); i++){
                System.out.println("title: "+ menu.getArrPelis().get(i).getTitle());
                System.out.println("sinopsis: "+ menu.getArrPelis().get(i).getSynopsis());
                System.out.println("año: "+ menu.getArrPelis().get(i).getYear());
                System.out.println("genero: "+ menu.getArrPelis().get(i).getGnre());
                System.out.println("Nombre director: "+ menu.getArrPelis().get(i).getDirectorName());
                System.out.println("Apellido director: "+ menu.getArrPelis().get(i).getDirectorLast());
                System.out.println("Pais director: "+ menu.getArrPelis().get(i).getDirectorCountry());
            }
       }
    }
    
}
