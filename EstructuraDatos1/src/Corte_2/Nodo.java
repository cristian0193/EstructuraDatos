package Corte_2;
/**
 *
 * @author Christian Rodriguez
 * @version 1.0
 */
public class Nodo {
    
    public int dato;
    public Nodo siguiente;

 
    public Nodo(){
        dato = 0;
        siguiente = null;
    }
    
    public Nodo(int valorEntero){
        this();
        this.dato = valorEntero;        
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
