/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Movies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. INGRSAR PELICULA");
            System.out.println("2. NADA");
            System.out.println("3. VER A LOS VER LAS PELICULAS");
            System.out.println("4. SALIR");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        
                        List<DateMovies>movies = new ArrayList<DateMovies>();
                        
                        movies.add(new DateMovies("MOVIE 1", "14-14-16", "MIEDO"," JUAN VALDES"));
                        movies.add(new DateMovies("MOVIE 2", "14-16-16", "COMEDIA"," JUAN CARLOS"));
                        movies.add(new DateMovies("MOVIE 3", "14-15-20", "ACCION", "JUAN CELEDA"));
                        
                        ExportarCSV(movies);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        ImportarCSV();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
           
        
    }
    public static void ExportarCSV(List<DateMovies>movies){
        String salidaArchivo = "Date movies.csv";
        boolean existe = new File(salidaArchivo).exists();
        
        if(existe){
            File archivoMovies = new File(salidaArchivo);
            archivoMovies.delete();
        }
        try {
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ';');
            
            
            salidaCSV.write("titulo");
            salidaCSV.write("año");
            salidaCSV.write("genero");
            salidaCSV.write("autor");
            
            salidaCSV.endRecord();
            
            for (DateMovies user : movies){
            salidaCSV.write(user.getLitle());
            salidaCSV.write(user.getYear());
            salidaCSV.write(user.getGenre());
            salidaCSV.write(user.getAuthor());

            
            salidaCSV.endRecord();
            }
            
            salidaCSV.close();
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void ImportarCSV(){
        try{
            List<DateMovies> movies =  new ArrayList<DateMovies>();
            
            CsvReader leerMovies = new CsvReader("Date movies.csv");
            leerMovies.readHeaders();
            
            while(leerMovies.readRecord()){
                String litle =leerMovies.get(0);
                String year  =leerMovies.get(1);
                String genre =leerMovies.get(2);
                String author =leerMovies.get(2);
                
                movies.add(new DateMovies(litle, year, genre, author));
            }
            leerMovies.close();
            
            for(DateMovies user : movies){
                System.out.println(user.getLitle()+ "  "
                        + user.getYear()+ "  "
                        + user.getGenre() + ""
                        + user.getAuthor());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

