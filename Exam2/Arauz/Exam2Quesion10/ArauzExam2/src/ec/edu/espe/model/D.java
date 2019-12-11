/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cristian Arauz
 */
public class D extends A{
    E[] e = new E[5];
    List<F> f = new ArrayList<>();

    @Override
    public String toString() {
        return "D{" + "e=" + e + ", f=" + f + '}';
    }
    
    
}
