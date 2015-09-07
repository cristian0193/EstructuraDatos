package Corte_1;

import javax.swing.JOptionPane;

public class EjercicioMatrizInformacion {

    public static String[] datosCurso;
    public static int[] creditos;
    public static int[] horas;
    public static int[] horasPresenciales;
    public static int[] horasIndependientes;
    public static int[] sumaHoras;
    public static String[] vectorValidacion;

    public static String mensajeMatriz = "", cadena = "", curso = "", menu = "";
    public static int opcion, numero, dato;

    public static void main(String[] args) {

        EjercicioMatrizInformacion obj = new EjercicioMatrizInformacion();

        menu = " VERIFICADOR DE INFORMACION " + " \n"
                + " 1 - INGRESE INFORMACION " + " \n"
                + " 2 - GENERAR VALIDACION " + " \n "
                + " 0 - SALIR ";
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));   
            
        switch (opcion) {
            case 1:
                int cantidad = obj.leerNumero("INGRESE CANTIDAD DE CURSOS");
                obj.MetodoLlenaInformacion(cantidad);
                break;
            case 2:
                obj.VectorValidacion();
                obj.ImprimirMatriz();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "INGRESE UN VALOR CORRECTO");
                break;
        }
        }while(opcion!=0);

    }

    public void MetodoLlenaInformacion(int cantidad) {

        datosCurso = new String[cantidad];
        creditos = new int[cantidad];
        horas = new int[cantidad];
        horasPresenciales = new int[cantidad];
        horasIndependientes = new int[cantidad];

        for (int posicionVector = 0; posicionVector < datosCurso.length; posicionVector++) {

            datosCurso[posicionVector] = leerString("INGRESE EL CURSO # " + (posicionVector + 1));
            curso = datosCurso[posicionVector];            
            creditos[posicionVector] = leerNumero("INGRESE EL NUMERO DE CREDITOS # " + curso);
            horas[posicionVector] = leerNumero("INGRESE EL NUMERO DE HORAS # " + curso);
            horasPresenciales[posicionVector] = leerNumero("INGRESE EL NUMERO DE HORAS DE TRABAJO PRESENCIAL # " + curso);
            horasIndependientes[posicionVector] = leerNumero("INGRESE EL NUMERO DE HORAS DE TRABAJO INDEPENDIENTE # " + curso);
        }
    }

    public void VectorValidacion() {
        vectorValidacion = new String[datosCurso.length];
        sumaHoras = new int[datosCurso.length];

        for (int posicionVector = 0; posicionVector < vectorValidacion.length; posicionVector++) {

            sumaHoras[posicionVector] = horasPresenciales[posicionVector] + horasIndependientes[posicionVector];

            if (sumaHoras[posicionVector] == horas[posicionVector]) {
                vectorValidacion[posicionVector] = "OK";
            } else {
                vectorValidacion[posicionVector] = "ERROR";
            }

        }
    }

    public void ImprimirMatriz() {
        //MUESTRA EL MENSAJE    
        for (int posicionVector = 0; posicionVector < datosCurso.length; posicionVector++) {
            mensajeMatriz += " | " + datosCurso[posicionVector] + " | " + "  " + vectorValidacion[posicionVector] + " | " + " \n";
        }
        mensajeMatriz = mensajeMatriz + "\n";

        JOptionPane.showMessageDialog(null, mensajeMatriz);
    }

    public String leerString(String mensaje) {
        cadena = JOptionPane.showInputDialog(mensaje);
        return cadena;
    }

    public int leerNumero(String mensaje) {
        dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

}
