package EjerciciosListasDoblemeEnlazadas;


public class Nodo {

    private int valorEntero;    
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(){
        valorEntero = 0;
        siguiente = null;
        anterior = null;
    }
            
    public Nodo(int codigo){
        this();
        this.valorEntero = codigo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
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

     
    
