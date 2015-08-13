
package estructuradatos1;

import javax.swing.JOptionPane;


public class EjerciciosEstructura4 {
    
    public static String[] matrizCursos = {"ESTRUCTURA DE DATOS","CALCULO","ING.SOFTWARE","BASE DE DATOS"};
    public static int[] matrizPisos = {1,2,3,4};
    public static int[] matrizNivel = {2,4,3,5};
//    public static int[] matrizSalon = {304,104,220,403};
    public static int[] matrizSalon;
    public static int[] matrizHoraInicio = {9,13,14,18};
    public static int numero = 0;
    
    public static void main(String[] args) {
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS "));
        for (int i = 0; i < matrizSalon.length; i++) {
          
            if(numero == matrizSalon[i]){
                JOptionPane.showMessageDialog(null, "ID YA SE ENCUENTRA REGISTRADO");
            }else{
//               matrizSalon[i] = numero; 
            }
            
        }
        
        
    }
    
    
}
