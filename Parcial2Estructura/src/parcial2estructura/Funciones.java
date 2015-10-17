package parcial2estructura;

import javax.swing.JOptionPane;

public class Funciones {


    public Nodo lista;
    public Nodo ultimo;

    Mensajes mensajes = new Mensajes();
    
    public boolean ListaVacia() {
        return (lista == null);
    }

    public boolean numeroParoImpar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void AddInicio(String numero) {

        Nodo nodo = new Nodo(numero);
        nodo.dato = numero;

        if (ListaVacia()) {
            lista = nodo;
            lista.siguiente = lista;
            nodo.anterior = ultimo;
            ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
            nodo.siguiente = lista;
            nodo.anterior = ultimo;
            ultimo = nodo;
            lista.anterior = ultimo;
        }

    }
    
    public void AddFinal(String numero) {
         Nodo nodo = new Nodo(numero);
         if (ListaVacia()) {
            ultimo = nodo;
            ultimo.anterior = lista;
            nodo.siguiente = lista;
            lista = nodo;
        } else {
            lista.anterior = nodo;
            nodo.anterior = ultimo;
            nodo.siguiente = lista;
            lista = nodo;
            ultimo.siguiente = lista;
        }
    }

    public void OrdenamientoDatos(String numero) {

        Nodo nodo = new Nodo(numero);
        if (ListaVacia()) {
            lista = nodo;
        } else {

            Nodo nodoAuxiliar = lista;

            int numeroConvertido = Integer.parseInt(numero);
            int numeroDato = Integer.parseInt(nodoAuxiliar.getDato());

            while ((nodoAuxiliar.getSiguiente() != lista) && (numeroDato < numeroConvertido)) {
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
            if ((nodoAuxiliar.getSiguiente() == lista) && (numeroDato < numeroConvertido)) {
                nodoAuxiliar.setSiguiente(nodo);
                nodo.setAnterior(nodoAuxiliar);
                nodo.setSiguiente(lista);
                lista.setAnterior(nodo);
            } else {
                Nodo anterior = nodoAuxiliar.getAnterior();
                nodo.setAnterior(anterior);
                anterior.setSiguiente(nodo);
                nodo.setSiguiente(nodoAuxiliar);
                nodoAuxiliar.setAnterior(nodo);
                int datoLista = Integer.parseInt(lista.getDato());

                if ((nodoAuxiliar == lista) && (datoLista > numeroConvertido)) {
                    lista = nodo;
                }
            }
        }
    }

    public void MostarListaDerecha() {
        if (ListaVacia()) {
            JOptionPane.showInputDialog("Lista Vacia");
        } else {
            Nodo auxiliar = lista;
            
            do{
                System.out.println("Derecha : " + auxiliar.toString());
                auxiliar = auxiliar.getSiguiente();
            }while(auxiliar != lista);
        }
    }
    
    public void MostarListaIzquierda() {
        if (ListaVacia()) {
            JOptionPane.showInputDialog("Lista Vacia");
        } else {
            Nodo auxiliar = ultimo;
            
            do{
                System.out.println("Izquierda : " + auxiliar.toString());
                auxiliar = auxiliar.getAnterior();
            }while(auxiliar != ultimo);
        }
    }
        
    public int menuPrincipal() {
        Mensajes entrada = new Mensajes();

        String cadena = "1. Ingresar de Datos a Lista \n"
                + "2. Mostar Ingreso \n"
                + "0. Salir";

        return entrada.leerInt(cadena);
    }

}
