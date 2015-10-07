package PilasColas;


public class Estudiantes {

    /**
     * Esta clase representa el nodo definida
     *
     * @author Christian A. Rodriguez
     * @version 1.0
     * @since 24Sep2015
     */
    
    private int identificacionEstudiante;
    private String nombreEstudiante;
    public int EstadoEspecial;

   

    /**
     * Constructor del Estudiantes
     * @param identificacionEstudiante
     * @param nombreEstudiante
     * @param EstadoEspecial
     */
     public Estudiantes(int identificacionEstudiante, String nombreEstudiante,int EstadoEspecial) {
        this.identificacionEstudiante = identificacionEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.EstadoEspecial = EstadoEspecial;
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
     public String getNombreEstudiante() {
        return nombreEstudiante;
    }
       
    /**
     * Método para asignar los datos del estudiante
     * @param nombreEstudiante  Datos de estudiante
     */
     public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEstadoEspecial() {
        return EstadoEspecial;
    }

    public void setEstadoEspecial(int EstadoEspecial) {
        this.EstadoEspecial = EstadoEspecial;
    }
         
          
     
    @Override
   public String toString() {
      return "Estudiante{\n" +
             "             idEst = " + identificacionEstudiante + "\n" +
             "             nombreEst = " + nombreEstudiante + "\n" +
             "}";
   }

}
