package EjerciciosListasDoblemeEnlazadas;

import EjerciciosListaSimple.*;


public class Lista {

    public Nodo cabeza;
    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Lista lista = new Lista();
        Mensajes mensajes = new Mensajes();
        Estudiantes estudiante = new Estudiantes();        
        
        Nodo nodo;

        int codigo;
        int identificacion;
        String nombre;
                
        int posicion;

        int opcion;

        do {
            opcion = lista.menu();
            switch (opcion) {
                case 1:
//                    NotasSemestre notas = null;
                    
                    codigo = mensajes.leerInt("Ingrese un codigo :");
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                    nombre = mensajes.leerString("Ingrese Nombre de Estudiante : ");
                  
                    estudiante.setCodigoEstudiante(codigo);
                    estudiante.setIdentificacionEstudiante(identificacion);
                    estudiante.setEstudiante(nombre);
                                                            
                   // fun.adicionarNodo();
                    
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
                case 6:
                    mensajes.mostrarInformacion("Cantidad de Nodos Ingresados : " + fun.contarNodo());
                    break;
                    
                case 7:
                    mensajes.mostrarInformacion("Cantidad de Nodos Ingresados : " + fun.contarNodo());
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
                + "2) Ingreso de Materias \n"
                + "3) Ingreso de Notas \n"
                + "4) Mostrar Estudiantes Totales\n"
                + "5) Lista de Estudiantes Ganadores\n"
                + "6) Lista de Estudiantes Ganadores\n"
                + "7) Tabla de Notas\n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
