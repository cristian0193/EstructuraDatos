package parcial2estructura;

public class ColasyPilas {

    public Nodo cola;
    public Nodo pila;
    public Nodo lista;
    public Nodo ultimo;

    /**
    * Metodo valida si la cola esta vacia
    * return cola
    */
    public boolean ListaVaciaCola() {
        return (cola == null);
    }

    /**
    * Metodo valida si la pila esta vacia
    * return pila
    */
    public boolean ListaVaciaPila() {
        return (pila == null);
    }

    /**
    * Metodo para ingresar un nodo a la cola
    * @param numero
    */
    public void AddCola(String numero) {

        Nodo nuevo = new Nodo(numero);
        if (ListaVaciaCola()) {
            cola = nuevo;
        } else if (cola.siguiente == null) {
            cola.siguiente = nuevo;
        } else {
            Nodo actual = cola;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    /**
    * Metodo para ingresar un nodo a la pila
    * @param numero
    */
    public void AddPila(String numero) {
        Nodo nuevo = new Nodo(numero);
        if (ListaVaciaPila()) {
            pila = nuevo;
        } else {
            nuevo.anterior = pila;
            pila = nuevo;
        }
    }

    public void ProcesoPalindromo(){
        
        
        
        
    }
    
}
