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
public class B extends A{
    ArrayList<H> hs = new ArrayList<H>();

    @Override
    public String toString() {
        return "B{" + "hs=" + hs + '}';
    }
    
    
}
