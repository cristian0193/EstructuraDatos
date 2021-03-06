package EjerciciosListaSimple;
/**
 * @author Usuario
 */
public class Lista {

    public Nodo cabeza;
    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Lista lista = new Lista();
        Mensajes mensajes = new Mensajes();
        Nodo nodo = null;

        int codigo;
        int posicion;
        String nombre;
        String identificacion;
        int semestre;
        String materias;

        int opcion;

        do {
            opcion = lista.menu();
            switch (opcion) {
                case 1:

                    codigo = mensajes.leerInt("Ingrese el nodo :");

                    fun.adicionarNodo(codigo);
                    break;
                case 2:
                    fun.mostrarLista(fun.cabeza);
                    break;
                case 3:
                    mensajes.mostrarInformacion("Cantidad de Nodos Ingresados : " + fun.contarNodo());
                    break;
                case 4:
                    int pos = mensajes.leerInt("ingresar posicion : ");
                    fun.buscarNodoPosicion(pos);        
                    break;
                case 5:
                    codigo = mensajes.leerInt("Ingrese el Nuevo nodo :");
                    posicion = mensajes.leerInt("Ingrese posicion :");
                    fun.intercalarNodo(posicion,codigo);
                    
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                default:
                    mensajes.mostrarError("¡La opción no existe!");
            }
        } while (opcion != 0);

    }

    public int menu() {
        Mensajes entrada = new Mensajes();
        String cadena = "M  E  N  U \n"
                + "1) Adicionar nodo \n"
                + "2) Mostrar Lista \n"
                + "3) Contar Nodos \n"
                + "4) Buscar Nodo \n"
                + "5) Intercalar Nodo\n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
