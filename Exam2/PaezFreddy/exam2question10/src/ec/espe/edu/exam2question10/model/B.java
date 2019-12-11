/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exam2question10.model;

/**
 *
 * @author Labs-DCCO
 */
public class B extends A {
        public void n(H h){
        System.out.println("The method n is being used by class A");
        
    }

    @Override
    public String toString() {
        return "B{The method n is being used by class A" + '}';
    }


}