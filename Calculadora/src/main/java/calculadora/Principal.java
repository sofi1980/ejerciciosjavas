
package calculadora;

import javax.swing.JOptionPane;
import sun.management.snmp.jvmmib.EnumJvmThreadCpuTimeMonitoring;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }
    
public boolean Validacion()//verdadero entero valor falso
{
int n1,n2;
    try
    {
        n1 = Integer.parseInt(numero1.getText());
        n2 = Integer.parseInt(numero2.getText());
        return true;
    }
    
        catch(Exception e){
        return false;
    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        RESTA = new javax.swing.JButton();
        MULTIPLICACION = new javax.swing.JButton();
        DIVISION = new javax.swing.JButton();
        SUMA = new javax.swing.JButton();
        RESULTADO = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RESTA.setText("-");
        RESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTAActionPerformed(evt);
            }
        });

        MULTIPLICACION.setText("*");
        MULTIPLICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICACIONActionPerformed(evt);
            }
        });

        DIVISION.setText("/");
        DIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISIONActionPerformed(evt);
            }
        });

        SUMA.setText("+");
        SUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMAActionPerformed(evt);
            }
        });

        RESULTADO.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        RESULTADO.setText("0");

        LIMPIAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LIMPIAR.setText("Limpiar");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MULTIPLICACION)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DIVISION))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SUMA)
                        .addGap(83, 83, 83)
                        .addComponent(RESTA)))
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(RESULTADO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LIMPIAR)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SUMA)
                            .addComponent(RESTA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MULTIPLICACION)
                    .addComponent(DIVISION))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESULTADO)
                    .addComponent(LIMPIAR))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MULTIPLICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MULTIPLICACIONActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
numero1.setText(null);
numero2.setText(" ");
RESULTADO.setText("0");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void SUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMAActionPerformed
        // TODO add your handling code here:
        if (Validacion()==true){
        int resul;
        resul = Integer.parseInt(numero1.getText()) +Integer.parseInt(numero2.getText());
        RESULTADO.setText(String.valueOf(resul));
                
        }
        else{
             JOptionPane.showMessageDialog(null,"algunos datos son erroneos");
             
           }
         }
            
            
           
    
        
    }//GEN-LAST:event_SUMAActionPerformed

    private void RESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RESTAActionPerformed

    private void DIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DIVISIONActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIVISION;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton MULTIPLICACION;
    private javax.swing.JButton RESTA;
    private javax.swing.JLabel RESULTADO;
    private javax.swing.JButton SUMA;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    // End of variables declaration//GEN-END:variables
}
