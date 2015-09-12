
package Corte_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MensajesEntradaSalida {
    
     public static int leerInt( String mensaje){
        return Integer.parseInt( JOptionPane.showInputDialog(mensaje));
    }

    public static String leerString( String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }    
   
    public static char leerChar( String mensaje){
        return JOptionPane.showInputDialog(mensaje).charAt(0);
    }
    
    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarPregunta(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Pregunta", JOptionPane.QUESTION_MESSAGE);
    }
    
     public static int confirmarSiNo(String pregunta){
        return JOptionPane.showConfirmDialog(null,pregunta,"Confirmar",JOptionPane.YES_NO_OPTION);        
    }
    
    public static Object listarOpciones(Object[] vector, String pregunta){
        return JOptionPane.showInputDialog(null,pregunta, "Seleccionar una opción",JOptionPane. QUESTION_MESSAGE, null,vector, vector[0]);
    }
    
    public static int listarBotones(Object[] botones, String pregunta){
       return JOptionPane.showOptionDialog(null,pregunta,"Seleccione un botón",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,botones,botones[0]);
    }
    
}
