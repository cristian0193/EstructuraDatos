package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AdminItem extends javax.swing.JDialog {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;

    public AdminItem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        combo_trabajo();
        cargar_tabla_item();
        ancho_columnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre_ITEM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_id_item = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo_trabajo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_item = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREACION DE ITEM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setText("Nombre ITEM :");

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Guardar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Actualizar Registro");

        jLabel3.setText("ID ITEM :");

        txt_id_item.setEditable(false);
        txt_id_item.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_id_item.setForeground(new java.awt.Color(0, 0, 255));
        txt_id_item.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Refrescar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Trabajo :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_item, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nombre_ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_id_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre_ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabla_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE ITEM", "TRABAJO"
            }
        ));
        tabla_item.setRowHeight(24);
        tabla_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_item);
        if (tabla_item.getColumnModel().getColumnCount() > 0) {
            tabla_item.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_item.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_item.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_item.getColumnModel().getColumn(1).setMinWidth(350);
            tabla_item.getColumnModel().getColumn(1).setPreferredWidth(350);
            tabla_item.getColumnModel().getColumn(1).setMaxWidth(350);
            tabla_item.getColumnModel().getColumn(2).setMinWidth(200);
            tabla_item.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla_item.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String descripcion = txt_nombre_ITEM.getText();
        String trabajo = combo_trabajo.getSelectedItem().toString();

        if (descripcion.equals("") || trabajo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS CAMPOS OBLIGATORIOS");
        } else {
            String id = consultar_id_trabajo(trabajo);

            boolean resultado = insertar_item(descripcion, id);

            if (resultado = true) {
                JOptionPane.showMessageDialog(null, "ITEM INSERTADO");
                cargar_tabla_item();
                ancho_columnas();
                txt_id_item.setText("");
                txt_nombre_ITEM.setText("");
                combo_trabajo.setSelectedIndex(0);
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE INSERTO TRABAJO");
                txt_id_item.setText("");
                txt_nombre_ITEM.setText("");
                combo_trabajo.setSelectedIndex(0);
                conexion.cerrar();
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        cargar_tabla_item();
        ancho_columnas();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabla_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_itemMouseClicked
        
         int rec = this.tabla_item.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            String valor = tabla_item.getValueAt(rec, 0).toString();
            String descripcion = tabla_item.getValueAt(rec, 1).toString();
            String item = tabla_item.getValueAt(rec, 2).toString();

            txt_id_item.setText(valor);
            txt_nombre_ITEM.setText(descripcion);
            combo_trabajo.setSelectedItem(item);
        }

        
    }//GEN-LAST:event_tabla_itemMouseClicked

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
//            java.util.logging.Logger.getLogger(AdminItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                AdminItem dialog = new AdminItem(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_trabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_item;
    private javax.swing.JTextField txt_id_item;
    private javax.swing.JTextField txt_nombre_ITEM;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR TABLA PROYECTOS
    public boolean insertar_item(String DESCRIPCION, String TRABAJO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "INSERT INTO "
                + " ITEM "
                + " ( ID,DESCRIPCION,ID_TRABAJOS ) "
                + " VALUES ( "
                + " NULL,"
                + "  '" + DESCRIPCION.toUpperCase() + "',"
                + "  '" + TRABAJO + "');";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            st.executeUpdate(query);

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insertar " + ex);
            return false;
        }
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla_item() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "DESCRIPCION DEL ITEM", "TRABAJO"};
        String[] registro = new String[3];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT I.ID, I.DESCRIPCION, T.DESCRIPCION AS TRABAJO "
                + "FROM TRABAJOS T, ITEM I "
                + "WHERE T.ID = I.ID_TRABAJOS";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("DESCRIPCION");
                registro[2] = rs.getString("TRABAJO");

                modelo.addRow(registro);
            }
            tabla_item.setModel(modelo);
            ConexioSQLite.cerrar();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "tabla " + ex);

        }
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void combo_trabajo() {
        combo_trabajo.setEnabled(true);
        combo_trabajo.removeAllItems();
        combo_trabajo.addItem("Seleccionar");

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        try {

            query = "SELECT DESCRIPCION FROM TRABAJOS ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_trabajo.addItem(rs.getString("DESCRIPCION"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public String consultar_id_trabajo(String TRABAJO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String id = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "sELECT T.ID "
                + "FROM TRABAJOS T "
                + "WHERE T.DESCRIPCION LIKE '%" + TRABAJO + "%'";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            id = rs.getString("ID");
            ConexioSQLite.cerrar();
            return id;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "tabla " + ex);
            return "";
        }

    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void ancho_columnas() {
        tabla_item.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_item.getColumnModel().getColumn(1).setPreferredWidth(350);
        tabla_item.getColumnModel().getColumn(2).setPreferredWidth(200);
    }
}
