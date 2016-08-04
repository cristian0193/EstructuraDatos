package Vista;

import Conexion.ConexioSQLite;
import static Vista.Principal.conexion;
import static Vista.Principal.txt_registro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CierreProyecto extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    public static int validacion_pendiente_cal = 0;
    public static int validacion_pendiente_pro = 0;

    public CierreProyecto() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_estados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proyectos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_inicio = new com.toedter.calendar.JDateChooser();
        txt_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_lider_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        combo_estado_consulta = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones_programacion = new javax.swing.JTextArea();
        txt_registro_pro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DE PROYECTO DE VALIDACION Ó CALIFICACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        jLabel6.setText("Numero Registro :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 20));

        tabla_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proyectosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 278, 970, 270));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Consultar"));

        jLabel2.setText("Fecha Inicial :");

        jLabel3.setText("Fecha Final :");

        txt_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        txt_fecha_inicio.setEnabled(false);

        txt_fecha_final.setDateFormatString("yyyy-MM-dd");
        txt_fecha_final.setEnabled(false);

        jLabel4.setText("Lider Tecnico :");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_lider_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "LIDER TECNICO", "ESTADO" }));
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

        jLabel15.setText("Seleccionar Filtro :");

        combo_estado_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Ejecutada", "Programado" }));
        combo_estado_consulta.setEnabled(false);

        jLabel7.setText("Estado :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_estado_consulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_lider_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_consulta, 0, 200, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(combo_estado_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 980, 110));

        txt_observaciones_programacion.setColumns(20);
        txt_observaciones_programacion.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones_programacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 500, 80));

        txt_registro_pro.setEditable(false);
        txt_registro_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_pro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_registro_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 100, 80));

        jLabel8.setText("Cambio de Estado :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 20));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Ejecutada", "Cerrada" }));
        getContentPane().add(combo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String registro = txt_registro_pro.getText();

        if (txt_registro_pro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " SELECCIONE UN REGISTRO DE LA TABLA");
        } else if (combo_estado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, " SELECCIONE EL ESTADO");
        } else if (txt_observaciones_programacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " INGRESE JUSTIFICACION");
        } else {

            String num_registro = txt_registro_pro.getText();
            String estado = combo_estado.getSelectedItem().toString();
            String observacion = txt_observaciones_programacion.getText();

            boolean resultado = conexion.upgrade_estado(num_registro, estado, observacion);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                LimpiarCampos();
                cargar_tabla_estados();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                LimpiarCampos();
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabla_proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proyectosMouseClicked
        int rec = this.tabla_proyectos.getSelectedRow();

        this.txt_registro_pro.setText(tabla_proyectos.getValueAt(rec, 0).toString());
        this.txt_observaciones_programacion.setText(tabla_proyectos.getValueAt(rec, 6).toString());

    }//GEN-LAST:event_tabla_proyectosMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {
            this.txt_fecha_inicio.setEnabled(true);
            this.txt_fecha_final.setEnabled(true);
            this.txt_lider_consulta.setEditable(false);
            this.combo_estado_consulta.setEnabled(false);
        } else if (index == 2) {
            this.txt_lider_consulta.setEditable(true);
            this.txt_lider_consulta.setEnabled(true);
            this.txt_fecha_inicio.setEnabled(false);
            this.txt_fecha_final.setEnabled(false);
            this.combo_estado_consulta.setEnabled(false);
        } else {
            this.combo_estado_consulta.setEditable(true);
            this.combo_estado_consulta.setEnabled(true);
            this.txt_lider_consulta.setEnabled(false);
            this.txt_fecha_inicio.setEnabled(false);
            this.txt_fecha_final.setEnabled(false);
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {

            if (this.txt_fecha_inicio.getDate() == null) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
            } else if (this.txt_fecha_final.getDate() == null) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
            } else {
                String formato1 = txt_fecha_inicio.getDateFormatString();
                Date date1 = (Date) txt_fecha_inicio.getDate();
                SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                String formato2 = txt_fecha_final.getDateFormatString();
                Date date2 = (Date) txt_fecha_final.getDate();
                SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                conexion.cerrar();
            }       

        } else if (index == 2) {

            String lider = txt_lider_consulta.getText();

            if (lider.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
            } else {
                consulta_lider(lider);
                conexion.cerrar();
            }

        } else {
            int registro = combo_estado_consulta.getSelectedIndex();

            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "SELECCIONAR UN ESTADO");
            } else {
                String registros = combo_estado_consulta.getSelectedItem().toString();
                consulta_estado(registros);
                conexion.cerrar();
            } 
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JComboBox combo_estado;
    private javax.swing.JComboBox combo_estado_consulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_proyectos;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_lider_consulta;
    private javax.swing.JTextArea txt_observaciones_programacion;
    public static javax.swing.JTextField txt_registro_pro;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_registro_pro.setText("");
        txt_observaciones_programacion.setText("");
        combo_estado.setSelectedIndex(0);
    }

    void cargar_tabla_estados() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Programado'  "
                + "ORDER BY ESTADO_PROYECTO DESC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_rango_fechas_propuesta(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Programado' "
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' "
                + "ORDER BY ESTADO_PROYECTO DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_rango_fechas_reprogramada(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Programado' AND "
                + "FECHA_REPROGRAMACION BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_REPROGRAMACION DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_lider(String lider) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Programado' AND "
                + "LIDER_TECNICO LIKE '%" + lider.toUpperCase().trim() + "%';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_estado(String estado) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = '" + estado + "';";
        System.out.println("" + query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}