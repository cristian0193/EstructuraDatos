package EjerciciosListasDoblemeEnlazadas;

import EjerciciosListaSimple.*;

/**
 * @author Usuario
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;

   public Funciones adicionarNodo(Estudiantes estudiante) {
        Nodo nodo;

        nodo = new Nodo(estudiante);

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
        String datos;

        if (nodo != null) {
            datos = "Codigo : " + nodo.getEstudiante().getCodigoEstudiante() + "\n";
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

                mensajes.mostrarInformacion("El nodo en la Psicion : " + posicion + "\n"
                        + "Corresponte a : " + nodo.getEstudiante().getCodigoEstudiante());
            }
            nodo = nodo.getSiguiente();
            conta++;
        }
    }

    public Funciones intercalarNodo(int posicion, int nuevoNumero) {

        return this;
    }

//     public Funciones eliminarNodo(Nodo nodo){
//        Nodo aux,anterior;
//        
//        //Verificamos si es el primer nodo
//        if ( cabeza.getValorEntero() == nodo.getValorEntero() ){
//            cabeza = cabeza.getSiguiente();
//            aux = null;
//        }
//        else{
//            //Buscamos si es un nodo intermedio o final a eliminar
//            anterior = aux =  cabeza;
//            while( aux != null){
//                if ( aux.getValorEntero() == nodo.getValorEntero())
//                {
//                    if ( aux.getSiguiente() != null){
//                        //es un nodo intermedio
//                        anterior.siguiente = aux.siguiente;
//                    }
//                    else{
//                        //es un nodo final
//                        anterior.siguiente = null;
//                    }
//                    
//                    aux = null;
//                }
//                else{
//                    anterior = aux;
//                    aux = aux.siguiente;
//                }                    
//            }
//        }
//        
//        return this;
//    }
    public int contarNodo() {
        return contador;
    }

}
