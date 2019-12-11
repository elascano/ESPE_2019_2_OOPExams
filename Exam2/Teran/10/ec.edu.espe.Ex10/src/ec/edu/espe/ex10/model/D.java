/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ex10.model;

import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class D extends A {
    ArrayList<F> fs = new ArrayList<F>();
    E[] es = new E[5];

    @Override
    public String toString() {
        return "D{" + "fs=" + fs + ", es=" + es + '}';
    }
    
    
    
    
}
