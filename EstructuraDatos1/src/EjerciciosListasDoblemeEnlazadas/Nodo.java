package EjerciciosListasDoblemeEnlazadas;

public class Nodo {

    public Nodo siguiente;
    public Nodo anterior;
    private Estudiantes estudiante;

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
     * @param estudiante
     */
    public Nodo(Estudiantes estudiante) {
        this();
        this.estudiante = estudiante;
    }
    
    /**
     * Constructor del nodo
     * @param estudiante
     * @param anterior
     * @param siguiente
     */
    public Nodo(Estudiantes estudiante, Nodo anterior, Nodo siguiente) {
        this.estudiante = estudiante;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }            
  
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }       

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    
    
}

     
    
