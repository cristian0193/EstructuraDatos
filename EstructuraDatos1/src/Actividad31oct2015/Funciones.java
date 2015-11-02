package Actividad31oct2015;


/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public NodoLista cabezaLista;
    public NodoArbol cabezaArbol;
    private int contador = 0;

    /**
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
//    public Funciones adicionarNodoInicio(Estudiantes estudiante) {
//        Nodo nodo;
//
//        nodo = new Nodo(estudiante);
//
//        if (cabeza == null) {
//            cabeza = nodo;
//            contador++;
//        } else {
//            nodo.siguiente = cabeza;
//            cabeza = nodo;
//            contador++;
//        }
//        return this;
//    }

    /**
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param semestre Datos de semestre
     */
    public void agregarOrdenadosLista(Semestre semestre) {

        NodoLista nuevo = new NodoLista(semestre);

        int codigo_semestre;
//        int grupo_semestre;
        
        codigo_semestre = nuevo.getSemestre().getCodigoSemestre();
//        grupo_semestre = nuevo.getSemestre().getGrupoSemestre();
        
        if (cabezaLista == null) {
            cabezaLista = nuevo;
            contador++;
        } else {
            if (codigo_semestre < (cabezaLista.getSemestre().getCodigoSemestre())) {
                nuevo.siguiente = cabezaLista;
                nuevo.siguiente.siguiente = null;
                cabezaLista = nuevo;
            } else {
                NodoLista recorre = cabezaLista;
                NodoLista atras = cabezaLista;

                while (codigo_semestre >= recorre.getSemestre().getCodigoSemestre() && recorre.siguiente != null) {
                    atras = recorre;
                    recorre = recorre.siguiente;
                }

                if (codigo_semestre >= (cabezaLista.getSemestre().getCodigoSemestre())) {
                    recorre.siguiente = nuevo;
                } else {
                    nuevo.siguiente = recorre;
                    atras.siguiente = nuevo;
                }
            }
            contador++;
        }
    }
    
//    public void agregarPlia(Estudiantes estudiante){
//        
//        Stack pilas = new Stack();
//        pilas.push(estudiante);
//        System.out.println("" + estudiante.getCodigoEstudiante());
//    }            

    /**
     * Método permite crear la lista desde el final ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
//    public Funciones adicionarNodoFinal(Estudiantes estudiante) {
//        Nodo nodoAuxiliar, ultimoNodo = getUltimoNodo();
//
//        if (ultimoNodo == null) {
//            ultimoNodo = new Nodo(estudiante);
//            cabeza = ultimoNodo;
//            contador++;
//        } else {
//            nodoAuxiliar = new Nodo(estudiante);
//            ultimoNodo.setSiguiente(nodoAuxiliar);
//            nodoAuxiliar.setAnterior(ultimoNodo);
//            contador++;
//        }
//        return this;
//    }

    /**
     * Método permite Monstrar la informacion de cada nodo almanceada por la
     * clase estudiantes
     */
    public void mostrarContenidoLista() {
        NodoLista temporal;
        
        if (cabezaLista == null) {
            mensajes.mostrarInformacion("La lista doble está vacía");
        } else {
            mensajes.mostrarInformacion("Se muestra el contenido de todos los nodos ("
                    + contarNodo() + ")");
            temporal = cabezaLista;
            while (temporal != null) {
                mensajes.mostrarInformacion(temporal.getSemestre().toString());
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
//    public Nodo buscarNodo(int identificacion) {
//        Nodo apuntadorNodoBuscado;
//
//        apuntadorNodoBuscado = cabeza;
//
//        while (apuntadorNodoBuscado != null) {
//            if (identificacion == apuntadorNodoBuscado.getEstudiante().getIdentificacionEstudiante()) {
//                return apuntadorNodoBuscado;
//            }
//            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
//        }
//
//        return apuntadorNodoBuscado;
//    }

    /**
     * Método permite ingresar las asignaturas para cada estudiante
     *
     * @param cantidadAsignaturas cantidad de asignaturas
     * @return Arreglo asignatura String []
     */
//    public String[] asignarAsigantura(int cantidadAsignaturas) {
//
//        String[] arregloMaterias;
//
//        arregloMaterias = new String[cantidadAsignaturas];
//
//        for (int posicion = 0; posicion < arregloMaterias.length; posicion++) {
//            arregloMaterias[posicion] = mensajes.leerString("Ingrese el nombre de la asignatura # " + (posicion + 1));
//        }
//
//        return arregloMaterias;
//    }

    /**
     * Método permite ingresar las notas para cada estudiante
     *
     * @param cantidadAsignaturas cantidad de asignaturas
     * @param identificacion identificacion de estudiante
     * @return Matriz Notas String [][]
     */
//    public double[][] asignarNotas(int cantidadAsignaturas, int identificacion) {
//
//        double[][] matrizNotas;
//        String asignatura;
//        nodoBase = cabeza;
//        matrizNotas = new double[cantidadAsignaturas][3];
//
//        while (nodoBase != null) {
//            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
//                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {
//                    for (int posicionCortes = 0; posicionCortes < 3; posicionCortes++) {
//
//                        asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];
//                        matrizNotas[posicionAsignatura][posicionCortes] = mensajes.leerDouble(" INGRESE LA NOTA PARA : \n"
//                                + " LA ASIGNATURA : " + asignatura + "\n"
//                                + " CORTE : " + (posicionCortes + 1));
//                    }
//                }
//                return matrizNotas;
//            }
//            nodoBase = nodoBase.getSiguiente();
//        }
//        return matrizNotas;
//    }

    /**
     * Método permite consultar la cantidad de materias que se encuentran en un
     * nodo
     *
     * @param nodoMateria nodo de materias
     * @param identificacion identificacion de estudiante
     * @return valor entero de cantidad de materias
     */
//    public int cantidadMateriasNodo(int identificacion, Nodo nodoMateria) {
//        int cantidad = 0;
//
//        nodoMateria = cabeza;
//
//        while (nodoMateria != null) {
//            if (identificacion == nodoMateria.getEstudiante().getIdentificacionEstudiante()) {
//                cantidad = nodoMateria.getEstudiante().getNombreAsignatura().length;
//            }
//            nodoMateria = nodoMateria.getSiguiente();
//        }
//
//        return cantidad;
//    }

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
//    private Nodo getUltimoNodo() {
//        Nodo lastNode = null;
//
//        if (cabeza != null) {
//            lastNode = cabeza;
//            while (lastNode.getSiguiente() != null) {
//                lastNode = lastNode.getSiguiente();
//            }
//        }
//        return lastNode;
//    }

    /**
     * Método permite concocer las notas definitivas de cada materias por
     * estudiante consultado
     *
     * @param cantidadAsignaturas cantidad de asignaturas
     * @param identificacion identificacion de estudiante
     * @return Notas definitivas por asignatura
     */
//    public String notasDefinitivaCortes(int cantidadAsignaturas, int identificacion) {
//
//        double[][] matrizNotas;
//        String asignatura;
//        Double notaDefinitiva = 0.0;
//        Double notaCorte = 0.0;
//        String mensaje = "";
//        String calificacion = "";
//
//        nodoBase = cabeza;
//        matrizNotas = new double[cantidadAsignaturas][3];
//
//        while (nodoBase != null) {
//            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
//                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {
//
//                    asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];
//
//                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {
//
//                        notaCorte = nodoBase.getEstudiante().getNotas()[posicionAsignatura][posicionCortes];
//
//                        if (posicionCortes == 0) {
//                            notaDefinitiva += notaCorte * 0.33;
//                        } else if (posicionCortes == 1) {
//                            notaDefinitiva += notaCorte * 0.22;
//                        } else {
//                            notaDefinitiva += notaCorte * 0.45;
//                            notaDefinitiva = Redondear(notaDefinitiva, 2);
//
//                            if (notaDefinitiva > 3.75) {
//                                calificacion = "GANO";
//                            } else {
//                                calificacion = "PERDIO";
//                            }
//                        }
//
//                    }
//                    mensaje += "ASIGNATURA : " + asignatura + " SU NOTA DEFINITIVA DE CORTE ES " + notaDefinitiva + " - (" + calificacion + ")\n";
//                    notaDefinitiva = 0.0;
//                }
//            }
//            nodoBase = nodoBase.getSiguiente();
//        }
//        return mensaje;
//    }

    /**
     * Método permite concocer el promedio acomulado por materias por estudiante
     * consultado
     *
     * @param cantidadAsignaturas cantidad de asignaturas
     * @param identificacion identificacion de estudiante
     * @return Promedio de Notas Semestre
     */
//    public Double notasPromedioSemestre(int cantidadAsignaturas, int identificacion) {
//
//        double[][] matrizNotas;
//        Double notaDefinitiva = 0.0;
//        Double notaCorte = 0.0;
//        Double SumatoriaPromedioSemestre = 0.0;
//        Double PromedioSemestre = 0.0;
//
//        nodoBase = cabeza;
//        matrizNotas = new double[cantidadAsignaturas][3];
//
//        while (nodoBase != null) {
//            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
//                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {
//
//                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {
//
//                        notaCorte = nodoBase.getEstudiante().getNotas()[posicionAsignatura][posicionCortes];
//
//                        if (posicionCortes == 0) {
//                            notaDefinitiva += notaCorte * 0.33;
//                        } else if (posicionCortes == 1) {
//                            notaDefinitiva += notaCorte * 0.22;
//                        } else {
//                            notaDefinitiva += notaCorte * 0.45;
//                            notaDefinitiva = Redondear(notaDefinitiva, 2);
//                        }
//                    }
//                    SumatoriaPromedioSemestre += notaDefinitiva;
//                    notaDefinitiva = 0.0;
//                }
//                PromedioSemestre = SumatoriaPromedioSemestre / cantidadAsignaturas;
//            }
//            nodoBase = nodoBase.getSiguiente();
//        }
//        return PromedioSemestre;
//    }
//
//    /**
//     * Método permite muestrar los estudaintes que ganaron el promedio del
//     * semestre mayor a 3,75
//     *
//     * @return estudiantes que ganaron el semestre
//     */
//    public String estudiantesGanadoresSemestre() {
//
//        String mensaje = "";
//        Double promedioSemestre = 0.0;
//        String estudiante;
//        int count = 1;
//        int contador2 = 0;
//
//        nodoBase = cabeza;
//        contador2 = contarNodo();
//
//        while (nodoBase != null) {
//            if (count <= contador2) {
//
//                estudiante = nodoBase.getEstudiante().getEstudiante();
//                promedioSemestre = nodoBase.getEstudiante().getNotaSemestre();
//
//                if (promedioSemestre > 3.75) {
//                    mensaje += "EL ESTUDIANTE : " + estudiante.toUpperCase() + " CON PROMEDIO : " + promedioSemestre + "\n";
//                }
//
//            }
//            nodoBase = nodoBase.getSiguiente();
//            count++;
//        }
//
//        return mensaje;
//    }
//
//    /**
//     * Método permite muestrar los estudaintes que perdieron el promedio del
//     * semestre menor a 3,75
//     *
//     * @return estudiantes que perdieron el semestre
//     */
//    public String estudiantesPerdieronSemestre() {
//
//        String mensaje = "";
//        Double promedioSemestre = 0.0;
//        String estudiante;
//        int count = 1;
//        int contador2 = 0;
//
//        nodoBase = cabeza;
//        contador2 = contarNodo();
//
//        while (nodoBase != null) {
//            if (count <= contador2) {
//
//                estudiante = nodoBase.getEstudiante().getEstudiante();
//                promedioSemestre = nodoBase.getEstudiante().getNotaSemestre();
//
//                if (promedioSemestre < 3.75) {
//                    mensaje += "EL ESTUDIANTE : " + estudiante.toUpperCase() + " CON PROMEDIO : " + promedioSemestre + "";
//                }
//
//            }
//            nodoBase = nodoBase.getSiguiente();
//            count++;
//        }
//
//        return mensaje;
//    }
//
//    /**
//     * Método permite concocer las notas definitivas de cada materias por
//     * estudiante consultado
//     *
//     * @param cantidadAsignaturas cantidad de asignaturas
//     * @param identificacion identificacion de estudiante
//     * @return Notas definitivas por asignatura
//     */
//    public String ListaNotasEstudiantes(int cantidadAsignaturas, int identificacion) {
//
//        double[][] matrizNotas;
//        String asignatura = "";
//        Double notaDefinitiva = 0.0;
//        Double notaCorte = 0.0;
//        String mensaje = "";
//        String nota = "";
//        String notaMatriz = "";
//        String asignaturaEstudiante = "";
//
//        nodoBase = cabeza;
//        matrizNotas = new double[cantidadAsignaturas][3];
//
//        while (nodoBase != null) {
//            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
//                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {
//
//                    asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];
//
//                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {
//
//                        notaCorte = nodoBase.getEstudiante().getNotas()[posicionAsignatura][posicionCortes];
//                        nota += notaCorte + " , ";
//                    }
//                    notaMatriz += " " + asignatura + " : " + nota + " \n ";
//                    nota = "";
//                }
//
//                mensaje += " " + notaMatriz + "";
//            }
//            nodoBase = nodoBase.getSiguiente();
//        }
//        return mensaje;
//    }
//
//    /**
//     * Método permite redonderar numeros decimales
//     *
//     * @return numero double redondeado
//     */
//    public double Redondear(double numero, int digitos) {
//        int cifras = (int) Math.pow(10, digitos);
//        return Math.rint(numero * cifras) / cifras;
//    }

}
