/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.model;

import java.util.ArrayList;



/**
 *
 * @author Jerico Ruiz
 */
public class D extends A{
    private E[] es = new E[5];
    private ArrayList<F> fs = new ArrayList<>();

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    public D() {
        System.out.println("D constructor");
        
    }

    @Override
    public String toString() {
        return "D{" + "es=" + es + ", fs=" + fs + '}';
    }
    
    
    
}
