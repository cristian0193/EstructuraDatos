/*9.	Cada estudiante debe analizar el código que se le brinda enfocado a vectores; 
cada línea debe ser comentada y de forma general explicar qué hace el programa, 
qué función cumple cada Ciclo for y para qué se utiliza el math.abs dentro del algoritmo.*/

package Ejercicios;

import java.util.*;
import javax.swing.*;

class Ejercicio_9 {

    public static void main(String[] args) {
        
        // Primero solicitamos al usuario ingresar la cantidad de filas y columnas que conforman la matriz
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las Filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las columnas: "));
       
        int i, j; // Inicializamos varaibles
        
        Random R = new Random(); // Instanciamos el metodo Random para obtener valores aleatorio segun el rango definido
        
        int A[][] = new int[filas][columnas]; //definicmos la matriz con el numero de filas y columna ingresadas por el usuario
        
//Lectura()        
        for (i = 0; i < filas; i++) { //recorrido de las filas segun el numero definido por el usuario
            for (j = 0; j < columnas; j++) { //recorrido de las columnas segun el numero definido por el usuario
                
                /*Medidante el metodo Math.abs garantizamos que los valores obtenidos en el random se conviertan a positivos y se adicionen a la matriz.
                adicional a eso se parametrizo que los numero dentro del rango de aleatorios se encuentren de 0 a 100.*/                
                
                A[i][j] = Math.abs(R.nextInt() % 99 + 1); 
            }
        }

//Escritura
        System.out.println("   ------  Matriz Leida  -------");
        for (i = 0; i < filas; i++) { // recorremos las filas de la matriz para luego obtener su valor.
            System.out.println();
            for (j = 0; j < columnas; j++) { // recorremos las columnas de la matriz para luego obtener su valor.
                
                if (A[i][j] >= 10) { // por medio de condicional IF se realiza la seleccion de los datos si estos son mayores o igual a 10 se escriben en una posicion determinada de los contrario en la siguiente posicion.
                    System.out.print(A[i][j] + "  "); // escribimos el valor en consola
                } else {
                    System.out.print(A[i][j] + "   "); // escribimos el valor en consola
                }
            }
        }
        System.out.println();
        System.exit(0); // termina el programa
    }
}
