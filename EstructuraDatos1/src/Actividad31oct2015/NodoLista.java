package Actividad31oct2015;

/**
 * Esta clase representa el nodo definida 
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class NodoLista {

    public Semestre Semestre;
    public NodoLista apuntadorArbol;
    public NodoLista siguiente;
    public NodoLista anterior;
    
    /*
    * Constructor del nodo
    */
   public NodoLista() {
        Semestre = null;
        apuntadorArbol = null;
        siguiente = null;
        anterior = null;
    }
    
    /**
     * Constructor del nodo
     * @param semestre
     */
    public NodoLista(Semestre semestre) {
        this();
        this.Semestre = semestre;        
    }
    
    /**
     * Constructor del nodo
     * @param semestre
     * @param apuntadorArbol
     * @param Siguiente
     * @param Anterior 
     */
    public NodoLista(Semestre semestre, NodoLista apuntadorArbol, NodoLista Siguiente, NodoLista Anterior) {
        this.Semestre = semestre;
        this.apuntadorArbol = apuntadorArbol;
        this.siguiente = Siguiente;
        this.anterior = Anterior;
    }

    public Semestre getSemestre() {
        return Semestre;
    }

    public void setSemestre(Semestre Semestre) {
        this.Semestre = Semestre;
    }

    public NodoLista getApuntadorArbol() {
        return apuntadorArbol;
    }

    public void setApuntadorArbol(NodoLista apuntadorArbol) {
        this.apuntadorArbol = apuntadorArbol;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
    
    
    
}

     
    
