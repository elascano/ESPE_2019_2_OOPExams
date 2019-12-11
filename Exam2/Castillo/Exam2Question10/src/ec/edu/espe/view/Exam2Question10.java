/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.A;
import ec.edu.espe.controller.B;
import ec.edu.espe.controller.C;
import ec.edu.espe.controller.D;
import ec.edu.espe.controller.E;
import ec.edu.espe.controller.G;
import ec.edu.espe.controller.J;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel castillo
 */
public class Exam2Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        G g = new G();
        A a= new A();
        B b = new B(g);
        J j = new J();
        C c = new C();
        D d= new D();
        
        E e1= new E(c);
        E e2= new E(d);
        ArrayList<E> es;
        System.out.println(a);
        System.out.println(g);
        System.out.println(j);
        System.out.println(e1);
        System.out.println();
        //System.out.println("");
        
    }
    
}
