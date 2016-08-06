package Vista;

import Conexion.ConexioSQLite;
import static Vista.Reprogramacion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProgramacionSemanal extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    
    public ProgramacionSemanal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_semana = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_programadas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reprogramadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_no_programada = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION SEMANAL");

        combo_semana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_programadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_programadas.setEnabled(false);
        jScrollPane2.setViewportView(tabla_programadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reprogramadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_reprogramadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_reprogramadas.setEnabled(false);
        jScrollPane1.setViewportView(tabla_reprogramadas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Semana :");

        jButton1.setBackground(new java.awt.Color(102, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Refrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "No Programadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_no_programada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_no_programada.setEnabled(false);
        jScrollPane4.setViewportView(tabla_no_programada);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_semana)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int index = combo_semana.getSelectedIndex();
        
        if(index == 0){
            JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION");
        }else{
            String semana = combo_semana.getSelectedItem().toString();
            cargar_tabla_programadas(semana);
            cargar_tabla_reprogramadas(semana);
            cargar_tabla_noprogramadas(semana);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_semana;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_no_programada;
    private javax.swing.JTable tabla_programadas;
    private javax.swing.JTable tabla_reprogramadas;
    private javax.swing.JTable tabla_reprogramadas1;
    // End of variables declaration//GEN-END:variables

void cargar_tabla_programadas(String SEMANA) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER","PLANTA", "MAQUINA","LOTE", "TURNO", "ESTADO", "FECHA"};
        String[] registro = new String[10];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "                
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "ESTADO_PROYECTO AS ESTADO, "               
                + "FECHA_PROPUESTA AS FECHA_ACTUAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Programado' "
                + "AND SEMANA = " + SEMANA + " "               
                + "ORDER BY FECHA_PROPUESTA ASC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("GCC");
                registro[1] = rs.getString("PROYECTO");
                registro[2] = rs.getString("TIPO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("PLANTA");
                registro[5] = rs.getString("MAQUINA");
                registro[6] = rs.getString("LOTE");
                registro[7] = rs.getString("TURNO");
                registro[8] = rs.getString("ESTADO");
                registro[9] = rs.getString("FECHA_ACTUAL");

                modelo.addRow(registro);
            }
            tabla_programadas.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

void cargar_tabla_reprogramadas(String SEMANA) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER","PLANTA", "MAQUINA","LOTE", "TURNO", "ESTADO", "FECHA"};
        String[] registro = new String[10];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "                
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "ESTADO_PROYECTO AS ESTADO, "               
                + "FECHA_REPROGRAMACION AS FECHA "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Reprogramado' "
                + "AND SEMANA = " + SEMANA + " "               
                + "ORDER BY FECHA_REPROGRAMACION ASC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("GCC");
                registro[1] = rs.getString("PROYECTO");
                registro[2] = rs.getString("TIPO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("PLANTA");
                registro[5] = rs.getString("MAQUINA");
                registro[6] = rs.getString("LOTE");
                registro[7] = rs.getString("TURNO");
                registro[8] = rs.getString("ESTADO");
                registro[9] = rs.getString("FECHA");

                modelo.addRow(registro);
            }
            tabla_reprogramadas.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

void cargar_tabla_noprogramadas(String SEMANA) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER","PLANTA", "MAQUINA","LOTE", "TURNO", "ESTADO", "FECHA"};
        String[] registro = new String[10];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "                
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "ESTADO_PROYECTO AS ESTADO, "               
                + "FECHA_REPROGRAMACION AS FECHA "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'No Programada' "
                + "AND SEMANA = " + SEMANA + " "               
                + "ORDER BY FECHA_REPROGRAMACION ASC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("GCC");
                registro[1] = rs.getString("PROYECTO");
                registro[2] = rs.getString("TIPO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("PLANTA");
                registro[5] = rs.getString("MAQUINA");
                registro[6] = rs.getString("LOTE");
                registro[7] = rs.getString("TURNO");
                registro[8] = rs.getString("ESTADO");
                registro[9] = rs.getString("FECHA");

                modelo.addRow(registro);
            }
            tabla_no_programada.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
}
