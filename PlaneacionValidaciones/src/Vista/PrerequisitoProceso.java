
package Vista;

import Conexion.ConexioSQLite;
import static Vista.Principal.conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PrerequisitoProceso extends javax.swing.JFrame {

   
    public PrerequisitoProceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_registro_principal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRE-REQUISITOS DE PROCESO");

        jButton1.setText("Actualizar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentacion"));

        jLabel2.setText("Calificacion IQOQPQ :");

        combo_pre_calificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel3.setText("Entrenamiento HFM :");

        combo_pre_HFM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_HFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_HFMActionPerformed(evt);
            }
        });

        jLabel4.setText("Entrenamiento Especificacion :");

        combo_pre_especificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_especificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_especificacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Entrenamiento Test Method :");

        combo_pre_test.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_testActionPerformed(evt);
            }
        });

        jLabel6.setText("Entrenamiento Protocolo :");

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

        jLabel7.setText("Materiales Disponibles :");

        jLabel8.setText("DP :");

        combo_pre_DP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_DPActionPerformed(evt);
            }
        });

        jLabel9.setText("Diagrama de Proceso :");

        combo_pre_diagrama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel10.setText("FMEA del Proceso/Producto :");

        combo_pre_FMEA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_FMEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_FMEAActionPerformed(evt);
            }
        });

        jLabel11.setText("PR :");

        combo_pre_PR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PRActionPerformed(evt);
            }
        });

        jLabel12.setText("PF :");

        combo_pre_PF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PFActionPerformed(evt);
            }
        });

        jLabel13.setText("RM :");

        combo_pre_RM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_RMActionPerformed(evt);
            }
        });

        jLabel14.setText("PC :");

        combo_pre_PC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_PCActionPerformed(evt);
            }
        });

        jLabel15.setText("CG :");

        combo_pre_CG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_CGActionPerformed(evt);
            }
        });

        jLabel16.setText("FP :");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_calificacion)
                    .addComponent(txt_pre_HFM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txt_pre_test, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txt_pre_materiales, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txt_pre_DP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_CG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_diagrama)
                    .addComponent(txt_pre_FMEA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_PR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_PF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_RM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_PC, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_CG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_FP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(combo_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pre_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(combo_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pre_FMEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txt_pre_RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(combo_pre_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(combo_pre_HFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(combo_pre_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(combo_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(combo_pre_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pre_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txt_pre_HFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(combo_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pre_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Numero Registro :");

        txt_registro_principal.setEditable(false);
        txt_registro_principal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_registro_principal.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_principal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_registro_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_registro_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_pre_HFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_HFMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_HFMActionPerformed

    private void combo_pre_especificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_especificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_especificacionActionPerformed

    private void combo_pre_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_testActionPerformed

    private void combo_pre_protocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_protocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_protocoloActionPerformed

    private void combo_pre_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_materialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_materialesActionPerformed

    private void combo_pre_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_DPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_DPActionPerformed

    private void combo_pre_FMEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_FMEAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_FMEAActionPerformed

    private void combo_pre_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PRActionPerformed

    private void combo_pre_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PFActionPerformed

    private void combo_pre_RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_RMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_RMActionPerformed

    private void combo_pre_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_PCActionPerformed

    private void combo_pre_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_CGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_CGActionPerformed

    private void combo_pre_FPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_FPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_FPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
          if (!txt_registro_principal.getText().equals("")) {

            String pre_proceso = txt_registro_principal.getText();

            if (consulta_pre_proceso(pre_proceso)) {
//                coloresCampos();
                JOptionPane.showMessageDialog(null, "INFORMACION CARGADA");
            } else {
                JOptionPane.showMessageDialog(null, "INFORMACION NO CARGADA");
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
        
//    public void coloresCampos() {
//        
//        //VALIDACION ESPECIFICACION DE EQUIPO
//        if (combo_pre_especificacion.getSelectedIndex() == 0) {
//            txt_pre_especificacion.setBackground(Color.GRAY);
//        } else if (combo_pre_especificacion.getSelectedIndex() == 1) {
//            txt_pre_especificacion.setBackground(Color.RED);
//        } else {
//            txt_pre_especificacion.setBackground(Color.GREEN);
//        }
//                
//        //VALIDACION PROTOCOLOS
//        if (combo_pre_protocolos.getSelectedIndex() == 0) {
//            txt_pre_protocolo.setBackground(Color.GRAY);
//        } else if (combo_pre_protocolos.getSelectedIndex() == 1) {
//            txt_pre_protocolo.setBackground(Color.RED);
//        } else {
//            txt_pre_protocolo.setBackground(Color.GREEN);
//        }
//            
//        //VALIDACION RU
//        if (combo_pre_RU.getSelectedIndex() == 0) {
//            txt_pre_RU.setBackground(Color.GRAY);
//        } else if (combo_pre_RU.getSelectedIndex() == 1) {
//            txt_pre_RU.setBackground(Color.RED);
//        } else {
//            txt_pre_RU.setBackground(Color.GREEN);
//        }        
//        
//        //VALIDACION LIBRO
//        if (combo_pre_libro.getSelectedIndex() == 0) {
//            txt_pre_libro.setBackground(Color.GRAY);
//        } else if (combo_pre_libro.getSelectedIndex() == 1) {
//            txt_pre_libro.setBackground(Color.RED);
//        } else {
//            txt_pre_libro.setBackground(Color.GREEN);
//        }
//                
//        //VALIDACION BR
//        if (combo_pre_BR.getSelectedIndex() == 0) {
//            txt_pre_BR.setBackground(Color.GRAY);
//        } else if (combo_pre_BR.getSelectedIndex() == 1) {
//            txt_pre_BR.setBackground(Color.RED);
//        } else {
//            txt_pre_BR.setBackground(Color.GREEN);
//        }
//        
//        //VALIDACION SOP
//        if (combo_pre_SOP.getSelectedIndex() == 0) {
//            txt_pre_SOP.setBackground(Color.GRAY);
//        } else if (combo_pre_SOP.getSelectedIndex() == 1) {
//            txt_pre_SOP.setBackground(Color.RED);
//        } else {
//            txt_pre_SOP.setBackground(Color.GREEN);
//        }
//                
//         //VALIDACION HOJA DE VIDA
//        if (combo_pre_hoja.getSelectedIndex() == 0) {
//            txt_pre_hoja.setBackground(Color.GRAY);
//        } else if (combo_pre_hoja.getSelectedIndex() == 1) {
//            txt_pre_hoja.setBackground(Color.RED);
//        } else {
//            txt_pre_hoja.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION RUTINA DE MANTENIMEINTO
//        if (combo_pre_rutinas.getSelectedIndex() == 0) {
//            txt_pre_rutinas.setBackground(Color.GRAY);
//        } else if (combo_pre_rutinas.getSelectedIndex() == 1) {
//            txt_pre_rutinas.setBackground(Color.RED);
//        } else {
//            txt_pre_rutinas.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION CERTIFICADO
//        if (combo_pre_certificado.getSelectedIndex() == 0) {
//            txt_pre_certificado.setBackground(Color.GRAY);
//        } else if (combo_pre_certificado.getSelectedIndex() == 1) {
//            txt_pre_certificado.setBackground(Color.RED);
//        } else {
//            txt_pre_certificado.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION PLANOS
//        if (combo_pre_planos.getSelectedIndex() == 0) {
//            txt_pre_planos.setBackground(Color.GRAY);
//        } else if (combo_pre_planos.getSelectedIndex() == 1) {
//            txt_pre_planos.setBackground(Color.RED);
//        } else {
//            txt_pre_planos.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION MANUALES
//        if (combo_pre_manual.getSelectedIndex() == 0) {
//            txt_pre_manual.setBackground(Color.GRAY);
//        } else if (combo_pre_manual.getSelectedIndex() == 1) {
//            txt_pre_manual.setBackground(Color.RED);
//        } else {
//            txt_pre_manual.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION MATERIALES
//        if (combo_pre_materiales.getSelectedIndex() == 0) {
//            txt_pre_materiales.setBackground(Color.GRAY);
//        } else if (combo_pre_materiales.getSelectedIndex() == 1) {
//            txt_pre_materiales.setBackground(Color.RED);
//        } else {
//            txt_pre_materiales.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION RECURSOS
//        if (combo_pre_recursos.getSelectedIndex() == 0) {
//            txt_pre_recursos.setBackground(Color.GRAY);
//        } else if (combo_pre_recursos.getSelectedIndex() == 1) {
//            txt_pre_recursos.setBackground(Color.RED);
//        } else {
//            txt_pre_recursos.setBackground(Color.GREEN);
//        }
//        
//         //VALIDACION ENTRENAMIENTO
//        if (combo_pre_entrenamiento.getSelectedIndex() == 0) {
//            txt_pre_entrenamiento.setBackground(Color.GRAY);
//        } else if (combo_pre_entrenamiento.getSelectedIndex() == 1) {
//            txt_pre_entrenamiento.setBackground(Color.RED);
//        } else {
//            txt_pre_entrenamiento.setBackground(Color.GREEN);
//        }
//    }

}
