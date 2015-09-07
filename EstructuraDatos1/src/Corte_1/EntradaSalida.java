package Corte_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bertulfo A. Prado Urrego
 * @version 1.0
 * @since 22Ago2015
 */
public class EntradaSalida{

	/**;
    * 
    * Método que escribe datos en la pantalla
    * @param mensajeEscribir Datos o información a escribir en la pantalla
    * @return No retorna
    */
	public static void escribir(String mensajeEscribir){
		JOptionPane.showMessageDialog(null,mensajeEscribir);
	}

    /**
     * Método que lee una cadena o string por teclado y lo regresa
	  * @param mensajePantalla Mensaje que se muestra en la pantalla al solicitar la entrada
     * @return lineaTeclado   Cadena leida por teclado
     */
    public static String leerCadena(String mensajePantalla){
        String lineaTeclado;
        
        lineaTeclado = JOptionPane.showInputDialog(mensajePantalla);
        return lineaTeclado;
    }
   
	/**
    * 
    * Método que lee un dato por teclado y regresa un entero
    * @param mensajeEntero Mensaje que se muestra al solicitar el ingreso del entero
    * @return valorEntero  Valor entero leido por teclado
    */
	public static int leerEntero(String mensajeEntero){
		int valorEntero;
		
		valorEntero = Integer.parseInt(leerCadena(mensajeEntero));
		return valorEntero;
    }
    
	/**
    * 
    * Método que lee un dato por teclado y regresa un real (Double)
    * @param mensajeReal     Mensaje que se muestra al solicitar el ingreso del real
    * @return valorReal      Valor real leido por teclado
    */
	public static double leerReal(String mensajeReal){
		double valorReal;
		
		valorReal = Double.parseDouble(leerCadena(mensajeReal));
		return valorReal;
    }    
}

