package Vista;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AsigarEstudiantesCursosProfesor extends javax.swing.JFrame {

//    public static ConexioSQLite conexion;
    DefaultTableModel modelo;

    public AsigarEstudiantesCursosProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_matricula();
        cargar_tabla_matricula();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_matriculados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_estudiante = new javax.swing.JTextField();
        txt_nombre_estudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_cursos = new javax.swing.JComboBox();
        txt_apellido_estudiante = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATRICULAR ESTUDIANTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, 45));

        tabla_matriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_matriculados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 756, 148));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ID ESTUDIANTE :");

        jLabel3.setText("NOMBRE ESTUDIANTE :");

        jLabel4.setText("APELLIDO ESTUDIANTE:");

        jLabel5.setText("CURSOS ASIGNADO:");

        combo_cursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txt_nombre_estudiante))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellido_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 756, -1));

        jButton1.setText("Matricular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 389, 112, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_id_estudiante.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE ID ESTUDIANTE ");
        } else if (txt_nombre_estudiante.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE NOMBRE ESTUDIANTE ");
        } else if (txt_apellido_estudiante.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE APELLIDO ESTUDIANTE ");
        } else if (combo_cursos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL ESTUDIANTE ");
        } else {

//            conexion = new ConexioSQLite();
//            conexion.coneccionbase();
//
//            int id = Integer.parseInt(txt_id_estudiante.getText());
//            String nombre = txt_nombre_estudiante.getText();
//            String apellido = txt_apellido_estudiante.getText();
//            int curso = Integer.parseInt(combo_cursos.getSelectedItem().toString());
//            Profesor profesor = null;
//            Curso objcurso = new Curso(curso, "", 0, "", profesor);
//
//            Estudiante estudiante = new Estudiante(id, nombre.toUpperCase(), apellido.toUpperCase(), objcurso);
//            boolean resultado = conexion.insert_estudiante(estudiante);
//
//            if (resultado == true) {
//                JOptionPane.showMessageDialog(null, "CURSO INSERTADO CORRECTAMENTE");
//
//                int resp = JOptionPane.showConfirmDialog(null, "¿ Desea ingresar Otro curso al mismo estudiante ?", "Informativo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//
//                if (resp == 0) {
//                    combo_cursos.setEnabled(false);
//                    txt_id_estudiante.setText("");
//                    txt_nombre_estudiante.setText("");
//                    txt_apellido_estudiante.setText("");
//                } else {
//                    combo_cursos.setEnabled(true);
//                    LimpiarCampos();
//                }
//
//                cargar_tabla_matricula();
//                conexion.cerrar();
//            } else {
//                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
//                LimpiarCampos();
//            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_cursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_matriculados;
    private javax.swing.JTextField txt_apellido_estudiante;
    private javax.swing.JTextField txt_id_estudiante;
    private javax.swing.JTextField txt_nombre_estudiante;
    // End of variables declaration//GEN-END:variables

    // METODO PARA LIMPIAR LOS CAMPOS
    public void LimpiarCampos() {
        txt_id_estudiante.setText("");
        txt_nombre_estudiante.setText("");
        txt_apellido_estudiante.setText("");
        combo_cursos.setSelectedIndex(0);
    }

    // METODO PARA CARGAR JCOMBOBOX MATRICULA
    public void cargar_lista_matricula() {

//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String query = "";
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT ID_CURSO FROM CURSO ";
//
//        System.out.println(query);
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                combo_cursos.addItem(rs.getString("ID_CURSO"));
//            }
//            conexion.cerrar();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }

    // METODO PARA CARGAR JTABLE DE MATRICULA
    void cargar_tabla_matricula() {

//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String[] titulos = {"ID", "NOMBRE", "APELLIDO", "CURSO"};
//        String[] registro = new String[4];
//        String query = "";
//
//        modelo = new DefaultTableModel(null, titulos);
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT E.ID_ESTUDIANTE, E.NOMBRE_ESTUDIANTE, E.APELLIDO_ESTUDIANTE, C.NOMBRE_CURSO "
//                + "FROM "
//                + "ESTUDIANTE E, CURSO C "
//                + "WHERE E.ID_CURSO = C.ID_CURSO ";
//
//        System.out.println(query);
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//
//                registro[0] = rs.getString("ID_ESTUDIANTE");
//                registro[1] = rs.getString("NOMBRE_ESTUDIANTE");
//                registro[2] = rs.getString("APELLIDO_ESTUDIANTE");
//                registro[3] = rs.getString("NOMBRE_CURSO");
//
//                modelo.addRow(registro);
//            }
//            tabla_matriculados.setModel(modelo);
//
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, ex);
//
//        }
    }
}
