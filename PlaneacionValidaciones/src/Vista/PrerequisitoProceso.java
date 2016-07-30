
package Vista;


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
                    .addComponent(txt_pre_HFM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_test, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_materiales, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_DP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
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
                    .addComponent(txt_pre_FMEA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_PR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_PF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_RM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_PC, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_CG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txt_pre_FP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton2.setText("Cargar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    // End of variables declaration//GEN-END:variables
}
