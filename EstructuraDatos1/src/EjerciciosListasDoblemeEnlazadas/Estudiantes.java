package EjerciciosListasDoblemeEnlazadas;

public class Estudiantes {

    /**
     * Esta clase representa el nodo definida
     *
     * @author Christian A. Rodriguez
     * @version 1.0
     * @since 24Sep2015
     */
    
    final String noAsignada = "noAsignada";
    final double notaNoAsignada = -100.0;

    private int codigoEstudiante;
    private int identificacionEstudiante;
    private String Estudiante;
    private String nombreAsignatura[];
    private double notas[][];
    private double notaSemestre;
    private boolean estadoSemestre;

    /**
     * Constructor del Estudiantes
     * @param codigoEstudiante
     * @param identificacionEstudiante
     * @param Estudiante
     * @param cantidadAsignatura
     * @param notaSemestre
     * @param estadoSemestre
     */
    
    public Estudiantes(int codigoEstudiante, int identificacionEstudiante, String Estudiante, int cantidadAsignatura, double notaSemestre, boolean estadoSemestre) {
        this.codigoEstudiante = codigoEstudiante;
        this.identificacionEstudiante = identificacionEstudiante;
        this.Estudiante = Estudiante.toUpperCase();
        this.nombreAsignatura = new String[cantidadAsignatura];
        this.notas = new double[3][cantidadAsignatura];
        this.notaSemestre = notaSemestre;
        this.estadoSemestre = estadoSemestre;
    }

    /**
     * Método para consultar o recuperar el codigo del estudiante
     * @return codigo 
     */
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Método para asignar el codigo del estudiante
     * @param codigoEstudiante  codigo de estudiante
     */
    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * Método para consultar o recuperar el identificacion del estudiante
     * @return identificacion 
     */
    public int getIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    /**
     * Método para asignar el identificacion del estudiante
     * @param identificacionEstudiante  identificacion de estudiante
     */
    public void setIdentificacionEstudiante(int identificacionEstudiante) {
        this.identificacionEstudiante = identificacionEstudiante;
    }

    /**
     * Método para consultar o recuperar el Datos de Estudiantes
     * @return Estudiante 
     */
    public String getEstudiante() {
        return Estudiante.toUpperCase();
    }

    /**
     * Método para asignar los datos del estudiante
     * @param Estudiante  Datos de estudiante
     */
    public void setEstudiante(String Estudiante) {
        this.Estudiante = Estudiante.toUpperCase();
    }

    /**
     * Método para consultar o recuperar el Nombre asignatura
     * @return Nombre de Asignatura 
     */
    public String[] getNombreAsignatura() {
        return nombreAsignatura;
    }

     /**
     * Método para asignar los nombres de las asignturas
     * @param nombreAsignatura  Nombre asignatura
     */
    public void setNombreAsignatura(String[] nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    /**
     * Método para consultar o recuperar las Notas
     * @return Notas
     */
    public double[][] getNotas() {
        return notas;
    }

    /**
     * Método para asignar las Nots del estudiante
     * @param notas  Nombre asignatura
     */
    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    /**
     * Método para consultar o recuperar la Nota Promedio de Semestre
     * @return Nota Semestre
     */
    public double getNotaSemestre() {
        return notaSemestre;
    }

    /**
     * Método para asignar las Notas del Semestre
     * @param notaSemestre  Nota Semestre
     */
    public void setNotaSemestre(double notaSemestre) {
        this.notaSemestre = notaSemestre;
    }

    /**
     * Método para consultar o recuperar el estado del semestre
     * @return estado del Semestre
     */
    public boolean isEstadoSemestre() {
        return estadoSemestre;
    }

    /**
     * Método para asignar las estado del Semestre
     * @param estadoSemestre  estado Semestre
     */
    public void setEstadoSemestre(boolean estadoSemestre) {
        this.estadoSemestre = estadoSemestre;
    }

    // Inicio de arreglo de asignatura    
    private void iniciarAsignatura() {
        for (int contadorAsignatura = 0; contadorAsignatura < nombreAsignatura.length; contadorAsignatura++) {
            nombreAsignatura[contadorAsignatura] = noAsignada;
        }
    }

    // Inicio de arreglo de notas 
    private void iniciarNota() {
        for (int contadorNotaFilas = 0; contadorNotaFilas < notas.length; contadorNotaFilas++) {
            for (int contadorNotaColumnas = 0; contadorNotaColumnas < notas.length; contadorNotaColumnas++) {
                notas[contadorNotaFilas][contadorNotaColumnas] = notaNoAsignada;
            }
        }
    }
    
    @Override
   public String toString() {
      return "Estudiante{\n" +
             "             codigoEst = " + codigoEstudiante + "\n" +
             "             idEst = " + identificacionEstudiante + "\n" +
             "             nombreEst = " + Estudiante + "\n" +
             "             materias = " + nombreAsignatura.toString() + "\n" +
             "            materias = " + nombreAsignatura.length + "\n" +
             "}";
   }

}
