/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class Registry {

    Leer leers = new Leer();
    private String encrip;

    public AddData addCsv() {
        AddData addData = new AddData();

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese Usuario: ");
        addData.setUser(in.nextLine());
        System.out.println("Ingrese Contraseña: ");
        addData.setPass(in.nextLine());

        return addData;
    }

    public void file(AddData addData) {
        Password password = new Password();
        try {
            File f = new File("Datos.csv");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                encrip = password.encriptar(addData.getPass());
                Gson gson = new Gson();

                String jsonString = gson.toJson(addData);
//                System.out.println("json -->" + jsonString);
                bw.newLine();
                bw.write(addData.getUser() + ";" + encrip +";" + jsonString);

            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                String encrip = password.encriptar(addData.getPass());
                bw.write(addData.getUser() + ";" + encrip);
            }
            bw.close();
        } catch (IOException e) {

        }
    }

//     public AddData searchData(String user){
//        ArrayList<AddData> arrData = new ArrayList<AddData>();
//        AddData data = new AddData();
//        arrData = leers.
//        for (int i = 0; i < arrData.size(); i++) {
//            if (arrData.get(i).getUser()== user) {
//                data =  arrData.get(i);
//            }
//        }
//        return data;
//    }
}
