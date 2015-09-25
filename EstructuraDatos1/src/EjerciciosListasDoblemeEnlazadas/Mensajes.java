package EjerciciosListasDoblemeEnlazadas;

import javax.swing.JOptionPane;

/**
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Mensajes {

    /**
     * Método que lee un dato por teclado y regresa un entero
     * @param mensaje Mensaje que se muestra al solicitar el ingreso del entero
     * @return valorEntero Valor entero leido por teclado
     */
    public int leerInt(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    /**
     * Método que lee un dato por teclado y regresa un double
     * @param mensaje Mensaje que se muestra al solicitar el ingreso del entero
     * @return valorDecimal Valor decimal leido por teclado
     */
    public double leerDouble(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }

    /**
     * Método que lee un dato por teclado y regresa un String (cadena)
     * @param mensaje Mensaje que se muestra al solicitar el ingreso del entero
     * @return valorCadena Valor String (Cadena) leido por teclado
     */
    public String leerString(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    /**
     * Método que lee un dato por teclado y regresa un char
     * @param mensaje Mensaje que se muestra al solicitar el ingreso del entero
     * @return valorchar Valor char leido por teclado
     */
    public char leerChar(String mensaje) {
        return JOptionPane.showInputDialog(mensaje).charAt(0);
    }

    /**
     * Método que escribe datos en la pantalla nivel error
     * @param mensaje Datos o información a escribir en la pantalla
     */
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que escribe datos en la pantalla nivel informativos
     * @param mensaje Datos o información a escribir en la pantalla
     */
    public void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que escribe datos en la pantalla nivel adventencia
     * @param mensaje Datos o información a escribir en la pantalla
     */
    public void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método que escribe datos en la pantalla nivel pregunta
     * @param mensaje Datos o información a escribir en la pantalla
     */
    public void mostrarPregunta(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Pregunta", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Método que confirmar datos en la pantalla nivel informativos
     * @param pregunta Datos o información a escribir en la pantalla
     */
    public int confirmarSiNo(String pregunta) {
        return JOptionPane.showConfirmDialog(null, pregunta, "Confirmar", JOptionPane.YES_NO_OPTION);
    }

}
