package Vista;

import Conexion.ConexioSQLite;
import static Vista.Pre_Prework.conexion;
import static Vista.Pre_Prework.valor;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Pre_RUs extends javax.swing.JDialog {

    public static String valor;
    public static ConexioSQLite conexion;

    public Pre_RUs(java.awt.Frame parent, boolean modal, String numero) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor = numero;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        check_manufactura = new javax.swing.JCheckBox();
        check_mantenimiento = new javax.swing.JCheckBox();
        check_ehs = new javax.swing.JCheckBox();
        check_calidad = new javax.swing.JCheckBox();
        check_facilities = new javax.swing.JCheckBox();
        check_it = new javax.swing.JCheckBox();
        check_ingenieria = new javax.swing.JCheckBox();
        check_otros = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecha_ru = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REQUERIMIENTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        check_manufactura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_manufactura.setText("MANUFACTUA");

        check_mantenimiento.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_mantenimiento.setText("MANTENIMIENTO");

        check_ehs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_ehs.setText("EHS");

        check_calidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_calidad.setText("CALIDAD");

        check_facilities.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_facilities.setText("FACILITIES");

        check_it.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_it.setText("IT");

        check_ingenieria.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_ingenieria.setText("INGENIERIA");

        check_otros.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        check_otros.setText("OTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_manufactura)
                    .addComponent(check_calidad)
                    .addComponent(check_facilities)
                    .addComponent(check_ingenieria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_mantenimiento)
                    .addComponent(check_ehs)
                    .addComponent(check_it)
                    .addComponent(check_otros))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_manufactura)
                    .addComponent(check_mantenimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_calidad)
                    .addComponent(check_ehs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_facilities)
                    .addComponent(check_it))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_ingenieria)
                    .addComponent(check_otros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("Guardar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FECHA :");

        jLabel5.setText("DD/MM/YYYY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_ru, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fecha_ru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(25, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String manufactura = "";
        String mantenimiento = "";
        String calidad = "";
        String ehs = "";
        String facilities = "";
        String it = "";
        String ingeniria = "";
        String otros = "";        

        String fecha = fecha_ru.getText();

        if (fecha.equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE LA FECHA");
        } else {
            
            if (check_manufactura.isSelected()) {
                manufactura = "S";
            } else {
                manufactura = "N";
            }

            if (check_mantenimiento.isSelected()) {
                mantenimiento = "S";
            } else {
                mantenimiento = "N";
            }

            if (check_calidad.isSelected()) {
                calidad = "S";
            } else {
                calidad = "N";
            }

            if (check_ehs.isSelected()) {
                ehs = "S";
            } else {
                ehs = "N";
            }

            if (check_facilities.isSelected()) {
                facilities = "S";
            } else {
                facilities = "N";
            }

            if (check_it.isSelected()) {
                it = "S";
            } else {
                it = "N";
            }
            
            if (check_ingenieria.isSelected()) {
                ingeniria = "S";
            } else {
                ingeniria = "N";
            }

            if (check_otros.isSelected()) {
                otros = "S";
            } else {
                otros = "N";
            }
            
            boolean resultado = update_ru(valor, fecha, manufactura, mantenimiento, calidad, ehs, facilities, it, ingeniria, otros);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "REQUERIMIENTOS ACTUALIZADOS");       
                fecha_ru.setText("");
                check_manufactura.setSelected(false);
                check_mantenimiento.setSelected(false);
                check_calidad.setSelected(false);
                check_ehs.setSelected(false);
                check_facilities.setSelected(false);
                check_ingenieria.setSelected(false);
                check_it.setSelected(false);
                check_otros.setSelected(false);
                
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
            }

        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments //
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
//            java.util.logging.Logger.getLogger(Pre_Prework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pre_Prework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pre_Prework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pre_Prework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Pre_Prework dialog = new Pre_Prework(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox check_calidad;
    private javax.swing.JCheckBox check_ehs;
    private javax.swing.JCheckBox check_facilities;
    private javax.swing.JCheckBox check_ingenieria;
    private javax.swing.JCheckBox check_it;
    private javax.swing.JCheckBox check_mantenimiento;
    private javax.swing.JCheckBox check_manufactura;
    private javax.swing.JCheckBox check_otros;
    private javax.swing.JTextField fecha_ru;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR TABLA PROYECTOS
    public boolean update_ru(String ID,
            String FECHA,
            String MANUFACTURA,
            String MANTENIMIENTO,
            String CALIDAD,
            String EHS,
            String FACILITIES,
            String IT,
            String INGENIERIA,
            String OTROS) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String query2 = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "UPDATE"
                + " PREREQUISITOS"
                + " SET "
                + "  RU_FECHA = '" + FECHA + "',"
                + "  RU_MANUFACTURA = '" + MANUFACTURA + "',"
                + "  RU_MTTO = '" + MANTENIMIENTO + "',"
                + "  RU_CALIDAD = '" + CALIDAD + "',"
                + "  RU_EHS = '" + EHS + "',"
                + "  RU_FACILITIES = '" + FACILITIES + "',"
                + "  RU_IT = '" + IT + "',"
                + "  RU_INGENIERIA = '" + INGENIERIA + "',"
                + "  RU_OTROS = '" + OTROS + "'"
                + " WHERE"
                + "  ID = " + ID + ";";

        query2 = "UPDATE"
                + " PROYECTOS"
                + " SET "
                + "  ESTADO = 'EN EJECUCION'"
                + " WHERE"
                + "  ID = " + ID + ";";

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

}
