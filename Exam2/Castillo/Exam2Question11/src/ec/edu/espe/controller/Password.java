/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.io.UnsupportedEncodingException;
import static java.lang.System.exit;
import java.util.Base64;
import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class Password {

    private int i;

    public void login() throws UnsupportedEncodingException {
        AddData addData = new AddData();
        Scanner sc = new Scanner(System.in);

        for (i = 1; i < 4; i++) {
            System.out.println("¿Nombre de usuario?\n");
            addData.setUser(sc.nextLine());
            if (addData.getUser().equals(addData.getUser())) {
                System.out.println("Nombre de usuario correcto\n Por favor ingrese su contrasena:\n");
                addData.setPass(sc.nextLine());
                if ("admin123".equals(addData.getPass())) {
                    System.out.println("Contrasena correcta, bienvenido");
                    String encrip = encriptar(addData.getPass());
                    String desinc = desencriptar(encrip);
                    System.out.println("Cadena encriptada > " + encrip);
                    System.out.println("Cadena desencriptada > " + desinc);
                    exit(0);
                } else if (!"admin123".equals(addData.getPass())) {
                    System.out.println("Contrasena incorrecta, por favor ingrese un usuario y contrasena valida");
                }
            } else if (!"admin".equals(addData.getUser())) {
                System.out.println("Nombre de usuario incorrecto, por favor ingrese su nombre de usuario nuevamente");
                //system("pause>null");
            }

            if (i > 0) {
                System.out.println("Ha realizado" + i + "/3 intentos");
            }
            if (i == 3) {

                System.out.println("Ha realizado 3 intentos, por seguridad el programa se cerrara...");
                exit(0);
            }
        }

    }

    public String encriptar(String s) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }

    public String desencriptar(String s) throws UnsupportedEncodingException {
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, "utf-8");
    }

}
