package Conexion;

import Vista.Principal;

public class Ejecutable {
 
    public static void main(String[] args) {
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
}
