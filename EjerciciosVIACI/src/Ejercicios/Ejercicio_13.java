/*13.	Construir una clase la cual permita capturar el nombre y la edad de una persona teniendo en cuenta la estructura 
proporcionada en el siguiente código. Posteriormente imprimir los datos cargados; después debe mostrar un mensaje 
si es mayor de edad teniendo en cuenta que las variables deben ser privadas para que no sean accedidas desde otra clase, 
el programa debe ser compilado y ejecutado de forma correcta a lo solicitado. */

package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

    private static String nombre,mensaje;
    private static int edad;

    public void inicializar() {
        nombre = "";
        edad = 0;
        mensaje = "";
    }

    public void imprimir() {

        mensaje = "Nombre : " + nombre + "\n "
                + "Edad : " + edad;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void esMayorEdad() {
        
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Es mayor de Edad ");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor de Edad ");
        }
        
    }

    public static void main(String[] ar) {

        Ejercicio_13 ejercicio  = new Ejercicio_13();
        
        nombre = JOptionPane.showInputDialog("Ingrese un nombre ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad "));        
        ejercicio.imprimir();
        ejercicio.esMayorEdad();
        
    }
}
