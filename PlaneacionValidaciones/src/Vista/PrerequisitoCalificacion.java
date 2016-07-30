
package Vista;


public class PrerequisitoCalificacion extends javax.swing.JFrame {

    
    public PrerequisitoCalificacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_pre_especificacion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        combo_pre_protocolos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combo_pre_RU = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combo_pre_libro = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        combo_pre_BR = new javax.swing.JComboBox();
        combo_pre_SOP = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_pre_hoja = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        combo_pre_rutinas = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        combo_pre_certificado = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        combo_pre_planos = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        combo_pre_manual = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        combo_pre_materiales = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        combo_pre_recursos = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        combo_pre_entrenamiento = new javax.swing.JComboBox();
        txt_pre_rutinas = new javax.swing.JTextField();
        txt_pre_certificado = new javax.swing.JTextField();
        txt_pre_planos = new javax.swing.JTextField();
        txt_pre_manual = new javax.swing.JTextField();
        txt_pre_materiales = new javax.swing.JTextField();
        txt_pre_recursos = new javax.swing.JTextField();
        txt_pre_entrenamiento = new javax.swing.JTextField();
        txt_pre_especificacion = new javax.swing.JTextField();
        txt_pre_protocolo = new javax.swing.JTextField();
        txt_pre_RU = new javax.swing.JTextField();
        txt_pre_libro = new javax.swing.JTextField();
        txt_pre_BR = new javax.swing.JTextField();
        txt_pre_SOP = new javax.swing.JTextField();
        txt_pre_hoja = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRE-REQUISITOS DE CALIFICACION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentacion"));

        jLabel2.setText("Especificacion de Equipo :");

        combo_pre_especificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel3.setText("Protocolos Oficiales :");

        combo_pre_protocolos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_protocolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_protocolosActionPerformed(evt);
            }
        });

        jLabel4.setText("RU No GxP :");

        combo_pre_RU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_RU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_RUActionPerformed(evt);
            }
        });

        jLabel5.setText("Libro de Parametros :");

        combo_pre_libro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_libroActionPerformed(evt);
            }
        });

        jLabel6.setText("BR Actualizado :");

        combo_pre_BR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_BRActionPerformed(evt);
            }
        });

        combo_pre_SOP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_SOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_SOPActionPerformed(evt);
            }
        });

        jLabel7.setText("SOP Actualizados :");

        jLabel8.setText("Hoja de Vida Calibracion :");

        combo_pre_hoja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_hoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_hojaActionPerformed(evt);
            }
        });

        jLabel9.setText("Rutinas de Mantenimiento :");

        combo_pre_rutinas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel10.setText("Certificado de Materiales :");

        combo_pre_certificado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_certificadoActionPerformed(evt);
            }
        });

        jLabel11.setText("Planos Actualizados :");

        combo_pre_planos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_planos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_planosActionPerformed(evt);
            }
        });

        jLabel12.setText("Manual del Equipo :");

        combo_pre_manual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_manualActionPerformed(evt);
            }
        });

        jLabel13.setText("Materiales Disponibles :");

        combo_pre_materiales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_materialesActionPerformed(evt);
            }
        });

        jLabel14.setText("Recursos Disponibles :");

        combo_pre_recursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_recursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_recursosActionPerformed(evt);
            }
        });

        jLabel15.setText("Entrenamientos :");

        combo_pre_entrenamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_entrenamientoActionPerformed(evt);
            }
        });

        txt_pre_entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pre_entrenamientoActionPerformed(evt);
            }
        });

        txt_pre_hoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pre_hojaActionPerformed(evt);
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
                        .addComponent(combo_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_pre_protocolos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_especificacion)
                    .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_RU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_libro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_BR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_SOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_hoja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pre_rutinas)
                    .addComponent(txt_pre_certificado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_planos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_manual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_materiales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_recursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txt_pre_entrenamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(combo_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(combo_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(combo_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(combo_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(combo_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(combo_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo_pre_protocolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combo_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combo_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(combo_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(combo_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jButton1.setText("Actualizar");

        jButton2.setText("Cargar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jTextField1)
                    .addGap(309, 309, 309)))
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
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(216, 216, 216)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_pre_protocolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_protocolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_protocolosActionPerformed

    private void combo_pre_RUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_RUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_RUActionPerformed

    private void combo_pre_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_libroActionPerformed

    private void combo_pre_BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_BRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_BRActionPerformed

    private void combo_pre_SOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_SOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_SOPActionPerformed

    private void combo_pre_hojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_hojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_hojaActionPerformed

    private void combo_pre_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_certificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_certificadoActionPerformed

    private void combo_pre_planosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_planosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_planosActionPerformed

    private void combo_pre_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_manualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_manualActionPerformed

    private void combo_pre_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_materialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_materialesActionPerformed

    private void combo_pre_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_recursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_recursosActionPerformed

    private void combo_pre_entrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_entrenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_entrenamientoActionPerformed

    private void txt_pre_entrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pre_entrenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pre_entrenamientoActionPerformed

    private void txt_pre_hojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pre_hojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pre_hojaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_pre_BR;
    private javax.swing.JComboBox combo_pre_RU;
    private javax.swing.JComboBox combo_pre_SOP;
    private javax.swing.JComboBox combo_pre_certificado;
    private javax.swing.JComboBox combo_pre_entrenamiento;
    private javax.swing.JComboBox combo_pre_especificacion;
    private javax.swing.JComboBox combo_pre_hoja;
    private javax.swing.JComboBox combo_pre_libro;
    private javax.swing.JComboBox combo_pre_manual;
    private javax.swing.JComboBox combo_pre_materiales;
    private javax.swing.JComboBox combo_pre_planos;
    private javax.swing.JComboBox combo_pre_protocolos;
    private javax.swing.JComboBox combo_pre_recursos;
    private javax.swing.JComboBox combo_pre_rutinas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_pre_BR;
    private javax.swing.JTextField txt_pre_RU;
    private javax.swing.JTextField txt_pre_SOP;
    private javax.swing.JTextField txt_pre_certificado;
    private javax.swing.JTextField txt_pre_entrenamiento;
    private javax.swing.JTextField txt_pre_especificacion;
    private javax.swing.JTextField txt_pre_hoja;
    private javax.swing.JTextField txt_pre_libro;
    private javax.swing.JTextField txt_pre_manual;
    private javax.swing.JTextField txt_pre_materiales;
    private javax.swing.JTextField txt_pre_planos;
    private javax.swing.JTextField txt_pre_protocolo;
    private javax.swing.JTextField txt_pre_recursos;
    private javax.swing.JTextField txt_pre_rutinas;
    // End of variables declaration//GEN-END:variables
}
