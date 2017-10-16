/* La empresa Asesoramos Al Instante  S.A  desea llevar la contabilidad de los gastos que tiene en una semana de trabajo.
La aplicación debe permitir introducir los gastos generados en cada uno de los cinco (5)días laborables 
y los gastos totales causados en los cinco (5) días de la semana.*/
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static String menu;
    public static int seleccion;
    public static double totalGastos;
    public static double[] gastosSemana = new double[5];

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    ingresoGastosSemana();
                    break;
                case 2:                   
                    JOptionPane.showMessageDialog(null, "Total Gastos en la Semana : $ " +  totalGastosSemana());
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static void ingresoGastosSemana() {

        for (int i = 0; i < gastosSemana.length; i++) {

            gastosSemana[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresar gastos del Dia # " + (i + 1)));
            totalGastos += gastosSemana[i];
        }

    }

    public static double totalGastosSemana() {
        return totalGastos;
    }

    public static String menu() {

        menu = "-- Asesoramos Al Instante  S.A --"
                + "\n 1 - Ingreso de Gastos por Dia "
                + "\n 2 - Ver Total Gastos en la Semana "
                + "\n 0 - Salir ";
        return menu;
    }

}
