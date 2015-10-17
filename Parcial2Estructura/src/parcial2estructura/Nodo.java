package parcial2estructura;

/**
 * Esta clase representa el nodo definida 
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class Nodo {

    public Nodo siguiente;
    public Nodo anterior;
    public String dato;

    /*
    * Constructor del nodo
    */
   public Nodo() {
        dato = "";        
        siguiente = null;
        anterior = null;
    }
    
    /**
     * Constructor del nodo
     * @param palabras
     */
    public Nodo(String palabras) {
        this();
        this.dato = palabras;
    }
    
    /**
     * Constructor del nodo
     * @param dato
     * @param anterior
     * @param siguiente
     */
    public Nodo(String dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
        
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo anterior
     * @return Nodo     Apuntador al nodo anterior 
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * Método para asignar el valor del apuntador al nodo anterior
     * @param anterior     Apuntador al nodo anterior 
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    } 
            
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo siguiente
     * @return Nodo     Apuntador al nodo siguiente 
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Método para asignar el valor del apuntador al nodo siguiente
     * @param siguiente     Apuntador al nodo siguiente 
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }       

    /**
     * Método para asignar el valor del apuntador al nodo siguiente
     * @return dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * Método para asignar el valor al Dato
     * @param dato     Dato a pasar
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    

    
   

    

 
  

    
    
    
    
    
}

     
    
