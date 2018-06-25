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

public class AdminContratista extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConexioSQLite conexion;
    public static DefaultTableCellRenderer Alinear;
    
    
    public AdminContratista() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_contratista();
        ancho_columnas();
        centrar_datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_contratista = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        btn_guardar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTRATISTA");

        tabla_contratista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_contratista.setRowHeight(23);
        tabla_contratista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_contratistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_contratista);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jLabel2.setText("ID :");

        txt_id.setEditable(false);

        jLabel3.setText("Nombre :");

        btn_guardar1.setBackground(new java.awt.Color(255, 204, 102));
        btn_guardar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardar1.setText("Guardar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        btn_guardar2.setBackground(new java.awt.Color(102, 102, 255));
        btn_guardar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardar2.setText("Eliminar");
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_contratistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_contratistaMouseClicked

        int rec = this.tabla_contratista.getSelectedRow();

        this.txt_id.setText(tabla_contratista.getValueAt(rec, 0).toString());
        this.txt_nombre.setText(tabla_contratista.getValueAt(rec, 1).toString());
        
    }//GEN-LAST:event_tabla_contratistaMouseClicked

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed

        if (txt_id.getText().equals("")) {
            if (txt_nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "NOMBRE OBLIGATORIO");
            } else {
                conexion = new ConexioSQLite();
                conexion.coneccionbase();

                String nombre = txt_nombre.getText();
                boolean resultado = conexion.insert_contratista(nombre.toUpperCase());

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "REGISTRO INSERTADO");
                    LimpiarCampos();
                    cargar_tabla_contratista();
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
                    LimpiarCampos();
                }
            }
        } else {

            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String id = txt_id.getText();
            String nombre = txt_nombre.getText();

            boolean resultado = conexion.upgrade_contratista(id, nombre);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO");
                LimpiarCampos();
                cargar_tabla_contratista();
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                LimpiarCampos();
            }

        } 
      
     
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
      
        if (txt_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE DE LA TABLA");
        } else {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String id = txt_id.getText();

            boolean resultado = conexion.delete_contratista(id);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                LimpiarCampos();
                cargar_tabla_contratista();
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ELIMINADO");
                LimpiarCampos();
            }
        }
        
    }//GEN-LAST:event_btn_guardar2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_contratista;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_id.setText("");
        txt_nombre.setText("");
    }
    
    void cargar_tabla_contratista() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "NOMBRE"};
        String[] registro = new String[2];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "NOMBRE  "
                + "FROM "
                + "CONTRATISTA "
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("NOMBRE");

                modelo.addRow(registro);
            }
            
            tabla_contratista.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

     public void ancho_columnas() {
        tabla_contratista.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_contratista.getColumnModel().getColumn(1).setPreferredWidth(400);
    }

    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_contratista.getColumnModel().getColumn(0).setCellRenderer(Alinear);
    }

}
