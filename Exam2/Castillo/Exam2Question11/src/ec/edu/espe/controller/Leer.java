/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel castillo
 */
public class Leer {
    
    public ArrayList<AddData> leerCsv(){
        Password password = new Password();
        ArrayList<AddData> addDatas = new ArrayList<AddData>();
           
        try{
            File f=new File("Datos.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                
                String line;
                while((line = br.readLine())!=null)
                {
                    AddData data = new AddData();
                    String[] contact = line.split(";");
                    
                    data.setUser(contact[0]);
                    data.setPass(contact[1]);
                    
            
                    addDatas.add(data);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return addDatas;
    }
    
    
}