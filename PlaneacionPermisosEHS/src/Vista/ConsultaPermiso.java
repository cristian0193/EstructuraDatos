package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConsultaPermiso extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;

    public ConsultaPermiso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        cargar_tabla_general();
        ancho_columnas();
        centrar_datos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agrupa_button = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_permisos = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_permiso_general = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_id_permiso = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txt_id_general = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        txt_id_unico = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_permiso_general = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Anular");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("Perdido");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        menu_permisos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_permisos.setText("Ver Permiso General Asociado");
        menu_permisos.setToolTipText("");
        menu_permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_permisosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_permisos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabla_permiso_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_permiso_general.setComponentPopupMenu(jPopupMenu1);
        tabla_permiso_general.setRowHeight(30);
        jScrollPane1.setViewportView(tabla_permiso_general);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIERRE DE PERMISOS INDIVIDUALES");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("ID Permiso :");

        txt_id_permiso.setToolTipText("Numero de Registro del proyecto");
        txt_id_permiso.setEnabled(false);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Descripción del Permiso : ");

        txt_descripcion.setToolTipText("Numero de Registro del proyecto");
        txt_descripcion.setEnabled(false);

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("Permite Buscar la informacion seleccioda en el filtro");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("ID General :");

        txt_id_general.setToolTipText("Numero de Registro del proyecto");
        txt_id_general.setEnabled(false);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha Inicial :");

        date_fecha_inicio.setToolTipText("Filtro de Fecha de inicio del proyecto");
        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        date_fecha_inicio.setEnabled(false);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha Final :");

        date_fecha_final.setToolTipText("Filtro de Fecha de fin del proyecto");
        date_fecha_final.setDateFormatString("yyyy-MM-dd");
        date_fecha_final.setEnabled(false);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("ID Unico :");

        txt_id_unico.setToolTipText("Numero de Registro del proyecto");
        txt_id_unico.setEnabled(false);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("ID Permiso General :");

        txt_permiso_general.setToolTipText("Numero de Registro del proyecto");
        txt_permiso_general.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "ID UNICO", "ID PERMISO", "DESCRIPCION DEL PERMISO", "ID GENERAL", "ID PERMISO GENERAL", "TODOS" }));
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

        jLabel15.setText("Seleccionar Filtro :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_unico))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_permiso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id_general)
                            .addComponent(txt_descripcion)
                            .addComponent(txt_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_unico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_permiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 0:
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
                break;
            case 1:
                if (this.date_fecha_inicio.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
                } else if (this.date_fecha_final.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
                } else {
                    String formato1 = date_fecha_inicio.getDateFormatString();
                    Date date1 = (Date) date_fecha_inicio.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                    String formato2 = date_fecha_final.getDateFormatString();
                    Date date2 = (Date) date_fecha_final.getDate();
                    SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                    String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                    consulta_rango_fechas(fecha_ingresada_inicio, fecha_ingresada_final);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 2:
                String id_unico = txt_id_unico.getText();
                if (id_unico.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE UN ID UNICO");
                } else {
                    consulta_id(id_unico);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }

                break;
            case 3:
                String id_permiso_general = txt_id_permiso.getText();
                if (id_permiso_general.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE UN ID PERMISO GENERAL");
                } else {
                    consulta_id_permiso(id_permiso_general);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 4:
                String descripcion = txt_descripcion.getText();
                if (descripcion.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE UNA DESCRIPCION DEL PERMISO");
                } else {
                    consulta_descripcion_permiso(descripcion);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 5:
                String id_general = txt_id_general.getText();
                if (id_general.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE UN ID GENERAL");
                } else {
                    consulta_id_general(id_general);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 6:
                String empresa = txt_permiso_general.getText();
                if (empresa.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE UN ID PERMISO GENERAL");
                } else {
                    consulta_id_permiso_general(empresa);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            default:
                cargar_tabla_general();
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
                break;
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void menu_permisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_permisosActionPerformed

        int rec = 0;
        rec = this.tabla_permiso_general.getSelectedRow();
        String id = tabla_permiso_general.getValueAt(rec, 0).toString();
        String id_permiso_general = tabla_permiso_general.getValueAt(rec, 4).toString();

        new DetallePermisoGeneral(null, true, id, id_permiso_general).setVisible(true);

    }//GEN-LAST:event_menu_permisosActionPerformed

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
                this.date_fecha_inicio.setEnabled(true);
                this.date_fecha_final.setEnabled(true);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(false);
                break;
            case 2:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(true);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(false);
                break;
            case 3:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(true);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(false);                                
                break;
            case 4:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(true);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(false);
                break;
            case 5:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(true);
                this.txt_permiso_general.setEnabled(false);
                break;
            case 6:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(true);
                break;
            default:
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_id_permiso.setEnabled(false);
                this.txt_id_unico.setEnabled(false);
                this.txt_descripcion.setEnabled(false);
                this.txt_id_general.setEnabled(false);
                this.txt_permiso_general.setEnabled(false);
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        // int rec = 0;
        int rec = this.tabla_permiso_general.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Cerrado ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permiso_general.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_cierre_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'CERRADO'");
                    cargar_tabla_general();
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                }

            } else {

            }
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        // int rec = 0;
        int rec = this.tabla_permiso_general.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Anulado ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permiso_general.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_anular_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'ANULADO'");
                    cargar_tabla_general();
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                }

            } else {

            }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
        // int rec = 0;
        int rec = this.tabla_permiso_general.getSelectedRow();
        
        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Perdido ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permiso_general.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_perdido_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'PERDIDO'");
                    cargar_tabla_general();
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                }

            } else {

            }
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup agrupa_button;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox combo_consulta;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_permisos;
    private javax.swing.JTable tabla_permiso_general;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_id_general;
    private javax.swing.JTextField txt_id_permiso;
    private javax.swing.JTextField txt_id_unico;
    private javax.swing.JTextField txt_permiso_general;
    // End of variables declaration//GEN-END:variables

    public void cargar_tabla_general() {
        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS "
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS "                
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_id(String id) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS " 
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND ID = '" + id + "'; ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");
                
                
                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_id_permiso(String id_permiso) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS " 
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND ID_PERMISO = '" + id_permiso + "'; ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");
                
                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_descripcion_permiso(String permiso) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS " 
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND NOMBRE_PERMISO LIKE '%" + permiso.toUpperCase() + "%' "
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_id_general(String id_general) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";


        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS " 
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND ID_GENERAL = '" + id_general + "'; ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");
                
                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void consulta_id_permiso_general(String id_permiso_general) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID PERMISO", "NOMBRE_PERMISO", "ID UNICO GENERAL", "ID P.GENERAL", "FECHA","ESTADO"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "ID_GENERAL, "
                + "ID_PERMISO_GENERAL, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS " 
                + "WHERE (ESTADO = 'Solicitado' OR ESTADO = 'Perdido' OR ESTADO = 'Anulado' OR ESTADO = 'Cerrado') "
                + "AND ID_PERMISO_GENERAL = '" + id_permiso_general + "'; ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("ID_GENERAL");
                registro[4] = rs.getString("ID_PERMISO_GENERAL");
                registro[5] = rs.getString("FECHA");
                registro[6] = rs.getString("ESTADO");
                
                modelo.addRow(registro);
            }
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }        
        
    public void ancho_columnas() {
        tabla_permiso_general.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_permiso_general.getColumnModel().getColumn(1).setPreferredWidth(30);
        tabla_permiso_general.getColumnModel().getColumn(2).setPreferredWidth(500);
        tabla_permiso_general.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabla_permiso_general.getColumnModel().getColumn(4).setPreferredWidth(80);
        tabla_permiso_general.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla_permiso_general.getColumnModel().getColumn(6).setPreferredWidth(100);
    }

    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_permiso_general.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_permiso_general.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        tabla_permiso_general.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tabla_permiso_general.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tabla_permiso_general.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        tabla_permiso_general.getColumnModel().getColumn(6).setCellRenderer(Alinear);
    }
    
}
