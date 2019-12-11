
package ec.edu.espe.Exam2Question10.model;

import java.util.ArrayList;


public class B extends A {
    public void r(){}
    private ArrayList<H>fs= new ArrayList();

    public B() {
    }

    @Override
    public String toString() {
        return "B{" + "fs=" + getFs() + '}';
    }

    /**
     * @return the fs
     */
    public ArrayList<H> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<H> fs) {
        this.fs = fs;
    }
    
    
}
