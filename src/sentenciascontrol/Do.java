/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;
import Modelos.MDO; 
import javax.swing.JOptionPane;


/**
 *
 * @author Armando J. López L.
 */
public class Do extends javax.swing.JInternalFrame {

    MDO hacer=new MDO();
    /**
     * Creates new form Do
     */
    public Do() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.                                                                   
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lEjer1 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        tfNum1 = new javax.swing.JTextField();
        bVerificar3 = new javax.swing.JButton();
        ln1 = new javax.swing.JLabel();
        lEjer4 = new javax.swing.JLabel();
        bVerificar4 = new javax.swing.JButton();
        lContra4 = new javax.swing.JLabel();
        lEjer2 = new javax.swing.JLabel();
        tfContra5 = new javax.swing.JTextField();
        la2 = new javax.swing.JLabel();
        bCalcular1 = new javax.swing.JButton();
        tfNum2 = new javax.swing.JTextField();
        lEjer5 = new javax.swing.JLabel();
        bCalcular2 = new javax.swing.JButton();
        bImprimir6 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        lEjer6 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        bCalcular5 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Sentencia de Repetición do de Java");

        lEjer1.setText("1. Calcule el promedio de los números entre 1 y N");

        bVerificar3.setText("Verificar");
        bVerificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar3ActionPerformed(evt);
            }
        });

        ln1.setText("N=");

        lEjer4.setText("4. Verifique que la contraseña es correcta: \"abc.123\"");

        bVerificar4.setText("Verificar");
        bVerificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar4ActionPerformed(evt);
            }
        });

        lContra4.setText("Contraseña:");

        lEjer2.setText("2. Calcule el promedio de los números entre a y b");

        la2.setText("a=");

        bCalcular1.setText("Calcular");
        bCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular1ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Imprimir la suma de los número impares existentes entre 2 y 200");

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        bImprimir6.setText("Imprimir");
        bImprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimir6ActionPerformed(evt);
            }
        });

        lb2.setText("b=");

        lEjer6.setText("6. Imprimir los 6 primeros términos de la serie de Fibonacci");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Verificar si el siguiente número es compuesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lContra4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContra5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar3))
                    .addComponent(lEjer1)
                    .addComponent(lEjer2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ln1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular2))))
                    .addComponent(lEjer3)
                    .addComponent(lEjer4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bImprimir6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln1)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la2)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular2)
                    .addComponent(lb2)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lContra4)
                    .addComponent(tfContra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bCalcular5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bImprimir6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar3ActionPerformed
        double n1=Double.parseDouble(tfNum4.getText());
        boolean respuestaveri=hacer.primo(n1);
        if(respuestaveri){
        JOptionPane.showMessageDialog(this,"Es compuesto");
                }
        else{
            JOptionPane.showMessageDialog(this,"No es compuesto");
        
        }
        
    }//GEN-LAST:event_bVerificar3ActionPerformed

    private void bVerificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar4ActionPerformed
     
     /*  
          String contra;
        contra = String.valueOf(tfContra5);
        boolean respcontra=hacer.conta(contra);
        if(respcontra){
            JOptionPane.showMessageDialog(this,"acceso consedido");
            
        }
        else{
            JOptionPane.showMessageDialog(this,"contasenia incorrecta");
        }*/
    }//GEN-LAST:event_bVerificar4ActionPerformed

    private void bCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular1ActionPerformed
double n2=Double.parseDouble(tfNum1.getText());
double resp=hacer.prom_1n(n2);
JOptionPane.showMessageDialog(this, "EL promedio de numeros es "+resp);


        // TODO add your handling code here:
    }//GEN-LAST:event_bCalcular1ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
double n3=Double.parseDouble(tfNum2.getText());
double n4=Double.parseDouble(tfNum2.getText());
double resp1=hacer.prom_12(n3, n4);
JOptionPane.showMessageDialog(this, "el promedio es "+resp1);
    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bImprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimir6ActionPerformed
//fibo

    }//GEN-LAST:event_bImprimir6ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
    double suma=hacer.sumar2();
    JOptionPane.showMessageDialog(this,suma);// TODO add your handling code here:
            
    }//GEN-LAST:event_bCalcular5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular1;
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bImprimir6;
    private javax.swing.JButton bVerificar3;
    private javax.swing.JButton bVerificar4;
    private javax.swing.JLabel lContra4;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel la2;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel ln1;
    private javax.swing.JTextField tfContra5;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    // End of variables declaration//GEN-END:variables
}
