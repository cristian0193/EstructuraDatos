/* El Instituto Meteorológico requiere conocer  el número de días en una semana en donde la temperatura supera 
los 30 grados centígrados.  Desarrollar una aplicación que permita usando condiciones y contadores  solucionar el problema. */

package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static double[] Temperaturas = new double[7];
    public static String[] Semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    public static int seleccion;
    public static String menu,semanaDia,mensaje = "";
    public static double temperatura,valorTemperatura;

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    ingresoTemperaturas();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, DiasMayorTemperatura());
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static void ingresoTemperaturas() {

        for (int i = 0; i < Semana.length; i++) {

            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Temperatura del Dia : " + Semana[i]));

            Temperaturas[i] = temperatura;

        }

    }

    public static String DiasMayorTemperatura() {

        for (int i = 0; i < Temperaturas.length; i++) {
            
            valorTemperatura = Temperaturas[i];
            semanaDia = Semana[i];
            
            if(valorTemperatura > 30){
                
                mensaje += " " + semanaDia + " : " + valorTemperatura + "\n";                
            
            }
                        
        }                   
        return mensaje;
    }

    public static String menu() {

        menu =  " 1 - Ingreso de Temperaturas "
                + "\n 2 - Ver Estado de la Semana "
                + "\n 0 - Salir ";
        return menu;
    }

}
