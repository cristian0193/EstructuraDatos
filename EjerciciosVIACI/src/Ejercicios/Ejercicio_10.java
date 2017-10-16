/*Teniendo en cuenta el siguiente diagrama de flujo deberá realizar el programa que allí se indica, 
debe hacer uso de condicionales lógicos y aritméticos.*/
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_10 {

    public static void main(String[] args) {

        double nota1, nota2, nota3, prom;
        String mensaje;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota # 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota # 2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota # 3"));

        prom = (nota1 + nota2 + nota3) / 3;

        if (prom >= 7) {
            mensaje = "Promocionado";
        } else {
            if (prom >= 4) {
                mensaje = "Regular";
            } else {
                mensaje = "Reprobado";
            }
        }
        
        JOptionPane.showMessageDialog(null, mensaje);

    }

}
