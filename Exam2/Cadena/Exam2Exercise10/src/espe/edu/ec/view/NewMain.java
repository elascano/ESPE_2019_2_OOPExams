/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.view;

import espe.edu.ec.model.A;
import espe.edu.ec.model.B;
import espe.edu.ec.model.C;
import espe.edu.ec.model.D;
import espe.edu.ec.model.E;
import espe.edu.ec.model.F;
import espe.edu.ec.model.G;
import espe.edu.ec.model.J;
import java.util.ArrayList;

/**
 *
 * @author H304
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        System.out.println("A>> "+a.toString());
        
        G g = new G();
        B b = new B(g);
        J j = new J();
        System.out.println("B>> "+b.getG().toString(j));
        
        C[] c = new C[3] ;
        E e1 = new E();
        E e2 = new E();
        ArrayList<E> es = new ArrayList<>();
        es.add(e1);
        es.add(e2);
        c[0] = new C(es);
        
        ArrayList<E> es2 = new ArrayList<>();
        es2 = c[0].getEs();
        e1 = es2.get(0);
        System.out.println("C>> "+e1.toString());

        F j1 = new F();
        F j2 = new F();
        ArrayList<F> js = new ArrayList<>();
        js.add(j1);
        js.add(j2);
        D d = new D(js);
        System.out.println("D tiene>> "+ d.getFs().get(0).toString());
        
    }
    
}
