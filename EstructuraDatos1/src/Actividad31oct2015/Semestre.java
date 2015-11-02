package Actividad31oct2015;

public class Semestre {

    /**
     * Esta clase representa el nodo definida
     *
     * @author Christian A. Rodriguez
     * @version 1.0
     * @since 24Sep2015
     */
    private int codigoSemestre;
    private String descripcionSemestre;
    private int grupoSemestre;

    /**
     * Constructor del Estudiantes
     *
     * @param codigoSemestre
     * @param descripcionSemestre
     * @param grupoSemestre
     */
    
    public Semestre(int codigoSemestre, String descripcionSemestre, int grupoSemestre) {
        this.codigoSemestre = codigoSemestre;
        this.descripcionSemestre = descripcionSemestre;
        this.grupoSemestre = grupoSemestre;
    }


    /**
     * Método para consultar o recuperar el codigo del estudiante
     * @return codigo
     */
     public int getCodigoSemestre() {
        return codigoSemestre;
    }

    /**
     * Método para asignar el codigo del estudiante
     *
     * @param codigoSemestre codigo de estudiante
     */
     public void setCodigoSemestre(int codigoSemestre) {
        this.codigoSemestre = codigoSemestre;
    }

    /**
     * Método para consultar o recuperar el identificacion del estudiante
     * @return identificacion
     */
    public String getDescripcionSemestre() {
        return descripcionSemestre;
    }

    /**
     * Método para asignar el identificacion del estudiante
     * @param descripcionSemestre identificacion de estudiante
     */
   public void setDescripcionSemestre(String descripcionSemestre) {
        this.descripcionSemestre = descripcionSemestre;
    }

    /**
     * Método para consultar o recuperar el Datos de Estudiantes
     *
     * @return Estudiante
     */
    public int getGrupoSemestre() {
        return grupoSemestre;
    }

    /**
     * Método para asignar los datos del estudiante
     *
     * @param grupoSemestre Datos de grupo semestre
     */
    public void setGrupoSemestre(int grupoSemestre) {
        this.grupoSemestre = grupoSemestre;
    }

    @Override
    public String toString() {
        return "Semestre{" + 
                " Codigo Semestre=" + codigoSemestre + " \n "
              + " Descripcion Semestre=" + descripcionSemestre + "\n "
              + " Grupo Semestre=" + grupoSemestre + '}';
    }

   
   

}
