
package estructuradatos1;

import javax.swing.JOptionPane;


public class EjerciciosEstructura3 {

    public static int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
    public static int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
    public static int[][] matrizResultados;
    public static String mensajeMatriz = "";
    
     public static void main(String[] args) {
         
         matrizResultados = new int[3][3];
         
         for (int posicionFilas = 0; posicionFilas < matriz1.length; posicionFilas++) {
            for (int posicionColumnas = 0; posicionColumnas < matriz1.length; posicionColumnas++) {
                
                matrizResultados[posicionFilas][posicionColumnas] = matriz1[posicionFilas][posicionColumnas] * matriz2[posicionFilas][posicionColumnas];
           
            }
         }
         
         for (int i = 0; i < matrizResultados.length; i++) {
            for (int j = 0; j < matrizResultados[0].length; j++) {
                mensajeMatriz = mensajeMatriz + matrizResultados[i][j] + " ";
            }
            mensajeMatriz = mensajeMatriz + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mensajeMatriz);
         
         
     }
    
}
