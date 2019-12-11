/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2Question10.model;

import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class D extends A {
    
    private ArrayList<E> es = new ArrayList(5);
    private ArrayList<F> fs = new ArrayList();

    public D() {
    }
    

    @Override
    public String toString() {
        return "D{" + "es=" + getEs() + ", fs=" + getFs() + '}';
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
    
    
}
