package EjemplosListas;

/**
 * @author Usuario
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;

    public Funciones adicionarNodo(int valorEntero) {
        Nodo nodo;

        nodo = new Nodo(valorEntero);

        if (cabeza == null) {
            cabeza = nodo;
        } else {
            nodo.siguiente = cabeza;
            cabeza = nodo;
        }
        return this;
    }

    public void mostrarLista(Nodo nodo) {
        int contador = 0;

        if (nodo != null) {
            contador++;
            mensajes.mostrarInformacion("Contenido : " + nodo.getNumero() + "\n");
            mostrarLista(nodo.getSiguiente());
        }
    }

}
