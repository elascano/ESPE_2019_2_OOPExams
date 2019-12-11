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
public class B extends A{
    private ArrayList<H> hs;

    public B(ArrayList<H> hs) {
        this.hs = hs;
        System.out.println("Create B");
    }
    public void r(H h){
        System.out.println("relation of B and H");
        System.out.println(h.toString());
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
        return "B{" + "hs=" + hs + super.toString();
    }
    
    
    
}
