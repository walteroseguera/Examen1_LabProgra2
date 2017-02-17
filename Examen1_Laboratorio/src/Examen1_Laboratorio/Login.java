package Examen1_Laboratorio;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        TFContraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BIngresar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        PBCrearUsuario = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        BCrearNasrralla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Usuario: ");

        jLabel3.setText("Contraseña: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar al Programa");

        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });

        TFContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFContraseñaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setText("Programa creado por Walter Oseguera");

        BIngresar.setText("Ingresar");
        BIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BIngresarMouseClicked(evt);
            }
        });
        BIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIngresarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCancelarMouseClicked(evt);
            }
        });

        PBCrearUsuario.setMaximum(1);

        jLabel5.setText("Ing. Nasrralla: ");

        BCrearNasrralla.setText("Crear Usuario");
        BCrearNasrralla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCrearNasrrallaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(29, 29, 29)
                                                .addComponent(BCrearNasrralla)))
                                        .addGap(18, 18, 18)
                                        .addComponent(PBCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(BIngresar)
                                .addGap(38, 38, 38)
                                .addComponent(BCancelar)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BCrearNasrralla)
                    .addComponent(PBCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BIngresar)
                    .addComponent(BCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIngresarActionPerformed
        
    }//GEN-LAST:event_BIngresarActionPerformed

    private void BIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BIngresarMouseClicked
        Principal Inicio = new Principal();
        if (Usuario.equals(TFUsuario.getText()) && Contraseña.equals(TFContraseña.getText())) {
            dispose();
            Inicio.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Lo sentimos su usuario o contraseña son incorrectos");
        }
    }//GEN-LAST:event_BIngresarMouseClicked

    private void BCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_BCancelarMouseClicked

    private void BCrearNasrrallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCrearNasrrallaMouseClicked
        if (PBCrearUsuario.getValue() < 1) {
            Usuario = JOptionPane.showInputDialog("Ingrese su usuario: ");
            Contraseña = JOptionPane.showInputDialog("Ingrese su contraseña: ");
            PBCrearUsuario.setValue(2);
            JOptionPane.showMessageDialog(this, "Ingeniero Nasrralla su usuario ha sido creado");
        } /* Fin if */ else{
            JOptionPane.showMessageDialog(this, "Lo sentimos solo puede crearse un usuario");
        }
    }//GEN-LAST:event_BCrearNasrrallaMouseClicked

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void TFContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFContraseñaActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BCrearNasrralla;
    private javax.swing.JButton BIngresar;
    private javax.swing.JProgressBar PBCrearUsuario;
    private javax.swing.JTextField TFContraseña;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    String Usuario, Contraseña;
}