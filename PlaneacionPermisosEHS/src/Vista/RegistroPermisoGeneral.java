package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroPermisoGeneral extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public RegistroPermisoGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.txt_id.setVisible(false);
        cargar_tabla_general();
        ancho_columnas();
        cargar_lista_empresa();
        cargar_lista_lugar();
        cargar_lista_contratista();
        cargar_lista_responsable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agrupa_button = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_general = new javax.swing.JTable();
        txt_id_permiso_general = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_lugar = new javax.swing.JComboBox();
        combo_empresa = new javax.swing.JComboBox();
        btn_asignar_permisos = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_fecha_creacion_actual = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_actividad_proyecto = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        date_fecha_creacion = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jButton5 = new javax.swing.JButton();
        btn_refrescar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        radio_contratista = new javax.swing.JRadioButton();
        radio_personal = new javax.swing.JRadioButton();
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
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabla_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_general.setRowHeight(24);
        tabla_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_generalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_general);

        txt_id_permiso_general.setEditable(false);
        txt_id_permiso_general.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_id_permiso_general.setForeground(new java.awt.Color(255, 0, 0));
        txt_id_permiso_general.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_permiso_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_permiso_generalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PERMISOS GENERALES");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo Permiso : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 20));

        combo_lugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_lugar.setToolTipText("");
        jPanel2.add(combo_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 650, -1));

        combo_empresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_empresa.setToolTipText("");
        jPanel2.add(combo_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 650, -1));

        btn_asignar_permisos.setBackground(new java.awt.Color(255, 0, 51));
        btn_asignar_permisos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_asignar_permisos.setText("Agregar Nuevos Permisos");
        btn_asignar_permisos.setToolTipText("");
        btn_asignar_permisos.setEnabled(false);
        btn_asignar_permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignar_permisosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_asignar_permisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 190, 30));

        btn_guardar.setBackground(new java.awt.Color(0, 255, 0));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, 30));

        txt_fecha_creacion_actual.setEditable(false);
        txt_fecha_creacion_actual.setToolTipText("");
        txt_fecha_creacion_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_creacion_actualActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fecha_creacion_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 20, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 20, 20));

        txt_actividad_proyecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_actividad_proyecto.setToolTipText("");
        txt_actividad_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_actividad_proyectoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_actividad_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 650, -1));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 30));

        date_fecha_creacion.setDateFormatString("yyyy-MM-dd");
        date_fecha_creacion.setMinSelectableDate(new java.util.Date(-62135747930000L));
        jPanel2.add(date_fecha_creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Lugar de Trabajo :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 20));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Empresas :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Actividad o Proyecto :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("*");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 20, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("*");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 20, 20));

        combo_contratista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_contratista.setToolTipText("");
        jPanel2.add(combo_contratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 520, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Nombre Contratista :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("*");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 20, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Estado del Permiso :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, 20));

        combo_responsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_responsable.setToolTipText("");
        jPanel2.add(combo_responsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 520, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("*");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 20, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Responsable J&J :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 20));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PA - Alturas\nPC - Caliente\nPE - Excavación\nPL - Loto\nPEC - Espacios Confinados\nPMC - Manipulación de Carga\nPSB - Safery Bypass\nPAC - Areas Clasificadas\nPRL - Roctura de Linea\nPSR - Sin Riesgo\nPMCC - Manipulación de Carga Criticas\nPFSRC - Fuera de Servicio Red Contra.");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 290, 230));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        btn_refrescar1.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar1.setText("Refrescar");
        btn_refrescar1.setToolTipText("");
        btn_refrescar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refrescar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 90, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 20));

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_estado.setText("Solicitado");
        txt_estado.setToolTipText("");
        txt_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, -1));

        agrupa_button.add(radio_contratista);
        radio_contratista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_contratista.setText("Contratista");
        radio_contratista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contratistaMouseClicked(evt);
            }
        });
        jPanel2.add(radio_contratista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        agrupa_button.add(radio_personal);
        radio_personal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio_personal.setText("Personal JnJ");
        radio_personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_personalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radio_personalMouseEntered(evt);
            }
        });
        jPanel2.add(radio_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("ID Permiso General  :");

        txt_consulta_registro.setToolTipText("Numero de Registro del proyecto");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Nombre Contratista  :");

        txt_consulta_registro1.setToolTipText("");

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Responsable J&J  :");

        txt_consulta_registro2.setToolTipText("");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha Inicial :");

        date_fecha_inicio.setToolTipText("");
        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha Final :");

        date_fecha_final.setToolTipText("");
        date_fecha_final.setDateFormatString("yyyy-MM-dd");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Empresa :");

        txt_consulta_registro3.setToolTipText("");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 0, 0));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
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
                            .addComponent(txt_consulta_registro2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_registro1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_permiso_general, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_consulta_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_consulta_registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_consulta_registro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_consulta_registro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_permiso_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_permiso_generalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_permiso_generalActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_actividad_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_actividad_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_actividad_proyectoActionPerformed

    private void txt_fecha_creacion_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_creacion_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_creacion_actualActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (txt_id.getText().equals("")) {

            if ((radio_contratista.isSelected() == false
                    && radio_personal.isSelected() == false)
                    || date_fecha_creacion.getDate() == null
                    || combo_empresa.getSelectedIndex() == 0
                    || combo_lugar.getSelectedIndex() == 0
                    || txt_actividad_proyecto.getText().equals("")
                    || combo_contratista.getSelectedIndex() == 0
                    || combo_responsable.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(null, "Ingrese Todos los campos Obligatorios (*)");

            } else {

                String tipo = "";
                String id = txt_id_permiso_general.getText();
                String empresa = combo_empresa.getSelectedItem().toString();
                String lugar = combo_lugar.getSelectedItem().toString();
                String actividad = txt_actividad_proyecto.getText();
                String contratista = combo_contratista.getSelectedItem().toString();
                String responsable = combo_responsable.getSelectedItem().toString();
                String estado = txt_estado.getText();

                String formato = date_fecha_creacion.getDateFormatString();
                Date date_ingresada = (Date) date_fecha_creacion.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String fecha_ingresada = String.valueOf(sdf.format(date_ingresada));

                if (radio_contratista.isSelected()) {
                    tipo = "CONTRATISTA";
                } else if (radio_personal.isSelected()) {
                    tipo = "PERSONAL JNJ";
                }

                boolean resultado = conexion.insertPermisoGeneral(id, fecha_ingresada, empresa, lugar, actividad, contratista, responsable, estado, tipo);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "PERMISO REGISTRADO");
                    cargar_tabla_general();
                    ancho_columnas();
                    Limpiar();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR PERMISO");
                    Limpiar();
                }

            }
        } else {

            String tipo = "";

            String id = txt_id.getText();
            String id_permiso = txt_id_permiso_general.getText();
            String empresa = combo_empresa.getSelectedItem().toString();
            String lugar = combo_lugar.getSelectedItem().toString();
            String actividad = txt_actividad_proyecto.getText();
            String contratista = combo_contratista.getSelectedItem().toString();
            String responsable = combo_responsable.getSelectedItem().toString();
            String estado = txt_estado.getText();

            String formato = date_fecha_creacion.getDateFormatString();
            Date date_ingresada = (Date) date_fecha_creacion.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String fecha_ingresada = String.valueOf(sdf.format(date_ingresada));

            if (radio_contratista.isSelected()) {
                tipo = "CONTRATISTA";
            } else if (radio_personal.isSelected()) {
                tipo = "PERSONAL JNJ";
            }

            boolean resultado = conexion.upgradePermisoGeneral(id, id_permiso, fecha_ingresada, empresa, lugar, actividad, contratista, responsable, estado, tipo);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PERMISO ACTUALIZADO");
                cargar_tabla_general();
                ancho_columnas();
                Limpiar();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR PERMISO");
                Limpiar();
            }
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_asignar_permisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_permisosActionPerformed

        String valor = "";
        String valor2 = "";

        valor = txt_id_permiso_general.getText();
        valor2 = txt_id.getText();

        new Permisos(this, true, valor, valor2).setVisible(true);

    }//GEN-LAST:event_btn_asignar_permisosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_refrescar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar1ActionPerformed

    }//GEN-LAST:event_btn_refrescar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        combo_empresa.removeAllItems();
        combo_empresa.addItem("Seleccionar");
        cargar_lista_empresa();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        combo_lugar.removeAllItems();
        combo_lugar.addItem("Seleccionar");
        cargar_lista_lugar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        combo_contratista.removeAllItems();
        combo_contratista.addItem("Seleccionar");
        cargar_lista_contratista();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        combo_responsable.removeAllItems();
        combo_responsable.addItem("Seleccionar");
        cargar_lista_responsable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadoActionPerformed

    private void radio_contratistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contratistaMouseClicked

        cargar_codigo_inicio();

    }//GEN-LAST:event_radio_contratistaMouseClicked

    private void radio_personalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_personalMouseClicked

        txt_id_permiso_general.setText("");

    }//GEN-LAST:event_radio_personalMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void radio_personalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_personalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_personalMouseEntered

    private void tabla_generalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_generalMouseClicked

        int rec = this.tabla_general.getSelectedRow();

        this.txt_id.setText(tabla_general.getValueAt(rec, 0).toString());
        this.txt_id_permiso_general.setText(tabla_general.getValueAt(rec, 1).toString());

        if (tabla_general.getValueAt(rec, 1).toString().equals("")) {
            this.radio_personal.setSelected(true);
        } else {
            this.radio_contratista.setSelected(true);

        }
        this.txt_fecha_creacion_actual.setText(tabla_general.getValueAt(rec, 2).toString());
        this.combo_empresa.setSelectedItem(tabla_general.getValueAt(rec, 3).toString());
        this.combo_lugar.setSelectedItem(tabla_general.getValueAt(rec, 4).toString());
        this.txt_actividad_proyecto.setText(tabla_general.getValueAt(rec, 5).toString());
        this.combo_contratista.setSelectedItem(tabla_general.getValueAt(rec, 6).toString());
        this.combo_responsable.setSelectedItem(tabla_general.getValueAt(rec, 7).toString());

        this.btn_asignar_permisos.setEnabled(true);

    }//GEN-LAST:event_tabla_generalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup agrupa_button;
    private javax.swing.JButton btn_asignar_permisos;
    private javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar1;
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
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton radio_contratista;
    private javax.swing.JRadioButton radio_personal;
    private javax.swing.JTable tabla_general;
    public javax.swing.JTextField txt_actividad_proyecto;
    private javax.swing.JTextField txt_consulta_registro;
    private javax.swing.JTextField txt_consulta_registro1;
    private javax.swing.JTextField txt_consulta_registro2;
    private javax.swing.JTextField txt_consulta_registro3;
    public javax.swing.JTextField txt_estado;
    public javax.swing.JTextField txt_fecha_creacion_actual;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_id_permiso_general;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_id.setText("");
        txt_id_permiso_general.setText("");
        radio_contratista.setSelected(false);
        radio_personal.setSelected(false);
        date_fecha_creacion.setDate(null);
        combo_empresa.setSelectedIndex(0);
        combo_lugar.setSelectedIndex(0);
        txt_actividad_proyecto.setText("");
        combo_contratista.setSelectedIndex(0);
        combo_responsable.setSelectedIndex(0);
        this.btn_asignar_permisos.setEnabled(false);
    }

    public void cargar_tabla_general() {
        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "ID_PERMISO", "FECHA", "EMPRESA", "LUGAR", "ACTIVIDAD", "CONTRATISTA", "RESPONSABLE", "ESTADO"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID, "
                + "ID_PERMISO, "
                + "FECHA, "
                + "EMPRESA, "
                + "LUGAR_TRABAJO AS LUGAR, "
                + "ACTIVIDAD, "
                + "CONTRATISTAS, "
                + "RESPONSABLE_JNJ, "
                + "ESTADO "
                + "FROM "
                + "PERMISOS_GENERALES "
                + "WHERE (ESTADO = 'Solicitado') "
                + "ORDER BY ID DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ID_PERMISO");
                registro[2] = rs.getString("FECHA");
                registro[3] = rs.getString("EMPRESA");
                registro[4] = rs.getString("LUGAR");
                registro[5] = rs.getString("ACTIVIDAD");
                registro[6] = rs.getString("CONTRATISTAS");
                registro[7] = rs.getString("RESPONSABLE_JNJ");
                registro[8] = rs.getString("ESTADO");

                modelo.addRow(registro);
            }
            tabla_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

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

    public void cargar_codigo_inicio() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int id_permiso_general = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT MAX(ID_PERMISO) AS MAXIMO FROM PERMISOS_GENERALES WHERE TIPO_PERMISO = 'CONTRATISTA'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            id_permiso_general = Integer.parseInt(rs.getString("MAXIMO")) + 1;
            txt_id_permiso_general.setText("" + id_permiso_general);

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NumberFormatException ex) {
            txt_id_permiso_general.setText("1");
        }

    }

    public void cargar_codigo_unico() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int id = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT MAX(ID) AS MAXIMO_ID FROM PERMISOS_GENERALES";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            id = Integer.parseInt(rs.getString("MAXIMO_ID")) + 1;
            txt_id.setText("" + id);

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NumberFormatException ex) {
            txt_id_permiso_general.setText("1");
        }

    }
    
    public void ancho_columnas() {
        tabla_general.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_general.getColumnModel().getColumn(1).setPreferredWidth(120);
        tabla_general.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_general.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabla_general.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabla_general.getColumnModel().getColumn(5).setPreferredWidth(300);
        tabla_general.getColumnModel().getColumn(6).setPreferredWidth(200);
        tabla_general.getColumnModel().getColumn(7).setPreferredWidth(150);
        tabla_general.getColumnModel().getColumn(8).setPreferredWidth(100);
    }

}
