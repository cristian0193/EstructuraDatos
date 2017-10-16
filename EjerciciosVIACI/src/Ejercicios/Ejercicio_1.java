/* Realizar un programa que permita calcular el IVA del 16 % del valor de un producto. 
Dicha aplicación debe emitir por consola el valor del IVA, valor del producto sin IVA y valor del producto con IVA.*/

package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static String menu, mensaje;
    public static int seleccion;
    public static double valorProducto, valorIVA, valorTotal;
    
    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    valorProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingresar valor del producto :"));
                    JOptionPane.showMessageDialog(null, totalPago(valorProducto));
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static String totalPago(Double valor) {

        valorIVA = valor * 0.16;
        valorTotal = valor + valorIVA;

        mensaje = " Valor del Producto : " + valor + "\n"
                + " IVA 16% : " + valorIVA + "\n"
                + " Total a Pagar : " + valorTotal;

        return mensaje;

    }

    public static String menu() {

        menu =  " 1 - Ingresar Valor del Producto : "
                + "\n 0 - Salir ";
        return menu;
    }

}
