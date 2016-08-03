package Vista;

import Conexion.ConexioSQLite;
import static Vista.Principal.txt_registro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Programacion extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    public static int validacion_pendiente_cal = 0;
    public static int validacion_pendiente_pro = 0;

    public Programacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_programaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proyectos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_inicio = new com.toedter.calendar.JDateChooser();
        txt_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_palabra_clave_consulta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_lider_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones_programacion = new javax.swing.JTextArea();
        txt_registro_pro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        date_fecha_nueva = new javax.swing.JTextField();
        txt_fecha_propuesta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION DE VALIDACION Ó CALIFICACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        jLabel6.setText("Numero Registro :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 20));

        jLabel7.setText("Fecha Reprogramada :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 20));

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

        jLabel5.setText("Palabra Clave :");

        txt_palabra_clave_consulta.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_lider_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "FECHA REPROGRAMACION", "LIDER TECNICO", "PALABRA CLAVE" }));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_palabra_clave_consulta)
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
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_palabra_clave_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 980, 110));

        txt_observaciones_programacion.setColumns(20);
        txt_observaciones_programacion.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones_programacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 500, 80));

        txt_registro_pro.setEditable(false);
        txt_registro_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_pro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_registro_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Programar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, 80));

        date_fecha_nueva.setEditable(false);
        date_fecha_nueva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        date_fecha_nueva.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(date_fecha_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        txt_fecha_propuesta.setEditable(false);
        getContentPane().add(txt_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, -1));

        jLabel8.setText("Fecha Propuesta :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String registro = txt_registro_pro.getText();

        if (txt_registro_pro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " SELECCIONE UN REGISTRO DE LA TABLA");
        } else {
            validacion_pendiente_cal = 0;
            validacion_pendiente_pro = 0;

            int Validacion_cal = Validar_Prerequisitos_Calificacion(registro);
            int Validacion_pro = Validar_Prerequisitos_Proceso(registro);

            if (Validacion_cal > 0) {
                JOptionPane.showMessageDialog(null, " TIENE : " + Validacion_cal + " PENDIENTES PREREQUISITOS DE CALIFICACION ");
            } else if (Validacion_pro > 0) {
                JOptionPane.showMessageDialog(null, " TIENE : " + Validacion_pro + " PENDIENTES PREREQUISITOS DE PROCESO ");
            } else {
                String registro_pro = txt_registro_pro.getText();
                String observacion = txt_observaciones_programacion.getText();
                
                boolean resultado = conexion.upgrade_programacion(registro_pro,"Programado",observacion);
                
                if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                LimpiarCampos();
                cargar_tabla_programaciones();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                LimpiarCampos();
            }
                
            }
        }

//        if(txt_registro_repro.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
//        }else if (this.date_nueva_fecha.getDate() == null) {
//            JOptionPane.showMessageDialog(null, "INGRESE NUEVA FECHA");
//        } else if (combo_motivo.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "INGRESE MOTIVO");
//        } else if (txt_observaciones_programacion.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "INGRESE JUSTIFICACION DE REPROGRAMACION");
//        } else {
//            conexion = new ConexioSQLite();
//            conexion.coneccionbase();
//
//            String registro = txt_registro_repro.getText();
//
//            String formato = date_nueva_fecha.getDateFormatString();
//            Date date = (Date) date_nueva_fecha.getDate();
//            SimpleDateFormat sdf = new SimpleDateFormat(formato);
//            String fecha_ingresada = String.valueOf(sdf.format(date));
//
//            String motivo = combo_motivo.getSelectedItem().toString();
//            
//            String observaciones = txt_observaciones_programacion.getText();
//
//            boolean resultado = conexion.upgrade_reprogramacion(registro, fecha_ingresada, observaciones,motivo);
//
//            if (resultado == true) {
//                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
//                LimpiarCampos();
//                cargar_tabla_reprogramaciones();
//                conexion.cerrar();
//            } else {
//                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
//                LimpiarCampos();
//            }
//        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabla_proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proyectosMouseClicked
        int rec = this.tabla_proyectos.getSelectedRow();

        this.txt_registro_pro.setText(tabla_proyectos.getValueAt(rec, 0).toString());
        this.txt_fecha_propuesta.setText(tabla_proyectos.getValueAt(rec, 4).toString());
        this.date_fecha_nueva.setText(tabla_proyectos.getValueAt(rec, 5).toString());
        this.txt_observaciones_programacion.setText(tabla_proyectos.getValueAt(rec, 7).toString());

    }//GEN-LAST:event_tabla_proyectosMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {
            this.txt_fecha_inicio.setEnabled(true);
            this.txt_fecha_final.setEnabled(true);
            this.txt_lider_consulta.setEditable(false);
            this.txt_palabra_clave_consulta.setEditable(false);
        } else if (index == 2) {
            this.txt_fecha_inicio.setEnabled(true);
            this.txt_fecha_final.setEnabled(true);
            this.txt_lider_consulta.setEditable(false);
            this.txt_palabra_clave_consulta.setEditable(false);
        } else if (index == 3) {
            this.txt_lider_consulta.setEditable(true);
            this.txt_lider_consulta.setEnabled(true);
            this.txt_fecha_inicio.setEnabled(false);
            this.txt_fecha_final.setEnabled(false);
            this.txt_palabra_clave_consulta.setEnabled(false);
        } else {
            this.txt_palabra_clave_consulta.setEditable(true);
            this.txt_palabra_clave_consulta.setEnabled(true);
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

                consulta_rango_fechas_reprogramada(fecha_ingresada_inicio, fecha_ingresada_final);
                conexion.cerrar();
            }

        } else if (index == 3) {

            String lider = txt_lider_consulta.getText();

            if (lider.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
            } else {
                consulta_lider(lider);
                conexion.cerrar();
            }

        } else {
            String registro = txt_palabra_clave_consulta.getText();

            if (registro.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
            } else {
                consulta_palabra_clave(registro);
                conexion.cerrar();
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JTextField date_fecha_nueva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_proyectos;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextField txt_lider_consulta;
    private javax.swing.JTextArea txt_observaciones_programacion;
    private javax.swing.JTextField txt_palabra_clave_consulta;
    public static javax.swing.JTextField txt_registro_pro;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_registro.setText("");
        date_fecha_nueva.setText("");
        txt_fecha_propuesta.setText("");
        txt_observaciones_programacion.setText("");
        // combo_motivo.setSelectedIndex(0);
    }

    void cargar_tabla_programaciones() {

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
                + "OBSERVACION_REPROGRAMACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'En Creacion' "
                + "ORDER BY FECHA_PROPUESTA DESC;";

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

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "FECHA REPRO", "MOTIVO", "OBSERVACIONES"};
        String[] registro = new String[8];
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
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "MOTIVO_REPROGRAMACION AS MOTIVO, "
                + "OBSERVACION_REPROGRAMACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_PROPUESTA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = rs.getString("MOTIVO");
                registro[7] = rs.getString("OBSERVACIONES");

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

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "FECHA REPRO", "MOTIVO", "OBSERVACIONES"};
        String[] registro = new String[8];
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
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "MOTIVO_REPROGRAMACION AS MOTIVO, "
                + "OBSERVACION_REPROGRAMACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
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
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = rs.getString("MOTIVO");
                registro[7] = rs.getString("OBSERVACIONES");

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

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "FECHA REPRO", "MOTIVO", "OBSERVACIONES"};
        String[] registro = new String[8];
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
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "MOTIVO_REPROGRAMACION AS MOTIVO, "
                + "OBSERVACION_REPROGRAMACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
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
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = rs.getString("MOTIVO");
                registro[7] = rs.getString("OBSERVACIONES");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_palabra_clave(String palabra) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "FECHA REPRO", "MOTIVO", "OBSERVACIONES"};
        String[] registro = new String[8];
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
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "MOTIVO_REPROGRAMACION AS MOTIVO, "
                + "OBSERVACION_REPROGRAMACION AS OBSERVACIONES "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "NOMBRE_PROYECTO LIKE '%" + palabra + "%';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = rs.getString("MOTIVO");
                registro[7] = rs.getString("OBSERVACIONES");
                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public static int Validar_Prerequisitos_Calificacion(String numero) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] registro = new String[14];
        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "PRE_CAL_ESPECIFICACION_EQUIPO AS ESPECIFICACION, "
                + "PRE_CAL_PROTOCOLOS AS PROTOCOLO, "
                + "PRE_CAL_RU_NO_GXP AS NO_GXP, "
                + "PRE_CAL_LIBRO_PARAMETROS AS LIBRO, "
                + "PRE_CAL_BR_ACTUALIZADO AS BR, "
                + "PRE_CAL_SOP AS SOP, "
                + "PRE_CAL_HOJA_VIDA AS HOJA, "
                + "PRE_CAL_RUTINA_MANTENIMIENTO AS RUTINA, "
                + "PRE_CAL_CERTIFICADO_MATERIALES AS CERTIFICADO, "
                + "PRE_CAL_PLANOS AS PLANO, "
                + "PRE_CAL_MANUALES AS MANUALES, "
                + "PRE_CAL_MATERIALES AS MATERIAL, "
                + "PRE_CAL_RECURSOS AS RECURSOS, "
                + "PRE_CAL_ENTRENAMIENTOS AS ENTRENAMIENTO "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE NUMERO_REGISTRO = " + numero + "";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ESPECIFICACION");
                registro[1] = rs.getString("PROTOCOLO");
                registro[2] = rs.getString("NO_GXP");
                registro[3] = rs.getString("LIBRO");
                registro[4] = rs.getString("BR");
                registro[5] = rs.getString("SOP");
                registro[6] = rs.getString("HOJA");
                registro[7] = rs.getString("RUTINA");
                registro[8] = rs.getString("CERTIFICADO");
                registro[9] = rs.getString("PLANO");
                registro[10] = rs.getString("MANUALES");
                registro[11] = rs.getString("MATERIAL");
                registro[12] = rs.getString("RECURSOS");
                registro[13] = rs.getString("ENTRENAMIENTO");
            }

            for (int i = 0; i < registro.length; i++) {

                String estado = registro[i];

                if (estado.equals("Pendiente")) {
                    validacion_pendiente_cal += 1;
                } else {
                    validacion_pendiente_cal += 0;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validacion_pendiente_cal;

    }

    public static int Validar_Prerequisitos_Proceso(String numero) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] registro = new String[15];
        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "PRE_PRO_CALIFICACION_IQOQPQ AS CALIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_HFM AS ENTRENAMIENTO, "
                + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION AS ESPECIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_TEST AS TEST, "
                + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO AS PROTOCOLO, "
                + "PRE_PRO_MATERIALES AS MATERIAL, "
                + "PRE_PRO_DP AS DP, "
                + "PRE_PRO_DIAGRAMA AS DIAGRAMA, "
                + "PRE_PRO_FMEA AS FMEA, "
                + "PRE_PRO_PR AS PR, "
                + "PRE_PRO_PF AS PF, "
                + "PRE_PRO_RM AS RM, "
                + "PRE_PRO_PC AS PC, "
                + "PRE_PRO_CG AS CG, "
                + "PRE_PRO_FP AS FP "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE NUMERO_REGISTRO = " + numero + "";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CALIFICACION");
                registro[1] = rs.getString("ENTRENAMIENTO");
                registro[2] = rs.getString("ESPECIFICACION");
                registro[3] = rs.getString("TEST");
                registro[4] = rs.getString("PROTOCOLO");
                registro[5] = rs.getString("MATERIAL");
                registro[6] = rs.getString("DP");
                registro[7] = rs.getString("DIAGRAMA");
                registro[8] = rs.getString("FMEA");
                registro[9] = rs.getString("PR");
                registro[10] = rs.getString("PF");
                registro[11] = rs.getString("RM");
                registro[12] = rs.getString("PC");
                registro[13] = rs.getString("CG");
                registro[14] = rs.getString("FP");
            }

            for (int i = 0; i < registro.length; i++) {

                String estado = registro[i];

                if (estado.equals("Pendiente")) {
                    validacion_pendiente_pro += 1;
                } else {
                    validacion_pendiente_pro += 0;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validacion_pendiente_pro;

    }

}