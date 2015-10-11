
package PilasColasObjectos;

/**
 * Esta clase representa el nodo definida 
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class Nodo {

    public Nodo siguiente;
    public Nodo anterior;
    private Clientes cliente;

    /*
    * Constructor del nodo
    */
   public Nodo() {
        cliente = null;        
        siguiente = null;
        anterior = null;
    }
    
    /**
     * Constructor del nodo
     * @param cliente
     */
    public Nodo(Clientes cliente) {
        this();
        this.cliente = cliente;
    }
    
    /**
     * Constructor del nodo
     * @param cliente
     * @param anterior
     * @param siguiente
     */
    public Nodo(Clientes cliente, Nodo siguiente, Nodo anterior) {
        this.cliente = cliente;
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
     * Método para consultar o recuperar los datos del cliente
     * @return Estudiante  Datos del cliente
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     * Método para asignar los datos del cliente
     * @param cliente  Datos del cliente
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }    

    
    
    
    
}

     
    


