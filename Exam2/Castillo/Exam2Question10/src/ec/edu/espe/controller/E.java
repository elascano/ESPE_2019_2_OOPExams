/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Angel castillo
 */
public class E {
    C[] cs = new C[3];
    D[] ds = new D[4];

    public E(C c) {
        C[] cs = new C[3];
        System.out.println(cs);
    }

    public E(D d) {
        D[] ds = new D[4];
        System.out.println(ds);
    }

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + ", ds=" + ds + '}';
    }

    
    
    
    
}
