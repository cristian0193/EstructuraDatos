package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static String menu;
    public static int seleccion;
    public static double numero1, numero2, resultado;

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primero numero (3 cifras): "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero (3 cifras): "));

                    division(numero1,numero2);
                    
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static double division(double numero1, double numero2) {

        if (numero1 >= 100 && numero1 <= 999) {
            JOptionPane.showMessageDialog(null, "El primer valor ingresado no es de (3 cifras) ");
        } else if (numero2 >= 100 && numero2 <= 999) {
            JOptionPane.showMessageDialog(null, "El segundo valor ingresado no es de (3 cifras) ");
        }else{
           
            try {
                resultado = numero1/numero2;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Java realizó la validación de la división y no es posible realizarla porque la división por cero (0) no existe");
            }                                    
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
