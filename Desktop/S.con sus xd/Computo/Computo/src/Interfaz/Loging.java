package Interfaz;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author CCP
 */
public class Loging extends javax.swing.JFrame {

    
    public Loging() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JTextField();
        Contra1 = new javax.swing.JPasswordField();
        ENTRAR1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        USER2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Castellar", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Institututo de computatacion \"CompuSur\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Login");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
        getContentPane().add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, -1));

        Contra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contra1ActionPerformed(evt);
            }
        });
        getContentPane().add(Contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 130, -1));

        ENTRAR1.setText("Ingresar");
        ENTRAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRAR1ActionPerformed(evt);
            }
        });
        getContentPane().add(ENTRAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "DOCENTE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inf.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));
        getContentPane().add(USER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void validarAdmi(){
        classDAO.LoginDAO obj = new classDAO.LoginDAO();
        
        obj.setUsuario(Usuario1.getText());
        obj.setClave(Contra1.getText());
        
        if(obj.validar("select * from aministrador where usuario='"+Usuario1.getText()+"' and clave='"+Contra1.getText()+"'")==false){
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }else{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Administrador().setVisible(true);
                }
            });
            this.dispose();
        }
    }
    void validarMaes(){
    classDAO.MaestroDAO mae = new classDAO.MaestroDAO();
        mae.setUsuario(Usuario1.getText());
        mae.setContrasena(Contra1.getText());
        if(mae.validar("select * from docente where usuario='"+Usuario1.getText()+"' and clave='"+Contra1.getText()+"'")==false){
            JOptionPane.showMessageDialog(rootPane, "DATOS incorrectos");
        }else{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Maestro().setVisible(true);  
                }
            });
            this.dispose();
        }
}
    private void ENTRAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRAR1ActionPerformed
        String opcion =(String)jComboBox1.getSelectedItem();
        
        if(opcion.equals("ADMINISTRADOR")){
            validarAdmi();
        } else {
            validarMaes();
           
        }
        
        /*  classDAO.LoginDAO obj = new classDAO.LoginDAO();
        obj.setUsuario(Usuario1.getText());
        obj.setClave(Contra1.getText());
        classDAO.MaestroDAO mae = new classDAO.MaestroDAO();
        mae.setUsuario(Usuario1.getText());
        mae.setContrasena(Contra1.getText());
       /* if(obj.validar("select * from admin where usuario='"+Usuario1.getText()+"' and contrasena='"+Contra1.getText()+"'")==false){
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }else{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Administrador().setVisible(true);
                }
            });
            this.dispose();
        }*/
       
        
        
        //validarAdmi();
        //validarMaes();
    }//GEN-LAST:event_ENTRAR1ActionPerformed

    private void Contra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contra1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contra1;
    private javax.swing.JButton ENTRAR1;
    public static javax.swing.JTextField USER2;
    public static javax.swing.JTextField Usuario1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    
}
