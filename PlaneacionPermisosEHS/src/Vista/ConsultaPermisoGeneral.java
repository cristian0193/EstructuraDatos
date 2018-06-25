package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaPermisoGeneral extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public ConsultaPermisoGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        cargar_tabla_general();
        ancho_columnas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agrupa_button = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menu_permisos = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_permiso_general = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_id_permiso_general = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_contratista = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txt_responsable = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        txt_id_unico = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();

        menu_permisos.setText("Consultar Permisos");
        menu_permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_permisosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_permisos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel1.setText("CONSULTA DE PERMISOS GENERALES");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("ID Permiso General  :");

        txt_id_permiso_general.setToolTipText("Numero de Registro del proyecto");
        txt_id_permiso_general.setEnabled(false);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Nombre Contratista  :");

        txt_contratista.setToolTipText("Numero de Registro del proyecto");
        txt_contratista.setEnabled(false);

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
        jLabel28.setText("Responsable J&J  :");

        txt_responsable.setToolTipText("Numero de Registro del proyecto");
        txt_responsable.setEnabled(false);

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
        jLabel30.setText("Empresa :");

        txt_empresa.setToolTipText("Numero de Registro del proyecto");
        txt_empresa.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "ID PERMISO GENERAL", "ID UNICO", "CONTRATISTA", "RESPONSABLE JNJ", "EMPRESA" }));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_id_unico))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_responsable, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txt_contratista, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txt_empresa))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_contratista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_unico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

//        int index = combo_consulta.getSelectedIndex();
//
//        if (index == 0) {
//            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
//        } else if (index == 1) {
//
//            if (this.date_fecha_inicio.getDate() == null) {
//                JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
//            } else if (this.date_fecha_final.getDate() == null) {
//                JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
//            } else {
//                String formato1 = date_fecha_inicio.getDateFormatString();
//                Date date1 = (Date) date_fecha_inicio.getDate();
//                SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
//                String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));
//
//                String formato2 = date_fecha_final.getDateFormatString();
//                Date date2 = (Date) date_fecha_final.getDate();
//                SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
//                String fecha_ingresada_final = String.valueOf(sdf2.format(date2));
//
//                consulta_rango_fechas(fecha_ingresada_inicio, fecha_ingresada_final);
//                conexion.cerrar();
//            }
//
//        } else if (index == 2) {
//
//            String lider = txt_consulta_lider.getText();
//
//            if (lider.equals("")) {
//                JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
//            } else {
//                consulta_lider(lider);
//                conexion.cerrar();
//            }
//
//        } else if (index == 3) {
//            String registro = txt_consulta_registro.getText();
//
//            if (registro.equals("")) {
//                JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
//            } else {
//                consulta_registro(registro);
//                conexion.cerrar();
//            }
//        } else if (index == 4) {
//            String registro = txt_consulta_gcc.getText();
//
//            if (registro.equals("")) {
//                JOptionPane.showMessageDialog(null, "INGRESE NUMERO GCC/APR");
//            } else {
//                consulta_gcc(registro);
//                conexion.cerrar();
//            }
//        } else {
//            String registro = txt_consulta_proyecto.getText();
//
//            if (registro.equals("")) {
//                JOptionPane.showMessageDialog(null, "INGRESE NOMBRE PROYECTO");
//            } else {
//                consulta_proyecto(registro);
//                conexion.cerrar();
//            }
//        }
//        
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void menu_permisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_permisosActionPerformed

        int rec = 0;
        rec = this.tabla_permiso_general.getSelectedRow();
        String id = tabla_permiso_general.getValueAt(rec, 0).toString();
        String id_general = tabla_permiso_general.getValueAt(rec, 1).toString();

        new DetallePermiso(null, true, id, id_general).setVisible(true);

    }//GEN-LAST:event_menu_permisosActionPerformed

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
            this.date_fecha_inicio.setEnabled(true);
            this.date_fecha_final.setEnabled(true);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(false);            
            break;
            case 2:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(true);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(false);
            break;
            case 3:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(true);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(false);
            break;
            case 4:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(true);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(false);
            break;
            case 5:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(true);
            this.txt_empresa.setEnabled(false);
            break;
            case 6:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(true);
            break;
            default:
            this.date_fecha_inicio.setEnabled(false);
            this.date_fecha_final.setEnabled(false);
            this.txt_id_permiso_general.setEnabled(false);
            this.txt_id_unico.setEnabled(false);
            this.txt_contratista.setEnabled(false);
            this.txt_responsable.setEnabled(false);
            this.txt_empresa.setEnabled(false);
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed


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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_permisos;
    private javax.swing.JTable tabla_permiso_general;
    private javax.swing.JTextField txt_contratista;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_id_permiso_general;
    private javax.swing.JTextField txt_id_unico;
    private javax.swing.JTextField txt_responsable;
    // End of variables declaration//GEN-END:variables

    public void cargar_tabla_general() {
        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID_PERMISO", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
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
                + "WHERE (ESTADO = 'Solicitado') "
                + "ORDER BY ID DESC";

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
            tabla_permiso_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void ancho_columnas() {
        tabla_permiso_general.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_permiso_general.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_permiso_general.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_permiso_general.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabla_permiso_general.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabla_permiso_general.getColumnModel().getColumn(5).setPreferredWidth(300);
        tabla_permiso_general.getColumnModel().getColumn(6).setPreferredWidth(200);
        tabla_permiso_general.getColumnModel().getColumn(7).setPreferredWidth(150);
        tabla_permiso_general.getColumnModel().getColumn(8).setPreferredWidth(100);
    }

}
