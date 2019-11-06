/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Inforlan
 */
public class Movie {
    private String title;
    private String synopsis;
    private String year;
    private ArrayList<String> genre;
    

    public Movie(String title, String synopsis, String year, ArrayList<String> genre) {
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.genre = genre;
    }

    private Movie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }
    
public void createMovieFile(ArrayList<Movie> arrayMovie){
        String moveFile= "Movie.csv";
        
        File file = new File (moveFile);
        if(file.exists())file.delete();
   
    }
    
    public ArrayList <Movie> readMovieFile(){
        ArrayList<Movie> array = new ArrayList<>();
        try{
            String movieFile= "Movie.csv";
            File movie=new File(movieFile);
            if(movie.exists())
            {
                FileReader fr = new FileReader(movie);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Movie movies = new Movie();
                    String[] contact = line.split(";");
                    
                    movies.setTitle(contact[0]);
                    movies.setSynopsis(contact[1]);
                    movies.setYear(contact[2]);
                    
            
                    ArrayList<String> genre  = new ArrayList<>();
                    genre.add((contact[3]));
                    genre.add((contact[4]));
                    genre.add((contact[5]));
            
                    movies.setGenre(genre);
            
                    array.add(movies);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return array;
    }
}

    

