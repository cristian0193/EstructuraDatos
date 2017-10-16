/* Teniendo en cuenta el siguiente código el cual tiene como objetivo principal: Ingresar cuatro números, 
calcular e informar la suma de los dos primeros, y el producto del tercero y el cuarto. Usted debe analizar 
cada línea del código y ajustarlo de forma correcta y coherente “en cuanto a sintaxis y operaciones” para que 
funcione según lo solicitado. El estudiante deberá entregar el programa funcionando y comentando las líneas que 
debieron ajustar, además deben justificar el porqué de cada ajuste?.*/

package Ejercicios;

import javax.swing.*;

public class Ejercicio_12 {

    public static void main(String[] args) {
         
        // int num2, num3, num4, suma, producto;
        //Se modifica esta linea incluyendo la variable num1 para que pueda ser operada.
        int num1, num2, num3, num4, suma, producto;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer valor:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo valor:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tercer valor:"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuarto valor:"));
        
        // suma = num1 - num2;
        // por medio del operador - obtenemos la resta y no la suma que se requiere. cambiamos el signo a (+).
        suma = num1 + num2;
        
        // producto = num3 % num4;;
        // por medio del operador % obtenemos el modulo de una division y no la multiplicacion que se requiere. cambiamos el signo a (*).        
        producto = num3 * num4;
                        
        System.out.print("La suma de los dos primero valores es : ");
        System.out.println(suma);
        System.out.print("El producto del tercer y cuarto valor es : ");
        // adicionamos la impresion del pruducto 
        System.out.println(producto);

    }
}
