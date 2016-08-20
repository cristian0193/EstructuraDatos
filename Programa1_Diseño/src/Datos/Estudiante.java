package Datos;

/**
 *
 * @author Christian Rodriguez
 */
public class Estudiante {
 
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Curso curso;

    public Estudiante(int idEstudiante, String nombreEstudiante, String apellidoEstudiante, Curso curso) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.curso = curso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + ", curso=" + curso + '}';
    }
    
    
}
