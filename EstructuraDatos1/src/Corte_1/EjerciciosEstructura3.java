
package Corte_1;

import javax.swing.JOptionPane;


public class EjerciciosEstructura3 {

    public static int[][] matrizA;
    public static int[][] matrizB;
    public static int[][] matrizProducto;
    public static String mensajeMatriz = "";
    public static int filasA = 0, columnasA = 0, filasB = 0, columnasB = 0, contador = 0, validacion = 0,
                      numeroA = 0, suma = 0,numeroB = 0;

    public static void main(String[] args) {

        EjercicioMultiplicacionMatrices obj = new EjercicioMultiplicacionMatrices();
        validacion = obj.MetodoLlenaMatrices();

        if (validacion == 0) {

           obj.ProductoMatrices();
           obj.ImprimirMatriz();
            
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE PRODUCTO ENTRE MATRICES");
        }

    }

    public int MetodoLlenaMatrices() {

        //DIMENSION DE MATRIZ A
        filasA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS (MATRIZ A)"));
        columnasA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS (MATRIZ B)"));

        //DIMENSION DE MATRIZ A
        filasB = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS (MATRIZ B)"));
        columnasB = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS (MATRIZ B)"));

        if (columnasA == filasB) {

            contador = 0;
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

        } else {
            contador = 1;
        }
        return contador;

    }
    
    public void ProductoMatrices(){
         //INICIALIZO LA MATRIZ RESULTADO CON LAS DIMENCIONES (M X P)
            matrizProducto = new int[filasA][columnasB];

            for (int posicionFilas = 0; posicionFilas < filasA; posicionFilas++) {
                for (int posicionColumnas2 = 0; posicionColumnas2 < columnasB; posicionColumnas2++) {
                    for (int posicionColumnas1 = 0; posicionColumnas1 < columnasA; posicionColumnas1++) {
                        matrizProducto[posicionFilas][posicionColumnas2] += matrizA[posicionFilas][posicionColumnas1] * matrizB[posicionColumnas1][posicionColumnas2];
                    }

                }
            }
    }

     public void ImprimirMatriz(){
        //MUESTRA EL MENSAJE    
            for(int posicionFilas = 0; posicionFilas < matrizProducto.length; posicionFilas++) {
                for (int posicionColumnas = 0; posicionColumnas < matrizProducto[0].length; posicionColumnas++) {
                    mensajeMatriz = mensajeMatriz + matrizProducto[posicionFilas][posicionColumnas] + " ";
                }
                mensajeMatriz = mensajeMatriz + "\n";
            }

            JOptionPane.showMessageDialog(null, mensajeMatriz);
    }
}
