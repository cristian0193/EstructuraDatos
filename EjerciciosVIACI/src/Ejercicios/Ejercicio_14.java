/* Desarrollar un programa el cual cargue los lados de un triángulo e implemente los siguientes métodos: inicializar los atributos 
(variables), imprimir el valor del lado mayor, y otro método que muestre si es equilátero o no. El estudiante debe tener en cuenta 
la siguiente estructura de clases para llevar a cabo el ejercicio de forma correcta, el programa debe ser compilado y ejecutado 
además de realizar el diagrama de flujo pertinente. Las variables deben ser privadas y adicionalmente se debe comentar el proceso 
que  se lleva a cabo en cada línea. */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_14 {

    private static String mensaje, ladoMayor, equilatero;
    private static int edad, lado1, lado2, lado3;

    public void inicializar() {
        lado1 = 0;
        lado2 = 0;
        lado3 = 0;
        ladoMayor = "";
        equilatero = "";
        mensaje = "";
    }

    public void imprimir() {

        mensaje = "El Lado Mayor es : " + esLadoMayor() + "\n "
                + "El triangulo : " + esEquilatero();

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String esLadoMayor() {

        if (lado1 > lado2 && lado1 > lado3) {
            ladoMayor = "Lado 1 = " + lado1;
        } else {
            if (lado2 > lado1 && lado2 > lado3) {
                ladoMayor = "Lado 2 = " + lado2;
            } else {
                if (lado3 > lado1 && lado3 > lado2) {
                    ladoMayor = "Lado 3 = " + lado3;
                } else {
                    ladoMayor = "Lados Iguales ";
                }
            }
        }

        return ladoMayor;
    }

    public String esEquilatero() {

        if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
            equilatero = "es Equilatero ";
        } else {
            equilatero = "no es Equilatero ";
        }

        return equilatero;
    }

    public static void main(String[] ar) {

        Ejercicio_14 ejercicio = new Ejercicio_14();

        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Lado 1 "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Lado 2 "));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Lado 3 "));
        ejercicio.imprimir();

    }
}
