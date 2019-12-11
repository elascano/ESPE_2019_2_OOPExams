package ec.edu.espe.Exam2Question11.model;




import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.Exam2Question11.model.Password;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class File {

    public static void exportCsv(List<Password> pass){
    
        String exitFile="Passwords.csv";
        boolean exist= new java.io.File(exitFile).exists();
        
        if(exist){
            java.io.File passFile = new java.io.File(exitFile);
            passFile.delete();
        }
        
        try{
        
        CsvWriter exitCsv = new CsvWriter(new FileWriter((exitFile),true),',');
        exitCsv.write("User");
        exitCsv.write("Password");
        
        
        exitCsv.endRecord();
        
        for(Password password : pass){
        
            exitCsv.write(password.getUser());
            exitCsv.write(password.getPassword());
            exitCsv.endRecord();
        }
        
        exitCsv.close();
        
        }catch(IOException e){
            e.printStackTrace();  
        }   
    }
    
    public static void importCsv(){
        try{
            List<Password> pass = new ArrayList<>();
            String key;
            CsvReader readPass = new CsvReader("Passwords.csv");   
            readPass.readHeaders();
            
            while(readPass.readRecord()){
            
            String user= readPass.get(0);
            String password= readPass.get(1);
            
            pass.add(new Password(user,password));
            }
            
            readPass.close();
            for(Password password : pass){
                System.out.println(password.getPassword());
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace(); 
        }catch(IOException e){
            e.printStackTrace();
        }
        
        }
}
    



