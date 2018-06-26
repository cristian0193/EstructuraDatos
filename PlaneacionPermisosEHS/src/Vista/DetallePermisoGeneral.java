package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetallePermisoGeneral extends javax.swing.JDialog {

    public static String valor1, valor2;
    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public DetallePermisoGeneral(java.awt.Frame parent, boolean modal, String id, String id_general) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor1 = id;
        valor2 = id_general;
        this.txt_ID_PERMISO.setText(valor1);
        this.txt_ID_GENERAL.setText(valor2);
        cargar_tabla_permisos_general(valor2);
        ancho_columnas();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_ID_PERMISO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_permisos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ID_GENERAL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLE POR GENERAL VS PERMISO INDIVIDUAL");

        txt_ID_PERMISO.setEditable(false);
        txt_ID_PERMISO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_ID_PERMISO.setForeground(new java.awt.Color(255, 0, 0));
        txt_ID_PERMISO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ID_PERMISO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_PERMISOActionPerformed(evt);
            }
        });

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
        tabla_permisos.setRowHeight(30);
        jScrollPane1.setViewportView(tabla_permisos);

        jLabel2.setText("ID GENERAL :");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ID_PERMISO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ID_GENERAL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ID_PERMISO, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ID_GENERAL)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ID_PERMISOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_PERMISOActionPerformed


    }//GEN-LAST:event_txt_ID_PERMISOActionPerformed

    private void txt_ID_GENERALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_GENERALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_GENERALActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_permisos;
    public javax.swing.JTextField txt_ID_GENERAL;
    public javax.swing.JTextField txt_ID_PERMISO;
    // End of variables declaration//GEN-END:variables

    public void cargar_tabla_permisos_general(String ID) {

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
                + "WHERE ID = '" + ID + "' ORDER BY ID_PERMISO ASC";
        System.out.println(query);
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
            tabla_permisos.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void ancho_columnas() {
        tabla_permisos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_permisos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_permisos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_permisos.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabla_permisos.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabla_permisos.getColumnModel().getColumn(5).setPreferredWidth(300);
        tabla_permisos.getColumnModel().getColumn(6).setPreferredWidth(200);
        tabla_permisos.getColumnModel().getColumn(7).setPreferredWidth(150);
        tabla_permisos.getColumnModel().getColumn(8).setPreferredWidth(100);
    }
}
