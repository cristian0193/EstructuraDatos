package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EliminarRegistrosPermisoGenerales extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;
    public static int validacion_pendiente_cal = 0;
    public static int validacion_pendiente_pro = 0;

    public EliminarRegistrosPermisoGenerales() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
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
        txt_id_permiso_consulta = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_id_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_registro_pro = new javax.swing.JTextField();
        btn_programar = new javax.swing.JButton();
        txt_estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINACION DE REGISTROS DE VALIDACION (PERMISO GENERAL)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 30));

        jLabel6.setText("Numero Registro :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 20));

        jLabel7.setText("Estado Proyecto :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 20));

        tabla_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_proyectos.setRowHeight(25);
        tabla_proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proyectosMouseClicked(evt);
            }
        });
        tabla_proyectos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_proyectosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 278, 1050, 370));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Consultar"));

        jLabel2.setText("Fecha Inicial :");

        jLabel3.setText("Fecha Final :");

        txt_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        txt_fecha_inicio.setEnabled(false);

        txt_fecha_final.setDateFormatString("yyyy-MM-dd");
        txt_fecha_final.setEnabled(false);

        jLabel4.setText("ID Unico :");

        jLabel5.setText("ID Permiso :");

        txt_id_permiso_consulta.setEnabled(false);

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_id_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "ID UNICO", "ID PERMISO" }));
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

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Refrescar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_id_permiso_consulta)
                    .addComponent(txt_id_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_id_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_id_permiso_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_buscar)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1060, 110));

        txt_registro_pro.setEditable(false);
        txt_registro_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_pro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registro_pro.setToolTipText("Numero de Registro del Proyecto");
        getContentPane().add(txt_registro_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        btn_programar.setBackground(new java.awt.Color(102, 255, 102));
        btn_programar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_programar.setText("ELIMINAR");
        btn_programar.setToolTipText("Permite programar un validacion en estado En Creacion");
        btn_programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_programarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 90));

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(255, 0, 0));
        txt_estado.setToolTipText("Estado actual de la validacion programada");
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_programarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_programarActionPerformed

        if (txt_registro_pro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " SELECCIONE UN REGISTRO DE LA TABLA");
        } else {

            if (this.txt_fecha_inicio.getDate() == null || this.txt_fecha_final.getDate() == null) {

                int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE LA ELIMINACIÓN DEL REGISTRO? ",
                        "Confirmacion de Eliminacion", JOptionPane.INFORMATION_MESSAGE);

                if (JOptionPane.OK_OPTION == confirmado) {

                    // EJECUCIÓN DE ELIMINACION
                    boolean resultado = conexion.delete_registro_permiso_general(txt_registro_pro.getText());

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                        LimpiarCampos();
                        cargar_tabla();
                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
                        LimpiarCampos();
                    }

                } else {

                }

            } else {

                int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE LA ELIMINACIÓN DEL REGISTRO? ",
                        "Confirmacion de Eliminacion", JOptionPane.INFORMATION_MESSAGE);

                if (JOptionPane.OK_OPTION == confirmado) {

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato1 = txt_fecha_inicio.getDateFormatString();
                    Date date1 = (Date) txt_fecha_inicio.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato2 = txt_fecha_final.getDateFormatString();
                    Date date2 = (Date) txt_fecha_final.getDate();
                    SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                    String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                    boolean resultado = conexion.delete_registro_permiso_general(txt_registro_pro.getText());

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                        LimpiarCampos();
                        cargar_tabla();
                        consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
                        LimpiarCampos();
                    }

                } else {

                }

            }

        }

    }//GEN-LAST:event_btn_programarActionPerformed

    private void tabla_proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proyectosMouseClicked
        int rec = this.tabla_proyectos.getSelectedRow();

        this.txt_registro_pro.setText(tabla_proyectos.getValueAt(rec, 0).toString());
        this.txt_estado.setText(tabla_proyectos.getValueAt(rec, 8).toString());

    }//GEN-LAST:event_tabla_proyectosMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
                this.txt_fecha_inicio.setEnabled(true);
                this.txt_fecha_final.setEnabled(true);
                this.txt_id_consulta.setEditable(false);
                this.txt_id_permiso_consulta.setEditable(false);
                break;
            case 2:
                this.txt_id_consulta.setEditable(true);
                this.txt_id_consulta.setEnabled(true);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_id_permiso_consulta.setEnabled(false);
                break;
            case 3:
                this.txt_id_permiso_consulta.setEditable(true);
                this.txt_id_permiso_consulta.setEnabled(true);
                this.txt_id_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                break;
            default:
                this.txt_id_permiso_consulta.setEditable(false);
                this.txt_id_permiso_consulta.setEnabled(false);
                this.txt_id_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                break;
        }


    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed

    }//GEN-LAST:event_combo_consultaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

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

            String id = txt_id_consulta.getText();

            if (id.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE UN ID UNICO VALIDO");
            } else {
                consulta_id(id);
                conexion.cerrar();
            }

        } else {
            String id_permiso = txt_id_permiso_consulta.getText();

            if (id_permiso.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE UN ID PERMISO VALIDO");
            } else {
                consulta_id_permiso(id_permiso);
                conexion.cerrar();
            }
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargar_tabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabla_proyectosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_proyectosKeyPressed

    }//GEN-LAST:event_tabla_proyectosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_programar;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_proyectos;
    private javax.swing.JTextField txt_estado;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_id_consulta;
    private javax.swing.JTextField txt_id_permiso_consulta;
    public static javax.swing.JTextField txt_registro_pro;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_registro_pro.setText("");
        txt_estado.setText("");
    }

    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID P.GENERAL", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "FECHA, "
                + "EMPRESA, "
                + "LUGAR_TRABAJO AS LUGAR, "
                + "ACTIVIDAD, "
                + "CONTRATISTAS, "
                + "RESPONSABLE_JNJ, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS_GENERALES "
                + "ORDER BY ID ASC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("FECHA");
                registro[3] = rs.getString("EMPRESA");
                registro[4] = rs.getString("LUGAR");
                registro[5] = rs.getString("ACTIVIDAD");
                registro[6] = rs.getString("CONTRATISTAS");
                registro[7] = rs.getString("RESPONSABLE_JNJ");
                registro[8] = rs.getString("ESTADO");

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

        String[] titulos = {"ID", "ID P.GENERAL", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "FECHA, "
                + "EMPRESA, "
                + "LUGAR_TRABAJO AS LUGAR, "
                + "ACTIVIDAD, "
                + "CONTRATISTAS, "
                + "RESPONSABLE_JNJ, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS_GENERALES "
                + "WHERE "
                + "FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' "
                + "ORDER BY ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("FECHA");
                registro[3] = rs.getString("EMPRESA");
                registro[4] = rs.getString("LUGAR");
                registro[5] = rs.getString("ACTIVIDAD");
                registro[6] = rs.getString("CONTRATISTAS");
                registro[7] = rs.getString("RESPONSABLE_JNJ");
                registro[8] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_id(String id) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID P.GENERAL", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "FECHA, "
                + "EMPRESA, "
                + "LUGAR_TRABAJO AS LUGAR, "
                + "ACTIVIDAD, "
                + "CONTRATISTAS, "
                + "RESPONSABLE_JNJ, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS_GENERALES "
                + "WHERE "
                + "ID = '" + id + "' "
                + " ORDER BY ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("FECHA");
                registro[3] = rs.getString("EMPRESA");
                registro[4] = rs.getString("LUGAR");
                registro[5] = rs.getString("ACTIVIDAD");
                registro[6] = rs.getString("CONTRATISTAS");
                registro[7] = rs.getString("RESPONSABLE_JNJ");
                registro[8] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_id_permiso(String id) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID P.GENERAL", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "FECHA, "
                + "EMPRESA, "
                + "LUGAR_TRABAJO AS LUGAR, "
                + "ACTIVIDAD, "
                + "CONTRATISTAS, "
                + "RESPONSABLE_JNJ, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS_GENERALES "
                + "WHERE "
                + "ID_PERMISO = '" + id + "' "
                + " ORDER BY ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("FECHA");
                registro[3] = rs.getString("EMPRESA");
                registro[4] = rs.getString("LUGAR");
                registro[5] = rs.getString("ACTIVIDAD");
                registro[6] = rs.getString("CONTRATISTAS");
                registro[7] = rs.getString("RESPONSABLE_JNJ");
                registro[8] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
