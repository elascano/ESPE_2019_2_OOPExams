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
public class B extends A {

    private ArrayList<H> hs = new ArrayList<>();

    public void r(H h) {

    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + hs + '}';
    }

    public B() {
        System.out.println("B constructor");
        
    }

    

}
