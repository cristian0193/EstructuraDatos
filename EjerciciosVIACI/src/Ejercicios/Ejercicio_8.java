package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static String menu;
    public static int seleccion,numero1, numero2 ;
    public static double resultadoDivision,resultado;

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero numero (3 cifras): "));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero (3 cifras): "));

                    resultadoDivision = division(numero1, numero2);                                        
                    
                    JOptionPane.showMessageDialog(null, "El Resultado es : " + resultadoDivision);

                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static double division(int numero1, int numero2) {

        resultado = 0;

            try {
                resultado = numero1/numero2;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Java realizó la validación de la división y no es posible realizarla porque la división por cero (0) no existe");
                resultado = 0;
            }

        return resultado;
    }

    public static String menu() {

        menu = "Seleccionar una opcion : "
                + "\n 1 - Ingresar Numeros (3 cifras) "
                + "\n 0 - Salir ";
        return menu;
    }

}
