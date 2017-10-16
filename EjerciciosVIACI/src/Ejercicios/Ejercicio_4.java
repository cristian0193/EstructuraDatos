/*En una escuela se requiere almacenar la edad de Veinte (20) estudiantes y posteriormente mostrar las edades de menor a mayor.
Desarrollar la aplicación en java usando  arreglos. */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static String menu, mensaje = "";
    public static int seleccion;
    public static int[] edades = new int[20];

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    ingresoEstudiantes();
                    break;
                case 2:
                    mostarEdadesOrdenadas();
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static void ingresoEstudiantes() {

        for (int i = 0; i < edades.length; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Edad de estudiante # " + (i + 1)));
        }
    }

    public static void ordenEdades(int[] arreglo) {

        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < arreglo.length-1; i++) {
            int min = i;

            //buscamos el menor número
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    //encontramos el menor número
                }
            }

            if (i != min) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }

    public static void mostarEdadesOrdenadas() {
        ordenEdades(edades);

        for (int i = 0; i < edades.length; i++) {
            mensaje += "Edad : " + edades[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String menu() {

        menu = " 1 - Ingresar Edades"
                + "\n 2 - Edades en Orden (Menor a Mayor)"
                + "\n 0 - Salir ";
        return menu;
    }

}
