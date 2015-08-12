package estructuradatos1;

import javax.swing.JOptionPane;

public class EjerciciosEstructura2 {

    public static int[][] matriz;
    public static int numero = 0, error;
    public static String numero2 = "";
    public static EjerciciosEstructura2 clase;

    public static void main(String[] args) {

        int filas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS "));

        matriz = new int[filas][columnas];

        for (int posicionFilas = 0; posicionFilas < filas; posicionFilas++) {
            for (int posicionColumnas = 0; posicionColumnas < columnas; posicionColumnas++) {

                
                do {                    
                    numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE LA MATRIZ EN POSICION : [" + posicionFilas + " - " + posicionColumnas + "]"));
                if (numero>0 && numero<99999) {
                    matriz[posicionFilas][posicionColumnas] = numero;
                    error = 0;
                } else {
                     JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO DE 5 DIGITOS");
                     error = 1;
                }
                } while (error == 1);
                
            }
        }

        
        String mat = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mat = mat + matriz[i][j] + " ";
            }
            mat = mat + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mat);
    }
}
