/* La video tienda Bogotá S.A desea construir una aplicación que permita sumar las ventas obtenidas en un día laboral. 
Desarrolle la aplicación usando Operadores básicos en Java, conversión de tipos de datos y operadores aritméticos en Java.*/

package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio_2 {

    public static String venta, menu;
    public static int seleccion;
    public static double totalVentas, valorVentas, sumaDiaria = 0;
    

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    venta = JOptionPane.showInputDialog("Ingresar valor de la venta :");
                    calculoVentaDiarias(venta);
                    break;
                case 2:
                    totalVentas = calculoVentaDiarias("0");
                    JOptionPane.showMessageDialog(null, "Total Ventas del Dia : $ " + totalVentas);
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static double calculoVentaDiarias(String ventas) {

        valorVentas = Integer.parseInt(ventas);

        sumaDiaria += valorVentas;

        return sumaDiaria;
    }

    public static String menu() {

        menu = "-- Video Tienda BOGOTA S.A --"
                + "\n 1 - Ingresar Venta "
                + "\n 2 - Ver Total Ventas "
                + "\n 0 - Salir ";
        return menu;
    }

}
