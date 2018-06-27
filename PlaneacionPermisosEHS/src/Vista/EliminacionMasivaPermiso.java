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

public class EliminacionMasivaPermiso extends javax.swing.JDialog {

    DefaultTableModel modelo;
    ConexioSQLite conexion;

    public EliminacionMasivaPermiso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_general();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        btn_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINACION MASIVA DE DATOS (PERMISOS)");

        jLabel2.setText("Fecha Inicio :");

        btn_eliminar.setBackground(new java.awt.Color(153, 255, 51));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setToolTipText("Permite realizar el cargue de la ruta donde se exportará la informacion");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_datos.setRowHeight(25);
        jScrollPane1.setViewportView(tabla_datos);

        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");

        jLabel3.setText("Fecha Fin :");

        date_fecha_final.setDateFormatString("yyyy-MM-dd");

        btn_consultar.setBackground(new java.awt.Color(102, 255, 255));
        btn_consultar.setText("Consultar");
        btn_consultar.setToolTipText("Permite realizar el cargue de la ruta donde se exportará la informacion");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (this.date_fecha_inicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
        } else if (this.date_fecha_final.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
        } else {

            int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Eliminar los Datos?", "Mensaje de Confirmacion", JOptionPane.QUESTION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                // CONVERSION DE FECHAS (DATE A STRING)
                String formato1 = date_fecha_inicio.getDateFormatString();
                Date date1 = (Date) date_fecha_inicio.getDate();
                SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                // CONVERSION DE FECHAS (DATE A STRING)
                String formato2 = date_fecha_final.getDateFormatString();
                Date date2 = (Date) date_fecha_final.getDate();
                SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                // EJECUCIÓN DE ELIMINACION A LA BASE DE DATOS
                boolean resultado = conexion.eliminacion_masiva_permisos(fecha_ingresada_inicio, fecha_ingresada_final);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CON EXITO");
                    cargar_tabla_general();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ELIMINADO");
                    cargar_tabla_general();
                }
            } else {

            }

        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed

        if (this.date_fecha_inicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
        } else if (this.date_fecha_final.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
        } else {

            // CONVERSION DE FECHAS (DATE A STRING)
            String formato1 = date_fecha_inicio.getDateFormatString();
            Date date1 = (Date) date_fecha_inicio.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
            String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

            // CONVERSION DE FECHAS (DATE A STRING)
            String formato2 = date_fecha_final.getDateFormatString();
            Date date2 = (Date) date_fecha_final.getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
            String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

            // EJECUCIÓN DE CONSULTA
            consulta_rango_fechas(fecha_ingresada_inicio, fecha_ingresada_final);

            // VISIBILIDAD DE BOTON (VERDADERA)
            btn_eliminar.setEnabled(true);
            conexion.cerrar();
        }

    }//GEN-LAST:event_btn_consultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables

     public void cargar_tabla_general() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID_PERMISO","NOMBRE_PERMISO", "FECHA", "ESTADO"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();
        
        query = "SELECT ID,"
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS "
                + "ORDER BY ID ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                     
                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("FECHA");
                registro[4] = rs.getString("ESTADO");
                
                modelo.addRow(registro);
            }
            tabla_datos.setModel(modelo);
                    

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

     void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID_PERMISO","NOMBRE_PERMISO", "FECHA", "ESTADO"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();
        
        query = "SELECT ID,"
                + "ID_PERMISO, "
                + "NOMBRE_PERMISO, "
                + "FECHA, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' "
                + "ORDER BY ID ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                     
                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("NOMBRE_PERMISO");
                registro[3] = rs.getString("FECHA");
                registro[4] = rs.getString("ESTADO");
                
                modelo.addRow(registro);
            }
            tabla_datos.setModel(modelo);
                    

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
     

}
