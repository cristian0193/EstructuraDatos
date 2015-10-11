package PilasColas;

/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo primero;
    public Nodo ultimo;


    private int contador = 0;
    String nombre = "";

    
    //METODOS COMPLEMENTARIOS
    public String estadoEspecial(int especial) {

        String estado = "";

        if (especial <= 25) {
            estado = "SI";
        } else {
            estado = "NO";
        }
        return estado;
    }

    /**
     * Método permite crear la lista desde el final ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarNodoFinal(Clientes estudiante) {
        Nodo nodoAuxiliar, ultimoNodo = getUltimoNodo();

        if (ultimoNodo == null) {
            ultimoNodo = new Nodo(estudiante);
            primero = ultimoNodo;
            contador++;
        } else {
            nodoAuxiliar = new Nodo(estudiante);
            ultimoNodo.setSiguiente(nodoAuxiliar);
            contador++;
        }
        return this;
    }

    /**
     * Método permite buscar y recorrer una lista por su Identificacion
     *
     * @param identificacion identificacion de estudiante
     * @return Nodo
     */
    public Nodo buscarNodo(int identificacion) {
        Nodo apuntadorNodoBuscado;
                
        apuntadorNodoBuscado = primero;

        while (apuntadorNodoBuscado != null) {
            if (identificacion == apuntadorNodoBuscado.getCliente().getIdentificacionCliente()) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
        }

        return apuntadorNodoBuscado;
    }
        
    /**
     * Método permite apuntar a ultimo nodo de la lista
     * @return nodo
     */
    private Nodo getUltimoNodo() {
        Nodo lastNode = null;

        if (primero != null) {
            lastNode = primero;
            while (lastNode.getSiguiente() != null) {
                lastNode = lastNode.getSiguiente();
            }
        }
        return lastNode;
    }

}
