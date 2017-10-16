/*11.	Teniendo en cuenta el siguiente código en Java usted deberá comentar que proceso se hace en cada línea y describir de 
forma muy precisa y coherente cuál es el objetivo del programa y qué funciones realiza.*/

package Ejercicios;

import javax.swing.*;

public class Ejercicio_11 {

    public static void main(String[] ar) {
        
        int valor;
        
        do { // por medio del do iniciamo el ciclo repretitivo
            
            // Se captura el valor ingresado por el  usuario y luego se convierte a dato entero.
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor entre 0 y 999 (0 finaliza):"));
            
            if (valor >= 100) { // validamos en el condicional if, si el valor ingresado es mayor o igual a 100. en caso de ser verdadero mostrara el mensaje (Tiene 3 dígitos.)
                System.out.println("Tiene 3 dígitos."); // imprimimos el mensaje
            } else {
            
                if (valor >= 10) { // // validamos en el condicional if, si el valor ingresado es mayor o igual a 10. en caso de ser verdadero mostrara el mensaje (Tiene 2 dígitos.)
                    System.out.println("Tiene 2 dígitos."); // imprimimos el mensaje
                } else {
                    System.out.println("Tiene 1 dígito."); // imprimimos el mensaje
                }
            
            }
        
        } while (valor != 0); // es ciclo solo finalizara cuando el valor ingresado por el usuario sea igual a 0, de lo contrario solicitara nuevamente el valor al usuario.
    
    }

}

/* Objetivo
El programa logra identificar por medio de condicionales la cantidad de digitos que tiene un valor ingresado de (0 a 999)
esto validando que cuando un numero se encuentra de 100 a 999 lo componen 3 cifras, si el valor ingresado se encuentra entre
10 a 99 es de 2 cifras, de lo contrario es de 1 cifra.
*/