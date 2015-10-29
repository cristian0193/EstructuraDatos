package Arboles;


/**
 * Esta clase representa el nodo definida 
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class Nodo {

    public Nodo izquierda;
    public Nodo derecha;
    public int dato;

    /*
    * Constructor del nodo
    */
   public Nodo() {
        dato = 0;
        izquierda = null;
        derecha = null;
    }
    
    /**
     * Constructor del nodo
     * @param dato
     */
    public Nodo(int dato) {
        this();
        this.dato = dato;
    }
    
    /**
     * Constructor del nodo
     * @param dato
     * @param izquierda
     * @param derecha
     */
    public Nodo(int dato, Nodo izquierda, Nodo derecha) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo anterior
     * @return Nodo     Apuntador al nodo anterior 
     */
    public Nodo getIzquierda() {
        return izquierda;
    }

    /**
     * Método para asignar el valor del apuntador al nodo anterior
     * @param izquierda     Apuntador al nodo anterior 
     */
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }          
  
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo siguiente
     * @return Nodo     Apuntador al nodo siguiente 
     */
    public Nodo getDerecha() {
        return derecha;
    }

    /**
     * Método para asignar el valor del apuntador al nodo siguiente
     * @param derecha     Apuntador al nodo siguiente 
     */
    public void setDerecha(Nodo derecha) {    
        this.derecha = derecha;
    }      

    /**
     * Método para consultar o recuperar los datos del estudiante
     * @return dato  Datos del estudiante
     */
    public int getDato() {
        return dato;
    }

    /**
     * Método para asignar los datos del estudiante
     * @param dato  Datos del estudiante
     */
    public void setDato(int dato) {
        this.dato = dato;
    }    
    
}

     
    
