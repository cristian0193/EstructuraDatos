package Vista;

import Conexion.ConexioSQLite;
import Datos.Curso;
import Datos.Estudiante;
import Datos.Notas;
import Datos.Profesor;
import static Vista.AsignarCursosProfesor.conexion;
import static Vista.CrearProfesores.conexion;
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
public class RegistrarNotas extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;

    public RegistrarNotas() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_curso();
        cargar_lista_estudiante();
        cargar_tabla_notas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla_notas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nota_1 = new javax.swing.JTextField();
        combo_estudiante = new javax.swing.JComboBox();
        combo_curso = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nota_2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nota_3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nota_final = new javax.swing.JTextField();
        txt_resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE NOTAS");

        jButton1.setText("Registrar Nota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_tabla_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txt_tabla_notas);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOTA 1");

        jLabel4.setText("ID ESTUDIANTE :");

        txt_nota_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_1.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_1ActionPerformed(evt);
            }
        });

        combo_estudiante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        jLabel5.setText("CURSO : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NOTA 2");

        txt_nota_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_2.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOTA 3");

        txt_nota_3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_3.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_3ActionPerformed(evt);
            }
        });

        jLabel8.setText("NOTA FINAL:");

        txt_nota_final.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_final.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_finalActionPerformed(evt);
            }
        });

        txt_resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(255, 0, 0));
        txt_resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(txt_nota_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nota_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nota_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nota_final, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nota_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nota_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nota_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nota_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (combo_curso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ID CURSO ");
        } else if (combo_estudiante.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ID ESTUDIANTE ");
        } else if (txt_nota_1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE APELLIDO PROFESOR ");
        } else if (txt_nota_1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOTA 1 ");
        } else if (txt_nota_2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOTA 2 ");
        } else if (txt_nota_3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOTA 3 ");
        } else {

            String nota1 = txt_nota_1.getText();
            String nota2 = txt_nota_2.getText();
            String nota3 = txt_nota_3.getText();

            if (!isNumeric(nota1)) {
                JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN NOTA 1");
            } else if (!isNumeric(nota2)) {
                JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN NOTA 2");
            } else if (!isNumeric(nota3)) {
                JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN NOTA 3");
            } else {

                conexion = new ConexioSQLite();
                conexion.coneccionbase();
                int id_curso = Integer.parseInt(combo_curso.getSelectedItem().toString());
                int id_estudiante = Integer.parseInt(combo_estudiante.getSelectedItem().toString());

                double nota_1 = Double.parseDouble(txt_nota_1.getText());
                double nota_2 = Double.parseDouble(txt_nota_2.getText());
                double nota_3 = Double.parseDouble(txt_nota_3.getText());

                Profesor profesor = new Profesor(0, "", "");
                Curso curso = new Curso(id_curso, "", 0, "", profesor);
                Estudiante estudiante = new Estudiante(id_estudiante, "", "", curso);

                Notas nota = new Notas(0, nota_1, nota_2, nota_3, estudiante, curso);
                boolean resultado = conexion.insert_nota(nota);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "NOTAS INSERTADAS CORRECTAMENTE");
                    LimpiarCampos();
                    cargar_tabla_notas();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
                    LimpiarCampos();
                }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nota_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nota_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nota_1ActionPerformed

    private void txt_nota_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nota_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nota_2ActionPerformed

    private void txt_nota_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nota_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nota_3ActionPerformed

    private void txt_nota_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nota_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nota_finalActionPerformed

    private void txt_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_curso;
    private javax.swing.JComboBox combo_estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_nota_1;
    private javax.swing.JTextField txt_nota_2;
    private javax.swing.JTextField txt_nota_3;
    private javax.swing.JTextField txt_nota_final;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTable txt_tabla_notas;
    // End of variables declaration//GEN-END:variables

    //METODO PARA LIMPIAR LOS CAMPOS 
    public void LimpiarCampos() {
        combo_curso.setSelectedIndex(0);
        combo_estudiante.setSelectedIndex(0);
        txt_nota_1.setText("");
        txt_nota_2.setText("");
        txt_nota_3.setText("");

    }

    //METODO PARA VALIDAR DATO NUMERICO O NO NUMERICO
    private boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void cargar_lista_curso() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT ID_CURSO FROM CURSO ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_curso.addItem(rs.getString("ID_CURSO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void cargar_lista_estudiante() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT ID_ESTUDIANTE FROM ESTUDIANTE ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_estudiante.addItem(rs.getString("ID_ESTUDIANTE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void cargar_tabla_notas() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ESTUDIANTE", "CURSO", "NOTA 1", "NOTA 2", "NOTA 3"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT (E.NOMBRE_ESTUDIANTE||\"  \"|| E.APELLIDO_ESTUDIANTE) AS NOMBRE ,C.NOMBRE_CURSO,N.NOTA_1,N.NOTA_2, N.NOTA_3 "
                + "FROM NOTAS N, CURSO C , ESTUDIANTE E "
                + "WHERE N.ID_ESTUDIANTE = E.ID_ESTUDIANTE "
                + "AND N.ID_CURSO = C.ID_CURSO; ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NOMBRE");
                registro[1] = rs.getString("NOMBRE_CURSO");
                registro[2] = rs.getString("NOTA_1");
                registro[3] = rs.getString("NOTA_2");
                registro[4] = rs.getString("NOTA_3");

                modelo.addRow(registro);
            }
            txt_tabla_notas.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
