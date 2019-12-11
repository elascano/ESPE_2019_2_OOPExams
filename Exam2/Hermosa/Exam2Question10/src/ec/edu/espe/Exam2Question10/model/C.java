
package ec.edu.espe.Exam2Question10.model;

import java.util.ArrayList;


public class C extends A {
    private ArrayList<E>es=new ArrayList();

    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "es=" + getEs() + '}';
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
}
