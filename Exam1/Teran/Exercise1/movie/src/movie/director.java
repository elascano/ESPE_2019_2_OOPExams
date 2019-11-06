/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 *
 * @author Labs-DCCO
 */
public class director {
    String name = "Camila";
    String country = "Ecuador";
    
    public director(String name, String country){
        this.name = name;
        this.country = country;
    }

    director() {
       
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
