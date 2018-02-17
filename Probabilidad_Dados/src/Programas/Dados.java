package Programas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Dados extends javax.swing.JInternalFrame {

    public static int[] dado1;
    public static int[] dado2;
    public static int contador = 0;

    public static String[] probabilidad1;
    public static String[] probabilidad2;
    public static int[] cantidad;
    public static double[] porcentaje;

    public static int aleatorio = 0;
    public static DefaultTableModel modelo1;
    public static DefaultTableModel modelo2;

    public static DefaultTableCellRenderer Alinear1;
    public static DefaultTableCellRenderer Alinear2;

    public static String[] registros_tabla1;
    public static String[] registros_tabla2;

    String[] titulos_tabla1 = {"NUMERO", "TIRO 1", "TIRO 2"};
    String[] titulos_tabla2 = {"NUMERO", "PROBA 1", "PROBA 2", "CANTIDAD", "PORCENTAJE"};

    public static int intAleatorio1 = 0;
    public static int intAleatorio2 = 0;
    public static int cant_iteracion = 0;

    public Dados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado_tabla2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txt_numero_iteracion = new javax.swing.JTextField();
        btn_inicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultados_tabla1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POBABILIDAD DADOS");

        resultado_tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        resultado_tabla2.setRowHeight(23);
        jScrollPane1.setViewportView(resultado_tabla2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel26.setText("Numero de Iteraciones :");

        txt_numero_iteracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_numero_iteracion.setForeground(new java.awt.Color(255, 0, 0));
        txt_numero_iteracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_inicar.setText("Iniciar");
        btn_inicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_numero_iteracion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inicar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero_iteracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inicar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultados_tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        resultados_tabla1.setRowHeight(23);
        jScrollPane2.setViewportView(resultados_tabla1);

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicarActionPerformed

        cant_iteracion = Integer.parseInt(txt_numero_iteracion.getText());

        if (cant_iteracion <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
        } else {

            dado1 = new int[cant_iteracion];
            dado2 = new int[cant_iteracion];

            registros_tabla1 = new String[3];

            modelo1 = new DefaultTableModel(null, titulos_tabla1);

            Random aleatorio = new Random(System.currentTimeMillis());

            for (int i = 0; i < dado1.length; i++) {
                registros_tabla1[0] = "" + (i + 1);

                intAleatorio1 = 1 + aleatorio.nextInt(6);
                dado1[i] = intAleatorio1;
                registros_tabla1[1] = "" + MostrarLado(intAleatorio1);

                intAleatorio2 = 1 + aleatorio.nextInt(6);
                dado2[i] = intAleatorio2;
                registros_tabla1[2] = "" + MostrarLado(intAleatorio2);

                modelo1.addRow(registros_tabla1);
            }

            resultados_tabla1.setModel(modelo1);
            centrar_datos_tabla1();
        }

        probabilidad1 = new String[37];
        probabilidad2 = new String[37];
        contador = 0;

        modelo2 = new DefaultTableModel(null, titulos_tabla2);
        registros_tabla2 = new String[6];

         calcularProbabilidad();
        
        for (int j = 1; j < 7; j++) {

            for (int k = 1; k < 7; k++) {

                registros_tabla2[0] = "" + (contador + 1);

                probabilidad1[contador] = "LADO " + j;
                registros_tabla2[1] = probabilidad1[contador];

                probabilidad2[contador] = "LADO " + k;
                registros_tabla2[2] = probabilidad2[contador];

                registros_tabla2[3] = "" + cantidad[contador];

                registros_tabla2[4] = "" + porcentaje[contador];
                
                contador++;
                                
                modelo2.addRow(registros_tabla2);
            }

        }    
        
        resultado_tabla2.setModel(modelo2);
                                       

    }//GEN-LAST:event_btn_inicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable resultado_tabla2;
    private javax.swing.JTable resultados_tabla1;
    private javax.swing.JTextField txt_numero_iteracion;
    // End of variables declaration//GEN-END:variables

    public String MostrarLado(int numero) {

        String lado = "";

        switch (numero) {
            case 1:
                lado = "LADO 1";
                break;
            case 2:
                lado = "LADO 2";
                break;
            case 3:
                lado = "LADO 3";
                break;
            case 4:
                lado = "LADO 4";
                break;
            case 5:
                lado = "LADO 5";
                break;
            case 6:
                lado = "LADO 6";
                break;
            default:
                break;
        }
        return lado;
    }

    public void calcularProbabilidad() {

        int valorDado1 = 0, valorDado2 = 0;
                
         cantidad = new int[37];
         porcentaje = new double[37];

        for (int i = 0; i < dado1.length; i++) {

            valorDado1 = dado1[i];
            valorDado2 = dado2[i];

            if (valorDado1 == 1 && valorDado2 == 1) {
                cantidad[0] += 1;
                porcentaje[0] = redondearDecimales((cantidad[0]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 1 && valorDado2 == 2) {
                cantidad[1] += 1;
                porcentaje[1] = redondearDecimales((cantidad[1]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 1 && valorDado2 == 3) {
                cantidad[2] += 1;
                porcentaje[2] = redondearDecimales((cantidad[2]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 1 && valorDado2 == 4) {
                cantidad[3] += 1;
                porcentaje[3] = redondearDecimales((cantidad[3]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 1 && valorDado2 == 5) {
                cantidad[4] += 1;
                porcentaje[4] = redondearDecimales((cantidad[4]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 1 && valorDado2 == 6) {
                cantidad[5] += 1;
                porcentaje[5] = redondearDecimales((cantidad[5]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 2) {
                cantidad[6] += 1;
                porcentaje[6] = redondearDecimales((cantidad[6]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 1) {
                cantidad[7] += 1;
                porcentaje[7] = redondearDecimales((cantidad[7]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 3) {
                cantidad[8] += 1;
                porcentaje[8] = redondearDecimales((cantidad[8]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 4) {
                cantidad[9] += 1;
                porcentaje[9] = redondearDecimales((cantidad[9]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 5) {
                cantidad[10] += 1;
                porcentaje[10] = redondearDecimales((cantidad[10]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 2 && valorDado2 == 6) {
                cantidad[11] += 1;
                porcentaje[11] = redondearDecimales((cantidad[11]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 1) {
                cantidad[12] += 1;
                porcentaje[12] = redondearDecimales((cantidad[12]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 2) {
                cantidad[13] += 1;
                porcentaje[13] = redondearDecimales((cantidad[13]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 3) {
                cantidad[14] += 1;
                porcentaje[14] = redondearDecimales((cantidad[14]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 4) {
                cantidad[15] += 1;
                porcentaje[15] = redondearDecimales((cantidad[15]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 5) {
                cantidad[16] += 1;
                porcentaje[16] = redondearDecimales((cantidad[16]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 3 && valorDado2 == 6) {
                cantidad[17] += 1;
                porcentaje[17] = redondearDecimales((cantidad[17]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 1) {
                cantidad[18] += 1;
                porcentaje[18] = redondearDecimales((cantidad[18]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 2) {
                cantidad[19] += 1;
                porcentaje[19] = redondearDecimales((cantidad[19]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 3) {
                cantidad[20] += 1;
                porcentaje[20] = redondearDecimales((cantidad[20]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 4) {
                cantidad[21] += 1;
                porcentaje[21] = redondearDecimales((cantidad[21]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 5) {
                cantidad[22] += 1;
                porcentaje[22] = redondearDecimales((cantidad[22]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 4 && valorDado2 == 6) {
                cantidad[23] += 1;
                porcentaje[23] = redondearDecimales((cantidad[23]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 1) {
                cantidad[24] += 1;
                porcentaje[24] = redondearDecimales((cantidad[24]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 2) {
                cantidad[25] += 1;
                porcentaje[25] = redondearDecimales((cantidad[25]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 3) {
                cantidad[26] += 1;
                porcentaje[26] = redondearDecimales((cantidad[26]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 4) {
                cantidad[27] += 1;
                porcentaje[27] = redondearDecimales((cantidad[27]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 5) {
                cantidad[28] += 1;
                porcentaje[28] = redondearDecimales((cantidad[28]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 5 && valorDado2 == 6) {
                cantidad[29] += 1;
                porcentaje[29] = redondearDecimales((cantidad[29]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 1) {
                cantidad[30] += 1;
                porcentaje[30] = redondearDecimales((cantidad[30]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 2) {
                cantidad[31] += 1;
                porcentaje[31] = redondearDecimales((cantidad[31]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 3) {
                cantidad[32] += 1;
                porcentaje[32] = redondearDecimales((cantidad[32]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 4) {
                cantidad[33] += 1;
                porcentaje[33] = redondearDecimales((cantidad[33]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 5) {
                cantidad[34] += 1;
                porcentaje[34] = redondearDecimales((cantidad[34]/Double.parseDouble(""+cant_iteracion)),2);
            } else if (valorDado1 == 6 && valorDado2 == 6) {
                cantidad[35] += 1;
                porcentaje[35] = redondearDecimales((cantidad[35]/Double.parseDouble(""+cant_iteracion)),2);
            }

        }
        
        System.out.println("");

    }

    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }

    public void centrar_datos_tabla1() {
        Alinear1 = new DefaultTableCellRenderer();
        Alinear1.setHorizontalAlignment(SwingConstants.CENTER);
        resultados_tabla1.getColumnModel().getColumn(0).setCellRenderer(Alinear1);
        resultados_tabla1.getColumnModel().getColumn(1).setCellRenderer(Alinear1);
        resultados_tabla1.getColumnModel().getColumn(2).setCellRenderer(Alinear1);

    }
    
    
}
