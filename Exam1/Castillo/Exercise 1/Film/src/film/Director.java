/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author Angel castillo
 */
public class Director {
    
    private String name; 
    private String lastName;
    private String country;
    
        public Director(String name, String lastName, String country) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
        
    public void print(){
    System.out.println("Nombre: "+this.name);
    System.out.println("Apellido: "+this.lastName);
    System.out.println("Pais: "+this.country);
    System.out.println("\n");
    }        
}
