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
public class C extends A{
    private ArrayList<E> e;
    public C(ArrayList<E> e){
        System.out.println("The creation the C");
        this.e=e;
    }

    public C(java.util.ArrayList<E> listE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<E> getE(){
        return e;
    }
    public void setEs(ArrayList<E> es){
this.e=es;
}

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }
    
}

