package Vistas;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FormRegistrosSalida extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConexioSQLite conexion;

    public FormRegistrosSalida() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txt_n_registro.setVisible(false);
        cargar_tabla();
        cargar_lista_conductor();
        cargar_tabla_autorizo();
        cargar_tabla_guarda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_conductor = new javax.swing.JComboBox();
        txt_ficha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_numero_cedula = new javax.swing.JTextField();
        txt_empresa = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_fecha_ingreso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_salida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_autorizo = new javax.swing.JComboBox();
        combo_guarda = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        combo_marca = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();
        txt_n_registro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txt_consulta_lider1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_consulta_lider2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_consulta_lider = new javax.swing.JTextField();
        txt_consulta_registro = new javax.swing.JTextField();
        txt_consulta_registro1 = new javax.swing.JTextField();
        txt_consulta_lider3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        combo_consulta = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 630));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE SALIDA DE PROVEEDORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Registro"));
        jPanel1.setMinimumSize(new java.awt.Dimension(1184, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(1191, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE CONDUCTOR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        jLabel3.setText("NUMERO FICHA :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 130, 44));

        combo_conductor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_conductor.setEnabled(false);
        combo_conductor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_conductorItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 274, -1));

        txt_ficha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_ficha.setForeground(new java.awt.Color(255, 0, 0));
        txt_ficha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ficha.setEnabled(false);
        txt_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fichaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 63, 47));

        jLabel4.setText("NUMERO CEDULA :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        jLabel5.setText("EMPRESA :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        jLabel6.setText("PLACA VEHICULO :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 20));

        txt_numero_cedula.setEditable(false);
        jPanel1.add(txt_numero_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 210, -1));

        txt_empresa.setEditable(false);
        jPanel1.add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 272, -1));

        txt_placa.setEditable(false);
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 132, -1));

        jLabel7.setText("FECHA Y HORA DE INGRESO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 16));

        txt_fecha_ingreso.setEditable(false);
        txt_fecha_ingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txt_fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 205, -1));

        jLabel8.setText("FECHA Y HORA DE SALIDA :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 167, 20));

        txt_fecha_salida.setEditable(false);
        txt_fecha_salida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_fecha_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_salidaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 197, -1));

        jLabel9.setText("PERSONA QUE AUTORIZA :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 159, -1));

        jLabel10.setText("GUARDA TURNO :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 166, 21));

        combo_autorizo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_autorizo.setEnabled(false);
        jPanel1.add(combo_autorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 230, -1));

        combo_guarda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_guarda.setEnabled(false);
        jPanel1.add(combo_guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 230, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SALE :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 200, 50, 21));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "SI" }));
        combo_marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_marcaItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 110, -1));

        jLabel12.setText("ESTADO :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 140, 20));

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(255, 0, 0));
        txt_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 197, -1));

        jLabel13.setText("OBSERVACIONES :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 178, 82));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 439, 80));

        btn_actualizar.setBackground(new java.awt.Color(255, 102, 102));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite Actualizar el proyecto en Base de Datos");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 30));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("Permite Limpiar los cambios");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 90, 30));

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, 30));

        txt_n_registro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_n_registro.setForeground(new java.awt.Color(255, 0, 0));
        txt_n_registro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_n_registro.setEnabled(false);
        txt_n_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n_registroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 63, 47));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("(*)");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 20, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("(*)");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 20, 20));

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_registro);

        jLabel18.setText("Fecha Inicial :");

        txt_consulta_lider1.setEditable(false);
        txt_consulta_lider1.setText("0000-00-00 00:00:00");
        txt_consulta_lider1.setToolTipText("");
        txt_consulta_lider1.setEnabled(false);

        jLabel19.setText("Fecha Final :");

        txt_consulta_lider2.setEditable(false);
        txt_consulta_lider2.setText("0000-00-00 00:00:00");
        txt_consulta_lider2.setToolTipText("");
        txt_consulta_lider2.setEnabled(false);

        jLabel25.setText("Cedula :");

        jLabel20.setText("Placa :");

        txt_consulta_lider.setEditable(false);
        txt_consulta_lider.setToolTipText("");
        txt_consulta_lider.setEnabled(false);

        txt_consulta_registro.setEditable(false);
        txt_consulta_registro.setToolTipText("Numero de Registro del proyecto");
        txt_consulta_registro.setEnabled(false);

        txt_consulta_registro1.setEditable(false);
        txt_consulta_registro1.setToolTipText("Numero de Registro del proyecto");
        txt_consulta_registro1.setEnabled(false);

        txt_consulta_lider3.setEditable(false);
        txt_consulta_lider3.setToolTipText("");
        txt_consulta_lider3.setEnabled(false);

        jLabel22.setText("Autorizo :");

        jLabel26.setText("Guarda :");

        jLabel21.setText("Seleccionar Filtro :");

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "PLACA", "CEDULA" }));
        combo_consulta.setToolTipText("Permite seleccionar el Filtro para la consulta de informacion");
        combo_consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_consultaItemStateChanged(evt);
            }
        });
        combo_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_lider1)
                            .addComponent(txt_consulta_lider2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consulta_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_lider, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_lider3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txt_consulta_registro1))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_lider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_consulta_lider)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_consulta_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_consulta_lider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_consulta_lider3)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_consulta_registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fecha_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_salidaActionPerformed

    private void txt_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fichaActionPerformed

    private void txt_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadoActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (this.txt_n_registro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        } else if(this.combo_marca.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "MARQUE (SI) DESEA SALIR");
        }else{
            
            conexion.cerrar();
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String registro = txt_n_registro.getText();
            String conductor = combo_conductor.getSelectedItem().toString();
            String cedula = txt_numero_cedula.getText();
            String empresa = txt_empresa.getText();
            String placa = txt_placa.getText();
            String fecha_ingreso = txt_fecha_ingreso.getText();
            String ficha = txt_ficha.getText();
            String autoriza = combo_autorizo.getSelectedItem().toString();
            String guarda = combo_guarda.getSelectedItem().toString();
            String fecha_salida = txt_fecha_salida.getText();
            String estado = txt_estado.getText();
            String observaciones = txt_observaciones.getText();

            boolean resultado = conexion.upgrade_registro(registro, fecha_ingreso, fecha_salida, ficha, conductor, empresa, cedula, placa, autoriza, guarda, estado, observaciones);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "INGRESO ACTUALIZADO");
                LimpiarCampos();
                cargar_tabla();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                LimpiarCampos();
            }

        }


    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        cargar_tabla();
        conexion.cerrar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void txt_n_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n_registroActionPerformed

    private void combo_conductorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_conductorItemStateChanged

    }//GEN-LAST:event_combo_conductorItemStateChanged

    private void tabla_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registroMouseClicked

        int rec = this.tabla_registro.getSelectedRow();

        this.txt_n_registro.setText(tabla_registro.getValueAt(rec, 0).toString());
        this.txt_fecha_ingreso.setText(tabla_registro.getValueAt(rec, 1).toString());
        this.txt_fecha_salida.setText(tabla_registro.getValueAt(rec, 2).toString());
        this.txt_ficha.setText(tabla_registro.getValueAt(rec, 3).toString());
        this.combo_conductor.setSelectedItem(tabla_registro.getValueAt(rec, 4).toString());
        this.txt_numero_cedula.setText(tabla_registro.getValueAt(rec, 5).toString());
        this.txt_empresa.setText(tabla_registro.getValueAt(rec, 6).toString());
        this.txt_placa.setText(tabla_registro.getValueAt(rec, 7).toString());
        this.combo_autorizo.setSelectedItem(tabla_registro.getValueAt(rec, 8).toString());
        this.combo_guarda.setSelectedItem(tabla_registro.getValueAt(rec, 9).toString());
        this.txt_estado.setText(tabla_registro.getValueAt(rec, 10).toString());
        this.txt_observaciones.setText(tabla_registro.getValueAt(rec, 11).toString());


    }//GEN-LAST:event_tabla_registroMouseClicked

    private void combo_marcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_marcaItemStateChanged

        int opcion = combo_marca.getSelectedIndex();
        if (opcion == 0) {
            this.txt_fecha_salida.setText("");
            this.txt_estado.setText("");
        } else {
            Calendar calendario = Calendar.getInstance();
            int dia, mes, año, hora, minutos, segundos;

            dia = calendario.get(Calendar.DAY_OF_MONTH);
            mes = calendario.get(Calendar.MONTH);
            año = calendario.get(Calendar.YEAR);

            hora = calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);

            this.txt_fecha_salida.setText("" + año + "-" + mes + "-" + dia + " " + hora + ":" + minutos + ":" + segundos);
            this.txt_estado.setText("SALIDA");
        }


    }//GEN-LAST:event_combo_marcaItemStateChanged

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        //        int index = combo_consulta.getSelectedIndex();
        //
        //        if (index == 0) {
            //            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
            //        } else if (index == 1) {
            //            this.date_fecha_inicio.setEnabled(true);
            //            this.date_fecha_final.setEnabled(true);
            //            this.txt_consulta_lider.setEditable(false);
            //            this.txt_consulta_lider.setEnabled(false);
            //        } else if (index == 2) {
            //            this.txt_consulta_lider.setEditable(true);
            //            this.txt_consulta_lider.setEnabled(true);
            //            this.date_fecha_inicio.setEnabled(false);
            //            this.date_fecha_final.setEnabled(false);
            //            this.txt_consulta_registro.setEnabled(false);
            //        } else {
            //            this.txt_consulta_registro.setEditable(true);
            //            this.txt_consulta_registro.setEnabled(true);
            //            this.txt_consulta_lider.setEnabled(false);
            //            this.date_fecha_inicio.setEnabled(false);
            //            this.date_fecha_final.setEnabled(false);
            //        }
    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox combo_autorizo;
    private javax.swing.JComboBox combo_conductor;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JComboBox combo_guarda;
    private javax.swing.JComboBox combo_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTextField txt_consulta_lider;
    private javax.swing.JTextField txt_consulta_lider1;
    private javax.swing.JTextField txt_consulta_lider2;
    private javax.swing.JTextField txt_consulta_lider3;
    private javax.swing.JTextField txt_consulta_registro;
    private javax.swing.JTextField txt_consulta_registro1;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fecha_ingreso;
    private javax.swing.JTextField txt_fecha_salida;
    private javax.swing.JTextField txt_ficha;
    private javax.swing.JTextField txt_n_registro;
    private javax.swing.JTextField txt_numero_cedula;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {

        combo_conductor.setSelectedIndex(0);
        combo_marca.setSelectedIndex(0);
        combo_guarda.setSelectedIndex(0);
        combo_autorizo.setSelectedIndex(0);

        txt_empresa.setText("");
        txt_estado.setText("");
        txt_ficha.setText("");
        txt_fecha_ingreso.setText("");
        txt_fecha_salida.setText("");
        txt_numero_cedula.setText("");
        txt_observaciones.setText("");
        txt_placa.setText("");

    }

// METODO PARA CARGAR TABLA DE REGISTRO
    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "CEDULA", "EMPRESA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "ORDER BY FECHA_ENTRADA DESC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

// METODO PARA CONSULTAR RANGO DE FECHAS
    public void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "FECHA_ENTRADA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CARGAR JCOMBOBOX CONDUCTORES
    public void cargar_lista_conductor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM CONDUCTORES ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_conductor.addItem(rs.getString("NOMBRE_CONDUCTOR"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX AUTORIZADO
    public void cargar_tabla_autorizo() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM AUTORIZACION ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_autorizo.addItem(rs.getString("NOMBRE_COMPLETO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void cargar_tabla_guarda() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM GUARDAS ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_guarda.addItem(rs.getString("NOMBRE_COMPLETO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
