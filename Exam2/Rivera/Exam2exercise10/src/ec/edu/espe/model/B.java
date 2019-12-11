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
public class B extends A{
    private ArrayList<H> h;
    private ArrayList<H> hs;
    
    public B(ArrayList<H> h){
        this.h = h;
        System.out.println("It class is the B");
        
    }

    public B(java.util.ArrayList<H> hs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void r(H h){
        System.out.println("Relation of B with the H");
        System.out.println(h.toString());
    }
    public ArrayList<H> getHs(){
        return h;
    }
    public void setHs(ArrayList<H> hs){
        this.hs=hs;
        
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + ", hs=" + hs + '}';
    }
    
    
}
