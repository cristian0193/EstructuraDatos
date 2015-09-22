package EjerciciosListasDoblemeEnlazadas;

public class Lista {

    public Nodo cabeza;
    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Lista lista = new Lista();
        Mensajes mensajes = new Mensajes();

        Nodo nodo;

        int codigo;
        int identificacion;
        String nombre;
        int cantidad;

        int opcion;

        do {
            opcion = lista.menu();
            switch (opcion) {
                case 1:

                    codigo = mensajes.leerInt("Ingrese un codigo :");
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                    nombre = mensajes.leerString("Ingrese Nombre de Estudiante : ");                    
                    
                    fun.adicionarNodo(new Estudiantes(codigo,identificacion,nombre,0,0,false));

                    break;
                
                case 2:
                    
                    Estudiantes estudianteMaterias;
                    Nodo nodosMaterias;
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                    cantidad = mensajes.leerInt("Ingrese cantidad de Asignaturas del estudiante  : ");

                    nodosMaterias = fun.buscarNodo(identificacion);
                    estudianteMaterias = nodosMaterias.getEstudiante();
                    estudianteMaterias.setNombreAsignatura(fun.asignarAsigantura(cantidad));
                    nodosMaterias.setEstudiante(estudianteMaterias);
                    
                    break;
                    
                case 3:
                    
                    Estudiantes estudianteNotas;
                    Nodo nodosNotas;
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");                    

                    nodosNotas = fun.buscarNodo(identificacion);
                    estudianteNotas = nodosNotas.getEstudiante();
                    int cant = estudianteNotas.getNombreAsignatura().length;                   
                    estudianteNotas.setNotas(fun.asignarNotas(cant,identificacion));

                    nodosNotas.setEstudiante(estudianteNotas);
                    
                    break;
                    
                case 4:
                     fun.mostrarLista(fun.cabeza);
                    break;
                case 5:

                    break;
                case 6:
                    
                    break;

                case 7:
                    
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
