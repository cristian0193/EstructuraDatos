package EjerciciosListasDoblemeEnlazadas;

public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;
    Nodo nodoBase;

    public Funciones adicionarNodo(Estudiantes estudiante) {
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

         Nodo nodoCantidad;
        double[][] matrizNotas;
        String asignatura;     
        nodoBase = cabeza;       
        matrizNotas = new double[3][cantidadAsignaturas];

        while (nodoBase != null) {
            if (identificacion == nodoBase.getEstudiante().getIdentificacionEstudiante()) {
                for (int posicionAsignatura = 0; posicionAsignatura < matrizNotas.length; posicionAsignatura++) {
                    for (int posicionCortes = 0; posicionCortes < matrizNotas.length; posicionCortes++) {

                        asignatura = nodoBase.getEstudiante().getNombreAsignatura()[posicionAsignatura];
                        matrizNotas[posicionCortes][posicionAsignatura] = mensajes.leerDouble(" Ingrese la nota para : \n"
                                + " La Asignatura : " + asignatura + "\n"
                                + " Corte : " + (posicionCortes + 1));
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

}
