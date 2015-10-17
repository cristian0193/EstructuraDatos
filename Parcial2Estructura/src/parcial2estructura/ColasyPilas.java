package parcial2estructura;

public class ColasyPilas {

    public Nodo cola;
    public Nodo pila;
    public Nodo lista;
    public Nodo ultimo;

    public boolean ListaVaciaCola() {
        return (cola == null);
    }

    public boolean ListaVaciaPila() {
        return (pila == null);
    }

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

    public void AddPila(String numero) {
        Nodo nuevo = new Nodo(numero);
        if (ListaVaciaPila()) {
            pila = nuevo;
        } else {
            nuevo.anterior = pila;
            pila = nuevo;
        }
    }

}
