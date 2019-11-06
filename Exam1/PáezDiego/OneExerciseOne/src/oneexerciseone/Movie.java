
package oneexerciseone;


public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genre;
    private String country;
    private String director;
    
    public Movie(String title, String synopsis,int year, String genre, String country, String director){
         
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.country = country;
        this.director = director;
        this.genre = genre;     
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
