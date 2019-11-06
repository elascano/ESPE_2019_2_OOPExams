
package firstexercise;

public class Director {
    
    public String firstName;
    public String lastName;
    public String country;

    
    
    public Director(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }
    
     public String getFirstName(){
        return firstName;
    }
    
    public void setfirstNJame(String firstName) {
        this.firstName = firstName;
    }
    
     public String getLastName(){
        return lastName;
    }
    
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
     public String getCountry(){
        return country;
    }
    
    public void setcountry(String country) {
        this.country = country;
    }
    
}
