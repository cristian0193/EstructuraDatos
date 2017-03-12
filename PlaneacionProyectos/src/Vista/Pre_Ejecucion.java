package Vista;

import Conexion.ConexioSQLite;
import static Vista.Pre_Capitalizacion.conexion;
import static Vista.Pre_Capitalizacion.modelo;
import static Vista.Pre_Capitalizacion.valor;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pre_Ejecucion extends javax.swing.JDialog {

    public static String valor;
    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public Pre_Ejecucion(java.awt.Frame parent, boolean modal, String numero) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor = numero;
        this.txt_id_proyecto_detallada.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id_proyecto_detallada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_item = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        check_semana = new javax.swing.JCheckBox();
        check_fin_semana = new javax.swing.JCheckBox();
        check_cumple = new javax.swing.JCheckBox();
        check_no_cumple = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txt_remisiones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_comentarios = new javax.swing.JTextArea();
        combo_pr = new javax.swing.JComboBox();
        combo_cotizacion = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_licitacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_proveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_informacion_detallada = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        combo_trabajo = new javax.swing.JComboBox();
        btn_grabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION DEL PROYECTO DETALLADA");

        txt_id_proyecto_detallada.setEditable(false);
        txt_id_proyecto_detallada.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_proyecto_detallada.setForeground(new java.awt.Color(255, 51, 51));
        txt_id_proyecto_detallada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_proyecto_detallada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_proyecto_detalladaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Datos"));

        jLabel2.setText("ITEM :");

        combo_item.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "TOMA CORRIENTE", "ILUMINACION", "CONEXION DE EQUIPOS", "DESCONEXION EQUIPOS", "TABLEROS", "TRAJE", "PLANOS ELECTRICOS" }));
        combo_item.setEnabled(false);

        jLabel4.setText("Cotizacion :");

        jLabel5.setText("Costos :");

        jLabel6.setText("PR :");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Bloqueos"));

        check_semana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check_semana.setText("S");

        check_fin_semana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check_fin_semana.setText("F");

        check_cumple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check_cumple.setText("C");

        check_no_cumple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check_no_cumple.setText("N/C");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(check_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(check_fin_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(check_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(check_no_cumple)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check_no_cumple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(check_fin_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(check_cumple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setText("Remisiones :");

        jLabel8.setText("Comentarios :");

        txt_comentarios.setColumns(20);
        txt_comentarios.setRows(5);
        jScrollPane2.setViewportView(txt_comentarios);

        combo_pr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "OK", "PENDIENTE", "DENEGADA" }));

        combo_cotizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "OK", "PENDIENTE" }));

        jLabel9.setText("Licitacion :");

        txt_licitacion.setEditable(false);

        jLabel10.setText("Proveedor :");

        jLabel11.setText("DD/MM/YYYY");

        jLabel12.setText("DD/MM/YYYY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_remisiones)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_proveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_licitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(txt_costo))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(combo_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_licitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_remisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tabla_informacion_detallada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRABAJO", "ITEM", "S", "F", "C", "N/A"
            }
        ));
        tabla_informacion_detallada.setRowHeight(25);
        jScrollPane1.setViewportView(tabla_informacion_detallada);
        if (tabla_informacion_detallada.getColumnModel().getColumnCount() > 0) {
            tabla_informacion_detallada.getColumnModel().getColumn(0).setMinWidth(180);
            tabla_informacion_detallada.getColumnModel().getColumn(0).setPreferredWidth(180);
            tabla_informacion_detallada.getColumnModel().getColumn(0).setMaxWidth(180);
            tabla_informacion_detallada.getColumnModel().getColumn(1).setMinWidth(320);
            tabla_informacion_detallada.getColumnModel().getColumn(1).setPreferredWidth(320);
            tabla_informacion_detallada.getColumnModel().getColumn(1).setMaxWidth(320);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel3.setText("Tipo de Trabajo :");

        combo_trabajo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "ELECTRICO", "CIVIL", "DATOS" }));
        combo_trabajo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_trabajoItemStateChanged(evt);
            }
        });

        btn_grabar.setBackground(new java.awt.Color(51, 255, 204));
        btn_grabar.setText("Grabar Registro");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(txt_id_proyecto_detallada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(combo_trabajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_proyecto_detallada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_proyecto_detalladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_proyecto_detalladaActionPerformed


    }//GEN-LAST:event_txt_id_proyecto_detalladaActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed

        String trabajo = combo_trabajo.getSelectedItem().toString();
        String item = combo_item.getSelectedItem().toString();
        String cotizacion = combo_cotizacion.getSelectedItem().toString();
        String proveedor = txt_proveedor.getText();
        String costo = txt_costo.getText();
        String licitacion = txt_licitacion.getText();
        String pr = combo_pr.getSelectedItem().toString();
        String s = "";
        String f = "";
        String c = "";
        String nc = "";
        String remision = txt_remisiones.getText();
        String comentario = txt_comentarios.getText();

        if (check_semana.isSelected()) {
            s = "X";
        } else {
            s = "";
        }

        if (check_fin_semana.isSelected()) {
            f = "X";
        } else {
            f = "";
        }

        if (check_cumple.isSelected()) {
            c = "X";
        } else {
            c = "";
        }

        if (check_no_cumple.isSelected()) {
            nc = "X";
        } else {
            nc = "";
        }

        if (trabajo.equals("Seleccionar") || item.equals("Seleccionar") || cotizacion.equals("Seleccionar")
                || proveedor.equals("") || costo.equals("") || licitacion.equals("") || pr.equals("Seleccionar")
                || remision.equals("") || comentario.equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS OBLIGATORIOS");
        } else {

            boolean resultado = insertar_ejecucion(item, cotizacion, proveedor, costo, licitacion, pr, s, f, c, nc, remision, comentario, valor);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CAPITALIZACION INSERTADA");
                LimpiarCampos();
                conexion.cerrar();
                cargar_tabla_capitalizacion(valor);
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                LimpiarCampos();
            }
        }


    }//GEN-LAST:event_btn_grabarActionPerformed

    private void combo_trabajoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_trabajoItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            combo_item.setEnabled(true);
            combo_item.removeAllItems();
            combo_item.addItem("Seleccionar");
            String trabajo = combo_trabajo.getSelectedItem().toString();
            cargar_lista_item(trabajo);
        }


    }//GEN-LAST:event_combo_trabajoItemStateChanged

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
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Pre_Ejecucion dialog = new Pre_Ejecucion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_grabar;
    private javax.swing.JCheckBox check_cumple;
    private javax.swing.JCheckBox check_fin_semana;
    private javax.swing.JCheckBox check_no_cumple;
    private javax.swing.JCheckBox check_semana;
    private javax.swing.JComboBox combo_cotizacion;
    private javax.swing.JComboBox combo_item;
    private javax.swing.JComboBox combo_pr;
    private javax.swing.JComboBox combo_trabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_informacion_detallada;
    private javax.swing.JTextArea txt_comentarios;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_id_proyecto_detallada;
    private javax.swing.JTextField txt_licitacion;
    private javax.swing.JTextField txt_proveedor;
    private javax.swing.JTextField txt_remisiones;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        combo_trabajo.setSelectedIndex(0);
        combo_cotizacion.setSelectedIndex(0);
        combo_item.setSelectedIndex(0);
        combo_pr.setSelectedIndex(0);
        txt_costo.setText("");
        txt_proveedor.setText("");
        txt_remisiones.setText("");
        txt_licitacion.setText("");
        txt_comentarios.setText("");
        check_semana.setSelected(false);
        check_fin_semana.setSelected(false);
        check_cumple.setSelected(false);
        check_no_cumple.setSelected(false);
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public boolean insertar_ejecucion(
            String ITEM,
            String COTIZACION,
            String PROVEEDOR,
            String COSTO,
            String LICITACION,
            String PR,
            String SEMANA,
            String FIN_SEMANA,
            String CUMPLE,
            String NO_CUMPLE,
            String REMISION,
            String OBSERVACION,
            String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String query2 = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "INSERT INTO "
                + " CAPITALIZACION "
                + " ( ID,ID_ITEM,COTIZACION,PROVEEDOR, COSTOS, LICITACION, PR,BLOQUEO_S,BLOQUEO_F,BLOQUEO_C,BLOQUEO_NC,REMISIONES,COMENTARIOS,ID_PROYECTO ) "
                + " VALUES ( "
                + " NULL,"
                + "  " + ITEM + ","
                + "  '" + COTIZACION + "',"
                + "  '" + PROVEEDOR + "',"
                + "  '" + COSTO + "',"
                + "  '" + LICITACION + "',"
                + "  '" + PR + "',"
                + "  '" + SEMANA + "',"
                + "  '" + FIN_SEMANA + "',"
                + "  '" + CUMPLE + "',"
                + "  '" + NO_CUMPLE + "',"
                + "  '" + REMISION + "',"
                + "  '" + OBSERVACION + "',"
                + "  " + ID_PROYECTO + ");";

        query2 = "UPDATE"
                + " PROYECTOS"
                + " SET "
                + "  ESTADO = 'EN EJECUCION'"
                + " WHERE"
                + "  ID = " + ID_PROYECTO + ";";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            st.executeUpdate(query);
            st.executeUpdate(query2);

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertar " + ex);
            return false;
        }
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla_capitalizacion(String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"TRABAJO", "ITEM", "S", "F", "C", "N/C"};
        String[] registro = new String[6];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT T.DESCRIPCION AS TRABAJO, I.DESCRIPCION AS ITEM, PD.BLOQUEO_S AS SEMANA,PD.BLOQUEO_F AS FIN,PD.BLOQUEO_C AS CUMPLE,PD.BLOQUEO_NC AS NO_CUMPLE "
                + "FROM TRABAJOS T, ITEM I, PROYECTO_DETALLADO PD, PROYECTOS PR "
                + "WHERE T.ID = I.ID_TRABAJOS "
                + "AND I.ID = PD.ID_ITEM "
                + "AND PR.ID = PD.ID_PROYECTO "
                + "AND PD.ID_PROYECTO = " + ID_PROYECTO + ";";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("TRABAJO");
                registro[1] = rs.getString("ITEM");
                registro[2] = rs.getString("SEMANA");
                registro[3] = rs.getString("FIN");
                registro[4] = rs.getString("CUMPLE");
                registro[5] = rs.getString("NO_CUMPLE");

                modelo.addRow(registro);
            }
            tabla_informacion_detallada.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "tabla " + ex);

        }
    }

    // METODO PARA CARGAR JCOMBOBOX CON ESTUDIANTES
    public void cargar_lista_item(String trabajo) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        try {

            query = "SELECT DESCRIPCION "
                    + "FROM ITEM "
                    + "WHERE ID_TRABAJOS = (SELECT ID FROM TRABAJOS WHERE DESCRIPCION LIKE '%" + trabajo + "%' ); ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
                while (rs.next()) {
                    combo_item.addItem(rs.getString("DESCRIPCION"));
                }
                conexion.cerrar();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    
}
