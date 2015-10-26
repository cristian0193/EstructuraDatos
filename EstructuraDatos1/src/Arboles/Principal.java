package Arboles;

/**
 * Esta clase ejecuta el programa medante un menu
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 25octubre2015
 */
public class Principal {

    public Nodo raiz;

    public static void main(String[] args) {

        Funciones funciones = new Funciones();
        Principal principal = new Principal();
        Mensajes mensajes = new Mensajes();

        int numero;
        int opcion;

        do {
            opcion = principal.menuPrincipal();
            switch (opcion) {

                case 1:
                    numero = mensajes.leerInt("Ingresar un Numero");
                    funciones.adicionarNodoArbol(numero);
                    break;

                case 2:
                    funciones.imprimirPre();
                    break;

                case 3:
                    funciones.imprimirEntre();
                    break;

                case 4:
                    funciones.imprimirPost();
                    break;

                case 5:
                    mensajes.mostrarInformacion("Cantidad de Nodos en Arbol : "+funciones.cantidad());                    
                    break;

                case 6:
                    mensajes.mostrarInformacion("Cantidad de Nodos Hojas : "+funciones.cantidadNodosHoja());
                    break;

                case 7:
                    mensajes.mostrarInformacion("Altura del Arbol : "+funciones.retornarAltura());
                    break;

                 case 8:
                    funciones.mayorValor();
                    break;
                     
                case 0:
                    System.exit(0);
                    break;
                default:
                    mensajes.mostrarError("¡La opción no existe!");
            }

        } while (opcion != 0);

    }

    public int menuPrincipal() {
        Mensajes entrada = new Mensajes();

        String cadena = "M  E  N  U \n"
                + "1) Ingresar Dato al Arbol. \n"
                + "2) Imprimir Arbol - Preorden. \n"
                + "3) Imprimir Arbol - Entreorden. \n"
                + "4) Imprimir Arbol - Postorden. \n"
                + "5) Cantidad de Nodos del Arbol. \n"
                + "6) Cantidad de Nodos Hoja del Arbol. \n"
                + "7) Altura de Arbol. \n"
                + "8) Valor Mayor del Arbol. \n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
