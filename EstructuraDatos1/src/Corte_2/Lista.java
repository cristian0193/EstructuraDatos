package Corte_2;

/**
 *
 * @author Christian Rodriguez
 */
public class Lista {

    public Nodo cabeza;
    public int numeroElementos;
    MensajesEntradaSalida entrada = new MensajesEntradaSalida();

    public Lista() {
        cabeza = null;
    }

    public Lista adicionarNodo(int valorEntero) {
        Nodo nodo, aux;

        nodo = new Nodo(valorEntero);
        nodo.setSiguiente(cabeza);
        cabeza = nodo;

        if (cabeza == null) {
            cabeza = nodo;
            aux = cabeza;
        } else {
            aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            aux.siguiente = nodo;
        }
        return this;
    }

    public  Lista adicionarNodoPila(int valorEntero) {
        Nodo nodo;

        nodo = new Nodo(valorEntero);

        if (cabeza == null) 
            {
                cabeza = nodo;
            } 
                else 
            {
                nodo.siguiente = cabeza;
                cabeza = nodo;
            }
        return this;
    }    
    
    public  Lista eliminarNodo(Nodo nodo) {
        Nodo aux, anterior;

        //Verificamos si es el primer nodo
        if (cabeza.dato == nodo.dato) {
            cabeza = cabeza.siguiente;
            aux = null;
        } else {
            //Buscamos si es un nodo intermedio o final a eliminar
            anterior = aux = cabeza;
            while (aux != null) {
                if (aux.dato == nodo.dato) {
                    if (aux.siguiente != null) {
                        //es un nodo intermedio
                        anterior.siguiente = aux.siguiente;
                    } else {
                        //es un nodo final
                        anterior.siguiente = null;
                    }

                    aux = null;
                } else {
                    anterior = aux;
                    aux = aux.siguiente;
                }
            }
        }

        return this;
    }

    public  void par(Nodo nodo) {
        while (nodo != null) {
            if (nodo.dato % 2 == 0) {
                entrada.mostrarInformacion("" + nodo.dato);
            }
            nodo = nodo.siguiente;
        }
    }

    public  void impar(Nodo nodo) {
        while (nodo != null) {
            if (nodo.dato % 2 != 0) {
                entrada.mostrarInformacion("" + nodo.dato);
            }
            nodo = nodo.siguiente;
        }
    }
    
    public  int contarNodos() {
        int contador = 0;
        Nodo aux = null;

        aux = cabeza;
        while (aux != null) {
            aux = aux.siguiente;
            contador++;
        }

        return contador;
    }

    public  void mostrarLista(Nodo nodo) {
        if (nodo != null) {
            entrada.mostrarInformacion("" + nodo.dato);
            mostrarLista(nodo.siguiente);
        }
    }

    public  void mostrarListaIterativo(Nodo nodo) {
        while (nodo != null) {
            entrada.mostrarInformacion("" + nodo.dato);
            nodo = nodo.siguiente;
        }
    }

    public  Nodo buscarNodo(Nodo nodo) {
        Nodo aux;

        aux = cabeza;

        while (aux != null) {
            if (aux.dato == nodo.dato) {
                return aux;
            }

            aux = aux.siguiente;
        }

        return null;
    }

}
