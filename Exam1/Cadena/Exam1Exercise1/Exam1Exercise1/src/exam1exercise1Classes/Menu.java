/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1exercise1Classes;

import java.util.ArrayList;

/**
 *
 * @author Pablo Cadena
 */
public class Menu {
    private ArrayList<Record> arrPelis;
    
    public Menu(){
        
    }
    public Record añadirPeli(){
        Record record = new Record();
        record.entryData();
        
        return record;
    }

    public ArrayList<Record> getArrPelis() {
        return arrPelis;
    }

    public void setArrPelis(ArrayList<Record> arrPelis) {
        this.arrPelis = arrPelis;
    }

}
