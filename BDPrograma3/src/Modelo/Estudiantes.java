package Modelo;

public class Estudiantes {

    private Integer idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;    
    private Cursos idCursos;

    public Estudiantes() {
    }

    public Estudiantes(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiantes(Integer idEstudiante, String nombreEstudiante, String apellidoEstudiante, Cursos idCursos) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.idCursos = idCursos;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
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

    public Cursos getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Cursos idCursos) {
        this.idCursos = idCursos;
    }

    @Override
    public String toString() {
        return "Modelo.Estudiantes[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
