package estructuradatos1;

import static estructuradatos1.EjerciciosEstructura2.matriz;
import static estructuradatos1.EjerciciosEstructura2.mensajeMatriz;
import javax.swing.JOptionPane;

public class EjercicioMultiplicacionMatrices {

    public static int[][] matrizA;
    public static int[][] matrizB;
    public static int[][] matrizProducto;
    public static int numeroA = 0, suma = 0;
    public static int numeroB = 0;
    public static String mensajeMatriz = "";
    

    public static void main(String[] args) {

        //DIMENSION DE MATRIZ A
        int filasA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS (MATRIZ A)"));
        int columnasA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS (MATRIZ B)"));

        //DIMENSION DE MATRIZ A
        int filasB = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS (MATRIZ B)"));
        int columnasB = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS (MATRIZ B)"));

        if (columnasA == filasB) {

            //INICIALIZO LA MATRIZ A Y B CON LAS DIMENCIONES (N X N)
            matrizA = new int[filasA][columnasA];
            matrizB = new int[filasB][columnasB];
            
            for (int posicionFilasA = 0; posicionFilasA < filasA; posicionFilasA++) {
                for (int posicionColumnasA = 0; posicionColumnasA < columnasA; posicionColumnasA++) {
                    numeroA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE LA (MATRIZ A) EN POSICION : [" + posicionFilasA + " - " + posicionColumnasA + "]"));
                    matrizA[posicionFilasA][posicionColumnasA] = numeroA;                    
                }
            }
            
            for (int posicionFilasB = 0; posicionFilasB < filasB; posicionFilasB++) {
                for (int posicionColumnasB = 0; posicionColumnasB < columnasB; posicionColumnasB++) {
                    numeroB = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE LA (MATRIZ B) EN POSICION : [" + posicionFilasB + " - " + posicionColumnasB + "]"));
                    matrizB[posicionFilasB][posicionColumnasB] = numeroB;                    
                }
            }
       
            
        //INICIALIZO LA MATRIZ RESULTADO CON LAS DIMENCIONES (M X P)
        matrizProducto = new int[filasA][columnasB];
            
       for (int posicionFilas = 0; posicionFilas < filasA; posicionFilas++) {
                for (int posicionColumnas2 = 0; posicionColumnas2 < columnasB; posicionColumnas2++) {                    
				for(int posicionColumnas1 = 0; posicionColumnas1 < columnasA; posicionColumnas1++){	
                                    matrizProducto[posicionFilas][posicionColumnas2] += matrizA[posicionFilas][posicionColumnas1] * matrizB[posicionColumnas1][posicionColumnas2];                    
                                }
                   
                }
            }
       
       

//           
           
       //MUESTRA EL MENSAJE    
       for (int i = 0; i < matrizProducto.length; i++) {
            for (int j = 0; j < matrizProducto[0].length; j++) {
                mensajeMatriz = mensajeMatriz + matrizProducto[i][j] + " ";
            }
            mensajeMatriz = mensajeMatriz + "\n";
        }

        JOptionPane.showMessageDialog(null, mensajeMatriz);
            
        } else {
             JOptionPane.showMessageDialog(null, "NO EXISTE PRODUCTO");
        }

    }


}
