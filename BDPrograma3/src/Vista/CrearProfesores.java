package Vista;

import Control.CRUD_Profesores;
import Control.ConexionMySQL;
import Modelo.Profesores;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Rodriguez
 */
public class CrearProfesores extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    public int contador = 10000;
    
    public CrearProfesores() {
        initComponents();
        this.setLocationRelativeTo(null);        
        cargar_tabla_profesor(); // INICIAMOS CARGANDO EL JCOMBOX DE PROFESO               
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
        setPreferredSize(new java.awt.Dimension(540, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR PROFESOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 525, 45));

        txt_tabla_profesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txt_tabla_profesor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 505, 148));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID PROFESOR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, 90, 20));

        jLabel3.setText("NOMBRE PROFESOR :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 41, -1, 20));

        jLabel4.setText("APELLIDO PROFESOR :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 72, -1, 20));

        txt_id_profesor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txt_id_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 126, -1));
        jPanel1.add(txt_nombre_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, -1));
        jPanel1.add(txt_apellido_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 505, 113));

        jButton1.setText("Guardar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 334, 136, 30));

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

            int id = Integer.parseInt(txt_id_profesor.getText());
            String nombre = txt_nombre_profesor.getText();
            String apellido = txt_apellido_profesor.getText();

            Profesores profesor = new Profesores(id, nombre.toUpperCase(), apellido.toUpperCase());
            boolean resultado = CRUD_Profesores.insert_profesor(profesor);

            if (resultado == true) {
                LimpiarCampos();
                cargar_tabla_profesor();               
            } else {
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

    //METODO PARA LIMPIAR LOS CAMPOS
    public void LimpiarCampos() {  
        txt_id_profesor.setText("");
        txt_nombre_profesor.setText("");
        txt_apellido_profesor.setText("");
    }

    // METODO PARA CARGAR JTABLE DE PROFESOR
    void cargar_tabla_profesor() {

        String[] titulos = {"ID", "NOMBRE", "APELLIDO"};
        String[] registro = new String[3];        

        modelo = new DefaultTableModel(null, titulos);
        
        try {            
            ResultSet rs = CRUD_Profesores.Consultar_Profesores();
            while (rs.next()) {

                registro[0] = rs.getString("ID_PROFESOR");
                registro[1] = rs.getString("NOMBRE_PROFESOR");
                registro[2] = rs.getString("APELLIDO_PROFESOR");

                modelo.addRow(registro);
            }
            txt_tabla_profesor.setModel(modelo);
            ConexionMySQL.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
