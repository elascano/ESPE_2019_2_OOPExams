/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.view;

/**
 *
 * @author Inforlan
 */
public class frmRegister extends javax.swing.JFrame {

    /**
     * Creates new form frmRegister
     */
    public frmRegister() {
        initComponents();
        
         setLocationRelativeTo(null);
         rootPane.setDefaultButton(btnSave);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegister = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblInsPassword = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtInsPassword = new javax.swing.JTextField();
        lblFondoRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblRegister.setText("REGISTER");
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblUsername.setText("Insert a Username:");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblInsPassword.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInsPassword.setText("Insert a Password:");
        getContentPane().add(lblInsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 51, 102));
        btnSave.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(null);
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setToolTipText("Click,if you want to back to first window.");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        txtUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setToolTipText("Insert a username (Adrian,Dennis,etc)");
        txtUsername.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 130, 30));

        txtInsPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInsPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInsPassword.setToolTipText("Insert a secure password");
        txtInsPassword.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(txtInsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 30));

        lblFondoRegister.setBackground(new java.awt.Color(0, 0, 0));
        lblFondoRegister.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblFondoRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 604, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SuperLoginJFrame superloginframe = new SuperLoginJFrame();
       superloginframe.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFondoRegister;
    private javax.swing.JLabel lblInsPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtInsPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
