/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Angel castillo
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {

        Registry registry = new Registry();
        Leer leer = new Leer();

        AddData addData = new AddData();
        addData = registry.addCsv();
        registry.file(addData);

        List<AddData> arrData = new ArrayList<AddData>();
        arrData = leer.leerCsv();
        System.out.println(Arrays.toString(arrData.toArray()));
        

        Password password = new Password();
        password.login();

    }

}
