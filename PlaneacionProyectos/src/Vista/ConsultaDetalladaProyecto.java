package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConsultaDetalladaProyecto extends javax.swing.JDialog {

    public static String valor;
    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;

    public ConsultaDetalladaProyecto(java.awt.Frame parent, boolean modal, String numero) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        valor = numero;
        this.txt_id_proyectos_con.setText(valor);
        cargar_tabla_ejecuciones(valor);
        cargar_tabla_capitalizacion(valor);
        cargar_informacion_proyecto(valor);
        centrar_datos();
        ancho_columnas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_fecha_kick = new javax.swing.JTextField();
        check_ru_kick = new javax.swing.JCheckBox();
        check_coreteam_kick = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        check_proyectos_pre = new javax.swing.JCheckBox();
        check_coreteam_pre = new javax.swing.JCheckBox();
        check_diseno_pre = new javax.swing.JCheckBox();
        txtx_fecha_prework = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txt_fecha_gcc = new javax.swing.JTextField();
        txt_capta_gcc = new javax.swing.JTextField();
        txt_symphony_gcc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_fecha_ru = new javax.swing.JTextField();
        check_calidad_ru = new javax.swing.JCheckBox();
        check_mantenimiento_ru = new javax.swing.JCheckBox();
        check_manufactura_ru = new javax.swing.JCheckBox();
        check_ehs_ru = new javax.swing.JCheckBox();
        check_facilities_ru = new javax.swing.JCheckBox();
        check_it_ru = new javax.swing.JCheckBox();
        check_ingenieria_ru = new javax.swing.JCheckBox();
        check_otros_ru = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        check_requerimientos_val = new javax.swing.JCheckBox();
        check_agendar_val = new javax.swing.JCheckBox();
        check_prevalidacion_val = new javax.swing.JCheckBox();
        txt_fecha_validacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cotizacion = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txt_fecha_entrega = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacion_en = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_capitalizacion = new javax.swing.JTable();
        txt_id_proyectos_con = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 730));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DETALLA DEL PROYECTO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KICKOFF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txt_fecha_kick.setEditable(false);

        check_ru_kick.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_ru_kick.setText("RU");

        check_coreteam_kick.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_coreteam_kick.setText("CORE TEAM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_coreteam_kick)
                    .addComponent(check_ru_kick)
                    .addComponent(txt_fecha_kick, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_fecha_kick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_ru_kick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_coreteam_kick)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRE-WORK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        check_proyectos_pre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_proyectos_pre.setText("PROYECTOS");

        check_coreteam_pre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_coreteam_pre.setText("CORE TEAM");

        check_diseno_pre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_diseno_pre.setText("DISEÑOS");

        txtx_fecha_prework.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_diseno_pre)
                    .addComponent(check_coreteam_pre)
                    .addComponent(check_proyectos_pre)
                    .addComponent(txtx_fecha_prework, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtx_fecha_prework, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_proyectos_pre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_coreteam_pre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_diseno_pre)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTROL DE CAMBIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txt_fecha_gcc.setEditable(false);

        txt_capta_gcc.setEditable(false);
        txt_capta_gcc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_symphony_gcc.setEditable(false);
        txt_symphony_gcc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setText("Capta");

        jLabel3.setText("Sympony");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txt_symphony_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_capta_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_fecha_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_capta_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_symphony_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REQUERIMIENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txt_fecha_ru.setEditable(false);

        check_calidad_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_calidad_ru.setText("CALIDAD");

        check_mantenimiento_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_mantenimiento_ru.setText("MANTENIMIENTO");

        check_manufactura_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_manufactura_ru.setText("MANUFACTURA");

        check_ehs_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_ehs_ru.setText("EHS");

        check_facilities_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_facilities_ru.setText("FACILITIES");

        check_it_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_it_ru.setText("IT");

        check_ingenieria_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_ingenieria_ru.setText("INGENIERIA");

        check_otros_ru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_otros_ru.setText("OTROS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_otros_ru)
                    .addComponent(check_ingenieria_ru)
                    .addComponent(check_it_ru)
                    .addComponent(check_facilities_ru)
                    .addComponent(check_ehs_ru)
                    .addComponent(check_calidad_ru)
                    .addComponent(check_mantenimiento_ru)
                    .addComponent(check_manufactura_ru)
                    .addComponent(txt_fecha_ru, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_fecha_ru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_manufactura_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_mantenimiento_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_calidad_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_ehs_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_facilities_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_it_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_ingenieria_ru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_otros_ru)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VALIDACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        check_requerimientos_val.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_requerimientos_val.setText("REQUERIMIENTOS");

        check_agendar_val.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_agendar_val.setText("AGENDAR");

        check_prevalidacion_val.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_prevalidacion_val.setText("PRE-VALIDACION");

        txt_fecha_validacion.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_prevalidacion_val)
                    .addComponent(check_agendar_val)
                    .addComponent(check_requerimientos_val)
                    .addComponent(txt_fecha_validacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_fecha_validacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_requerimientos_val)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_agendar_val)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_prevalidacion_val)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_cotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRABAJO", "ITEM", "COTIZACION", "COSTO", "PR", "S", "F", "C", "N/C"
            }
        ));
        tabla_cotizacion.setRowHeight(23);
        jScrollPane1.setViewportView(tabla_cotizacion);
        if (tabla_cotizacion.getColumnModel().getColumnCount() > 0) {
            tabla_cotizacion.getColumnModel().getColumn(1).setMinWidth(200);
            tabla_cotizacion.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_cotizacion.getColumnModel().getColumn(1).setMaxWidth(200);
            tabla_cotizacion.getColumnModel().getColumn(2).setMinWidth(140);
            tabla_cotizacion.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabla_cotizacion.getColumnModel().getColumn(2).setMaxWidth(140);
            tabla_cotizacion.getColumnModel().getColumn(4).setMinWidth(110);
            tabla_cotizacion.getColumnModel().getColumn(4).setPreferredWidth(110);
            tabla_cotizacion.getColumnModel().getColumn(4).setMaxWidth(110);
            tabla_cotizacion.getColumnModel().getColumn(5).setMinWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(5).setPreferredWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(5).setMaxWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(6).setMinWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(6).setPreferredWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(6).setMaxWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(7).setMinWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(7).setPreferredWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(7).setMaxWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(8).setMinWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(8).setPreferredWidth(50);
            tabla_cotizacion.getColumnModel().getColumn(8).setMaxWidth(50);
        }

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTREGA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txt_fecha_entrega.setEditable(false);

        txt_observacion_en.setColumns(20);
        txt_observacion_en.setRows(5);
        jScrollPane2.setViewportView(txt_observacion_en);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txt_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAPITALIZACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tabla_capitalizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "ACTIVO", "FECHA"
            }
        ));
        tabla_capitalizacion.setRowHeight(23);
        jScrollPane3.setViewportView(tabla_capitalizacion);
        if (tabla_capitalizacion.getColumnModel().getColumnCount() > 0) {
            tabla_capitalizacion.getColumnModel().getColumn(1).setMinWidth(140);
            tabla_capitalizacion.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabla_capitalizacion.getColumnModel().getColumn(1).setMaxWidth(140);
            tabla_capitalizacion.getColumnModel().getColumn(2).setMinWidth(100);
            tabla_capitalizacion.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_capitalizacion.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_id_proyectos_con.setEditable(false);
        txt_id_proyectos_con.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_proyectos_con.setForeground(new java.awt.Color(255, 51, 51));
        txt_id_proyectos_con.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_proyectos_con.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(txt_id_proyectos_con, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_id_proyectos_con)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(ConsultaDetalladaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(ConsultaDetalladaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(ConsultaDetalladaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(ConsultaDetalladaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
////
////        /* Create and display the dialog */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                ConsultaDetalladaProyecto dialog = new ConsultaDetalladaProyecto(new javax.swing.JFrame(), true);
////                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
////                    @Override
////                    public void windowClosing(java.awt.event.WindowEvent e) {
////                        System.exit(0);
////                    }
////                });
////                dialog.setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_agendar_val;
    private javax.swing.JCheckBox check_calidad_ru;
    private javax.swing.JCheckBox check_coreteam_kick;
    private javax.swing.JCheckBox check_coreteam_pre;
    private javax.swing.JCheckBox check_diseno_pre;
    private javax.swing.JCheckBox check_ehs_ru;
    private javax.swing.JCheckBox check_facilities_ru;
    private javax.swing.JCheckBox check_ingenieria_ru;
    private javax.swing.JCheckBox check_it_ru;
    private javax.swing.JCheckBox check_mantenimiento_ru;
    private javax.swing.JCheckBox check_manufactura_ru;
    private javax.swing.JCheckBox check_otros_ru;
    private javax.swing.JCheckBox check_prevalidacion_val;
    private javax.swing.JCheckBox check_proyectos_pre;
    private javax.swing.JCheckBox check_requerimientos_val;
    private javax.swing.JCheckBox check_ru_kick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_capitalizacion;
    private javax.swing.JTable tabla_cotizacion;
    private javax.swing.JTextField txt_capta_gcc;
    private javax.swing.JTextField txt_fecha_entrega;
    private javax.swing.JTextField txt_fecha_gcc;
    private javax.swing.JTextField txt_fecha_kick;
    private javax.swing.JTextField txt_fecha_ru;
    private javax.swing.JTextField txt_fecha_validacion;
    private javax.swing.JTextField txt_id_proyectos_con;
    private javax.swing.JTextArea txt_observacion_en;
    private javax.swing.JTextField txt_symphony_gcc;
    private javax.swing.JTextField txtx_fecha_prework;
    // End of variables declaration//GEN-END:variables
        
    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla_ejecuciones(String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"TRABAJO", "ITEM", "COTIZACION", "COSTOS", "PD", "S", "F", "C", "N/C"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT T.DESCRIPCION AS TRABAJO, I.DESCRIPCION AS ITEM,PD.COTIZACION,PD.COSTOS,PD.PR, PD.BLOQUEO_S AS SEMANA,PD.BLOQUEO_F AS FIN,PD.BLOQUEO_C AS CUMPLE,PD.BLOQUEO_NC AS NO_CUMPLE "
                + "FROM TRABAJOS T, ITEM I, PROYECTO_DETALLADO PD, PROYECTOS PR "
                + "WHERE T.ID = I.ID_TRABAJOS "
                + "AND I.ID = PD.ID_ITEM "
                + "AND PR.ID = PD.ID_PROYECTO "
                + "AND PD.ID_PROYECTO = " + ID_PROYECTO + ";";

        System.out.println("" + query);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("TRABAJO");
                registro[1] = rs.getString("ITEM");
                registro[2] = rs.getString("COTIZACION");
                registro[3] = rs.getString("COSTOS");
                registro[4] = rs.getString("PR");
                registro[5] = rs.getString("SEMANA");
                registro[6] = rs.getString("FIN");
                registro[7] = rs.getString("CUMPLE");
                registro[8] = rs.getString("NO_CUMPLE");

                modelo.addRow(registro);
            }
            tabla_cotizacion.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "tabla " + ex);

        }
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_tabla_capitalizacion(String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ITEM", "# ACTIVO", "FECHA"};
        String[] registro = new String[3];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "CAP_ITEM, "
                + "CAP_ACTIVO, "
                + "CAP_FECHA "
                + "FROM "
                + "CAPITALIZACION "
                + "WHERE "
                + "  ID_PROYECTO = " + ID_PROYECTO + ";";
        System.out.println("" + query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CAP_ITEM");
                registro[1] = rs.getString("CAP_ACTIVO");
                registro[2] = rs.getString("CAP_FECHA");

                modelo.addRow(registro);
            }
            tabla_capitalizacion.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "tabla " + ex);

        }
    }

    // METODO PARA CARGAR TABLA PROYECTOS
    public void cargar_informacion_proyecto(String ID_PROYECTO) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT PRE_FECHA,"
                + "       PRE_PROYECTO,"
                + "       PRE_CORE,"
                + "       PRE_DISENO,"
                + "       KICK_FECHA,"
                + "       KICK_RU,"
                + "       KICK_CORE,"
                + "       RU_FECHA,"
                + "       RU_MANUFACTURA,"
                + "       RU_MTTO,"
                + "       RU_CALIDAD,"
                + "       RU_EHS,"
                + "       RU_FACILITIES,"
                + "       RU_IT,"
                + "       RU_INGENIERIA,"
                + "       RU_OTROS,"
                + "       CC_FECHA,"
                + "       CC_CAPTA,"
                + "       CC_GCC,"
                + "       VAL_FECHA,"
                + "       VAL_RU,"
                + "       VAL_AGENDAR,"
                + "       VAL_PRE_VALIDACION,"
                + "       EN_FECHA,"
                + "       EN_OBSERVACIONES"
                + "  FROM PREREQUISITOS"
                + "  WHERE ID_PROYECTO = " + ID_PROYECTO;

        System.out.println("" + query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                txtx_fecha_prework.setText(rs.getString("PRE_FECHA"));

                if (rs.getString("PRE_PROYECTO").equals("S")) {
                    check_proyectos_pre.setSelected(true);
                } else {
                    check_proyectos_pre.setSelected(false);
                }

                if (rs.getString("PRE_CORE").equals("S")) {
                    check_coreteam_pre.setSelected(true);
                } else {
                    check_coreteam_pre.setSelected(false);
                }

                if (rs.getString("PRE_DISENO").equals("S")) {
                    check_diseno_pre.setSelected(true);
                } else {
                    check_diseno_pre.setSelected(false);
                }

                txt_fecha_kick.setText(rs.getString("KICK_FECHA"));

                if (rs.getString("KICK_RU").equals("S")) {
                    check_ru_kick.setSelected(true);
                } else {
                    check_ru_kick.setSelected(false);
                }

                if (rs.getString("KICK_CORE").equals("S")) {
                    check_coreteam_kick.setSelected(true);
                } else {
                    check_coreteam_kick.setSelected(false);
                }

                txt_fecha_ru.setText(rs.getString("RU_FECHA"));

                if (rs.getString("RU_MANUFACTURA").equals("S")) {
                    check_manufactura_ru.setSelected(true);
                } else {
                    check_manufactura_ru.setSelected(false);
                }

                if (rs.getString("RU_MTTO").equals("S")) {
                    check_mantenimiento_ru.setSelected(true);
                } else {
                    check_mantenimiento_ru.setSelected(false);
                }

                if (rs.getString("RU_CALIDAD").equals("S")) {
                    check_calidad_ru.setSelected(true);
                } else {
                    check_calidad_ru.setSelected(false);
                }

                if (rs.getString("RU_EHS").equals("S")) {
                    check_ehs_ru.setSelected(true);
                } else {
                    check_ehs_ru.setSelected(false);
                }

                if (rs.getString("RU_FACILITIES").equals("S")) {
                    check_facilities_ru.setSelected(true);
                } else {
                    check_facilities_ru.setSelected(false);
                }

                if (rs.getString("RU_IT").equals("S")) {
                    check_it_ru.setSelected(true);
                } else {
                    check_it_ru.setSelected(false);
                }

                if (rs.getString("RU_INGENIERIA").equals("S")) {
                    check_ingenieria_ru.setSelected(true);
                } else {
                    check_ingenieria_ru.setSelected(false);
                }

                if (rs.getString("RU_OTROS").equals("S")) {
                    check_otros_ru.setSelected(true);
                } else {
                    check_otros_ru.setSelected(false);
                }

                txt_fecha_gcc.setText(rs.getString("CC_FECHA"));
                txt_capta_gcc.setText(rs.getString("CC_CAPTA"));
                txt_symphony_gcc.setText(rs.getString("CC_GCC"));

                txt_fecha_validacion.setText(rs.getString("VAL_FECHA"));
                
                 if (rs.getString("VAL_RU").equals("S")) {
                    check_requerimientos_val.setSelected(true);
                } else {
                    check_requerimientos_val.setSelected(false);
                }

                if (rs.getString("VAL_PRE_VALIDACION").equals("S")) {
                    check_prevalidacion_val.setSelected(true);
                } else {
                    check_prevalidacion_val.setSelected(false);
                }
                                    
                txt_fecha_entrega.setText(rs.getString("EN_FECHA"));
                txt_observacion_en.setText(rs.getString("EN_OBSERVACIONES"));
                
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "tabla " + ex);

        }
    }

    public void ancho_columnas() {

        tabla_cotizacion.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla_cotizacion.getColumnModel().getColumn(1).setPreferredWidth(240);
        tabla_cotizacion.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_cotizacion.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_cotizacion.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabla_cotizacion.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_cotizacion.getColumnModel().getColumn(6).setPreferredWidth(50);
        tabla_cotizacion.getColumnModel().getColumn(7).setPreferredWidth(50);
        tabla_cotizacion.getColumnModel().getColumn(8).setPreferredWidth(50);

        tabla_capitalizacion.getColumnModel().getColumn(0).setPreferredWidth(140);
        tabla_capitalizacion.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_capitalizacion.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_cotizacion.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        tabla_cotizacion.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        tabla_cotizacion.getColumnModel().getColumn(7).setCellRenderer(Alinear);
        tabla_cotizacion.getColumnModel().getColumn(8).setCellRenderer(Alinear);
    }
    
}

                
