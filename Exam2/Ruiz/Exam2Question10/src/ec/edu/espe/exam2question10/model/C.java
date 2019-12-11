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
public class C extends A {
    private ArrayList<E> es = new ArrayList<>();

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

    public C() {
        System.out.println("C constructor");
    }
    



}
