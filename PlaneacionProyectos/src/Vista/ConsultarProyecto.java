package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarProyecto extends javax.swing.JDialog {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;      

    public ConsultarProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
        ancho_columnas();             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menu_tabla = new javax.swing.JMenuItem();
        menu_tabla2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txt_id_proyecto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo_proyecto = new javax.swing.JTextField();
        txt_palabra_clave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_valor_menor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_valor_mayor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo_filtro = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_consulta_proyecto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };

        menu_tabla.setText("Ingresar Detalle");
        menu_tabla.setToolTipText("");
        menu_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tablaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_tabla);

        menu_tabla2.setText("Consultar Detalle");
        menu_tabla2.setToolTipText("");
        menu_tabla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tabla2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_tabla2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE PROYECTO");

        txt_id_proyecto.setEditable(false);
        txt_id_proyecto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_proyecto.setForeground(new java.awt.Color(255, 51, 51));
        txt_id_proyecto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_proyectoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Consulta"));

        jLabel2.setText("Codigo Proyecto :");

        txt_codigo_proyecto.setEditable(false);

        txt_palabra_clave.setEditable(false);

        jLabel3.setText("Palabra Clave :");

        jLabel4.setText("Valor Menor :");

        txt_valor_menor.setEditable(false);

        jLabel5.setText("Valor Mayor :");

        txt_valor_mayor.setEditable(false);

        jLabel6.setText("Filtro :");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "CODIGO", "PALABRA CLAVE", "RANGO", "TODOS" }));
        combo_filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_filtroItemStateChanged(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Refrescar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_palabra_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valor_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valor_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_codigo_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_valor_menor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_valor_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_palabra_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_consulta_proyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE PROYECTO", "CAPEX INGRESADO", "CAPEX UTILIZADO", "DIFERENCIA"
            }
        ));
        tabla_consulta_proyecto.setComponentPopupMenu(jPopupMenu1);
        tabla_consulta_proyecto.setRowHeight(25);
        tabla_consulta_proyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_consulta_proyectoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_consulta_proyecto);
        if (tabla_consulta_proyecto.getColumnModel().getColumnCount() > 0) {
            tabla_consulta_proyecto.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_consulta_proyecto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_consulta_proyecto.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_consulta_proyecto.getColumnModel().getColumn(1).setMinWidth(570);
            tabla_consulta_proyecto.getColumnModel().getColumn(1).setPreferredWidth(570);
            tabla_consulta_proyecto.getColumnModel().getColumn(1).setMaxWidth(570);
            tabla_consulta_proyecto.getColumnModel().getColumn(2).setMinWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(2).setMaxWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(3).setMinWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(3).setPreferredWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(3).setMaxWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(4).setMinWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(4).setPreferredWidth(170);
            tabla_consulta_proyecto.getColumnModel().getColumn(4).setMaxWidth(170);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_id_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_proyectoActionPerformed

    private void tabla_consulta_proyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_consulta_proyectoMouseClicked

        int rec = this.tabla_consulta_proyecto.getSelectedRow();

        if (rec == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            String valor = tabla_consulta_proyecto.getValueAt(rec, 0).toString();
            txt_id_proyecto.setText(valor);
        }


    }//GEN-LAST:event_tabla_consulta_proyectoMouseClicked

    private void menu_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tablaActionPerformed

        int rec = this.tabla_consulta_proyecto.getSelectedRow();
        String valor = tabla_consulta_proyecto.getValueAt(rec, 0).toString();
        new PrerequsitosProyectos(null, true, valor).setVisible(true);
    }//GEN-LAST:event_menu_tablaActionPerformed

    private void menu_tabla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tabla2ActionPerformed
        int rec = this.tabla_consulta_proyecto.getSelectedRow();
        String valor = tabla_consulta_proyecto.getValueAt(rec, 0).toString();
        new ConsultaDetalladaProyecto(null, true, valor).setVisible(true);
    }//GEN-LAST:event_menu_tabla2ActionPerformed

    private void combo_filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_filtroItemStateChanged

        int opcion = combo_filtro.getSelectedIndex();

        if (opcion == 1) {
            txt_codigo_proyecto.setEditable(true);
            txt_palabra_clave.setEditable(false);
            txt_valor_menor.setEditable(false);
            txt_valor_mayor.setEditable(false);
        } else if (opcion == 2) {
            txt_codigo_proyecto.setEditable(false);
            txt_palabra_clave.setEditable(true);
            txt_valor_menor.setEditable(false);
            txt_valor_mayor.setEditable(false);
        } else if (opcion == 3) {
            txt_codigo_proyecto.setEditable(false);
            txt_palabra_clave.setEditable(false);
            txt_valor_menor.setEditable(true);
            txt_valor_mayor.setEditable(true);
        }


    }//GEN-LAST:event_combo_filtroItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int index = combo_filtro.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una Opcion");
        } else if (index == 1) {

            String codigo = txt_codigo_proyecto.getText();

            if (isNumeric(codigo) == false) {
                JOptionPane.showMessageDialog(null, "INGRESE UN VALOR NUMERICO");
            } else if (codigo.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE EL CODIGO");
            } else {
                consuta_tabla_id(codigo);
                ancho_columnas();
            }

        } else if (index == 2) {

            String palabra = txt_palabra_clave.getText();

            if (palabra.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE PALABRA CLAVE");
            } else {
                consuta_tabla_palabra(palabra);
            }

        } else if (index == 3) {

            String minimo = txt_valor_menor.getText();
            String maximo = txt_valor_mayor.getText();

            if (isNumeric(minimo) == false || isNumeric(maximo) == false) {
                JOptionPane.showMessageDialog(null, "INGRESE UN VALOR NUMERICO");
            } else if (minimo.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE EL VALOR MINIMO");
            } else if (maximo.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE EL VALOR MAXIMO");
            } else {
                consuta_tabla_rango(minimo, maximo);
                ancho_columnas();
            }

        } else {
            txt_codigo_proyecto.setEditable(false);
            txt_palabra_clave.setEditable(false);
            txt_valor_mayor.setEditable(false);
            txt_valor_menor.setEditable(false);
            cargar_tabla();
            ancho_columnas();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargar_tabla();
        ancho_columnas();
    }//GEN-LAST:event_jButton3ActionPerformed

//    
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
//            java.util.logging.Logger.getLogger(ConsultarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConsultarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConsultarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConsultarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ConsultarProyecto dialog = new ConsultarProyecto(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox combo_filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_tabla;
    private javax.swing.JMenuItem menu_tabla2;
    private javax.swing.JTable tabla_consulta_proyecto;
    private javax.swing.JTextField txt_codigo_proyecto;
    private javax.swing.JTextField txt_id_proyecto;
    private javax.swing.JTextField txt_palabra_clave;
    private javax.swing.JTextField txt_valor_mayor;
    private javax.swing.JTextField txt_valor_menor;
    // End of variables declaration//GEN-END:variables

    //METODO PARA VALIDAR DATO NUMERICO O NO NUMERICO
    private boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public String convertirValor(String numero) {
        String convertido = "";
        double valor = Double.parseDouble(numero);
        DecimalFormat formatear = new DecimalFormat("###,###,###,###,###,###,###.##");
        convertido = formatear.format(valor);

        return convertido;
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "DESCRIPCION", "CAPEX", "CAPEX ACTUAL", "DIFERENCIA", "ESTADO"};
        String[] registro = new String[6];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "DESCRIPCION, "
                + "CAPEX, "
                + "CAPEX_ACTUAL, "
                + "DIFERENCIA, "
                + "ESTADO "
                + "FROM "
                + "PROYECTOS "
                + "WHERE ESTADO = 'EN EJECUCION';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("DESCRIPCION");
                registro[2] = convertirValor(rs.getString("CAPEX"));
                registro[3] = convertirValor(rs.getString("CAPEX_ACTUAL"));
                registro[4] = convertirValor(rs.getString("DIFERENCIA"));
                registro[5] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_consulta_proyecto.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR TABLA POR ID
    public void consuta_tabla_id(String numero) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "DESCRIPCION", "CAPEX", "CAPEX ACTUAL", "DIFERENCIA", "ESTADO"};
        String[] registro = new String[6];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "DESCRIPCION, "
                + "CAPEX, "
                + "CAPEX_ACTUAL, "
                + "DIFERENCIA, "
                + "ESTADO "
                + "FROM "
                + "PROYECTOS "
                + "WHERE "
                + "ESTADO = 'EN EJECUCION' "
                + "AND ID = " + numero;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("DESCRIPCION");
                registro[2] = convertirValor(rs.getString("CAPEX"));
                registro[3] = convertirValor(rs.getString("CAPEX_ACTUAL"));
                registro[4] = convertirValor(rs.getString("DIFERENCIA"));
                registro[5] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_consulta_proyecto.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR TABLA POR ID
    public void consuta_tabla_palabra(String palabra) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "DESCRIPCION", "CAPEX", "CAPEX ACTUAL", "DIFERENCIA", "ESTADO"};
        String[] registro = new String[6];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "DESCRIPCION, "
                + "CAPEX, "
                + "CAPEX_ACTUAL, "
                + "DIFERENCIA, "
                + "ESTADO "
                + "FROM "
                + "PROYECTOS "
                + "WHERE "
                + "ESTADO = 'EN EJECUCION' AND "
                + "DESCRIPCION LIKE '%" + palabra + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("DESCRIPCION");
                registro[2] = convertirValor(rs.getString("CAPEX"));
                registro[3] = convertirValor(rs.getString("CAPEX_ACTUAL"));
                registro[4] = convertirValor(rs.getString("DIFERENCIA"));
                registro[5] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_consulta_proyecto.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR TABLA POR ID
    public void consuta_tabla_rango(String rangoMin, String rangoMax) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "DESCRIPCION", "CAPEX", "CAPEX ACTUAL", "DIFERENCIA", "ESTADO"};
        String[] registro = new String[6];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "DESCRIPCION, "
                + "CAPEX, "
                + "CAPEX_ACTUAL, "
                + "DIFERENCIA, "
                + "ESTADO "
                + "FROM "
                + "PROYECTOS "
                + "WHERE "
                + " ESTADO = 'EN EJECUCION' AND"
                + "(CAPEX >= " + rangoMin + " "
                + "AND "
                + "CAPEX <= " + rangoMax + ")";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("DESCRIPCION");
                registro[2] = convertirValor(rs.getString("CAPEX"));
                registro[3] = convertirValor(rs.getString("CAPEX_ACTUAL"));
                registro[4] = convertirValor(rs.getString("DIFERENCIA"));
                registro[5] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_consulta_proyecto.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void ancho_columnas() {
        tabla_consulta_proyecto.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_consulta_proyecto.getColumnModel().getColumn(1).setPreferredWidth(500);
        tabla_consulta_proyecto.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla_consulta_proyecto.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_consulta_proyecto.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabla_consulta_proyecto.getColumnModel().getColumn(5).setPreferredWidth(150);
    }
    
    
   
}
