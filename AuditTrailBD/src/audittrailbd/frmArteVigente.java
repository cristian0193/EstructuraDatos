package audittrailbd;

import Conexion.ConexioMySql;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRODRIGUEZ
 */
public class frmArteVigente extends javax.swing.JFrame {

    public static ConexioMySql conexion;
    DefaultTableModel modelo;

    public frmArteVigente() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcionMaterial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArteVigente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipoEtiqueta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMotivoCambio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ArteVigente = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARTE VIGENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Codigo Producto");

        jLabel3.setText("Descripcion del Producto");

        jLabel4.setText("Codigo Material de Empaque");

        jLabel5.setText("Descripcion Material de Empaque");

        jLabel6.setText("Arte Vigente");

        jLabel7.setText("Tipo de Etiqueta");

        jLabel8.setText("Motivo del Cambio");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        jLabel9.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescripcionMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtArteVigente, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMotivoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcionMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArteVigente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl_ArteVigente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbl_ArteVigente.setRowHeight(23);
        tbl_ArteVigente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ArteVigenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ArteVigente);

        jLabel10.setText("Usuario :");

        lbUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUsuario.setText("CHRISTIAN R.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lbUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String id = txtID.getText();
        String cod_producto = txtCodigoProducto.getText();
        String desc_producto = txtDescripcionProducto.getText();
        String cod_material = txtCodigoMaterial.getText();
        String desc_material = txtDescripcionMaterial.getText();
        String arte = txtArteVigente.getText();
        String tipo = txtTipoEtiqueta.getText();
        String motivo = txtMotivoCambio.getText();
        String usuario = lbUsuario.getText();

        boolean resultado = conexion.upgradeArteVigente(id, cod_producto, desc_producto, cod_material, desc_material, arte, tipo, motivo, usuario);

        String mensaje;
        String sHostName;
        String sSistemaOperativo;
        InetAddress address;

        try {
            sSistemaOperativo = System.getProperty("os.name");
            address = InetAddress.getLocalHost();
            String IP_local = address.getHostAddress();
            Date fecha1 = new Date();
            String fecha = fecha1.toLocaleString();

            mensaje = id + ";" + cod_producto + ";" + desc_producto + ";" + cod_material + ";" + desc_material + ";" + arte + ";" + tipo + ";" + motivo + ";" + usuario + ";" + IP_local + ";" + sSistemaOperativo + ";" + fecha;

            escribirLog(mensaje);

        } catch (UnknownHostException ex) {
            Logger.getLogger(frmArteVigente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "ARTE VIGENTE ACTUALIZADA");
            LimpiarCampos();
            cargar_tabla();
            conexion.cerrar();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
            LimpiarCampos();
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String id = txtID.getText();
        String cod_producto = txtCodigoProducto.getText();
        String desc_producto = txtDescripcionProducto.getText();
        String cod_material = txtCodigoMaterial.getText();
        String desc_material = txtDescripcionMaterial.getText();
        String arte = txtArteVigente.getText();
        String tipo = txtTipoEtiqueta.getText();
        String motivo = txtMotivoCambio.getText();
        String usuario = lbUsuario.getText();

        boolean resultado = conexion.insertarArteVigente(cod_producto, desc_producto, cod_material, desc_material, arte, tipo, motivo, usuario);

        String mensaje;
        String sHostName;
        String sSistemaOperativo;
        InetAddress address;

        try {
            sSistemaOperativo = System.getProperty("os.name");
            address = InetAddress.getLocalHost();
            String IP_local = address.getHostAddress();
            Date fecha1 = new Date();
            String fecha = fecha1.toLocaleString();

            mensaje = id + ";" + cod_producto + ";" + desc_producto + ";" + cod_material + ";" + desc_material + ";" + arte + ";" + tipo + ";" + motivo + ";" + usuario + ";" + IP_local + ";" + sSistemaOperativo + ";" + fecha;

            escribirLog(mensaje);

        } catch (UnknownHostException ex) {
            Logger.getLogger(frmArteVigente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "ARTE VIGENTE GUARDADA");
            LimpiarCampos();
            cargar_tabla();
            conexion.cerrar();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
            LimpiarCampos();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String id = txtID.getText();
        String cod_producto = txtCodigoProducto.getText();
        String desc_producto = txtDescripcionProducto.getText();
        String cod_material = txtCodigoMaterial.getText();
        String desc_material = txtDescripcionMaterial.getText();
        String arte = txtArteVigente.getText();
        String tipo = txtTipoEtiqueta.getText();
        String motivo = txtMotivoCambio.getText();
        String usuario = lbUsuario.getText();

        boolean resultado = conexion.deleteArteVigente(id, cod_producto, desc_producto, cod_material, desc_material, arte, tipo, motivo, usuario);

        String mensaje;
        String sHostName;
        String sSistemaOperativo;
        InetAddress address;

        try {
            sSistemaOperativo = System.getProperty("os.name");
            address = InetAddress.getLocalHost();
            String IP_local = address.getHostAddress();
            Date fecha1 = new Date();
            String fecha = fecha1.toLocaleString();

            mensaje = id + ";" + cod_producto + ";" + desc_producto + ";" + cod_material + ";" + desc_material + ";" + arte + ";" + tipo + ";" + motivo + ";" + usuario + ";" + IP_local + ";" + sSistemaOperativo + ";" + fecha;

            escribirLog(mensaje);

        } catch (UnknownHostException ex) {
            Logger.getLogger(frmArteVigente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "ARTE VIGENTE ELIMINADA");
            LimpiarCampos();
            cargar_tabla();
            conexion.cerrar();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
            LimpiarCampos();
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbl_ArteVigenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ArteVigenteMouseClicked

        int rec = this.tbl_ArteVigente.getSelectedRow();

        this.txtID.setText(tbl_ArteVigente.getValueAt(rec, 0).toString());
        this.txtCodigoProducto.setText(tbl_ArteVigente.getValueAt(rec, 1).toString());
        this.txtDescripcionProducto.setText(tbl_ArteVigente.getValueAt(rec, 2).toString());
        this.txtCodigoMaterial.setText(tbl_ArteVigente.getValueAt(rec, 3).toString());
        this.txtDescripcionMaterial.setText(tbl_ArteVigente.getValueAt(rec, 4).toString());
        this.txtArteVigente.setText(tbl_ArteVigente.getValueAt(rec, 5).toString());
        this.txtTipoEtiqueta.setText(tbl_ArteVigente.getValueAt(rec, 6).toString());
        this.txtMotivoCambio.setText(tbl_ArteVigente.getValueAt(rec, 7).toString());


    }//GEN-LAST:event_tbl_ArteVigenteMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmArteVigente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmArteVigente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmArteVigente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmArteVigente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmArteVigente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tbl_ArteVigente;
    private javax.swing.JTextField txtArteVigente;
    private javax.swing.JTextField txtCodigoMaterial;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcionMaterial;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMotivoCambio;
    private javax.swing.JTextField txtTipoEtiqueta;
    // End of variables declaration//GEN-END:variables

    //METODO PARA LIMPIAR LOS CAMPOS 
    public void LimpiarCampos() {
        txtID.setText("");
        txtCodigoProducto.setText("");;
        txtDescripcionProducto.setText("");
        txtCodigoMaterial.setText("");
        txtDescripcionMaterial.setText("");
        txtArteVigente.setText("");
        txtTipoEtiqueta.setText("");
        txtMotivoCambio.setText("");
    }

    // METODO PARA CARGAR TABLA PRINCIPAL
    public void cargar_tabla() {

        conexion = new ConexioMySql();
        conexion.coneccionbase();

        String[] titulos = {"ID", "COD_PRODCUTO", "DESCRIPCION", "COD_MATERIAL", "DESCRIPCION", "ARTE", "TIPO", "MOTIVO", "FECHA"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioMySql con = new ConexioMySql();
        Connection cn = con.Conectar();

        query = "SELECT * "
                + "FROM "
                + "arte_vigente "
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("COD_PRODUCTO");
                registro[2] = rs.getString("DESCRIPCION_PRODUCTO");
                registro[3] = rs.getString("COD_MATERIAL");
                registro[4] = rs.getString("DESCRIPCION_MATERAL");
                registro[5] = rs.getString("ARTE_VIGENTE");
                registro[6] = rs.getString("TIPO_ETIQUETA");
                registro[7] = rs.getString("MOTIVO_CAMBIO");
                registro[8] = rs.getString("FECHA_CREACION");

                modelo.addRow(registro);
            }
            tbl_ArteVigente.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public static void escribirLog(String mensaje) {

        BufferedWriter br;

        try {
            br = new BufferedWriter(new FileWriter("C:\\Users\\CRODRIGUEZ\\Documents\\NetBeansProjects\\EstructuraDatos\\AuditTrailBD\\log.txt",true));

            br.write(mensaje);
            br.newLine();
            br.close();

        } catch (Exception e) {
            System.out.println("Excepción Generada");
        } finally {

        }
    }

    public static void leerLog() {
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("archivo.txt"));
            String line = br.readLine();
            String cad = "";
            while (line != null) {
                cad = cad.concat(line);
                System.out.println(line);
                if (line.isEmpty()) {
                    System.out.println("Salto de línea");
                }
                line = br.readLine();
            }
            System.out.println("Mostrar Cadena Acumuladora:");
            System.out.println(cad);
            br.close();
        } catch (Exception e) {
            System.out.println("Excepción Generada");
        } finally {

        }

    }

}
