
package ec.edu.espe.Exam2Question10.model;

import java.util.ArrayList;


public class D extends A {
    private E e[]=new E[5];
    private ArrayList<F>fs= new ArrayList();

    public D() {
    }

    @Override
    public String toString() {
        return "D{" + "e=" + getE() + ", fs=" + getFs() + '}';
    }

    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
    
    
}
