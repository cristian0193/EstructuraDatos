package Vistas;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FormRegistros extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConexioSQLite conexion;

    public FormRegistros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txt_n_registro.setVisible(false);
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
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();
        txt_n_registro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 630));
        setPreferredSize(new java.awt.Dimension(1240, 630));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE ENTRADA DE PROVEEDORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Registro"));
        jPanel1.setMinimumSize(new java.awt.Dimension(1184, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(1191, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE CONDUCTOR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        jLabel3.setText("NUMERO FICHA :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 130, 44));

        combo_conductor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
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
        jPanel1.add(combo_autorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 197, -1));

        combo_guarda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(combo_guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 197, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SALE :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 21));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "X" }));
        jPanel1.add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel12.setText("ESTADO :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 140, 20));

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(255, 0, 0));
        txt_estado.setText("INGRESO");
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

        btn_guardar.setBackground(new java.awt.Color(0, 255, 0));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("Permite Guardar el proyecto en Base de Datos");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 30));

        btn_actualizar.setBackground(new java.awt.Color(255, 102, 102));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite Actualizar el proyecto en Base de Datos");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, 30));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("Permite Limpiar los cambios");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 90, 30));

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 90, 30));

        txt_n_registro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_n_registro.setForeground(new java.awt.Color(255, 0, 0));
        txt_n_registro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_n_registro.setEnabled(false);
        txt_n_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n_registroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 63, 47));

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_registro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (combo_conductor.getSelectedIndex() == 0 || txt_numero_cedula.getText().equals("")
                || txt_empresa.getText().equals("") || txt_empresa.getText().equals("") || txt_placa.getText().equals("")
                || txt_fecha_ingreso.getText().equals("") || txt_ficha.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS OBLIGATORIOS (*)");
        } else {

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

            boolean resultado = conexion.insert_registro(fecha_ingreso, "", ficha, conductor, empresa, cedula, placa, "", "", estado, observaciones);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "INGRESO REGISTRADO");
                LimpiarCampos();
                cargar_tabla();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                LimpiarCampos();
            }

        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (this.txt_ficha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        } else {

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
                JOptionPane.showMessageDialog(null, "INGRESO REGISTRADO");
                LimpiarCampos();
                cargar_tabla();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox combo_autorizo;
    private javax.swing.JComboBox combo_conductor;
    private javax.swing.JComboBox combo_guarda;
    private javax.swing.JComboBox combo_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
                + "WHERE ESTADO = 'INGRESO' "
                + "ORDER BY FECHA_INGRESO DESC;";

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
                + "ESTADO = 'INGRESO' "
                + "AND FECHA_INGRESO BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_INGRESO DESC";
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

}
