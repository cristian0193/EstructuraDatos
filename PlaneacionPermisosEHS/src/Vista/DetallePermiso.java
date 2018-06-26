package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DetallePermiso extends javax.swing.JDialog {

    public static String valor1, valor2;
    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;

    public DetallePermiso(java.awt.Frame parent, boolean modal, String id, String id_general) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor1 = id;
        valor2 = id_general;
        this.txt_ID_PERMISO.setText(valor1);
        this.txt_ID_GENERAL.setText(valor2);
        cargar_tabla_permisos(valor1);
        ancho_columnas();
        centrar_datos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txt_ID_PERMISO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ID_GENERAL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_permisos = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLE POR PERMISO VS GENERAL");

        txt_ID_PERMISO.setEditable(false);
        txt_ID_PERMISO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_ID_PERMISO.setForeground(new java.awt.Color(255, 0, 0));
        txt_ID_PERMISO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID_PERMISO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_PERMISOActionPerformed(evt);
            }
        });

        jLabel2.setText("ID :");

        jLabel3.setText("ID PERMISO GENERAL :");

        txt_ID_GENERAL.setEditable(false);
        txt_ID_GENERAL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_ID_GENERAL.setForeground(new java.awt.Color(255, 0, 0));
        txt_ID_GENERAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID_GENERAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_GENERALActionPerformed(evt);
            }
        });

        tabla_permisos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabla_permisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_permisos.setComponentPopupMenu(jPopupMenu1);
        tabla_permisos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_permisos.setRowHeight(30);
        jScrollPane2.setViewportView(tabla_permisos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ID_PERMISO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ID_GENERAL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ID_PERMISO)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ID_GENERAL)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ID_PERMISOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_PERMISOActionPerformed


    }//GEN-LAST:event_txt_ID_PERMISOActionPerformed

    private void txt_ID_GENERALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_GENERALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_GENERALActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        // int rec = 0;
        int rec = this.tabla_permisos.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Cerrado ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permisos.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_cierre_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'CERRADO'");
                    cargar_tabla_permisos(valor1);
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
        int rec = this.tabla_permisos.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Anulado ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permisos.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_anular_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'ANULADO'");
                    cargar_tabla_permisos(valor1);
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
        int rec = this.tabla_permisos.getSelectedRow();
        
        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado del permiso a Perdido ",
                    "Informativo", JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == confirmado) {

                String id = tabla_permisos.getValueAt(rec, 0).toString();

                boolean resultado = conexion.upgrade_perdido_permiso(id);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO 'PERDIDO'");
                    cargar_tabla_permisos(valor1);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_permisos;
    public javax.swing.JTextField txt_ID_GENERAL;
    public javax.swing.JTextField txt_ID_PERMISO;
    // End of variables declaration//GEN-END:variables

    public void cargar_tabla_permisos(String ID) {

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
                + "WHERE ID_PERMISO_GENERAL = '" + ID + "' ORDER BY ID_PERMISO ASC";
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
            tabla_permisos.setModel(modelo);
                    

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void ancho_columnas() {
        tabla_permisos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_permisos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_permisos.getColumnModel().getColumn(2).setPreferredWidth(500);
        tabla_permisos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_permisos.getColumnModel().getColumn(4).setPreferredWidth(150);
    }
    
      public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_permisos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_permisos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        tabla_permisos.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tabla_permisos.getColumnModel().getColumn(4).setCellRenderer(Alinear);
    }
}
