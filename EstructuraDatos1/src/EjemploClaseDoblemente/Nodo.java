package  EjemploClaseDoblemente;

/**
 * Esta clase representa el nodo definida para el primer ejemplo de listas
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 18Sep2015
 */
 public class Nodo {
   private Estudiante estudiante;
   private Nodo anterior, siguiente;

   /**
    * Constructor del nodo
    */
   public Nodo() {
        estudiante = null;
        anterior = null;
        siguiente = null;
    }
    
    /**
     * Constructor del nodo
     */
    public Nodo(Estudiante estudiante) {
        this();
        this.estudiante = estudiante;
    }
    
    /**
     * Constructor del nodo
     */
    public Nodo(Estudiante estudiante, Nodo anterior, Nodo siguiente) {
        this.estudiante = estudiante;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    /**
     * Método para consultar o recuperar los datos del estudiante
     * @return Estudiante  Datos del estudiante
     */
    public Estudiante getEstudiante() {
      return estudiante;
    }
    
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo anterior
     * @return Nodo     Apuntador al nodo anterior 
     */
    public Nodo getAnterior() {
      return anterior;
    }
    
    /**
     * Método para consultar o recuperar el valor del apuntador al nodo siguiente
     * @return Nodo     Apuntador al nodo siguiente 
     */
    public Nodo getSiguiente() {
      return siguiente;
    }
        
    /**
     * Método para asignar los datos del estudiante
     * @param estudiante  Datos del estudiante
     */
    public void setEstudiante(Estudiante estudiante) {
      this.estudiante = estudiante;
    }
    
    /**
     * Método para asignar el valor del apuntador al nodo anterior
     * @param anterior     Apuntador al nodo anterior 
     */
    public void setAnterior(Nodo anterior) {
      this.anterior = anterior;
    }
    
    /**
     * Método para asignar el valor del apuntador al nodo siguiente
     * @param siguiente     Apuntador al nodo siguiente 
     */
    public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
    }
}

