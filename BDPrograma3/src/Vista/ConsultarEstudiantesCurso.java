
package Vista;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Christian Rodriguez
 */
public class ConsultarEstudiantesCurso extends javax.swing.JFrame {

//     public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    
    public ConsultarEstudiantesCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_curso();//INICIO CARGANDO EL JCOMBOBOX DE CURSOS
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_id_curso = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas_estudiantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR ESTUDIANTES DE UN CURSO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 45));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ID CURSO :");

        combo_id_curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_id_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_id_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 580, -1));

        tablas_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablas_estudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 580, 183));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int opcion = Integer.parseInt(combo_id_curso.getSelectedItem().toString());
        
        if(opcion == 0){
            JOptionPane.showMessageDialog(null,"SELECCIONAR UN CODIGO DE PROFESOR");
        }else{
            cargar_tabla_estudiantes(opcion);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_id_curso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablas_estudiantes;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR JCOMBOBOX CURSOS
    public void cargar_lista_curso() {

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
//                combo_id_curso.addItem(rs.getString("ID_CURSO"));
//            }
//            conexion.cerrar();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }
        
    //INICIO CARGANDO LA JTABLE DE LOS ESTUDIANTES
    void cargar_tabla_estudiantes(int id_profesor) {

//        conexion = new ConexioSQLite();
//        conexion.coneccionbase();
//
//        String[] titulos = {"CEDULA", "NOMBRE", "APELLIDO"};
//        String[] registro = new String[3];
//        String query = "";
//
//        modelo = new DefaultTableModel(null, titulos);
//
//        ConexioSQLite con = new ConexioSQLite();
//        Connection cn = con.Conectar();
//
//        query = "SELECT E.ID_ESTUDIANTE, E.NOMBRE_ESTUDIANTE, E.APELLIDO_ESTUDIANTE " +
//                "FROM ESTUDIANTE E, CURSO C " +
//                "WHERE E.ID_CURSO = C.ID_CURSO " +
//                "AND C.ID_CURSO = " + id_profesor;
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
//
//
//                modelo.addRow(registro);
//            }
//            tablas_estudiantes.setModel(modelo);
//
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, ex);
//
//        }
    }


}
