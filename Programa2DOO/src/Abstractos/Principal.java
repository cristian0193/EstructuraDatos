package Abstractos;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Rodriguez
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        combo_red_social = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_url = new javax.swing.JTextField();
        txt_fundador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_navegar = new javax.swing.JTextField();
        txt_compartir = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lb_icono = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REDES SOCIALES");

        combo_red_social.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FACEBOOK", "GOOGLE", "INSTAGRAM", "LINKEDIN", "TWITTER", "YOUTUBE" }));
        combo_red_social.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_red_socialItemStateChanged(evt);
            }
        });

        jLabel2.setText("RED SOCIAL :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion"));

        jLabel3.setText("Nombre Red Social :");

        txt_nombre.setEditable(false);

        jLabel4.setText("URL :");

        txt_url.setEditable(false);

        txt_fundador.setEditable(false);

        jLabel5.setText("Fundador :");

        jLabel6.setText("Precio :");

        txt_precio.setEditable(false);
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodos Abstractos"));
        jPanel3.setFocusCycleRoot(true);

        jLabel8.setText("COMPARTIR :");

        jLabel9.setText("BUSCAR :");

        jLabel10.setText("NAVEGAR :");

        txt_navegar.setEditable(false);

        txt_compartir.setEditable(false);

        txt_buscar.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_compartir, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(txt_navegar)
                    .addComponent(txt_buscar))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_compartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_navegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_precio)
                            .addComponent(txt_fundador)
                            .addComponent(txt_url)
                            .addComponent(txt_nombre))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_fundador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_icono.setBackground(new java.awt.Color(255, 255, 255));
        lb_icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_icono, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_icono, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combo_red_social, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_red_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void combo_red_socialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_red_socialItemStateChanged

        int index = combo_red_social.getSelectedIndex();
        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {
            Facebook();
        } else if (index == 2) {
            Google();
        } else if (index == 3) {
            Instagram();
        } else if (index == 4) {
            Linkedin();
        }else if(index == 5){
            Twitter();
        }else{
            Youtube();
        }

    }//GEN-LAST:event_combo_red_socialItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_red_social;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_icono;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_compartir;
    private javax.swing.JTextField txt_fundador;
    private javax.swing.JTextField txt_navegar;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_url;
    // End of variables declaration//GEN-END:variables

    public void Facebook() {
        Facebook facebook = new Facebook("Facebook", "https://www.facebook.com", "Mark Zuckerberg", "337.000 millones de dólares");
        this.txt_nombre.setText(facebook.getNombre_Red());
        this.txt_url.setText(facebook.getURL());
        this.txt_fundador.setText(facebook.getFundador());
        this.txt_precio.setText(facebook.getPrecio());
        this.txt_compartir.setText(facebook.Compatir());
        this.txt_navegar.setText(facebook.Navegar());
        this.txt_buscar.setText(facebook.Buscar());

        String path = "/Imagenes/facebook.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }

     public void Google() {
        Google google = new Google("Google+ ", "https://plus.google.com/", "Larry Page y Serguei Brin", "5.000 millones de dólares");
        this.txt_nombre.setText(google.getNombre_Red());
        this.txt_url.setText(google.getURL());
        this.txt_fundador.setText(google.getFundador());
        this.txt_precio.setText(google.getPrecio());
        this.txt_compartir.setText(google.Compatir());
        this.txt_navegar.setText(google.Navegar());
        this.txt_buscar.setText(google.Buscar());

        String path = "/Imagenes/google.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }
     
      public void Instagram() {
        Instagram instagram = new Instagram("Instagram", "https://www.instagram.com", "Kevin Systrom y Mike Krieger", "1.000 millones de dólares");
        this.txt_nombre.setText(instagram.getNombre_Red());
        this.txt_url.setText(instagram.getURL());
        this.txt_fundador.setText(instagram.getFundador());
        this.txt_precio.setText(instagram.getPrecio());
        this.txt_compartir.setText(instagram.Compatir());
        this.txt_navegar.setText(instagram.Navegar());
        this.txt_buscar.setText(instagram.Buscar());

        String path = "/Imagenes/instagram.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }
      
       public void Linkedin() {
        Linkedln linkedin = new Linkedln("LinkedIn", "	https://www.linkedin.com", "Reid Hoffman y Allen Blue", "26.200 millones de dólares");
        this.txt_nombre.setText(linkedin.getNombre_Red());
        this.txt_url.setText(linkedin.getURL());
        this.txt_fundador.setText(linkedin.getFundador());
        this.txt_precio.setText(linkedin.getPrecio());
        this.txt_compartir.setText(linkedin.Compatir());
        this.txt_navegar.setText(linkedin.Navegar());
        this.txt_buscar.setText(linkedin.Buscar());

        String path = "/Imagenes/Linkedin.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }
       
        public void Twitter() {
        Twitter twitter = new Twitter("Twitter", "https://twitter.com", "Jack Dorsey y Evan Williams", "31.700 millones de dólares");
        this.txt_nombre.setText(twitter.getNombre_Red());
        this.txt_url.setText(twitter.getURL());
        this.txt_fundador.setText(twitter.getFundador());
        this.txt_precio.setText(twitter.getPrecio());
        this.txt_compartir.setText(twitter.Compatir());
        this.txt_navegar.setText(twitter.Navegar());
        this.txt_buscar.setText(twitter.Buscar());

        String path = "/Imagenes/Twitter.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }
        
         public void Youtube() {
        YouTube youtube = new YouTube("Youtube", "https://www.youtube.com", "Larry Page y Serguei Brin", "17.000 millones de dólares");
        this.txt_nombre.setText(youtube.getNombre_Red());
        this.txt_url.setText(youtube.getURL());
        this.txt_fundador.setText(youtube.getFundador());
        this.txt_precio.setText(youtube.getPrecio());
        this.txt_compartir.setText(youtube.Compatir());
        this.txt_navegar.setText(youtube.Navegar());
        this.txt_buscar.setText(youtube.Buscar());

        String path = "/Imagenes/YouTube.jpg";
        URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon(url);

        lb_icono.setIcon(icon);
    }
    
}
