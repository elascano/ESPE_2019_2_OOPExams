/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.model;

import java.util.ArrayList;

/**
 *
 * @author H304
 */
public class D {
    private E[] es = new E[5];
    private ArrayList<F> fs;

    public D(ArrayList<F> fs) {
        this.fs = fs;
    }

    public E[] getEs() {
        return es;
    }

    public void setEs(E[] es) {
        this.es = es;
    }

    public ArrayList<F> getFs() {
        return fs;
    }

    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
    
    
}

