package Programas;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Binomial extends javax.swing.JInternalFrame {
    
    public static int[] arreglo_N;
    public static double[] arreglo_fx;
    public static double[] arreglo_Fx;
    public static double[] arreglo_R_fx;
    public static double[] arreglo_R_promedio;
    public static double[] arreglo_R_promedio_2;
    public static double[] arreglo_R_promedio_2_fx;
    
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;
    
    public static String[] titulos = {"R", "f(x)", "F(x)", "R * f(x)", "R - promedio", "(R - promedio)^2", "(R - promedio)^2*f(x)"};
    public static String[] registros_tabla;
    
    public static int N = 0;
    public static double P = 0;
    public static double Q = 0;
    public static double promedio = 0;
    public static double varianza = 0;
    public static double desviacion = 0;
    
    public Binomial() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_P = new javax.swing.JTextField();
        txt_N = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_Q = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_varianza = new javax.swing.JTextField();
        txt_desviacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Promedio = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POBABILIDAD BINOMIAL");

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_resultados.setRowHeight(23);
        jScrollPane1.setViewportView(tabla_resultados);
        tabla_resultados.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("N :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("P :");

        txt_P.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_P.setForeground(new java.awt.Color(255, 0, 0));
        txt_P.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_N.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_N.setForeground(new java.awt.Color(255, 0, 0));
        txt_N.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_P, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_P, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        txt_Q.setEditable(false);
        txt_Q.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Q.setForeground(new java.awt.Color(0, 51, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Q :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Varianza :");

        txt_varianza.setEditable(false);
        txt_varianza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_varianza.setForeground(new java.awt.Color(0, 51, 255));

        txt_desviacion.setEditable(false);
        txt_desviacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_desviacion.setForeground(new java.awt.Color(0, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Desviación :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Promedio :");

        txt_Promedio.setEditable(false);
        txt_Promedio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Promedio.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_desviacion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txt_varianza))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_varianza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_desviacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addComponent(txt_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        N = Integer.parseInt(txt_N.getText());
        P = Double.parseDouble(txt_P.getText());
        Q = (1 - P);
        
        arreglo_N = new int[N + 1];
        arreglo_fx = new double[N + 1];
        arreglo_Fx = new double[N + 1];
        arreglo_R_fx = new double[N + 1];
        arreglo_R_promedio = new double[N + 1];
        arreglo_R_promedio_2 = new double[N + 1];
        arreglo_R_promedio_2_fx = new double[N + 1];
        
        for (int i = 0; i < arreglo_N.length; i++) {
            
            arreglo_N[i] = i; // N = R

            arreglo_fx[i] = redondearDecimales((factorial(N) / (factorial(i) * factorial(N - i)) * (Math.pow(P, i)) * (Math.pow(Q, (N - i)))), 4); // f(x)

            if (i == 0) {
                arreglo_Fx[i] = arreglo_fx[i]; // F(x)
            } else {
                arreglo_Fx[i] = redondearDecimales(arreglo_Fx[i - 1] + arreglo_fx[i], 4); // F(x)
            }
            
            arreglo_R_fx[i] = redondearDecimales(arreglo_N[i] * arreglo_fx[i], 4); // R * f(x)

        }
        
        for (int j = 0; j < arreglo_R_fx.length; j++) {
            
            promedio += redondearDecimales(arreglo_R_fx[j], 1); // Promedio de (R * f(x))

        }
        
        for (int k = 0; k < arreglo_N.length; k++) {
            
            arreglo_R_promedio[k] = arreglo_N[k] - promedio; // R - promedio

            arreglo_R_promedio_2[k] = Math.pow(arreglo_R_promedio[k], 2); // (R - promedio)^2

            arreglo_R_promedio_2_fx[k] = redondearDecimales(arreglo_R_promedio_2[k] * arreglo_fx[k], 4);
            
        }
        
        for (int l = 0; l < arreglo_N.length; l++) {
            
            varianza += redondearDecimales(arreglo_R_promedio_2_fx[l], 4); // varianza es la sumatoria de arreglo_R_promedio_2_fx

        }
        
        desviacion = redondearDecimales(Math.sqrt(varianza), 4); // raiz de a varianza

        registros_tabla = new String[8];
        modelo = new DefaultTableModel(null, titulos);

        //MUESTRA LOS RESULTADOS EN EL JTABLE
        for (int m = 0; m < arreglo_N.length; m++) {
            
            registros_tabla[0] = "" + arreglo_N[m];
            registros_tabla[1] = "" + arreglo_fx[m];
            registros_tabla[2] = "" + arreglo_Fx[m];
            registros_tabla[3] = "" + arreglo_R_fx[m];
            registros_tabla[4] = "" + arreglo_R_promedio[m];
            registros_tabla[5] = "" + arreglo_R_promedio_2[m];
            registros_tabla[6] = "" + arreglo_R_promedio_2_fx[m];
            
            modelo.addRow(registros_tabla);
        }
        
        tabla_resultados.setModel(modelo);
        centrar_datos();
        
        txt_Promedio.setText("" + promedio);
        txt_Q.setText("" + Q);
        txt_varianza.setText("" + varianza);
        txt_desviacion.setText("" + desviacion);
        

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_N;
    private javax.swing.JTextField txt_P;
    private javax.swing.JTextField txt_Promedio;
    private javax.swing.JTextField txt_Q;
    private javax.swing.JTextField txt_desviacion;
    private javax.swing.JTextField txt_varianza;
    // End of variables declaration//GEN-END:variables

    public int factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return (int) (numero * factorial(numero - 1));
        }
    }
    
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }
    
    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_resultados.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_resultados.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        tabla_resultados.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        tabla_resultados.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tabla_resultados.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tabla_resultados.getColumnModel().getColumn(5).setCellRenderer(Alinear);
    }
    
}
