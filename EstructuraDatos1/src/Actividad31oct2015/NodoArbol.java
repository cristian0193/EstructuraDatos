package Actividad31oct2015;

/**
 * Esta clase representa el nodo definida 
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class NodoArbol {

    public NodoArbol siguiente;
    public NodoArbol anterior;
    private Estudiantes estudiante;

    /*
    * Constructor del nodo
    */
   public NodoArbol() {
        estudiante = null;
        anterior = null;
        siguiente = null;
    }
    
    /**
     * Constructor del nodo
     * @param estudiante
     */
    public NodoArbol(Estudiantes estudiante) {
        this();
        this.estudiante = estudiante;
    }
    
    /**
     * Constructor del nodo
     * @param estudiante
     * @param anterior
     * @param siguiente
     */
    public NodoArbol(Estudiantes estudiante, NodoArbol anterior, NodoArbol siguiente) {
        this.estudiante = estudiante;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    

    /**
     * Método para consultar o recuperar el valor del apuntador al nodo anterior
     * @return NodoArbol     Apuntador al nodo anterior 
     */
    public NodoArbol getAnterior() {
        return anterior;
    }

    /**
     * Método para asignar el valor del apuntador al nodo anterior
     * @param anterior     Apuntador al nodo anterior 
     */
    public void setAnterior(NodoArbol anterior) {
        this.anterior = anterior;
    }            
  
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo siguiente
     * @return NodoArbol     Apuntador al nodo siguiente 
     */
    public NodoArbol getSiguiente() {
        return siguiente;
    }

    /**
     * Método para asignar el valor del apuntador al nodo siguiente
     * @param siguiente     Apuntador al nodo siguiente 
     */
    public void setSiguiente(NodoArbol siguiente) {
        this.siguiente = siguiente;
    }       

    /**
     * Método para consultar o recuperar los datos del estudiante
     * @return Estudiante  Datos del estudiante
     */
    public Estudiantes getEstudiante() {
        return estudiante;
    }

    /**
     * Método para asignar los datos del estudiante
     * @param estudiante  Datos del estudiante
     */
    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }    
    
}

     
    
