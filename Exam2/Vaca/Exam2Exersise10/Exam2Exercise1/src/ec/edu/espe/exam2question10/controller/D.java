/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.controller;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class D extends A{
    private E[] es;
    private java.util.ArrayList<F> fs ;

    public D(E[] es, ArrayList<F> fs) {
        
    }

    public D(E[] es, java.util.ArrayList<F> fs) {
        System.out.println("Create D");
        this.fs = fs;
        this.es = es;    
    }

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
    public java.util.ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(java.util.ArrayList<F> fs) {
        this.fs = fs;
    }

    @Override
    public String toString() {
        return "D{" + "es=" + Arrays.toString(es) + ", fs=" + fs + super.toString();
    }
    
    
    
}
