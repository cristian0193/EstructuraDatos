package estructuradatos1;

import javax.swing.JOptionPane;

public class EjercicioTraspuestaMatriz {

    public static int[][] matriz;
    public static int[][] matrizTraspuesta;
    public static String mensajeMatriz = "";
    public static int filas, columnas, numero,dato;

    public static void main(String[] args) {

        EjercicioTraspuestaMatriz obj = new EjercicioTraspuestaMatriz();
        
        obj.MetodoLlenaMatrices();
        obj.MatrizTraspuesta();
        obj.ImprimirMatriz();
    }

    public void MetodoLlenaMatrices() {

        //DECLARAMOS LA DIMENCION DE LA MATRIZ LLENA 
        filas = leerNumero("INGRESE EL NUMERO DE FILAS (MATRIZ A)");
        columnas = leerNumero("INGRESE EL NUMERO DE COLUMNAS (MATRIZ B)");

        matriz = new int[filas][columnas];

        for (int posicionFilasA = 0; posicionFilasA < filas; posicionFilasA++) {
            for (int posicionColumnasA = 0; posicionColumnasA < columnas; posicionColumnasA++) {
                numero = leerNumero(("INGRESE NUMERO DE LA (MATRIZ) EN POSICION : [" + posicionFilasA + " - " + posicionColumnasA + "]"));
                matriz[posicionFilasA][posicionColumnasA] = numero;
            }
        }
    }

    public void MatrizTraspuesta() {
        matrizTraspuesta = new int[matriz[0].length][matriz.length];

        for (int posicionFilas = 0; posicionFilas < matriz.length; posicionFilas++) {
            for (int posicionColumnas = 0; posicionColumnas < matriz[0].length; posicionColumnas++) {
                matrizTraspuesta[posicionColumnas][posicionFilas] = matriz[posicionFilas][posicionColumnas];
            }
        }
    }

    public void ImprimirMatriz() {
        //MUESTRA EL MENSAJE    
        for (int posicionFilas = 0; posicionFilas < matrizTraspuesta.length; posicionFilas++) {
            for (int posicionColumnas = 0; posicionColumnas < matrizTraspuesta[0].length; posicionColumnas++) {
                mensajeMatriz = mensajeMatriz + matrizTraspuesta[posicionFilas][posicionColumnas] + " ";
            }
            mensajeMatriz = mensajeMatriz + "\n";
        }

        JOptionPane.showMessageDialog(null, mensajeMatriz);
    }
    
    public int leerNumero(String mensaje){      
        dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    

}
