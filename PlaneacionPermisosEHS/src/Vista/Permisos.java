package Vista;

import java.sql.Connection;
import Conexion.ConexioSQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Permisos extends javax.swing.JDialog {

    public static String valor;
    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public Permisos(java.awt.Frame parent, boolean modal, String numero) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor = numero;
        this.txt_id_general.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_general = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        chk_alturas = new javax.swing.JCheckBox();
        chk_caliente = new javax.swing.JCheckBox();
        chk_excavacion = new javax.swing.JCheckBox();
        chk_loto = new javax.swing.JCheckBox();
        chk_espacio_confinado = new javax.swing.JCheckBox();
        chk_mani_carga = new javax.swing.JCheckBox();
        chk_safery_bypass = new javax.swing.JCheckBox();
        chk_area_clasificadas = new javax.swing.JCheckBox();
        chk_ructura_linea = new javax.swing.JCheckBox();
        chk_sin_riesgo = new javax.swing.JCheckBox();
        chk_mani_carga_critica = new javax.swing.JCheckBox();
        chk_fuera_servicio = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR PERMISOS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Permiso General:");

        txt_id_general.setEditable(false);
        txt_id_general.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_id_general.setForeground(new java.awt.Color(255, 0, 0));
        txt_id_general.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Permisos Asociados"));

        chk_alturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_alturas.setText("ALTURAS");

        chk_caliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_caliente.setText("CALIENTE");

        chk_excavacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_excavacion.setText("EXCAVACIÓN");

        chk_loto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_loto.setText("LOTO");
        chk_loto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_lotoActionPerformed(evt);
            }
        });

        chk_espacio_confinado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_espacio_confinado.setText("ESPACIOS CONFINADOS");
        chk_espacio_confinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_espacio_confinadoActionPerformed(evt);
            }
        });

        chk_mani_carga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_mani_carga.setText("MANIPULACIÓN DE CARGA");
        chk_mani_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_mani_cargaActionPerformed(evt);
            }
        });

        chk_safery_bypass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_safery_bypass.setText("SAFERY BYPASS");
        chk_safery_bypass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_safery_bypassActionPerformed(evt);
            }
        });

        chk_area_clasificadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_area_clasificadas.setText("AREAS CLASIFICADAS");
        chk_area_clasificadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_area_clasificadasActionPerformed(evt);
            }
        });

        chk_ructura_linea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_ructura_linea.setText("ROCTURA DE LINEA");
        chk_ructura_linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ructura_lineaActionPerformed(evt);
            }
        });

        chk_sin_riesgo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_sin_riesgo.setText("SIN RIESGO");
        chk_sin_riesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_sin_riesgoActionPerformed(evt);
            }
        });

        chk_mani_carga_critica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_mani_carga_critica.setText("MANIPULACIÓN DE CARGA CRITICA");
        chk_mani_carga_critica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_mani_carga_criticaActionPerformed(evt);
            }
        });

        chk_fuera_servicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chk_fuera_servicio.setText("FUERA DE SERVICIO RED CONTRAINCENDIO");
        chk_fuera_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_fuera_servicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_fuera_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chk_mani_carga_critica, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_sin_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_ructura_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_area_clasificadas, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_safery_bypass, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_mani_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_espacio_confinado, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_loto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_excavacion, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_caliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_alturas, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(chk_alturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_caliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_excavacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_loto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_espacio_confinado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_mani_carga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_safery_bypass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_area_clasificadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_ructura_linea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_sin_riesgo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_mani_carga_critica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_fuera_servicio)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generar Codigo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_general, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_general, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_lotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_lotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_lotoActionPerformed

    private void chk_espacio_confinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_espacio_confinadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_espacio_confinadoActionPerformed

    private void chk_mani_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_mani_cargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_mani_cargaActionPerformed

    private void chk_safery_bypassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_safery_bypassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_safery_bypassActionPerformed

    private void chk_area_clasificadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_area_clasificadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_area_clasificadasActionPerformed

    private void chk_ructura_lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_ructura_lineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_ructura_lineaActionPerformed

    private void chk_sin_riesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_sin_riesgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_sin_riesgoActionPerformed

    private void chk_mani_carga_criticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_mani_carga_criticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_mani_carga_criticaActionPerformed

    private void chk_fuera_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_fuera_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_fuera_servicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String permiso = "", mensaje = "";

        if (!chk_alturas.isSelected() && !chk_area_clasificadas.isSelected() && !chk_caliente.isSelected()
                && !chk_espacio_confinado.isSelected() && !chk_excavacion.isSelected()
                && !chk_fuera_servicio.isSelected() && !chk_loto.isSelected() && !chk_mani_carga.isSelected()
                && !chk_mani_carga_critica.isSelected() && !chk_ructura_linea.isSelected()
                && !chk_safery_bypass.isSelected() && !chk_sin_riesgo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        }
        if (chk_alturas.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PA");

            insertarPermisosEHS("ALTURAS", valor, "" + cantidad, "PA", "Solicitado");
            permiso += "ID ALTURA : " + cantidad + "\n";
        }

        if (chk_caliente.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PC");

            insertarPermisosEHS("CALIENTE", valor, "" + cantidad, "PC", "Solicitado");
            permiso += "ID CALIENTE : " + cantidad + "\n";
        }

        if (chk_excavacion.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PE");

            insertarPermisosEHS("EXCAVACION", valor, "" + cantidad, "PE", "Solicitado");
            permiso += "ID EXCAVACION : " + cantidad + "\n";
        }

        if (chk_loto.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PL");

            insertarPermisosEHS("LOTO", valor, "" + cantidad, "PL", "Solicitado");
            permiso += "ID LOTO : " + cantidad + "\n";
        }

        if (chk_espacio_confinado.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PEC");

            insertarPermisosEHS("ESPACIO CONFINADO", valor, "" + cantidad, "PEC", "Solicitado");
            permiso += "ID ESPACIO CONFINADO : " + cantidad + "\n";
        }

        if (chk_mani_carga.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PMC");

            insertarPermisosEHS("MANIPULACION DE CARGA", valor, "" + cantidad, "PMC", "Solicitado");
            permiso += "ID MANIPULACION DE CARGA : " + cantidad + "\n";
        }

        if (chk_safery_bypass.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PSB");

            insertarPermisosEHS("SAFERY BYPASS", valor, "" + cantidad, "PSB", "Solicitado");
            permiso += "ID SAFERY BYPASS : " + cantidad + "\n";
        }

        if (chk_area_clasificadas.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PAC");

            insertarPermisosEHS("AREA CLASIFICADA", valor, "" + cantidad, "PAC", "Solicitado");
            permiso += "ID AREA CLASIFICADA : " + cantidad + "\n";
        }

        if (chk_ructura_linea.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PRL");

            insertarPermisosEHS("RUCTURA LINEA", valor, "" + cantidad, "PRL", "Solicitado");
            permiso += "ID RUCTURA LINEA : " + cantidad + "\n";
        }

        if (chk_sin_riesgo.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PSR");

            insertarPermisosEHS("SIN RIESGO", valor, "" + cantidad, "PSR", "Solicitado");
            permiso += "ID SIN RIESGO : " + cantidad + "\n";
        }

        if (chk_mani_carga_critica.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PMCC");

            insertarPermisosEHS("MANIPULACION DE CARGA CRITICA ", valor, "" + cantidad, "PMCC", "Solicitado");
            permiso += "ID MANIPULACION DE CARGA CRITICA : " + cantidad + "\n";
        }

        if (chk_fuera_servicio.isSelected()) {
            int cantidad = 0;
            cantidad = contador_id_permisos("PFSRC");

            insertarPermisosEHS("FUERA SERVICIO RED CONTRAINCENDIO", valor, "" + cantidad, "PFSRC", "Solicitado");
            permiso += "ID FUERA SERVICIO RED CONTRAINCENDIO : " + cantidad + "\n";
        }

            mensaje = permiso;
            JOptionPane.showMessageDialog(null, mensaje);

            JOptionPane.showMessageDialog(null, "PERMISOS CREADOS EXITOSAMENTE");
            LimpiarCampos();
            this.hide();
        


    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk_alturas;
    private javax.swing.JCheckBox chk_area_clasificadas;
    private javax.swing.JCheckBox chk_caliente;
    private javax.swing.JCheckBox chk_espacio_confinado;
    private javax.swing.JCheckBox chk_excavacion;
    private javax.swing.JCheckBox chk_fuera_servicio;
    private javax.swing.JCheckBox chk_loto;
    private javax.swing.JCheckBox chk_mani_carga;
    private javax.swing.JCheckBox chk_mani_carga_critica;
    private javax.swing.JCheckBox chk_ructura_linea;
    private javax.swing.JCheckBox chk_safery_bypass;
    private javax.swing.JCheckBox chk_sin_riesgo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_id_general;
    // End of variables declaration//GEN-END:variables

    //METODO PARA LIMPIAR LOS CAMPOS 
    public void LimpiarCampos() {
        chk_alturas.enable(false);
        chk_caliente.enable(false);
        chk_excavacion.enable(false);
        chk_loto.enable(false);
        chk_espacio_confinado.enable(false);
        chk_mani_carga.enable(false);
        chk_safery_bypass.enable(false);
        chk_area_clasificadas.enable(false);
        chk_ructura_linea.enable(false);
        chk_sin_riesgo.enable(false);
        chk_mani_carga_critica.enable(false);
        chk_fuera_servicio.enable(false);

    }

    public int contador_id_permisos(String indicador) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int contador_permiso = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT COUNT(ID_PERMISO) AS CONT_PERMISO \n "
                + " FROM PERMISOS\n "
                + " WHERE INDICADOR_PERMISO = '" + indicador + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            contador_permiso = Integer.parseInt(rs.getString("CONT_PERMISO")) + 1;
            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return contador_permiso;

    }

    public void insertarPermisosEHS(String NOMBRE_PERMISO,
            String ID_GENERAL,
            String ID_PERMISO,
            String INDICADOR_PERMISO,
            String ESTADO) {

        // REGISTRO DE LA CALIFICACION
        boolean resultado = conexion.insertPermiso(NOMBRE_PERMISO, ID_GENERAL, ID_PERMISO, INDICADOR_PERMISO, ESTADO);

        if (resultado == true) {
            conexion.cerrar();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
            LimpiarCampos();
        }
    }

}
