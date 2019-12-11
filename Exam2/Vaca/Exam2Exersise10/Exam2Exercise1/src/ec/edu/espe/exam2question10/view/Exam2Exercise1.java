/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2question10.view;

import ec.edu.espe.exam2question10.controller.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Exam2Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        J j = new J();
        G g = new G();
        g.m(j);
        
        ArrayList<H> hs = new ArrayList<>();
        hs.add(g);
        B b = new B(hs);
        
        E e1 = new E();
        E e2 = new E();
        E e3 = new E();
        E e4 = new E();
        E e5 = new E();
        
        E[] es = new E[5];
        es[0]= e1;
        es[1]= e2;
        es[2]= e3;
        es[3]= e4;
        es[4]= e5;
        
        F f = new F();
        F f2 = new F();
        ArrayList<F> fs = new ArrayList<>();
        fs.add(f);
        fs.add(f2);
        
        D d = new D(es,fs);
        
        ArrayList<E> listE = new ArrayList<>();
        listE.add(e1);
        listE.add(e2);
        listE.add(e3);
        
        C c = new C(listE);
        
        ArrayList<A> as = new ArrayList<>();
        as.add(b);
        as.add(c);
        as.add(d);
        
        System.out.println(Arrays.toString(as.toArray()));
        
    }
    
}
