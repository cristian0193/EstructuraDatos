package parcial2estructura;

/**
 * Esta clase que presenta los metodos de ayuda
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 17Oct2015
 */

import javax.swing.JOptionPane;

public class Funciones {


    public Nodo lista;
    public Nodo ultimo;

    Mensajes mensajes = new Mensajes();
    
    
    /**
    * Metodo para validar si esta null la lista
    * @return Boolean de Lista
    */
    public boolean ListaVacia() {
        return (lista == null);
    }

    /**
    * Metodo para validar si un numero es par o impar
    * @param numero
    * @return Boolean de Lista
    */
    public boolean numeroParoImpar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
    * Metodo para ingresar un Nodo a la lista en el inicio
    * @param numero
    */
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
    
   /**
    * Metodo para ingresar un Nodo a la lista al final
    * @param numero
    */
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

    /**
    * Metodo para organizar los datos
    * @param numero
    */
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

    /**
    * Metodo mostrar los datos de derecha a izquierda
    */
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
    
    /**
    * Metodo mostrar los datos de izquierda a derecha
    */
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
    
    /**
    * Metodo mostrar los datos de derecha a izquierda
    * return numero de opcion de menu
    */
    public int menuPrincipal() {
        Mensajes entrada = new Mensajes();

        String cadena = "1. Ejercicio # 1 \n"
                + "2. Ejercicio # 2 \n"
                + "0. Salir";

        return entrada.leerInt(cadena);
    }
    
    public int subMenuPrincipal1() {
        Mensajes entrada = new Mensajes();

        String cadena = "1. Ingresar de Datos a Lista \n"
                + "2. Mostar Ingreso \n"
                + "0. Salir";

        return entrada.leerInt(cadena);
    }

    public int subMenuPrincipal2() {
        Mensajes entrada = new Mensajes();

        String cadena = "1. Ingresar Datos a la Cola \n"
                + "2. Procesar \n"
                + "3. Mostrar Colas \n"
                + "4. Mostrar Pilas \n"
                + "0. Salir";

        return entrada.leerInt(cadena);
    }
   
    
}
