package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroPermisoGeneral extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    
    public RegistroPermisoGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        cargar_codigo_inicio();
        cargar_lista_empresa();
        cargar_lista_lugar();
        cargar_lista_actividad();
        cargar_lista_contratista();
        cargar_lista_responsable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_id_permiso_general = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_lugar = new javax.swing.JComboBox();
        combo_empresa = new javax.swing.JComboBox();
        btn_refrescar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_fecha_propuesta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_estado_proyecto = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        date_fecha_creacion = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        combo_actividad = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        combo_contratista = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        combo_responsable = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_refrescar1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txt_consulta_registro = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_consulta_registro1 = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txt_consulta_registro2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        txt_consulta_registro3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(23);
        jScrollPane1.setViewportView(jTable1);

        txt_id_permiso_general.setEditable(false);
        txt_id_permiso_general.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_id_permiso_general.setForeground(new java.awt.Color(255, 0, 0));
        txt_id_permiso_general.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_permiso_general.setText("1000");
        txt_id_permiso_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_permiso_generalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PERMISOS GENERALES (CONTRATISTAS)");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Relevante"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 20));

        combo_lugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_lugar.setToolTipText("Lider Tecnico del Proyecto (Persona encargada de ejecucion del Proyecto)");
        jPanel2.add(combo_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 650, -1));

        combo_empresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_empresa.setToolTipText("Tipo de Calificacion a ejecutar");
        jPanel2.add(combo_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 650, -1));

        btn_refrescar.setBackground(new java.awt.Color(255, 0, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Agregar Nuevos Permisos");
        btn_refrescar.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 190, 30));

        btn_guardar.setBackground(new java.awt.Color(0, 255, 0));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("Permite Guardar el proyecto en Base de Datos");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 90, 30));

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.setToolTipText("Fecha Propuesta cargada de Base de Datos");
        txt_fecha_propuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_propuestaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 120, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 20, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 20, 20));

        txt_estado_proyecto.setEditable(false);
        txt_estado_proyecto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_estado_proyecto.setText("Solicitado");
        txt_estado_proyecto.setToolTipText("Estado de Inicio del Proyecto");
        txt_estado_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estado_proyectoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_estado_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("Permite Limpiar los cambios");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 90, 30));

        date_fecha_creacion.setDateFormatString("yyyy-MM-dd");
        date_fecha_creacion.setMinSelectableDate(new java.util.Date(-62135747930000L));
        jPanel2.add(date_fecha_creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Lugar de Trabajo :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 20));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Empresas :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Actividad o Proyecto :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 20));

        combo_actividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_actividad.setToolTipText("Lider Tecnico del Proyecto (Persona encargada de ejecucion del Proyecto)");
        jPanel2.add(combo_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 650, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("*");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 20, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("*");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 20, 20));

        combo_contratista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_contratista.setToolTipText("Lider Tecnico del Proyecto (Persona encargada de ejecucion del Proyecto)");
        jPanel2.add(combo_contratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 520, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Nombre Contratista :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("*");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 20, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Estado del Permiso :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 20));

        combo_responsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_responsable.setToolTipText("Lider Tecnico del Proyecto (Persona encargada de ejecucion del Proyecto)");
        jPanel2.add(combo_responsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 520, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("*");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 20, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Responsable J&J :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 20));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PA - Alturas\nPC - Caliente\nPE - Excavación\nPL - Loto\nPEC - Espacios Confinados\nPMC - Manipulación de Carga\nPSB - Safery Bypass\nPAC - Areas Clasificadas\nPRL - Roctura de Linea\nPSR - Sin Riesgo\nPMCC - Manipulación de Carga Criticas\nPFSRC - Fuera de Servicio Red Contra.");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 290, 230));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, -1));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, -1, -1));

        btn_refrescar1.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar1.setText("Refrescar");
        btn_refrescar1.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refrescar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 90, 30));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("ID Permiso General  :");

        txt_consulta_registro.setToolTipText("Numero de Registro del proyecto");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Nombre Contratista  :");

        txt_consulta_registro1.setToolTipText("Numero de Registro del proyecto");

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("Permite Buscar la informacion seleccioda en el filtro");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Responsable J&J  :");

        txt_consulta_registro2.setToolTipText("Numero de Registro del proyecto");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha Inicial :");

        date_fecha_inicio.setToolTipText("Filtro de Fecha de inicio del proyecto");
        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha Final :");

        date_fecha_final.setToolTipText("Filtro de Fecha de fin del proyecto");
        date_fecha_final.setDateFormatString("yyyy-MM-dd");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Empresa :");

        txt_consulta_registro3.setToolTipText("Numero de Registro del proyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_consulta_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_consulta_registro3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consulta_registro1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_registro2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_consulta_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_consulta_registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_consulta_registro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_consulta_registro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_permiso_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_permiso_generalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_permiso_generalActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_estado_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estado_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estado_proyectoActionPerformed

    private void txt_fecha_propuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_propuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_propuestaActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
       
       String valor = "";
       valor = txt_id_permiso_general.getText();
       new Permisos(this, true,valor).setVisible(true);
       
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_refrescar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar1ActionPerformed
   
    }//GEN-LAST:event_btn_refrescar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminEmpresas empresas = new AdminEmpresas();
        empresas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminLugar lugar = new AdminLugar();
        lugar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminActividad actividad = new AdminActividad();
        actividad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminContratista contratista = new AdminContratista();
        contratista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminResponsableJJ responsable = new AdminResponsableJJ();
        responsable.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JButton btn_refrescar1;
    public javax.swing.JComboBox combo_actividad;
    public javax.swing.JComboBox combo_contratista;
    public javax.swing.JComboBox combo_empresa;
    public javax.swing.JComboBox combo_lugar;
    public javax.swing.JComboBox combo_responsable;
    public com.toedter.calendar.JDateChooser date_fecha_creacion;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txt_consulta_registro;
    private javax.swing.JTextField txt_consulta_registro1;
    private javax.swing.JTextField txt_consulta_registro2;
    private javax.swing.JTextField txt_consulta_registro3;
    public javax.swing.JTextField txt_estado_proyecto;
    public javax.swing.JTextField txt_fecha_propuesta;
    public javax.swing.JTextField txt_id_permiso_general;
    // End of variables declaration//GEN-END:variables

    
     public void cargar_lista_empresa() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM EMPRESAS";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_empresa.addItem(rs.getString("NOMBRE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
     public void cargar_lista_lugar() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM LUGAR_TRABAJO";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_lugar.addItem(rs.getString("NOMBRE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
     public void cargar_lista_actividad() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM ACTIVIDAD";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_actividad.addItem(rs.getString("NOMBRE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

     public void cargar_lista_contratista() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM CONTRATISTA";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_contratista.addItem(rs.getString("NOMBRE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
     public void cargar_lista_responsable() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM RESPONSABLE_JNJ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_responsable.addItem(rs.getString("NOMBRE"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
     public void cargar_codigo_inicio(){
        
        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int id_permiso_general = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT MAX(ID) AS MAXIMO FROM PERMISOS_GENERALES";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
          
            id_permiso_general = Integer.parseInt(rs.getString("MAXIMO")) + 1;
            txt_id_permiso_general.setText(""+id_permiso_general);
               
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NumberFormatException ex){
            txt_id_permiso_general.setText("1");
        }
                  
     }
     
}
