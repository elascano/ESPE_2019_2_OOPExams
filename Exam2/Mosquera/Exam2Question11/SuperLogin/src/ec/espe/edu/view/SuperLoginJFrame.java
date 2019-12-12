/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.view;

import ec.edu.espe.model.Security;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inforlan
 */
public final class SuperLoginJFrame extends javax.swing.JFrame {
    private static Scanner sc;
    private static int tries;
    private static String user,password;

    /**
     * Creates new form SuperLoginJFrame
     */
    public SuperLoginJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        rootPane.setDefaultButton(btnLogin);
    }

    public static void setTries(int tries) {
        SuperLoginJFrame.tries = tries;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSystem = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("O");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 10, -1));

        lblSystem.setBackground(new java.awt.Color(0, 0, 0));
        lblSystem.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblSystem.setText("   SYSTEM");
        getContentPane().add(lblSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, 40));

        btnLogin.setBackground(new java.awt.Color(0, 51, 102));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("click, if you are a registered user.");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, -1));

        btnRegister.setBackground(new java.awt.Color(0, 51, 102));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setToolTipText("click, if you want to register for the first time.");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, -1));

        btnExit.setBackground(new java.awt.Color(0, 51, 102));
        btnExit.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.setToolTipText("Click to exit of the sytem.");
        btnExit.setActionCommand("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblUser.setText("USER");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 70, 30));

        txtUser.setBackground(new java.awt.Color(153, 153, 153));
        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setToolTipText("Enter your username.");
        txtUser.setBorder(new javax.swing.border.MatteBorder(null));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, 30));

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setText("PASSWORD");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 110, 30));

        txtPassword.setBackground(new java.awt.Color(153, 153, 153));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setToolTipText("enter your password");
        txtPassword.setBorder(new javax.swing.border.MatteBorder(null));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 30));

        jLabel1Fondo.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        FileReader fr=null;
        try {
            // TODO add your handling code here:
            int nLines=0;
            int i=0;
            String [] users = null;
            String line;
            sc= new Scanner(new File("C:\\Users\\Inforlan\\Documents\\ANMG\\SuperLogin\\Users.txt"));
            File f = new File("C:\\Users\\Inforlan\\Documents\\ANMG\\SuperLogin\\Users.txt");
            fr = new FileReader(f); // le mando el parametro f porque es la ruta del archivo
            BufferedReader br = new BufferedReader(fr);// hasta aqui ya se procesa el archivo
            try {
                while((line=br.readLine())!=null){// mientras la linea actual no este vacia que la procese
                    nLines++;
                      
                }   } catch (IOException ex) {
                Logger.getLogger(SuperLoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            users = new String [nLines];// the size of the array
            
            while(sc.hasNextLine()){
            users[i++] = sc.nextLine();//Keep the lines in the array
            }
            tries++;
            user=txtUser.getText();
            password=txtPassword.getText();
            
            Security s =new Security();
            s.validLogin(users, user, password, tries);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuperLoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                
            } catch (IOException ex) {
                Logger.getLogger(SuperLoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        frmRegister frmregister = new frmRegister();
        frmregister.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
  
    /**
     * @param args the command line arguments
     */
   
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuperLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSystem;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    
}