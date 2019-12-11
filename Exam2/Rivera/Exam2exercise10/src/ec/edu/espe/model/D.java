/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Usuario
 */
public class D extends A{
    private E[] es;
    private java.util.ArrayList<F> f;
    public D(E[] es, ArrayList<F> f){
        
    }
    public D(E[] es, java.util.ArrayList<F> f){
        System.out.println("The creation the D");
        this.f=f;
        this.es=es;
        
    }
    public E[] getEs(){
        return es;
    }
    public void setEs(E[] es){
        this.es=es;
    }
    public java.util.ArrayList<F> getFs(){
        return f;
    }
    public void setF(java.util.ArrayList<F> f){
        this.f=f;
        
    }

    @Override
    public String toString() {
        return "D{" + "es=" + es + ", f=" + f + '}';
    }
    
}
