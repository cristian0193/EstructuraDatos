package Vista;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrerequisitoProceso extends javax.swing.JFrame {

    public static ConexioSQLite conexion;

    public PrerequisitoProceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_pre_calificacion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        combo_pre_HFM = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combo_pre_especificacion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combo_pre_test = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        combo_pre_protocolo = new javax.swing.JComboBox();
        combo_pre_materiales = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_pre_DP = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        combo_pre_diagrama = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        combo_pre_FMEA = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        combo_pre_PR = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        combo_pre_PF = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        combo_pre_RM = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        combo_pre_PC = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        combo_pre_CG = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        combo_pre_FP = new javax.swing.JComboBox();
        txt_pre_diagrama = new javax.swing.JTextField();
        txt_pre_FMEA = new javax.swing.JTextField();
        txt_pre_PR = new javax.swing.JTextField();
        txt_pre_PF = new javax.swing.JTextField();
        txt_pre_RM = new javax.swing.JTextField();
        txt_pre_PC = new javax.swing.JTextField();
        txt_pre_CG = new javax.swing.JTextField();
        txt_pre_FP = new javax.swing.JTextField();
        txt_pre_calificacion = new javax.swing.JTextField();
        txt_pre_HFM = new javax.swing.JTextField();
        txt_pre_especificacion = new javax.swing.JTextField();
        txt_pre_test = new javax.swing.JTextField();
        txt_pre_protocolo = new javax.swing.JTextField();
        txt_pre_materiales = new javax.swing.JTextField();
        txt_pre_DP = new javax.swing.JTextField();
        txt_fecha_protocolo = new javax.swing.JTextField();
        txt_fecha_especificacion = new javax.swing.JTextField();
        txt_fecha_metodo = new javax.swing.JTextField();
        txt_fecha_diagrama_proceso = new javax.swing.JTextField();
        txt_fecha_producto = new javax.swing.JTextField();
        txt_fecha_hoja_maestra = new javax.swing.JTextField();
        btn_cargar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_registro_principal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_fecha_propuesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRE-REQUISITOS DE PROCESO");

        btn_actualizar.setBackground(new java.awt.Color(102, 255, 0));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite actualizar la documentacion a estado (Pendiente, Completo, No aplica)");
        btn_actualizar.setEnabled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentacion"));

        jLabel2.setText("Protocolo Oficial :");

        combo_pre_calificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel3.setText("Entrenamiento HFM/SOP/TM :");

        combo_pre_HFM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_HFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_HFMActionPerformed(evt);
            }
        });

        jLabel4.setText("Especificaciones PR/FP/PF emitidas :");

        combo_pre_especificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_especificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_especificacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Métodos de Análisis Emitidos :");

        combo_pre_test.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_testActionPerformed(evt);
            }
        });

        jLabel6.setText("Calificación IQ/OQ/PQ de Equipos :");

        combo_pre_protocolo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_protocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_protocoloActionPerformed(evt);
            }
        });

        combo_pre_materiales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_materialesActionPerformed(evt);
            }
        });

        jLabel7.setText("Calificación CSV :");

        jLabel8.setText("Control de Cambios (En Entregables)/ DP aprobado :");

        combo_pre_DP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_DPActionPerformed(evt);
            }
        });

        jLabel9.setText("Flujograma de proceso oficial :");

        combo_pre_diagrama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel10.setText("FMEA (Matriz de riesgo) oficial :");

        combo_pre_FMEA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_FMEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_FMEAActionPerformed(evt);
            }
        });

        jLabel11.setText("Especificaciones de Equipo/Área oficiales :");

        combo_pre_PR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PRActionPerformed(evt);
            }
        });

        jLabel12.setText("Estabilidades de producto/ empaque :");

        combo_pre_PF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PFActionPerformed(evt);
            }
        });

        jLabel13.setText("Hoja de Fabricación Maestra (HFM) emitida :");

        combo_pre_RM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_RMActionPerformed(evt);
            }
        });

        jLabel14.setText("Procedimientos Operativos Estándar (SOP's) oficiales :");

        combo_pre_PC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PCActionPerformed(evt);
            }
        });

        jLabel15.setText("  Muestra de referencia de producto terminado :");

        combo_pre_CG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_CGActionPerformed(evt);
            }
        });

        jLabel16.setText("Disponibilidad de Materiales :");

        combo_pre_FP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_FP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_FPActionPerformed(evt);
            }
        });

        txt_pre_diagrama.setEditable(false);

        txt_pre_FMEA.setEditable(false);

        txt_pre_PR.setEditable(false);

        txt_pre_PF.setEditable(false);

        txt_pre_RM.setEditable(false);

        txt_pre_PC.setEditable(false);

        txt_pre_CG.setEditable(false);

        txt_pre_FP.setEditable(false);

        txt_pre_calificacion.setEditable(false);

        txt_pre_HFM.setEditable(false);

        txt_pre_especificacion.setEditable(false);

        txt_pre_test.setEditable(false);

        txt_pre_protocolo.setEditable(false);

        txt_pre_materiales.setEditable(false);

        txt_pre_DP.setEditable(false);

        txt_fecha_protocolo.setEditable(false);
        txt_fecha_protocolo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_especificacion.setEditable(false);
        txt_fecha_especificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_metodo.setEditable(false);
        txt_fecha_metodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_diagrama_proceso.setEditable(false);
        txt_fecha_diagrama_proceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_producto.setEditable(false);
        txt_fecha_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_hoja_maestra.setEditable(false);
        txt_fecha_hoja_maestra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_pre_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_pre_HFM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_test, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_pre_materiales, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_test, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_HFM, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_calificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txt_pre_DP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fecha_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combo_pre_CG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combo_pre_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_pre_CG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_PC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_PF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_PR, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_FMEA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_diagrama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(combo_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha_diagrama_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_fecha_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fecha_hoja_maestra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(combo_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_diagrama_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(combo_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(combo_pre_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(combo_pre_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(combo_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_hoja_maestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(combo_pre_PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(combo_pre_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(combo_pre_HFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pre_HFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fecha_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(combo_pre_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pre_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fecha_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_pre_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fecha_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_pre_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(combo_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pre_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(combo_pre_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btn_cargar.setBackground(new java.awt.Color(51, 102, 255));
        btn_cargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cargar.setText("Cargar");
        btn_cargar.setToolTipText("Permite Cargar la informacion Obtenida de Base de Datos");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        jLabel17.setText("Numero Registro :");

        txt_registro_principal.setEditable(false);
        txt_registro_principal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_principal.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_principal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setText("Fecha Propuesta :");

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_fecha_propuesta.setForeground(new java.awt.Color(255, 0, 0));
        txt_fecha_propuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_registro_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_fecha_propuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 819, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(txt_fecha_propuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_registro_principal)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed

        if (!txt_registro_principal.getText().equals("") || !txt_fecha_propuesta.getText().equals("")) {

            String pre_proceso = txt_registro_principal.getText();

            if (consulta_pre_proceso(pre_proceso)) {
                coloresCampos();
                btn_actualizar.setEnabled(true);
                btn_cargar.setEnabled(false);
                fechasProximas();
                JOptionPane.showMessageDialog(null, "INFORMACION CARGADA");
            } else {
                JOptionPane.showMessageDialog(null, "INFORMACION NO CARGADA");
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA Y VERIFIQUE QUE TENGA FECHA PROPUESTA");
        }

    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (txt_registro_principal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        } else {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String registro = txt_registro_principal.getText();
            String calificacion = combo_pre_calificacion.getSelectedItem().toString();
            String hfm = combo_pre_HFM.getSelectedItem().toString();
            String especificacion = combo_pre_especificacion.getSelectedItem().toString();
            String test = combo_pre_test.getSelectedItem().toString();
            String protocolo = combo_pre_protocolo.getSelectedItem().toString();
            String materiales = combo_pre_materiales.getSelectedItem().toString();
            String dp = combo_pre_DP.getSelectedItem().toString();
            String diagrama = combo_pre_diagrama.getSelectedItem().toString();
            String fmea = combo_pre_FMEA.getSelectedItem().toString();
            String pr = combo_pre_PR.getSelectedItem().toString();
            String pf = combo_pre_PF.getSelectedItem().toString();
            String rm = combo_pre_RM.getSelectedItem().toString();
            String pc = combo_pre_PC.getSelectedItem().toString();
            String cg = combo_pre_CG.getSelectedItem().toString();
            String fp = combo_pre_FP.getSelectedItem().toString();

            boolean resultado = conexion.upgrade_pre_proceso(registro, calificacion, hfm, especificacion, test, protocolo, materiales, dp, diagrama, fmea, pr, pf, rm, pc, cg, fp);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                coloresCampos();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                consulta_pre_proceso(registro);
            }
        }


    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void combo_pre_FPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_FPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_FPActionPerformed

    private void combo_pre_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_CGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_CGActionPerformed

    private void combo_pre_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PCActionPerformed

    private void combo_pre_RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_RMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_RMActionPerformed

    private void combo_pre_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PFActionPerformed

    private void combo_pre_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PRActionPerformed

    private void combo_pre_FMEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_FMEAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_FMEAActionPerformed

    private void combo_pre_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_DPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_DPActionPerformed

    private void combo_pre_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_materialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_materialesActionPerformed

    private void combo_pre_protocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_protocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_protocoloActionPerformed

    private void combo_pre_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_testActionPerformed

    private void combo_pre_especificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_especificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_especificacionActionPerformed

    private void combo_pre_HFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_HFMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_HFMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JComboBox combo_pre_CG;
    private javax.swing.JComboBox combo_pre_DP;
    private javax.swing.JComboBox combo_pre_FMEA;
    private javax.swing.JComboBox combo_pre_FP;
    private javax.swing.JComboBox combo_pre_HFM;
    private javax.swing.JComboBox combo_pre_PC;
    private javax.swing.JComboBox combo_pre_PF;
    private javax.swing.JComboBox combo_pre_PR;
    private javax.swing.JComboBox combo_pre_RM;
    private javax.swing.JComboBox combo_pre_calificacion;
    private javax.swing.JComboBox combo_pre_diagrama;
    private javax.swing.JComboBox combo_pre_especificacion;
    private javax.swing.JComboBox combo_pre_materiales;
    private javax.swing.JComboBox combo_pre_protocolo;
    private javax.swing.JComboBox combo_pre_test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_fecha_diagrama_proceso;
    private javax.swing.JTextField txt_fecha_especificacion;
    private javax.swing.JTextField txt_fecha_hoja_maestra;
    private javax.swing.JTextField txt_fecha_metodo;
    private javax.swing.JTextField txt_fecha_producto;
    public javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextField txt_fecha_protocolo;
    private javax.swing.JTextField txt_pre_CG;
    private javax.swing.JTextField txt_pre_DP;
    private javax.swing.JTextField txt_pre_FMEA;
    private javax.swing.JTextField txt_pre_FP;
    private javax.swing.JTextField txt_pre_HFM;
    private javax.swing.JTextField txt_pre_PC;
    private javax.swing.JTextField txt_pre_PF;
    private javax.swing.JTextField txt_pre_PR;
    private javax.swing.JTextField txt_pre_RM;
    private javax.swing.JTextField txt_pre_calificacion;
    private javax.swing.JTextField txt_pre_diagrama;
    private javax.swing.JTextField txt_pre_especificacion;
    private javax.swing.JTextField txt_pre_materiales;
    private javax.swing.JTextField txt_pre_protocolo;
    private javax.swing.JTextField txt_pre_test;
    public javax.swing.JTextField txt_registro_principal;
    // End of variables declaration//GEN-END:variables

    public boolean consulta_pre_proceso(String registro) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "PRE_PRO_CALIFICACION_IQOQPQ AS CALIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_HFM AS ENTRENAMIENTO, "
                + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION AS ESPECIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_TEST AS TEST, "
                + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO AS PROTOCOLO, "
                + "PRE_PRO_MATERIALES AS MATERIAL, "
                + "PRE_PRO_DP AS DP, "
                + "PRE_PRO_DIAGRAMA AS DIAGRAMA, "
                + "PRE_PRO_FMEA AS FMEA, "
                + "PRE_PRO_PR AS PR, "
                + "PRE_PRO_PF AS PF, "
                + "PRE_PRO_RM AS RM, "
                + "PRE_PRO_PC AS PC, "
                + "PRE_PRO_CG AS CG, "
                + "PRE_PRO_FP AS FP "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "NUMERO_REGISTRO = " + registro + ";";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                combo_pre_calificacion.setSelectedItem(rs.getString("CALIFICACION"));
                combo_pre_HFM.setSelectedItem(rs.getString("ENTRENAMIENTO"));
                combo_pre_especificacion.setSelectedItem(rs.getString("ESPECIFICACION"));
                combo_pre_test.setSelectedItem(rs.getString("TEST"));
                combo_pre_protocolo.setSelectedItem(rs.getString("PROTOCOLO"));
                combo_pre_materiales.setSelectedItem(rs.getString("MATERIAL"));
                combo_pre_DP.setSelectedItem(rs.getString("DP"));
                combo_pre_diagrama.setSelectedItem(rs.getString("DIAGRAMA"));
                combo_pre_FMEA.setSelectedItem(rs.getString("FMEA"));
                combo_pre_PR.setSelectedItem(rs.getString("PR"));
                combo_pre_PF.setSelectedItem(rs.getString("PF"));
                combo_pre_RM.setSelectedItem(rs.getString("RM"));
                combo_pre_PC.setSelectedItem(rs.getString("PC"));
                combo_pre_CG.setSelectedItem(rs.getString("CG"));
                combo_pre_FP.setSelectedItem(rs.getString("FP"));
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;

        }
    }

    public void coloresCampos() {

        //VALIDACION CALIFICACION IQOQPQ
        if (combo_pre_calificacion.getSelectedIndex() == 0) {
            txt_pre_calificacion.setBackground(Color.GRAY);
        } else if (combo_pre_calificacion.getSelectedIndex() == 1) {
            txt_pre_calificacion.setBackground(Color.RED);
        } else {
            txt_pre_calificacion.setBackground(Color.GREEN);
        }

        //VALIDACION HFM
        if (combo_pre_HFM.getSelectedIndex() == 0) {
            txt_pre_HFM.setBackground(Color.GRAY);
        } else if (combo_pre_HFM.getSelectedIndex() == 1) {
            txt_pre_HFM.setBackground(Color.RED);
        } else {
            txt_pre_HFM.setBackground(Color.GREEN);
        }

        //VALIDACION ESPECIFICACION
        if (combo_pre_especificacion.getSelectedIndex() == 0) {
            txt_pre_especificacion.setBackground(Color.GRAY);
        } else if (combo_pre_especificacion.getSelectedIndex() == 1) {
            txt_pre_especificacion.setBackground(Color.RED);
        } else {
            txt_pre_especificacion.setBackground(Color.GREEN);
        }

        //VALIDACION TEST
        if (combo_pre_test.getSelectedIndex() == 0) {
            txt_pre_test.setBackground(Color.GRAY);
        } else if (combo_pre_test.getSelectedIndex() == 1) {
            txt_pre_test.setBackground(Color.RED);
        } else {
            txt_pre_test.setBackground(Color.GREEN);
        }

        //VALIDACION PROTOCOLO
        if (combo_pre_protocolo.getSelectedIndex() == 0) {
            txt_pre_protocolo.setBackground(Color.GRAY);
        } else if (combo_pre_protocolo.getSelectedIndex() == 1) {
            txt_pre_protocolo.setBackground(Color.RED);
        } else {
            txt_pre_protocolo.setBackground(Color.GREEN);
        }

        //VALIDACION MATERIALES
        if (combo_pre_materiales.getSelectedIndex() == 0) {
            txt_pre_materiales.setBackground(Color.GRAY);
        } else if (combo_pre_materiales.getSelectedIndex() == 1) {
            txt_pre_materiales.setBackground(Color.RED);
        } else {
            txt_pre_materiales.setBackground(Color.GREEN);
        }

        //VALIDACION DP
        if (combo_pre_DP.getSelectedIndex() == 0) {
            txt_pre_DP.setBackground(Color.GRAY);
        } else if (combo_pre_DP.getSelectedIndex() == 1) {
            txt_pre_DP.setBackground(Color.RED);
        } else {
            txt_pre_DP.setBackground(Color.GREEN);
        }

        //VALIDACION DIAGRAMA
        if (combo_pre_diagrama.getSelectedIndex() == 0) {
            txt_pre_diagrama.setBackground(Color.GRAY);
        } else if (combo_pre_diagrama.getSelectedIndex() == 1) {
            txt_pre_diagrama.setBackground(Color.RED);
        } else {
            txt_pre_diagrama.setBackground(Color.GREEN);
        }

        //VALIDACION FMEA
        if (combo_pre_FMEA.getSelectedIndex() == 0) {
            txt_pre_FMEA.setBackground(Color.GRAY);
        } else if (combo_pre_FMEA.getSelectedIndex() == 1) {
            txt_pre_FMEA.setBackground(Color.RED);
        } else {
            txt_pre_FMEA.setBackground(Color.GREEN);
        }

        //VALIDACION PR
        if (combo_pre_PR.getSelectedIndex() == 0) {
            txt_pre_PR.setBackground(Color.GRAY);
        } else if (combo_pre_PR.getSelectedIndex() == 1) {
            txt_pre_PR.setBackground(Color.RED);
        } else {
            txt_pre_PR.setBackground(Color.GREEN);
        }

        //VALIDACION PF
        if (combo_pre_PF.getSelectedIndex() == 0) {
            txt_pre_PF.setBackground(Color.GRAY);
        } else if (combo_pre_PF.getSelectedIndex() == 1) {
            txt_pre_PF.setBackground(Color.RED);
        } else {
            txt_pre_PF.setBackground(Color.GREEN);
        }

        //VALIDACION RM
        if (combo_pre_RM.getSelectedIndex() == 0) {
            txt_pre_RM.setBackground(Color.GRAY);
        } else if (combo_pre_RM.getSelectedIndex() == 1) {
            txt_pre_RM.setBackground(Color.RED);
        } else {
            txt_pre_RM.setBackground(Color.GREEN);
        }

        //VALIDACION PC
        if (combo_pre_PC.getSelectedIndex() == 0) {
            txt_pre_PC.setBackground(Color.GRAY);
        } else if (combo_pre_PC.getSelectedIndex() == 1) {
            txt_pre_PC.setBackground(Color.RED);
        } else {
            txt_pre_PC.setBackground(Color.GREEN);
        }

        //VALIDACION CG
        if (combo_pre_CG.getSelectedIndex() == 0) {
            txt_pre_CG.setBackground(Color.GRAY);
        } else if (combo_pre_CG.getSelectedIndex() == 1) {
            txt_pre_CG.setBackground(Color.RED);
        } else {
            txt_pre_CG.setBackground(Color.GREEN);
        }

        //VALIDACION FP
        if (combo_pre_FP.getSelectedIndex() == 0) {
            txt_pre_FP.setBackground(Color.GRAY);
        } else if (combo_pre_FP.getSelectedIndex() == 1) {
            txt_pre_FP.setBackground(Color.RED);
        } else {
            txt_pre_FP.setBackground(Color.GREEN);
        }

    }

    public void fechasProximas() {

        try {
            String fecha_propuesta = "";
            fecha_propuesta = txt_fecha_propuesta.getText();
            SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fechafinal = convertifecha.parse(fecha_propuesta);

            Date fechaSuma1 = sumarRestarDiasFecha(fechafinal, -15);           
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd");
            String fechaConverida1 = fechaHora.format(fechaSuma1);
            txt_fecha_protocolo.setText(fechaConverida1);
            
            Date fechaSuma2 = sumarRestarDiasFecha(fechafinal, -20);           
            DateFormat fechaHora2 = new SimpleDateFormat("yyyy-MM-dd");
            String fechaConverida2 = fechaHora2.format(fechaSuma2);            
            
            txt_fecha_diagrama_proceso.setText(fechaConverida2);
            txt_fecha_especificacion.setText(fechaConverida2);
            txt_fecha_hoja_maestra.setText(fechaConverida2);
            txt_fecha_metodo.setText(fechaConverida2);
            txt_fecha_producto.setText(fechaConverida2);

        } catch (ParseException ex) {

        }
    }

    public Date sumarRestarDiasFecha(Date fecha, int dias) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de días a añadir, o restar en caso de días<0

        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }
}
