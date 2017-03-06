package Vista;

import java.text.DecimalFormat;

public class CreacionProyecto extends javax.swing.JDialog {

    public CreacionProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_capex_total = new javax.swing.JTextField();
        txt_capex_diferencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_capex_ingresado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_creacion_proyecto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREACION DE PROYECTO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informativos"));

        jLabel2.setText("Nombre Proyecto : ");

        jLabel4.setText("Capex Total :");

        txt_capex_total.setEditable(false);
        txt_capex_total.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txt_capex_diferencia.setEditable(false);
        txt_capex_diferencia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel5.setText("Diferencia :");

        jLabel6.setText("Capex Ingresado :");

        txt_capex_ingresado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_capex_ingresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_capex_ingresadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_capex_ingresadoMouseExited(evt);
            }
        });
        txt_capex_ingresado.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_capex_ingresadoInputMethodTextChanged(evt);
            }
        });
        txt_capex_ingresado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_capex_ingresadoPropertyChange(evt);
            }
        });
        txt_capex_ingresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_capex_ingresadoKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Guardar Registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_capex_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_capex_total, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_capex_diferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_capex_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_capex_diferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_capex_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 51, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        tabla_creacion_proyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE PROYECTO", "CAPEX INGRESADO", "CAPEX UTILIZADO", "DIFERENCIA", "ESTADO"
            }
        ));
        tabla_creacion_proyecto.setRowHeight(25);
        jScrollPane1.setViewportView(tabla_creacion_proyecto);
        if (tabla_creacion_proyecto.getColumnModel().getColumnCount() > 0) {
            tabla_creacion_proyecto.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_creacion_proyecto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_creacion_proyecto.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_creacion_proyecto.getColumnModel().getColumn(1).setMinWidth(480);
            tabla_creacion_proyecto.getColumnModel().getColumn(1).setPreferredWidth(480);
            tabla_creacion_proyecto.getColumnModel().getColumn(1).setMaxWidth(480);
            tabla_creacion_proyecto.getColumnModel().getColumn(2).setMinWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(2).setMaxWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(3).setMinWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(3).setPreferredWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(3).setMaxWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(4).setMinWidth(150);
            tabla_creacion_proyecto.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla_creacion_proyecto.getColumnModel().getColumn(4).setMaxWidth(150);
            tabla_creacion_proyecto.getColumnModel().getColumn(5).setMinWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(5).setPreferredWidth(170);
            tabla_creacion_proyecto.getColumnModel().getColumn(5).setMaxWidth(170);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txt_capex_ingresadoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_capex_ingresadoInputMethodTextChanged
//        this.txt_capex_total.setText("hola cambie");
    }//GEN-LAST:event_txt_capex_ingresadoInputMethodTextChanged

    private void txt_capex_ingresadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_capex_ingresadoPropertyChange

    }//GEN-LAST:event_txt_capex_ingresadoPropertyChange

    private void txt_capex_ingresadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_capex_ingresadoMouseExited

        if (txt_capex_ingresado.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "estoy afuera");
        } else {            
            double valor = Double.parseDouble(txt_capex_ingresado.getText());
            DecimalFormat formatear = new DecimalFormat("###,###,###,###,###,###,###.##");
            this.txt_capex_ingresado.setText(formatear.format(valor));
        }

    }//GEN-LAST:event_txt_capex_ingresadoMouseExited

    private void txt_capex_ingresadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capex_ingresadoKeyReleased
    }//GEN-LAST:event_txt_capex_ingresadoKeyReleased

    private void txt_capex_ingresadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_capex_ingresadoMouseEntered
        if (txt_capex_ingresado.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "estoy afuera");
        } else {    
            String valor = "", numero = "";
            
            valor = txt_capex_ingresado.getText();
            numero = valor.replaceAll("\\.","");                        
            this.txt_capex_ingresado.setText(""+numero);
        }
    }//GEN-LAST:event_txt_capex_ingresadoMouseEntered

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                CreacionProyecto dialog = new CreacionProyecto(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tabla_creacion_proyecto;
    private javax.swing.JTextField txt_capex_diferencia;
    private javax.swing.JTextField txt_capex_ingresado;
    private javax.swing.JTextField txt_capex_total;
    // End of variables declaration//GEN-END:variables
}
