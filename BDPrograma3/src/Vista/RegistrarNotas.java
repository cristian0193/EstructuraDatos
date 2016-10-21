package Vista;


import java.awt.event.ItemEvent;
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
public class RegistrarNotas extends javax.swing.JFrame {

//    public static ConexioSQLite conexion;
//    DefaultTableModel modelo;
//    public static int contador = 0;
//
//    public RegistrarNotas() {
//        initComponents();
//        this.setLocationRelativeTo(null);
//        cargar_lista_curso(); //INICIO CARGANDO EL JCOMBOBOX DE CURSOS
//        cargar_tabla_notas();//INICIO CARGANDO EL JCOMBOBOX DE NOTAS
//    }
//
//    @SuppressWarnings("unchecked")
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
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE NOTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 658, 45));

        jButton1.setText("Registrar Nota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 446, 114, 34));

        txt_tabla_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txt_tabla_notas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 638, 145));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOTA 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 80, 60, 20));

        jLabel4.setText("ID ESTUDIANTE :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 20));

        txt_nota_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_1.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nota_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 106, 60, 30));

        combo_estudiante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_estudiante.setEnabled(false);
        jPanel1.add(combo_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 240, -1));

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_curso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_cursoItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 240, -1));

        jLabel5.setText("CURSO : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NOTA 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 80, 60, 20));

        txt_nota_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_2.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_2ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nota_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 106, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOTA 3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 80, 60, 20));

        txt_nota_3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_3.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nota_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 106, 60, 30));

        jLabel8.setText("NOTA FINAL:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 159, 83, 20));

        txt_nota_final.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nota_final.setForeground(new java.awt.Color(255, 0, 0));
        txt_nota_final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nota_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nota_finalActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nota_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 154, 60, 30));

        txt_resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(255, 0, 0));
        txt_resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultadoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 139, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 638, 202));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 446, 109, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (combo_curso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ID CURSO ");
        } else if (combo_estudiante.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ID ESTUDIANTE ");
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

//                conexion = new ConexioSQLite();
//                conexion.coneccionbase();
//                int id_curso = Integer.parseInt(combo_curso.getSelectedItem().toString());
//                int id_estudiante = Integer.parseInt(combo_estudiante.getSelectedItem().toString());
//
//                double nota_1 = Double.parseDouble(txt_nota_1.getText());
//                double nota_2 = Double.parseDouble(txt_nota_2.getText());
//                double nota_3 = Double.parseDouble(txt_nota_3.getText());
//
//                Profesor profesor = new Profesor(0, "", "");
//                Curso curso = new Curso(id_curso, "", 0, "", profesor);
//                Estudiante estudiante = new Estudiante(id_estudiante, "", "", curso);
//
//                Notas nota = new Notas(0, nota_1, nota_2, nota_3, estudiante, curso);
//                boolean resultado = conexion.insert_nota(nota);
//
//                notaFinal(nota_1, nota_2, nota_3);
//
//                if (resultado == true) {
//                    JOptionPane.showMessageDialog(null, "NOTAS INSERTADAS CORRECTAMENTE");
//                    cargar_tabla_notas();
//                    conexion.cerrar();
//                } else {
//                    JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
//                    LimpiarCampos();
//                }

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LimpiarCampos();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_cursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_cursoItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            combo_estudiante.setEnabled(true);
            combo_estudiante.removeAllItems();
            combo_estudiante.addItem("Seleccionar");
            int id_curso = Integer.parseInt(combo_curso.getSelectedItem().toString());
//            cargar_lista_estudiante(id_curso);
        }

    }//GEN-LAST:event_combo_cursoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_curso;
    private javax.swing.JComboBox combo_estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
        txt_nota_final.setText("");
        txt_resultado.setText("");
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

    // METODO PARA CARGAR JCOMBOBOX CURSOS
//    public void cargar_lista_curso() {
//
//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String query = "";
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT ID_CURSO FROM CURSO";
//
//        System.out.println(query);
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                combo_curso.addItem(rs.getString("ID_CURSO"));
//            }
//            conexion.cerrar();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }

    // METODO PARA CARGAR JCOMBOBOX CON ESTUDIANTES
//    public void cargar_lista_estudiante(int curso) {
//
//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String query = "";
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT ID_ESTUDIANTE FROM ESTUDIANTE WHERE ID_CURSO = " + curso;
//
//        System.out.println(query);
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                combo_estudiante.addItem(rs.getString("ID_ESTUDIANTE"));
//            }
//            conexion.cerrar();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }

    // METODO PARA CARGAR JTABLE DE NOTAS DEL ESTUDIANTE
//    void cargar_tabla_notas() {
//
//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String[] titulos = {"ESTUDIANTE", "CURSO", "NOTA 1", "NOTA 2", "NOTA 3"};
//        String[] registro = new String[5];
//        String query = "";
//
//        modelo = new DefaultTableModel(null, titulos);
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT (E.NOMBRE_ESTUDIANTE||\"  \"|| E.APELLIDO_ESTUDIANTE) AS NOMBRE ,C.NOMBRE_CURSO,N.NOTA_1,N.NOTA_2, N.NOTA_3 "
//                + "FROM NOTAS N, CURSO C , ESTUDIANTE E "
//                + "WHERE N.ID_ESTUDIANTE = E.ID_ESTUDIANTE "
//                + "AND N.ID_CURSO = C.ID_CURSO; ";
//
//        System.out.println(query);
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//
//                registro[0] = rs.getString("NOMBRE");
//                registro[1] = rs.getString("NOMBRE_CURSO");
//                registro[2] = rs.getString("NOTA_1");
//                registro[3] = rs.getString("NOTA_2");
//                registro[4] = rs.getString("NOTA_3");
//
//                modelo.addRow(registro);
//            }
//            txt_tabla_notas.setModel(modelo);
//
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, ex);
//
//        }
//    }

    // METODO PARA DEFINIR NOTA FINAL DEL ESTUDIANTE
    public void notaFinal(double nota1, double nota2, double nota3) {

        double notaFinal = ((nota1*0.30) + (nota2*0.30) + (nota3*0.40));
        double redondear = Math.rint(notaFinal * 100) / 100;
        txt_nota_final.setText("" + redondear);

        if (notaFinal >= 3.0) {
            txt_resultado.setText("APROBO");
        } else {
            txt_resultado.setText("REPROBO");
        }

    }

}
