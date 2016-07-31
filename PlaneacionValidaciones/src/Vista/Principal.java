package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_lotes = new javax.swing.JTextField();
        txt_proyecto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_fecha_propuesta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combo_maquina = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_GCC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_lider = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_estado_reprogramacion = new javax.swing.JTextField();
        txt_estado_pre_calificacion = new javax.swing.JTextField();
        txt_estado_pre_proceso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_observaciones_proyecto = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        combo_planta = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        txt_turnos = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txt_fecha_propuesta = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_contenido = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txt_consulta_lider = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txt_registro = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANEACIÓN DE VALIDACIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 905, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Relevante"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Lotes :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 20));

        txt_lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lotesActionPerformed(evt);
            }
        });
        jPanel2.add(txt_lotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 137, -1));
        jPanel2.add(txt_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 58, 850, -1));

        jLabel3.setText("Nombre Proyecto : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 58, 110, 20));

        date_fecha_propuesta.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(date_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, -1));

        jLabel4.setText("Planta :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, 20));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Programado", "No Ejecutado", "En Ejecucion", "Pendientes Requisitos", "No cumple IQ", "No cumple OQ", "No cumple PQ", "No cumple Valiacion de Proceso", "Ejecutado sin RR", "Ejecutado con RR", "Otros" }));
        combo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadoActionPerformed(evt);
            }
        });
        jPanel2.add(combo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, -1));

        jLabel5.setText("Maquina :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 60, 20));

        combo_maquina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Tanque Preparacion", "Kalish 1", "Kalish 2", "Kalish 4", "Linea 3", "Linea 5", "Linea 6", "Linea 7", "Volpack", "Comadis", "Tonazzi", "21.1", "21.2", "21.3", "21.4", "38.1", "38.2", "Nativa 1", "Nativa 2", "Jabon", "Talco", "Pañitos Humedos", "General", "No Aplica" }));
        jPanel2.add(combo_maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 187, -1));

        jLabel6.setText("Fecha Propuesta :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 20));

        jLabel7.setText("Tipo Validacion :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 92, 90, -1));

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Equipo", "CSV", "Producto", "L&S", "Empaque" }));
        jPanel2.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 178, -1));

        jLabel8.setText("Lider Tecnico :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 92, 80, -1));

        jLabel9.setText("Numero GCC / APR :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 120, 17));
        jPanel2.add(txt_GCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 27, 130, -1));

        jLabel11.setText("Turnos : ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 50, 20));

        txt_lider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_liderActionPerformed(evt);
            }
        });
        jPanel2.add(txt_lider, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 190, -1));

        jButton1.setText("Prerequisitos de Calificacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 190, -1));

        jButton2.setText("Prerequisitos de Proceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 190, -1));

        jButton3.setText("Reprogramacion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 190, -1));

        txt_estado_reprogramacion.setEditable(false);
        jPanel2.add(txt_estado_reprogramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 100, -1));

        txt_estado_pre_calificacion.setEditable(false);
        jPanel2.add(txt_estado_pre_calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 100, -1));

        txt_estado_pre_proceso.setEditable(false);
        jPanel2.add(txt_estado_pre_proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 100, -1));

        jLabel10.setText("Observaciones :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 20));

        txt_observaciones_proyecto.setColumns(20);
        txt_observaciones_proyecto.setRows(5);
        jScrollPane3.setViewportView(txt_observaciones_proyecto);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 620, 90));

        jLabel12.setText("Estado del Proyecto :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 20));

        combo_planta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Liquidos", "Llenado", "Sanpro", "Pesaje", "Preparacion", "Empaque", "Laboratorios", "General", "Planta" }));
        combo_planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_plantaActionPerformed(evt);
            }
        });
        jPanel2.add(combo_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, -1));

        jButton4.setText("Limpiar");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 80, -1));

        txt_turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_turnosActionPerformed(evt);
            }
        });
        jPanel2.add(txt_turnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 137, -1));

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_propuestaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, -1));

        jButton7.setText("Actualizar");
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 65, 990, 340));

        tabla_contenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_contenidoMouseClicked(evt);
            }
        });
        tabla_contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_contenidoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_contenido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 990, 120));

        jLabel13.setText("Fecha Inicial :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 420, 80, 30));

        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 120, 30));

        jLabel14.setText("Fecha Final :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 30));

        date_fecha_final.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 120, 30));

        jLabel15.setText("Lider Tecnico :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 20));
        getContentPane().add(txt_consulta_lider, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 200, -1));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 110, -1));

        txt_registro.setEditable(false);
        txt_registro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_registro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_estadoActionPerformed

    private void txt_lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lotesActionPerformed

    private void txt_liderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_liderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_liderActionPerformed

    private void combo_plantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_plantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_plantaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrerequisitoCalificacion calificacion = new PrerequisitoCalificacion();
        calificacion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrerequisitoProceso proceso = new PrerequisitoProceso();
        proceso.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reprogramacion reprogramacion = new Reprogramacion();
        reprogramacion.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_turnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_turnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_turnosActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        conexion = new ConexioSQLite();
        conexion.coneccionbase();
        String gcc = txt_GCC.getText();
        String nombre = txt_proyecto.getText();
        String tipo = combo_tipo.getSelectedItem().toString();
        String lider = txt_lider.getText();
        String planta = combo_planta.getSelectedItem().toString();
        String maquina = combo_maquina.getSelectedItem().toString();
        String lote = txt_lotes.getText();
        String turno = txt_turnos.getText();

        String formato = date_fecha_propuesta.getDateFormatString();
        Date date = (Date) date_fecha_propuesta.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String fecha_ingresada = String.valueOf(sdf.format(date));

        String estado = combo_estado.getSelectedItem().toString();
        String observaciones = txt_observaciones_proyecto.getText();

        boolean resultado = conexion.insert(gcc.toUpperCase(), nombre.toUpperCase(), tipo, lider.toUpperCase(), planta, maquina, lote, turno, fecha_ingresada, estado, observaciones.toUpperCase(), "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "", "");

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "PROYECTO INSERTADO");
            LimpiarCampos();
            cargar_tabla();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
            LimpiarCampos();
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void tabla_contenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_contenidoMouseClicked

        int rec = this.tabla_contenido.getSelectedRow();

        this.txt_registro.setText(tabla_contenido.getValueAt(rec, 0).toString());
        this.txt_GCC.setText(tabla_contenido.getValueAt(rec, 1).toString());
        this.txt_proyecto.setText(tabla_contenido.getValueAt(rec, 2).toString());
        this.combo_tipo.setSelectedItem(tabla_contenido.getValueAt(rec, 3).toString());
        this.txt_lider.setText(tabla_contenido.getValueAt(rec, 4).toString());
        this.combo_planta.setSelectedItem(tabla_contenido.getValueAt(rec, 5).toString());
        this.combo_maquina.setSelectedItem(tabla_contenido.getValueAt(rec, 6).toString());
        this.txt_lotes.setText(tabla_contenido.getValueAt(rec, 7).toString());
        this.txt_turnos.setText(tabla_contenido.getValueAt(rec, 8).toString());
        this.txt_fecha_propuesta.setText(tabla_contenido.getValueAt(rec, 9).toString());
        this.combo_estado.setSelectedItem(tabla_contenido.getValueAt(rec, 10).toString());

    }//GEN-LAST:event_tabla_contenidoMouseClicked

    private void tabla_contenidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_contenidoKeyPressed
    }//GEN-LAST:event_tabla_contenidoKeyPressed

    private void txt_fecha_propuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_propuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_propuestaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String formato1 = date_fecha_inicio.getDateFormatString();
        Date date1 = (Date) date_fecha_inicio.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
        String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

        String formato2 = date_fecha_final.getDateFormatString();
        Date date2 = (Date) date_fecha_final.getDate();
        SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
        String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

        consulta_rango_fechas(fecha_ingresada_inicio,fecha_ingresada_final);

    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    private javax.swing.JComboBox combo_estado;
    private javax.swing.JComboBox combo_maquina;
    private javax.swing.JComboBox combo_planta;
    private javax.swing.JComboBox combo_tipo;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
    private com.toedter.calendar.JDateChooser date_fecha_propuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_contenido;
    private javax.swing.JTextField txt_GCC;
    private javax.swing.JTextField txt_consulta_lider;
    private javax.swing.JTextField txt_estado_pre_calificacion;
    private javax.swing.JTextField txt_estado_pre_proceso;
    private javax.swing.JTextField txt_estado_reprogramacion;
    private javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextField txt_lider;
    private javax.swing.JTextField txt_lotes;
    private javax.swing.JTextArea txt_observaciones_proyecto;
    private javax.swing.JTextField txt_proyecto;
    private javax.swing.JTextField txt_registro;
    private javax.swing.JTextField txt_turnos;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_GCC.setText("");
        txt_proyecto.setText("");
        combo_tipo.setSelectedIndex(0);
        txt_lider.setText("");
        combo_planta.setSelectedIndex(0);
        combo_maquina.setSelectedIndex(0);
        txt_lotes.setText("");
        txt_turnos.setText("");
        date_fecha_propuesta.setDate(null);
        combo_estado.setSelectedIndex(0);
        txt_observaciones_proyecto.setText("");
    }

    void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO "
                + "FROM "
                + "PLANEACIONES_VALIDACION;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("LIDER");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNO");
                registro[9] = rs.getString("FECHA");
                registro[10] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_contenido.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "';";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("LIDER");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNO");
                registro[9] = rs.getString("FECHA");
                registro[10] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_contenido.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
