package Vista;

import Conexion.ConexioSQLite;
import Datos.Profesor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class CrearProfesores extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    
    public CrearProfesores() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_profesor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla_profesor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_profesor = new javax.swing.JTextField();
        txt_nombre_profesor = new javax.swing.JTextField();
        txt_apellido_profesor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR PROFESOR");

        txt_tabla_profesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txt_tabla_profesor);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID PROFESOR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, 90, 20));

        jLabel3.setText("NOMBRE PROFESOR :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 41, -1, 20));

        jLabel4.setText("APELLIDO PROFESOR :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 72, -1, 20));
        jPanel1.add(txt_id_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 126, -1));
        jPanel1.add(txt_nombre_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, -1));
        jPanel1.add(txt_apellido_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, -1));

        jButton1.setText("Guardar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_id_profesor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE ID PROFESOR ");
        } else if (txt_nombre_profesor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOMBRE PROFESOR ");
        } else if (txt_apellido_profesor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE APELLIDO PROFESOR ");
        } else {

            conexion = new ConexioSQLite();
            conexion.coneccionbase();
            int id = Integer.parseInt(txt_id_profesor.getText());
            String nombre = txt_nombre_profesor.getText();
            String apellido = txt_apellido_profesor.getText();

            Profesor profesor = new Profesor(id, nombre.toUpperCase(), apellido.toUpperCase());
            boolean resultado = conexion.insert_profesor(profesor);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PROFESOR INSERTADO CORRECTAMENTE");
                LimpiarCampos();
                cargar_tabla_profesor();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
                LimpiarCampos();
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_apellido_profesor;
    private javax.swing.JTextField txt_id_profesor;
    private javax.swing.JTextField txt_nombre_profesor;
    private javax.swing.JTable txt_tabla_profesor;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_id_profesor.setText("");
        txt_nombre_profesor.setText("");
        txt_apellido_profesor.setText("");
    }

    void cargar_tabla_profesor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "NOMBRE", "APELLIDO"};
        String[] registro = new String[3];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * "
                + "FROM "
                + "PROFESOR "
                + "ORDER BY ID_PROFESOR ASC";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID_PROFESOR");
                registro[1] = rs.getString("NOMBRE_PROFESOR");
                registro[2] = rs.getString("APELLIDO_PROFESOR");

                modelo.addRow(registro);
            }
            txt_tabla_profesor.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
