/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Cristian Arauz
 */
public class B  extends A{
    private G g;

    public B(G g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "B{" + "g=" + g + '}';
    }
    
    
    
}
