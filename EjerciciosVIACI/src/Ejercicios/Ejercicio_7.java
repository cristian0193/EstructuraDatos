package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_7 {

    public static String apellido1_Ingesado, apellido2_Ingesado, mensaje, menu;
    public static int seleccion;

    public static void main(String[] args) {

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (seleccion) {
                case 1:
                    apellido1_Ingesado = JOptionPane.showInputDialog("Ingrese Apellido 1 : ");
                    apellido2_Ingesado = JOptionPane.showInputDialog("Ingrese Apellido 2 : ");

                    JOptionPane.showMessageDialog(null, compararApellidos(apellido1_Ingesado, apellido2_Ingesado));
                    break;
                default:
                    break;
            }

        } while (seleccion != 0);

    }

    public static String compararApellidos(String apellido1, String apellido2) {

        if (apellido1.equals(apellido2)) {
            mensaje = "Los apellidos son iguales";
        } else {
            mensaje = "Los apellidos son diferentes";
        }

        return mensaje;
    }

    public static String menu() {

        menu = "Seleccionar una opcion : "
                + "\n 1 - Ingresar Apellidos "
                + "\n 0 - Salir ";
        return menu;
    }

}
