package BuscarNodo;


public class Nodo {

    private int valorEntero;    
    public Nodo siguiente;

    public Nodo(){
        valorEntero = 0;
        siguiente = null;
    }
            
    public Nodo(int codigo ){
        this();
        this.valorEntero = codigo;
    }

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int codigo) {
        this.valorEntero = codigo;
    }

   
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }       
    
}

     
    
