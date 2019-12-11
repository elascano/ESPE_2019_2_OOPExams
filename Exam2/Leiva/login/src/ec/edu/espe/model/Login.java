/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.espe.edu.view.FrmMenuPrincipal;
import ec.espe.edu.view.SuperLoginJFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Inforlan
 */
public class Login {
    String ans;
    SuperLoginJFrame superlogin = new SuperLoginJFrame();
    
    public void validLogin(String users[], String user, String password,int tries){
        boolean found = false;
        
        for(int i=0;i<users.length;i++){
            if ((users[i].equalsIgnoreCase(user)&& users[i+1].equals(password))){
                ans= "Welcome to the System: "+ user;
                found = true;
                JOptionPane.showMessageDialog(null,ans,"LOGIN SUCCESFULL",JOptionPane.INFORMATION_MESSAGE);
                tries=0;
                superlogin.setTries(tries);
                FrmMenuPrincipal frmmenuprincipal = new FrmMenuPrincipal();
                frmmenuprincipal.setVisible(true);
                break;
                
                
            }
        }//finish FOR
        if (found == false){
            ans = "the password or user is not correct "+ tries+" fail attempts";
            JOptionPane.showMessageDialog(null,ans,"IT WAS NOT POSIBLE LOGIN",JOptionPane.ERROR_MESSAGE);
        }
        if (tries >2){
            JOptionPane.showMessageDialog(null,ans,"3 fail attempts,it will close ",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    
    }
}
