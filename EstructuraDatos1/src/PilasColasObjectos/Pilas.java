package PilasColasObjectos;

public class Pilas {

    public Nodo primero;
    public Nodo ultimo;

    //PILAS
    public Nodo nodoPrimeroPila;
    public Nodo nodoUltimoPila;

    
    public boolean listaVacia() {
        return ( nodoPrimeroPila == null);
    }
    
    public boolean listaVaciaPilas() {
        return ( nodoUltimoPila == null);
    }
 
    public void AddPila(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaPilas()) {
            ultimo = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }
    
    
    
    
    
}
