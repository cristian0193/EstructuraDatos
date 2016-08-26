package Vista;

import Conexion.ConexioSQLite;
import Datos.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Rodriguez
 */
public class AsignarCursosProfesor extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;

    public AsignarCursosProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_profesor();
        cargar_tabla_curso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla_cursos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_curso = new javax.swing.JTextField();
        txt_numero_creditos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_profe_asignado = new javax.swing.JComboBox();
        txt_actividades = new javax.swing.JTextField();
        txt_nombre_curso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR CURSO");

        txt_tabla_cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txt_tabla_cursos);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID_CURSO :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setText("NUMERO_CREDITOS :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, -1, -1));

        jLabel4.setText("ACTIVIDADES_CURSO :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 117, -1, -1));
        jPanel1.add(txt_id_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 13, 152, -1));
        jPanel1.add(txt_numero_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 62, -1));

        jLabel5.setText("PROFESOR ASIGNADO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 155, 152, -1));

        combo_profe_asignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(combo_profe_asignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 280, -1));
        jPanel1.add(txt_actividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 280, -1));
        jPanel1.add(txt_nombre_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 45, 280, -1));

        jLabel6.setText("NOMBRE CURSO :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton1.setText("Guardar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_id_curso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE ID CURSO ");
        } else if (txt_numero_creditos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOMBRE PROFESOR ");
        } else if (txt_actividades.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE APELLIDO PROFESOR ");
        } else if (combo_profe_asignado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL PROFESOR ");
        } else {

            conexion = new ConexioSQLite();
            conexion.coneccionbase();
            int id = Integer.parseInt(txt_id_curso.getText());
            String nombre = txt_nombre_curso.getText();
            int numero = Integer.parseInt(txt_numero_creditos.getText());
            String actividad = txt_actividades.getText();
            int profesor = Integer.parseInt(combo_profe_asignado.getSelectedItem().toString());

            Profesor objprofesor1 = new Profesor(profesor, "", "");

            Curso curso = new Curso(id, nombre.toUpperCase(), numero, actividad.toUpperCase(), objprofesor1);
            boolean resultado = conexion.insert_curso(curso);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CURSO INSERTADO CORRECTAMENTE");

                int resp = JOptionPane.showConfirmDialog(null, "¿ Desea ingresar Otro Profesor al mismo Curso ?", "Informativo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (resp == 0) {
                    combo_profe_asignado.setEnabled(false);
                    txt_id_curso.setText("");
                    txt_nombre_curso.setText("");
                    txt_numero_creditos.setText("");
                    txt_actividades.setText("");
                } else {
                    combo_profe_asignado.setEnabled(true);
                    LimpiarCampos();
                }

                cargar_tabla_curso();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
                LimpiarCampos();
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_profe_asignado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_actividades;
    private javax.swing.JTextField txt_id_curso;
    private javax.swing.JTextField txt_nombre_curso;
    private javax.swing.JTextField txt_numero_creditos;
    private javax.swing.JTable txt_tabla_cursos;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_id_curso.setText("");
        txt_nombre_curso.setText("");
        txt_numero_creditos.setText("");
        txt_actividades.setText("");
        combo_profe_asignado.setSelectedIndex(0);
    }

// METODO PARA CARGAR JCOMBOBOX PROFESOR
    public void cargar_lista_profesor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT ID_PROFESOR FROM PROFESOR ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_profe_asignado.addItem(rs.getString("ID_PROFESOR"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void cargar_tabla_curso() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "NOMBRE", "CREDITOS", "ACTIVIDAD", "PROFESOR"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT C.ID_CURSO,C.NOMBRE_CURSO, C.NUMERO_CREDITOS, C.ACTIVIDAD_CURSO, P.NOMBRE_PROFESOR "
                + "FROM "
                + "PROFESOR P, CURSO C "
                + "WHERE P.ID_PROFESOR = C.ID_PROFESOR ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID_CURSO");
                registro[1] = rs.getString("NOMBRE_CURSO");
                registro[2] = rs.getString("NUMERO_CREDITOS");
                registro[3] = rs.getString("ACTIVIDAD_CURSO");
                registro[4] = rs.getString("NOMBRE_PROFESOR");

                modelo.addRow(registro);
            }
            txt_tabla_cursos.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
}
