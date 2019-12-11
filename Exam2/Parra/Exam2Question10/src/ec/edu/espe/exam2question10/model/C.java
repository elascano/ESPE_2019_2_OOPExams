/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.model;

/**
 *
 * @author HP
 */
public class C extends A {

    public void g(A a) {
        System.out.println("The method g is being used by class A");

    }

    @Override
    public String toString() {
        return "C{The method g is being used by class A" + '}';
    }
}
