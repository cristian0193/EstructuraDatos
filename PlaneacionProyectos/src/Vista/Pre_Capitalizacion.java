package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pre_Capitalizacion extends javax.swing.JDialog {

public static String valor; 
public static ConexioSQLite conexion;
public static DefaultTableModel modelo;
    
    public Pre_Capitalizacion(java.awt.Frame parent, boolean modal,String numero) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor = numero;                 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id_proyecto_detallada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_activo = new javax.swing.JTextField();
        txt_fecha_capitalizacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_capitalizacion = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAPITALIZACION");

        txt_id_proyecto_detallada.setEditable(false);
        txt_id_proyecto_detallada.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_proyecto_detallada.setForeground(new java.awt.Color(255, 51, 51));
        txt_id_proyecto_detallada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_proyecto_detallada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_proyecto_detalladaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Datos"));

        jLabel10.setText("ITEM :");

        jLabel13.setText("# ACTIVO :");

        jLabel14.setText("FECHA :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha_capitalizacion)
                    .addComponent(txt_item)
                    .addComponent(txt_activo, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_fecha_capitalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tabla_capitalizacion.setAutoCreateColumnsFromModel(false);
        tabla_capitalizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "# ACTIVO", "FECHA"
            }
        ));
        tabla_capitalizacion.setRowHeight(25);
        jScrollPane1.setViewportView(tabla_capitalizacion);
        if (tabla_capitalizacion.getColumnModel().getColumnCount() > 0) {
            tabla_capitalizacion.getColumnModel().getColumn(0).setMinWidth(40);
            tabla_capitalizacion.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla_capitalizacion.getColumnModel().getColumn(0).setMaxWidth(40);
            tabla_capitalizacion.getColumnModel().getColumn(1).setMinWidth(500);
            tabla_capitalizacion.getColumnModel().getColumn(1).setPreferredWidth(500);
            tabla_capitalizacion.getColumnModel().getColumn(1).setMaxWidth(500);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("Grabar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(txt_id_proyecto_detallada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_proyecto_detallada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_proyecto_detalladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_proyecto_detalladaActionPerformed
        
    }//GEN-LAST:event_txt_id_proyecto_detalladaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String item = txt_item.getText();
        String activo = txt_activo.getText();
        String fecha = txt_fecha_capitalizacion.getText();
        
        if(item.equals("")|| activo.equals("") || fecha.equals("")){
            JOptionPane.showMessageDialog(null,"INGRESE TODOS LOS CAMPOS OBLIGATORIOS");
        }else{
            
             boolean resultado = conexion.insert_proyecto(item, activo, fecha, valor);
            
            if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "CAPITALIZACION INSERTADA");
                        LimpiarCampos();
                        cargar_tabla_capitalizacion(valor);                        
                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                        LimpiarCampos();
                    }
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


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
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pre_Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Pre_Ejecucion dialog = new Pre_Ejecucion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_capitalizacion;
    private javax.swing.JTextField txt_activo;
    private javax.swing.JTextField txt_fecha_capitalizacion;
    private javax.swing.JTextField txt_id_proyecto_detallada;
    private javax.swing.JTextField txt_item;
    // End of variables declaration//GEN-END:variables

        public void LimpiarCampos() {
        txt_item.setText("");
        txt_activo.setText("");
        txt_fecha_capitalizacion.setText("");
        }
    
 // METODO PARA CARGAR TABLA PROYECTOS
    public boolean insertar_capitalizacion( String FECHA,
            String CAP_ITEM,
            String CAP_ACTIVO,
            String CAP_FECHA,
            String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String query2 = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "INSERT INTO "
                + " CAPITALIZACION"
                + " ( ID, CAP_ITEM,CAP_ACTIVO,CAP_FECHA,ID_PROYECTO ) VALUES ( "
                + "  NULL,"
                + "  '" + CAP_ITEM + "',"
                + "  '" + CAP_ACTIVO + "',"
                + "  '" + CAP_FECHA + "',"
                + "  " + ID_PROYECTO + "";

        query2 = "UPDATE"
                + " PROYECTOS"
                + " SET "
                + "  ESTADO = 'EN EJECUCION'"
                + " WHERE"
                + "  ID = " + ID_PROYECTO + ";";
        
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(query);
            st.executeUpdate(query2);

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    
        // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla_capitalizacion(String id_proyecto) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ITEM", "# ACTIVO", "FECHA"};
        String[] registro = new String[3];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "CAP_ITEM, "
                + "CAP_ACTIVO, "
                + "CAP_FECHA "
                + "FROM "
                + "CAPITALIZACION "
                + "WHERE "
                + "  ID_PROYECTO = " + id_proyecto + ";";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("CAP_ITEM");
                registro[2] = rs.getString("CAP_ACTIVO");
                registro[3] = rs.getString("CAP_FECHA");                

                modelo.addRow(registro);
            }
            tabla_capitalizacion.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
