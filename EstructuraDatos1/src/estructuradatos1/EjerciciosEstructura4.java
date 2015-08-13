
package estructuradatos1;

import javax.swing.JOptionPane;


public class EjerciciosEstructura4 {
    
    public static String[] matrizCursos = {"ESTRUCTURA DE DATOS","CALCULO","ING.SOFTWARE","BASE DE DATOS"};
    public static int[] matrizPisos = {1,2,3,4};
    public static int[] matrizNivel = {2,4,3,5};
    public static int[] matrizSalon = {304,104,220,304}; 
    public static int[] matrizHoraInicio = {9,13,14,18};
    public static int numero = 0, contador = 0 , valor = 0;
    
    public static void main(String[] args) {
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SALON "));
        valor = busquedadRepetidosCursos(numero);
        
        if (valor > 0) {
            JOptionPane.showMessageDialog(null, "NUMEROS REPETIDOS : " + valor);
        } else {
            JOptionPane.showMessageDialog(null, "DATO INGREADO");
        }
        
    }
    
    public static int busquedadRepetidosCursos(int numero){
        
        for (int i = 0; i < matrizSalon.length; i++) {
          
            if(numero == matrizSalon[i]){
                  contador += 1;
            }            
        }        
        return  contador;
    }
    
    
}
