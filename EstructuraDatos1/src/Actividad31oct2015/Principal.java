package Actividad31oct2015;


/**
 * Esta clase ejecuta el programa medante un menu
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class Principal {

    public NodoLista cabezaLista;
    public NodoArbol cabezaArbol;
    
    NodoLista nodoLista = new NodoLista();
    NodoArbol nodoArbol = new NodoArbol();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Principal lista = new Principal();
        Mensajes mensajes = new Mensajes();

        int codigo;
        int grupo;
        String descripcion;
        int cantidadMaterias;

        int opcion;

        do {
            opcion = lista.menu();
            switch (opcion) {
               
                case 1:
                    codigo = mensajes.leerInt("Ingrese codigo de Semestre :");                    
                    descripcion = mensajes.leerString("Ingrese Descripcion del Semestre : ");
                    grupo = mensajes.leerInt("Ingrese una Grupo Semestre : ");
                    
                    //pasan parametros al metodo para ingresar los nodos
                    fun.agregarOrdenadosLista(new Semestre(codigo, descripcion.toUpperCase(),grupo));

                    break;
                
                case 2:
                    fun.mostrarContenidoLista();
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
                + "1) Adicionar Datos Basicos \n"
                + "2) Mostrar Orden \n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
