/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.controller;

/**
 *
 * @author user
 */
public class G implements H{

    public G() {
        System.out.println("New G");
    }
    
    public void m(J j){
        System.out.println("Method m of G with J param");
    }

    @Override
    public String toString() {
        return "Object C implements H";
    }
    
}
