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

                    fun.adicionarNodoFinal(new Estudiantes(codigo, identificacion, nombre, 0, 0, false));

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
                    int cantidadMaterias = estudianteNotas.getNombreAsignatura().length;
                    estudianteNotas.setNotas(fun.asignarNotas(cantidadMaterias, identificacion));
                    nodosNotas.setEstudiante(estudianteNotas);

                    break;
                
                case 4:
                    fun.mostrarLista(fun.cabeza);
                    break;
                
                case 5:
                    Nodo nodoNotas;
                    Estudiantes estudiantNotas;
                    String reporte = "";
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");

                    nodoNotas = fun.buscarNodo(identificacion);
                    estudiantNotas = nodoNotas.getEstudiante();
                    int cantiMaterias = estudiantNotas.getNombreAsignatura().length;
                    reporte = fun.notasDefinitivaCortes(cantiMaterias, identificacion);
                    mensajes.mostrarInformacion(reporte);
                    break;
                
                case 6:
                    Nodo nodoPromedio;
                    Estudiantes estudiantePromedio;
                    Double PromedioSemestral;
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");

                    nodoPromedio = fun.buscarNodo(identificacion);
                    estudiantePromedio = nodoPromedio.getEstudiante();
                    int cantiMateri = estudiantePromedio.getNombreAsignatura().length;
                    PromedioSemestral = fun.notasPromedioSemestre(cantiMateri, identificacion);
                    estudiantePromedio.setNotaSemestre(PromedioSemestral);
                    nodoPromedio.setEstudiante(estudiantePromedio);
                    mensajes.mostrarInformacion("PROMEDIO SEMESTRAL ES : " + PromedioSemestral);
                    break;

                case 7:
                    mensajes.mostrarInformacion(""+fun.estudiantesGanadoresSemestre());
                    break;

                case 8:

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
                + "5) Consultar Notas Definitivas\n"
                + "6) Consultar Promedio de Semestre\n"
                + "7) Lista de Estudiantes Ganadores\n"
                + "8) Lista de Estudiantes Perdieron\n"
                + "9) Tabla de Notas\n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
