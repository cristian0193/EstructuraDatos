package BuscarNodo;

import EjercicioListaNodos.*;

/**
 * @author Usuario
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;

    public Funciones adicionarNodo(int datoEntero) {
        Nodo nodo;

        nodo = new Nodo(datoEntero);

        if (cabeza == null) {
            cabeza = nodo;
            contador++;
        } else {
            nodo.siguiente = cabeza;
            cabeza = nodo;
            contador++;
        }
        return this;
    }

    public void mostrarLista(Nodo nodo) {
        int contador = 0;
        String datos;

        if (nodo != null) {
            contador++;
            datos = "Codigo : " + nodo.getValorEntero() + "\n";
            mensajes.mostrarInformacion(datos);
            mostrarLista(nodo.getSiguiente());
        }
    }

    public void buscarNodoPosicion(int posicion) {

        Nodo nodo;
        nodo = cabeza;
        int conta = 1;

        while (nodo != null) {

            if (conta == posicion) {

                mensajes.mostrarInformacion("" + nodo.getValorEntero());
            }
            nodo = nodo.getSiguiente();
            conta++;
        }
    }

    public Funciones intercalarNodo(int posicion, int nuevoNumero) {

        Nodo nodo;
        nodo = cabeza;
        int conta = 1;

        while (nodo != null) {

            if (conta == posicion) {
                nodo = new Nodo(nuevoNumero);
                nodo.siguiente = nodo.getSiguiente();
                nodo.siguiente = nodo;
                mensajes.mostrarInformacion("Nodo ingresado con exito");
                break;
            }
            nodo = nodo.getSiguiente();
            conta++;
        }

        return this;
    }

    public int contarNodo() {
        return contador;
    }

}
