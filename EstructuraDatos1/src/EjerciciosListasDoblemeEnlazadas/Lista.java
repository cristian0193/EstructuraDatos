package EjerciciosListasDoblemeEnlazadas;

/**
 * Esta clase ejecuta el programa medante un menu
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */

public class Lista {

    public Nodo cabeza;
    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Lista lista = new Lista();
        Mensajes mensajes = new Mensajes();

        int codigo;
        int identificacion;
        String nombre;
        int cantidadMaterias;

        int opcion;

        do {
            opcion = lista.menu();
            switch (opcion) {
               
                case 1:
                    codigo = mensajes.leerInt("Ingrese un codigo :");
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                    nombre = mensajes.leerString("Ingrese Nombre de Estudiante : ");

                    //pasan parametros al metodo para ingresar los nodos
                    fun.adicionarNodoFinal(new Estudiantes(codigo, identificacion, nombre, 0, 0, false));

                    break;
                
                case 2:
                    Estudiantes estudianteMaterias;
                    Nodo nodosMaterias;
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                    cantidadMaterias = mensajes.leerInt("Ingrese cantidad de Asignaturas del estudiante  : ");

                    //Buscan el nodo y s ejcuta el metodo para ingresar materias y se añaden al nodo.
                    nodosMaterias = fun.buscarNodo(identificacion);
                    estudianteMaterias = nodosMaterias.getEstudiante();
                    estudianteMaterias.setNombreAsignatura(fun.asignarAsigantura(cantidadMaterias));
                    nodosMaterias.setEstudiante(estudianteMaterias);

                    break;
                
                case 3:
                    Estudiantes estudianteNotas;
                    Nodo nodosNotas;
                    identificacion = mensajes.leerInt("Ingrese una Identificacion : ");

                    //Buscan el nodo y la cantidad de materias de nodo y ejcuta el metodo para ingresar notas y se añaden al nodo.
                    nodosNotas = fun.buscarNodo(identificacion);
                    estudianteNotas = nodosNotas.getEstudiante();
                    int cantidadMateriaNotas = estudianteNotas.getNombreAsignatura().length;
                    estudianteNotas.setNotas(fun.asignarNotas(cantidadMateriaNotas, identificacion));
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

                    //Buscan el nodo y la cantidad de materias de nodo y ejecuta el metodo para definir notas de corte y se añaden al nodo.
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

                    //Buscan el nodo y la cantidad de materias de nodo y ejecuta el metodo para definir promedio de notas y se añaden al nodo.
                    nodoPromedio = fun.buscarNodo(identificacion);
                    estudiantePromedio = nodoPromedio.getEstudiante();
                    int cantidadMateriaPromedio = estudiantePromedio.getNombreAsignatura().length;
                    PromedioSemestral = fun.notasPromedioSemestre(cantidadMateriaPromedio, identificacion);
                    estudiantePromedio.setNotaSemestre(PromedioSemestral);
                    nodoPromedio.setEstudiante(estudiantePromedio);
                    mensajes.mostrarInformacion("PROMEDIO SEMESTRAL ES : " + PromedioSemestral);
                    break;

                case 7:
                    //Muestra losestudiantes que aprobaron el semestre
                    mensajes.mostrarInformacion("ESTUDIANTES QUE GANARON SEMESTRE : \n"+fun.estudiantesGanadoresSemestre());
                    break;

                case 8:
                    //Muestra losestudiantes que Reprobaron el semestre
                     mensajes.mostrarInformacion("ESTUDIANTES QUE PERDIERON SEMESTRE : \n"+fun.estudiantesPerdieronSemestre());
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
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}
