package Modelo;

public class Cursos {

    private int idCursos;
    private String nombreCurso;
    private int numeroCreditos;
    private String actividadCursos;
    private Profesores idProfesor;

    public Cursos() {
    }

    public Cursos(int idCursos) {
        this.idCursos = idCursos;
    }

    public Cursos(int idCursos, String nombreCurso, int numeroCreditos, String actividadCursos,Profesores idProfesor) {
        this.idCursos = idCursos;
        this.nombreCurso = nombreCurso;
        this.numeroCreditos = numeroCreditos;
        this.actividadCursos = actividadCursos;
        this.idProfesor = idProfesor;
    }

    public int getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(int idCursos) {
        this.idCursos = idCursos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getActividadCursos() {
        return actividadCursos;
    }

    public void setActividadCursos(String actividadCursos) {
        this.actividadCursos = actividadCursos;
    }

    public Profesores getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Profesores idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "Modelo.Cursos[ idCursos=" + idCursos + " ]";
    }
    
}
