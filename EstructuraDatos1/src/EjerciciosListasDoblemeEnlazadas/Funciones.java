package EjerciciosListasDoblemeEnlazadas;

public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;
    Nodo nodoBase;

    public Funciones adicionarNodoInicio(Estudiantes estudiante) {
        Nodo nodo;

        nodo = new Nodo(estudiante);

        if (cabeza == null) {
            cabeza = nodo;
            contador++;
        } else {
            nodo.siguiente = cabeza;
            cabeza = nodo;
            contador++;
        }
        return this;
    }

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

    public void mostrarLista(Nodo nodo) {
        String datos;
        String asignatura = "";

        for (int i = 0; i < nodo.getEstudiante().getNombreAsignatura().length; i++) {
            asignatura += nodo.getEstudiante().getNombreAsignatura()[i] + ",";
        }

        if (nodoBase != null) {
            datos = " Codigo : " + nodo.getEstudiante().getCodigoEstudiante() + "\n"
                    + " Identificacion : " + nodo.getEstudiante().getIdentificacionEstudiante() + "\n"
                    + " Nombre : " + nodo.getEstudiante().getEstudiante() + "\n"
                    + " Asignaturas : " + asignatura + "\n"
                    + " Nota Semestre : " + nodo.getEstudiante().getNotaSemestre() + "\n"
                    + " Estado Semestre : " + nodo.getEstudiante().isEstadoSemestre() + "\n";
            mensajes.mostrarInformacion(datos);

            mostrarLista(nodo.getSiguiente());
        }
    }

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

    public String[] asignarAsigantura(int cantidadAsignaturas) {

        String[] arregloMaterias;

        arregloMaterias = new String[cantidadAsignaturas];

        for (int posicion = 0; posicion < arregloMaterias.length; posicion++) {
            arregloMaterias[posicion] = mensajes.leerString("Ingrese el nombre de la asignatura # " + (posicion + 1));
        }

        return arregloMaterias;
    }

    public double[][] asignarNotas(int cantidadAsignaturas, int identificacion) {

        double[][] matrizNotas;
        String asignatura;
        nodoBase = cabeza;
        matrizNotas = new double[cantidadAsignaturas][3];

        while (nodoBase != null) {
            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {
                    for (int posicionCortes = 0; posicionCortes < 3; posicionCortes++) {

                        asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];
                        matrizNotas[posicionAsignatura][posicionCortes] = mensajes.leerDouble(" INGRESE LA NOTA PARA : \n"
                                + " LA ASIGNATURA : " + asignatura + "\n"
                                + " CORTE : " + (posicionCortes + 1));
                    }
                }
                return matrizNotas;
            }
            nodoBase = nodoBase.getSiguiente();
        }
        return matrizNotas;
    }

    public int cantidadMateriasNodo(int identificacion, Nodo nodoMateria) {
        int cantidad = 0;

        nodoMateria = cabeza;

        while (nodoMateria != null) {
            if (identificacion == nodoMateria.getEstudiante().getIdentificacionEstudiante()) {
                cantidad = nodoMateria.getEstudiante().getNombreAsignatura().length;
            }
            nodoMateria = nodoMateria.getSiguiente();
        }

        return cantidad;
    }

    public int contarNodo() {
        return contador;
    }

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

    public String notasDefinitivaCortes(int cantidadAsignaturas, int identificacion) {

        double[][] matrizNotas;
        String asignatura;
        Double notaDefinitiva = 0.0;
        Double notaCorte = 0.0;
        String mensaje = "";

        nodoBase = cabeza;
        matrizNotas = new double[cantidadAsignaturas][3];

        while (nodoBase != null) {
            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {

                    asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];

                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {

                        notaCorte = nodoBase.getEstudiante().getNotas()[posicionAsignatura][posicionCortes];

                        if (posicionCortes == 0) {
                            notaDefinitiva += notaCorte * 0.33;
                        } else if (posicionCortes == 1) {
                            notaDefinitiva += notaCorte * 0.22;
                        } else {
                            notaDefinitiva += notaCorte * 0.45;
                            notaDefinitiva = Redondear(notaDefinitiva, 2);
                        }

                    }
                    mensaje += "ASIGNATURA : " + asignatura + " SU NOTA DEFINITIVA DE CORTE ES " + notaDefinitiva + "\n";
                    notaDefinitiva = 0.0;
                }
            }
            nodoBase = nodoBase.getSiguiente();
        }
        return mensaje;
    }

    public Double notasPromedioSemestre(int cantidadAsignaturas, int identificacion) {

        double[][] matrizNotas;
        Double notaDefinitiva = 0.0;
        Double notaCorte = 0.0;
        Double SumatoriaPromedioSemestre = 0.0;
        Double PromedioSemestre = 0.0;

        nodoBase = cabeza;
        matrizNotas = new double[cantidadAsignaturas][3];

        while (nodoBase != null) {
            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
                for (int posicionAsignatura = 0; posicionAsignatura < cantidadAsignaturas; posicionAsignatura++) {

                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {

                        notaCorte = nodoBase.getEstudiante().getNotas()[posicionAsignatura][posicionCortes];

                        if (posicionCortes == 0) {
                            notaDefinitiva += notaCorte * 0.33;
                        } else if (posicionCortes == 1) {
                            notaDefinitiva += notaCorte * 0.22;
                        } else {
                            notaDefinitiva += notaCorte * 0.45;
                            notaDefinitiva = Redondear(notaDefinitiva, 2);
                        }
                    }
                    SumatoriaPromedioSemestre += notaDefinitiva;
                    notaDefinitiva = 0.0;
                }
                PromedioSemestre = SumatoriaPromedioSemestre / cantidadAsignaturas;
            }
            nodoBase = nodoBase.getSiguiente();
        }
        return PromedioSemestre;
    }

    public String estudiantesGanadoresSemestre() {

        String mensaje = "";
        Double promedioSemestre = 0.0;
        String estudiante;
        int count = 1;
        int contador2 = 0;

        nodoBase = cabeza;
        contador2 = contarNodo();

        while (nodoBase != null) {
            if (count <= contador2) {             
               
                estudiante = nodoBase.getEstudiante().getEstudiante();                
                promedioSemestre = nodoBase.getEstudiante().getNotaSemestre();
                                
                if(promedioSemestre > 3.75){
                    mensaje += "EL ESTUDIANTE : " + estudiante.toUpperCase() + " CON PROMEDIO : " + promedioSemestre + "\n";
                }
                
            }
            nodoBase = nodoBase.getSiguiente();
            count++;
        }
        
        return mensaje;
    }

    public String estudiantesPerdieronSemestre() {

        String mensaje = "";
        Double promedioSemestre = 0.0;
        String estudiante;
        int count = 1;
        int contador2 = 0;

        nodoBase = cabeza;
        contador2 = contarNodo();

        while (nodoBase != null) {
            if (count <= contador2) {             
               
                estudiante = nodoBase.getEstudiante().getEstudiante();                
                promedioSemestre = nodoBase.getEstudiante().getNotaSemestre();
                                
                if(promedioSemestre < 3.75){
                    mensaje += "EL ESTUDIANTE : " + estudiante.toUpperCase() + " CON PROMEDIO : " + promedioSemestre + "";
                }
                
            }
            nodoBase = nodoBase.getSiguiente();
            count++;
        }
        
        return mensaje;
    }
    
    public double Redondear(double numero, int digitos) {
        int cifras = (int) Math.pow(10, digitos);
        return Math.rint(numero * cifras) / cifras;
    }

}
