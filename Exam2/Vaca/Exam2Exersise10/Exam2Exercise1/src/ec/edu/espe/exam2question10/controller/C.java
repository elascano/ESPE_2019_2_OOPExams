/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.controller;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class C extends A{
    private ArrayList<E> es;

    public C(ArrayList<E> es) {
        System.out.println("Create C");
        this.es = es;
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + super.toString();
    }
    
    
}
