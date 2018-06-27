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

public class TotalPermisosCerrados extends javax.swing.JDialog {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;

    public TotalPermisosCerrados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_solicitado = new javax.swing.JTextField();
        txt_anulados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_perdidos = new javax.swing.JTextField();
        txt_cerrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_caliente = new javax.swing.JTextField();
        txt_excavacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_loto = new javax.swing.JTextField();
        txt_espacio_confinado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_manipulacion_carga = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_safery_bypass = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_areas_clasificadas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_roctura_linea = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_sin_riesgo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_manipulacion_carga_critica = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_fuera_red_contraincendio = new javax.swing.JTextField();
        txt_total_perdidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL CIERRE DE PERMISOS");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Fecha Inicial :");

        date_fecha_inicio.setToolTipText("Filtro de Fecha de inicio del proyecto");
        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha Final :");

        date_fecha_final.setToolTipText("Filtro de Fecha de fin del proyecto");
        date_fecha_final.setDateFormatString("yyyy-MM-dd");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total Permisos Solicitados");

        txt_solicitado.setEditable(false);
        txt_solicitado.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_solicitado.setForeground(new java.awt.Color(255, 0, 0));
        txt_solicitado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_solicitado.setText("0");

        txt_anulados.setEditable(false);
        txt_anulados.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_anulados.setForeground(new java.awt.Color(255, 0, 0));
        txt_anulados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_anulados.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Permisos Anulados");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Permisos Perdidos");

        txt_perdidos.setEditable(false);
        txt_perdidos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_perdidos.setForeground(new java.awt.Color(255, 0, 0));
        txt_perdidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_perdidos.setText("0");

        txt_cerrada.setEditable(false);
        txt_cerrada.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_cerrada.setForeground(new java.awt.Color(255, 0, 0));
        txt_cerrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cerrada.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Permisos Cerrados");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Permisos detallados"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ALTURAS :");

        txt_altura.setEditable(false);
        txt_altura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_altura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_altura.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("CALIENTE :");

        txt_caliente.setEditable(false);
        txt_caliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_caliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_caliente.setText("0");

        txt_excavacion.setEditable(false);
        txt_excavacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_excavacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_excavacion.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("EXCAVACIÓN :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("LOTO :");

        txt_loto.setEditable(false);
        txt_loto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_loto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_loto.setText("0");

        txt_espacio_confinado.setEditable(false);
        txt_espacio_confinado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_espacio_confinado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_espacio_confinado.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ESPACIOS CONFINADOS :");

        txt_manipulacion_carga.setEditable(false);
        txt_manipulacion_carga.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_manipulacion_carga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_manipulacion_carga.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("MANIPULACIÓN DE CARGA :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("SAFERY BYPASS :");

        txt_safery_bypass.setEditable(false);
        txt_safery_bypass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_safery_bypass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_safery_bypass.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("AREAS CLASIFICADAS :");

        txt_areas_clasificadas.setEditable(false);
        txt_areas_clasificadas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_areas_clasificadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_areas_clasificadas.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ROCTURA DE LINEA :");

        txt_roctura_linea.setEditable(false);
        txt_roctura_linea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_roctura_linea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_roctura_linea.setText("0");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("SIN RIESGO :");

        txt_sin_riesgo.setEditable(false);
        txt_sin_riesgo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_sin_riesgo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sin_riesgo.setText("0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("MANIPULACIÓN DE CARGA CRITICA :");

        txt_manipulacion_carga_critica.setEditable(false);
        txt_manipulacion_carga_critica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_manipulacion_carga_critica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_manipulacion_carga_critica.setText("0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("FUERA DE SERVICIO RED CONTRAINCENDIO :");

        txt_fuera_red_contraincendio.setEditable(false);
        txt_fuera_red_contraincendio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_fuera_red_contraincendio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fuera_red_contraincendio.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_manipulacion_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_loto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_excavacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_caliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_espacio_confinado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_sin_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fuera_red_contraincendio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_manipulacion_carga_critica, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_safery_bypass, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_areas_clasificadas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_roctura_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_safery_bypass, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_areas_clasificadas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_roctura_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_sin_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_manipulacion_carga_critica, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_fuera_red_contraincendio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_caliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_excavacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_loto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_espacio_confinado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_manipulacion_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        txt_total_perdidos.setEditable(false);
        txt_total_perdidos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_total_perdidos.setForeground(new java.awt.Color(51, 51, 255));
        txt_total_perdidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total_perdidos.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total Permisos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_solicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txt_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_anulados, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_cerrada, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_total_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_anulados, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_solicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cerrada, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_total_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("Permite Buscar la informacion seleccioda en el filtro");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(date_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (this.date_fecha_inicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
        } else if (this.date_fecha_final.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
        } else {
            String formato1 = date_fecha_inicio.getDateFormatString();
            Date date1 = (Date) date_fecha_inicio.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
            String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

            String formato2 = date_fecha_final.getDateFormatString();
            Date date2 = (Date) date_fecha_final.getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
            String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

            consulta_rango_fechas_solicitada(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_perdido(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_anulado(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_cerrado(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_total(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_alturas(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_alturas(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_caliente(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_excavacion(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_loto(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_espacio_confinado(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_manipulacion_carga(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_Safery_bypass(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_areas_clasificadas(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_roctura_linea(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_sin_riesgo(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_manipulacion_carga_critica(fecha_ingresada_inicio, fecha_ingresada_final);
            consulta_rango_fechas_fuera_servicio_red(fecha_ingresada_inicio, fecha_ingresada_final);
            conexion.cerrar();
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_anulados;
    private javax.swing.JTextField txt_areas_clasificadas;
    private javax.swing.JTextField txt_caliente;
    private javax.swing.JTextField txt_cerrada;
    private javax.swing.JTextField txt_espacio_confinado;
    private javax.swing.JTextField txt_excavacion;
    private javax.swing.JTextField txt_fuera_red_contraincendio;
    private javax.swing.JTextField txt_loto;
    private javax.swing.JTextField txt_manipulacion_carga;
    private javax.swing.JTextField txt_manipulacion_carga_critica;
    private javax.swing.JTextField txt_perdidos;
    private javax.swing.JTextField txt_roctura_linea;
    private javax.swing.JTextField txt_safery_bypass;
    private javax.swing.JTextField txt_sin_riesgo;
    private javax.swing.JTextField txt_solicitado;
    private javax.swing.JTextField txt_total_perdidos;
    // End of variables declaration//GEN-END:variables

    public void consulta_rango_fechas_solicitada(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query1 = "";

        query1 = "SELECT "
                + "COUNT(ID) AS SOLICITADO "
                + "FROM "
                + "PERMISOS "
                + "WHERE (ESTADO = 'Solicitado') "
                + "AND FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query1);

            txt_solicitado.setText(rs.getString("SOLICITADO"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void consulta_rango_fechas_cerrado(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query2 = "";

        query2 = "SELECT "
                + "COUNT(ID) AS CERRADO "
                + "FROM "
                + "PERMISOS "
                + "WHERE (ESTADO = 'Cerrado') "
                + "AND FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'";
        try {
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);

            txt_cerrada.setText(rs2.getString("CERRADO"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void consulta_rango_fechas_perdido(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query3 = "";

        query3 = "SELECT "
                + "COUNT(ID) AS PERDIDOS "
                + "FROM "
                + "PERMISOS "
                + "WHERE (ESTADO = 'Perdido') "
                + "AND FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'";
        try {
            Statement st3 = cn.createStatement();
            ResultSet rs3 = st3.executeQuery(query3);

            txt_perdidos.setText(rs3.getString("PERDIDOS"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void consulta_rango_fechas_anulado(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query4 = "";

        query4 = "SELECT "
                + "COUNT(ID) AS ANULADO "
                + "FROM "
                + "PERMISOS "
                + "WHERE (ESTADO = 'Anulado') "
                + "AND FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'";
        try {
            Statement st4 = cn.createStatement();
            ResultSet rs4 = st4.executeQuery(query4);

            txt_anulados.setText(rs4.getString("ANULADO"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void consulta_rango_fechas_total(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query5 = "";

        query5 = "SELECT "
                + "COUNT(ID) AS TOTAL "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query5);

            txt_total_perdidos.setText(rs5.getString("TOTAL"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_alturas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PA "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PA'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_altura.setText(rs5.getString("PA"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_caliente(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_caliente.setText(rs5.getString("PC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_excavacion(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PE "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PE'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_excavacion.setText(rs5.getString("PE"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_loto(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PL "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PL'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_loto.setText(rs5.getString("PL"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_espacio_confinado(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PEC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PEC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_espacio_confinado.setText(rs5.getString("PEC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_manipulacion_carga(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PMC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PMC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_manipulacion_carga.setText(rs5.getString("PMC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_Safery_bypass(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PSB "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PSB'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_safery_bypass.setText(rs5.getString("PSB"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_areas_clasificadas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PAC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PAC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_areas_clasificadas.setText(rs5.getString("PAC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_roctura_linea(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PRL "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PRL'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_roctura_linea.setText(rs5.getString("PRL"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_sin_riesgo(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PSR "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PSR'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_sin_riesgo.setText(rs5.getString("PSR"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_manipulacion_carga_critica(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PMCC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PMCC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_manipulacion_carga_critica.setText(rs5.getString("PMCC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void consulta_rango_fechas_fuera_servicio_red(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        String query = "";

        query = "SELECT "
                + "COUNT(ID) AS PFSRC "
                + "FROM "
                + "PERMISOS "
                + "WHERE FECHA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "AND INDICADOR_PERMISO = 'PFSRC'";
        try {
            Statement st5 = cn.createStatement();
            ResultSet rs5 = st5.executeQuery(query);

            txt_fuera_red_contraincendio.setText(rs5.getString("PFSRC"));

            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
