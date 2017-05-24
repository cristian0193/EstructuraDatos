package Vistas;

import Conexion.ConexioSQLite;
import static Vistas.Bares.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cuenta extends javax.swing.JDialog {

    public static String valor = "", idPrducto = "", descripcion = "",numero_cuenta="";
    public static DefaultTableModel modeloCuenta;
    public static double sumaProductos = 0.0;
    public static int confirmacion = 0;

    String filas[][] = {};
    String columnas[] = {"ID", "DESCRIPCION", "PRECIO", "CANTIDAD", "TOTAL"};

    public Cuenta(java.awt.Frame parent, boolean modal, String idMesa) {
        super(parent, modal);
        initComponents();
        valor = idMesa;
        this.txt_id_mesa.setText(valor);
        this.setLocationRelativeTo(null);
        cargar_lista_clientes();
        cargar_lista_usuarios();

        modeloCuenta = new DefaultTableModel(filas, columnas);
        tabla_cuenta_productos.setModel(modeloCuenta);
        //actualizar_total();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_mesa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_cliente = new javax.swing.JComboBox();
        combo_usuario = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuenta_productos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_iva = new javax.swing.JTextField();
        txt_sub_total = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_crear_cuenta = new javax.swing.JButton();
        btn_calcular_total = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        btn_anadir_productos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_debe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cambio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUENTA");

        jLabel2.setText("ID MESA :");

        txt_id_mesa.setEditable(false);
        txt_id_mesa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_id_mesa.setForeground(new java.awt.Color(255, 0, 0));
        txt_id_mesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel3.setText("Cliente :");

        combo_cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        combo_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        jLabel4.setText("Usuario :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_usuario, 0, 283, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        tabla_cuenta_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_cuenta_productos.setRowHeight(25);
        tabla_cuenta_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabla_cuenta_productosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_cuenta_productos);

        jLabel5.setText("SUBTOTAL :");

        jLabel6.setText("IVA 19% :");

        jLabel7.setText("TOTAL : ");

        txt_iva.setEditable(false);
        txt_iva.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_iva.setForeground(new java.awt.Color(255, 0, 0));
        txt_iva.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txt_sub_total.setEditable(false);
        txt_sub_total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_sub_total.setForeground(new java.awt.Color(255, 0, 0));
        txt_sub_total.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_total.setForeground(new java.awt.Color(255, 0, 0));
        txt_total.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_crear_cuenta.setBackground(new java.awt.Color(255, 153, 0));
        btn_crear_cuenta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_crear_cuenta.setText("Crear Cuenta");
        btn_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_cuentaActionPerformed(evt);
            }
        });

        btn_calcular_total.setBackground(new java.awt.Color(51, 255, 51));
        btn_calcular_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_calcular_total.setText("Facturar Productos");
        btn_calcular_total.setEnabled(false);
        btn_calcular_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_totalActionPerformed(evt);
            }
        });

        btn_pagar.setBackground(new java.awt.Color(102, 255, 255));
        btn_pagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_pagar.setText("Pagar");
        btn_pagar.setEnabled(false);
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        btn_anadir_productos.setBackground(new java.awt.Color(51, 51, 255));
        btn_anadir_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_anadir_productos.setText("Añadir Productos");
        btn_anadir_productos.setEnabled(false);
        btn_anadir_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadir_productosActionPerformed(evt);
            }
        });

        jLabel8.setText("DEBE :");

        txt_debe.setEditable(false);
        txt_debe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_debe.setForeground(new java.awt.Color(51, 255, 0));
        txt_debe.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel9.setText("CAMBIO:");

        txt_cambio.setEditable(false);
        txt_cambio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cambio.setForeground(new java.awt.Color(51, 255, 0));
        txt_cambio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cambio.setToolTipText("");
        txt_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_crear_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt_iva, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_sub_total, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(120, 120, 120)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(btn_calcular_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btn_anadir_productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txt_debe, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(315, 315, 315)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_id_mesa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sub_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_anadir_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_calcular_total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_iva, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_debe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(btn_crear_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anadir_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadir_productosActionPerformed

        new Productos(null, true, valor).setVisible(true);

    }//GEN-LAST:event_btn_anadir_productosActionPerformed

    private void btn_calcular_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_totalActionPerformed

        try {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            confirmacion = 0;

            String idMesa = txt_id_mesa.getText();
            String clienteSeleccionado = combo_cliente.getSelectedItem().toString();
            String usuarioSeleccionado = combo_usuario.getSelectedItem().toString();

            char idCliente = clienteSeleccionado.charAt(0);
            char idUsuario = usuarioSeleccionado.charAt(0);

            String idCli = String.valueOf(idCliente);
            String idUsu = String.valueOf(idUsuario);

            numero_cuenta = conexion.consultaNumeroCuenta(idMesa, idCli, idUsu);
            
            for (int i = 0; i < modeloCuenta.getRowCount(); i++) {
                String idProducto = modeloCuenta.getValueAt(i, 0).toString();
                String cantidad = modeloCuenta.getValueAt(i, 3).toString();                
                confirmacion += conexion.ingresarProductos(cantidad, idProducto, idMesa, idCli, idUsu);
            }

            if (confirmacion >= 1) {
                JOptionPane.showMessageDialog(null, "PRODUCTOS FACTURADOS", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_calcular_totalActionPerformed

    private void btn_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_cuentaActionPerformed

        try {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String idMesa = txt_id_mesa.getText();
            String clienteSeleccionado = combo_cliente.getSelectedItem().toString();
            String usuarioSeleccionado = combo_usuario.getSelectedItem().toString();

            if (clienteSeleccionado.equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
            } else if (usuarioSeleccionado.equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Seleccione un Usuario");
            } else {
                char idCliente = clienteSeleccionado.charAt(0);
                char idUsuario = usuarioSeleccionado.charAt(0);

                String idCli = String.valueOf(idCliente);
                String idUsu = String.valueOf(idUsuario);

                confirmacion = conexion.crearCuenta(idMesa, idCli, idUsu);

                if (confirmacion == 1) {
                    btn_anadir_productos.setEnabled(true);
                    btn_calcular_total.setEnabled(true);
                    btn_pagar.setEnabled(true);
                    btn_crear_cuenta.setEnabled(false);
                    combo_cliente.setEnabled(false);
                    combo_usuario.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "CUENTA CREADA", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_crear_cuentaActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed

        double adeudado = 0.0, cambio = 0.0;
        
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a Pagar :"));
        double total = Double.parseDouble(txt_total.getText());
        
        if(pago < total ){
            adeudado = pago - total;
            txt_debe.setText("$ "+adeudado);            
        }else if (pago > total){
            cambio = pago - total;
            txt_cambio.setText("$ "+cambio);
        }else{

             new Factura(null, true, numero_cuenta).setVisible(true);
        }
        
        
        


    }//GEN-LAST:event_btn_pagarActionPerformed

    private void tabla_cuenta_productosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_cuenta_productosMouseEntered

        double iva = 0.0;
        double total = 0.0;

        int totalRow = tabla_cuenta_productos.getRowCount();
        totalRow -= 1;
        for (int i = 0; i <= (totalRow); i++) {
            double sumatoria = Double.parseDouble(String.valueOf(tabla_cuenta_productos.getValueAt(i, 4)));
            sumaProductos += sumatoria;
        }

        iva = (sumaProductos * 0.19);
        total = sumaProductos + iva;

        txt_sub_total.setText("$ " + sumaProductos);
        txt_iva.setText("$ " + iva);
        txt_total.setText("$ " + total);


    }//GEN-LAST:event_tabla_cuenta_productosMouseEntered

    private void txt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cambioActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Cuenta dialog = new Cuenta(new javax.swing.JFrame(), true, valor);
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
    private javax.swing.JButton btn_anadir_productos;
    private javax.swing.JButton btn_calcular_total;
    private javax.swing.JButton btn_crear_cuenta;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JComboBox combo_cliente;
    private javax.swing.JComboBox combo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_cuenta_productos;
    public javax.swing.JTextField txt_cambio;
    public javax.swing.JTextField txt_debe;
    private javax.swing.JTextField txt_id_mesa;
    public javax.swing.JTextField txt_iva;
    public javax.swing.JTextField txt_sub_total;
    public javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

// METODO PARA CARGAR JCOMBOBOX CLIENTES
    public void cargar_lista_clientes() {

        try {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();
            try {
                ResultSet resultado = null;

                resultado = conexion.consultaClientes();

                while (resultado.next()) {
                    combo_cliente.addItem(resultado.getString("cliente"));
                }
                conexion.cerrar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Bares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX USUARIOS
    public void cargar_lista_usuarios() {

        try {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();
            try {
                ResultSet resultado = null;

                resultado = conexion.consultaUsuario();

                while (resultado.next()) {
                    combo_usuario.addItem(resultado.getString("usuario"));
                }
                conexion.cerrar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Bares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
