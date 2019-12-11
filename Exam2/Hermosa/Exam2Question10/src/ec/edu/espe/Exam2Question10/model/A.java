
package ec.edu.espe.Exam2Question10.model;

import java.util.ArrayList;


public class A {
    private ArrayList<A>as = new ArrayList();

    public A() {
    }

    
    
    @Override
    public String toString() {
        return "A{" + "as=" + getAs() + '}';
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
    
    
}
