package Vista;

import Control.CRUD_Cursos;
import Control.CRUD_Profesores;
import Control.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Christian Rodriguez
 */
public class ConsultarCursosProfesor extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public ConsultarCursosProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_profesor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_id_profesor = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas_cursos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR CURSOS DEL PROFESOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 45));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ID CURSO :");

        combo_id_profesor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

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
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_id_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(combo_id_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 580, -1));

        tablas_cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablas_cursos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 580, 183));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int opcion = Integer.parseInt(combo_id_profesor.getSelectedItem().toString());

        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONAR UN CODIGO DE PROFESOR");
        } else {
            cargar_tabla_curso(opcion);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_id_profesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablas_cursos;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR JCOMBOBOX PROFESOR
    public void cargar_lista_profesor() {

       try {
            ResultSet rs = CRUD_Profesores.Consultar_Profesores();

            while (rs.next()) {
                combo_id_profesor.addItem(rs.getString("ID_PROFESOR"));
            }
            ConexionMySQL.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JTABLE CURSOS
    void cargar_tabla_curso(int id_profesor) {

        String[] titulos = {"ID", "NOMBRE", "CREDITOS", "ACTIVIDAD"};
        String[] registro = new String[4];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        System.out.println(query);
        try {
            ResultSet rs = CRUD_Cursos.Consultar_Curso_Profesor(id_profesor);

            while (rs.next()) {

                registro[0] = rs.getString("ID_CURSOS");
                registro[1] = rs.getString("NOMBRE_CURSO");
                registro[2] = rs.getString("NUMERO_CREDITOS");
                registro[3] = rs.getString("ACTIVIDAD_CURSOS");

                modelo.addRow(registro);
            }
            tablas_cursos.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
