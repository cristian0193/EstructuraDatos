package PilasColas;

import EjerciciosListasDoblemeEnlazadas.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;
    Nodo nodoBase;

    /**
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarNodoInicio(Estudiantes estudiante, int aleatorioCola, int aleatorioCodigo) {
        Nodo nodo;

        nodo = new Nodo(estudiante);
        LinkedList colasRetiroEfectivo = new LinkedList();
        LinkedList colasCambioCheque = new LinkedList();
        LinkedList colasPagoServicios = new LinkedList();
        LinkedList colasPagoImpuestos = new LinkedList();
        LinkedList colasConsignacionCheque = new LinkedList();
        LinkedList colasConsignacionEfectivo = new LinkedList();
        LinkedList colasPagoTarjetaCredito = new LinkedList();

        if (cabeza == null) {
            cabeza = nodo;
        } else {
            nodo.siguiente = cabeza;
            cabeza = nodo;

            if (aleatorioCodigo >= 0 && aleatorioCodigo <= 3) {
                colasPagoTarjetaCredito.add(nodo);
            } else if (aleatorioCodigo > 3 && aleatorioCodigo <= 5) {
                colasPagoImpuestos.add(nodo);
            } else if (aleatorioCodigo > 5 && aleatorioCodigo <= 10) {
                colasRetiroEfectivo.add(nodo);
            } else if (aleatorioCodigo > 10 && aleatorioCodigo <= 15) {
                colasConsignacionEfectivo.add(nodo);    
            } else if (aleatorioCodigo > 15 && aleatorioCodigo <= 20) {
                colasConsignacionCheque.add(nodo);
            } else if (aleatorioCodigo > 20 && aleatorioCodigo <= 22) {
                colasCambioCheque.add(nodo);
            } else if (aleatorioCodigo > 22 && aleatorioCodigo <= 25) {
                colasPagoServicios.add(nodo);
            }

        }
        return this;
    }

    public void agregarCola(Estudiantes estudiante) {

    }

    /**
     * Método permite crear la lista desde el final ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarNodoFinal(Estudiantes estudiante) {
        Nodo nodoAuxiliar, ultimoNodo = getUltimoNodo();

        if (ultimoNodo == null) {
            ultimoNodo = new Nodo(estudiante);
            cabeza = ultimoNodo;
            contador++;
        } else {
            nodoAuxiliar = new Nodo(estudiante);
            ultimoNodo.setSiguiente(nodoAuxiliar);
            nodoAuxiliar.setAnterior(ultimoNodo);
            contador++;
        }
        return this;
    }

    /**
     * Método permite Monstrar la informacion de cada nodo almanceada por la
     * clase estudiantes
     */
    public void mostrarContenidoLista() {
        Nodo temporal;

        nodoBase = cabeza;

        if (nodoBase == null) {
            mensajes.mostrarInformacion("La lista doble está vacía");
        } else {
            mensajes.mostrarInformacion("Se muestra el contenido de todos los nodos ("
                    + contarNodo() + ")");
            temporal = cabeza;
            while (temporal != null) {
                mensajes.mostrarInformacion(temporal.getEstudiante().toString());
                temporal = temporal.getSiguiente();
            }
        }
    }

    /**
     * Método permite buscar y recorrer una lista por su Identificacion
     *
     * @param identificacion identificacion de estudiante
     * @return Nodo
     */
    public Nodo buscarNodo(int identificacion) {
        Nodo apuntadorNodoBuscado;

        apuntadorNodoBuscado = cabeza;

        while (apuntadorNodoBuscado != null) {
            if (identificacion == apuntadorNodoBuscado.getEstudiante().getIdentificacionEstudiante()) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
        }

        return apuntadorNodoBuscado;
    }

    /**
     * Método permite ingresar las asignaturas para cada estudiante
     *
     * @param cantidadAsignaturas cantidad de asignaturas
     * @return Arreglo asignatura String []
     */
    public String[] asignarAsigantura(int cantidadAsignaturas) {

        String[] arregloMaterias;

        arregloMaterias = new String[cantidadAsignaturas];

        for (int posicion = 0; posicion < arregloMaterias.length; posicion++) {
            arregloMaterias[posicion] = mensajes.leerString("Ingrese el nombre de la asignatura # " + (posicion + 1));
        }

        return arregloMaterias;
    }

    /**
     * Método permite contar la cantidad de nodos ingresados
     *
     * @return valor entero de contador
     */
    public int contarNodo() {
        return contador;
    }

    /**
     * Método permite apuntar a ultimo nodo de la lista
     *
     * @return nodo
     */
    private Nodo getUltimoNodo() {
        Nodo lastNode = null;

        if (cabeza != null) {
            lastNode = cabeza;
            while (lastNode.getSiguiente() != null) {
                lastNode = lastNode.getSiguiente();
            }
        }
        return lastNode;
    }

    /**
     * Método permite redonderar numeros decimales
     *
     * @return numero double redondeado
     */
    public double Redondear(double numero, int digitos) {
        int cifras = (int) Math.pow(10, digitos);
        return Math.rint(numero * cifras) / cifras;
    }

}
