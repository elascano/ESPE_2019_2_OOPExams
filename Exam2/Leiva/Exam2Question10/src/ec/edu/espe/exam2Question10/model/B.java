/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2Question10.model;

/**
 *
 * @author Steven
 */
public class B extends A {
   
    private H hs = new G();

    /**
     * @return the hs
     */
    public H getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(H hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + hs + '}';
    }

    public B() {
    }
   
    
    
    
}
