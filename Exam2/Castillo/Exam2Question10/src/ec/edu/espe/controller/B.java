/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel castillo
 */
public class B extends A{
    
    List<H>hs = new ArrayList<>();

    public B(G g) {
        System.out.println("+");
    }
    

    @Override
    public String toString() {
        return "B{" + '}';
    }
    
    H h= new H() {
        @Override
        public void r() {
            System.out.println("construyendo B");
        }
    };
    
    
}
