
package firstexercise;

public class Movie {
    
    public String title;
    public String synopsis;
    public int year;
    public String genre;
    public String country;
    public Director director;
    
    public Movie(String title, String synopsis, int year, String genre, String country, Director director) {
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.genre = genre;
        this.country = country;
        this.director = director;
    }
   
    public String getTitle(){
        return title;
    }
    
    public void settitle(String title) {
        this.title = title;
    }
    
    public String getSynopsis(){
        return synopsis;
    }
    
    public void setsynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setyear(int year) {
        this.year = year;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setgenre(String genre) {
        this.genre = genre;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setcountry(String country) {
        this.country = country;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public void setdirector(Director director) {
        this.director = director;
    }
    
    
    
 
    
    
}
