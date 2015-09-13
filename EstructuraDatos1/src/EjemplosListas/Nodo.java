package EjemplosListas;
/**
 * @author Usuario
 */

public class Nodo {
    public int numero;
    public Nodo siguiente;

    public Nodo(){
        numero = 0;
        siguiente = null;
    }
    
    
    
    public Nodo(int valorEntero){
        this();
        this.numero = valorEntero;   
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}

     
    
