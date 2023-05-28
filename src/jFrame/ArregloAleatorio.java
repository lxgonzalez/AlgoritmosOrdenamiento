/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFrame;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class ArregloAleatorio extends javax.swing.JFrame {

    /**
     * Creates new form ArregloAleatorio
     */
    int dimension = 0;
    int[] arreglo;
    public ArregloAleatorio() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        setTitle("Arreglo Aleatorio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtDimension = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblArregloTotal = new javax.swing.JTextArea();
        bxAlgoritmos = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();

        btnAceptar1.setBackground(new java.awt.Color(255, 176, 114));
        btnAceptar1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(201, 40, 79));
        btnAceptar1.setText("Tiempos de Ejecucion");
        btnAceptar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnAceptar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 40, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 250, 30));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 227, 179));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese la dimension del arreglo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 40));

        btnAceptar.setBackground(new java.awt.Color(255, 176, 114));
        btnAceptar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(201, 40, 79));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 30));

        jSeparator2.setBackground(new java.awt.Color(201, 40, 79));
        jSeparator2.setForeground(new java.awt.Color(201, 40, 79));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 0, 10));

        txtDimension.setBackground(new java.awt.Color(201, 40, 79));
        txtDimension.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtDimension.setForeground(new java.awt.Color(255, 255, 255));
        txtDimension.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDimension.setBorder(null);
        txtDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 40));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 227, 179));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Arreglo Aleatorio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 40));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 710, 10));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 153, 102));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblArregloTotal.setEditable(false);
        lblArregloTotal.setBackground(new java.awt.Color(201, 40, 79));
        lblArregloTotal.setColumns(20);
        lblArregloTotal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblArregloTotal.setForeground(new java.awt.Color(51, 51, 51));
        lblArregloTotal.setRows(5);
        lblArregloTotal.setBorder(null);
        jScrollPane2.setViewportView(lblArregloTotal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 580, 50));

        bxAlgoritmos.setBackground(new java.awt.Color(102, 102, 102));
        bxAlgoritmos.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        bxAlgoritmos.setForeground(new java.awt.Color(255, 255, 255));
        bxAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Algoritmo de Ordenamiento", "BubbleSort", "SelectionSort", "InsertionSort", "Shellsort" }));
        bxAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxAlgoritmosActionPerformed(evt);
            }
        });
        jPanel1.add(bxAlgoritmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 380, 40));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 680, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        try {
            dimension = Integer.parseInt(txtDimension.getText());
            txtDimension.setText("");
            txtDimension.requestFocus();
            JOptionPane.showMessageDialog(this, "La dimension es correcta", "Ingrese los " + dimension + " numeros", JOptionPane.INFORMATION_MESSAGE);
            arreglo = new int[dimension];

            for (int i = 0; i < dimension; i++) {
                arreglo[i] = (int) (Math.random() * 500 + 1);
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < dimension; i++) {
                builder.append(arreglo[i]).append(" | ");
            }
            lblArregloTotal.setText(builder.toString());

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se permiten letras\nNo se permiten numeros negativos", "Error!", JOptionPane.ERROR_MESSAGE);
            txtDimension.setText("");
            txtDimension.requestFocus();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDimensionActionPerformed

    private void bxAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxAlgoritmosActionPerformed
        // TODO add your handling code here:
        if (dimension == 0) {
            JOptionPane.showMessageDialog(this, "Aun no existe un arreglo", "Error!", JOptionPane.ERROR_MESSAGE);
            bxAlgoritmos.setSelectedIndex(0);

        } else {
            int opcion = bxAlgoritmos.getSelectedIndex();
            switch (opcion) {
                case 1 : {
                    BubbleSort ordenar = new BubbleSort(arreglo, dimension);
                    ordenar.setVisible(true);
                }
                case 2 : {
                    SelectionSort ordenar = new SelectionSort(arreglo, dimension);
                    ordenar.setVisible(true);
                }
                case 3 : {
                    InsertionSort ordenar = new InsertionSort(arreglo, dimension);
                    ordenar.setVisible(true);
                }
                case 4 : {
                    ShellSort ordenar = new ShellSort(arreglo, dimension);
                    ordenar.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_bxAlgoritmosActionPerformed
    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        TiemposEjecucion te = new TiemposEjecucion();

        te.setVisible(true);
    }//GEN-LAST:event_btnAceptar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ArregloAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArregloAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArregloAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArregloAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArregloAleatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JComboBox<String> bxAlgoritmos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea lblArregloTotal;
    private javax.swing.JTextField txtDimension;
    // End of variables declaration//GEN-END:variables
}
