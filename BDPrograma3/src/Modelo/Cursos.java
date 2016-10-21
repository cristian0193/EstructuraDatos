package Modelo;

public class Cursos {

    private Integer idCursos;
    private String nombreCurso;
    private int numeroCreditos;
    private String actividadCursos;
    private Profesores idProfesor;

    public Cursos() {
    }

    public Cursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public Cursos(Integer idCursos, String nombreCurso, int numeroCreditos, String actividadCursos) {
        this.idCursos = idCursos;
        this.nombreCurso = nombreCurso;
        this.numeroCreditos = numeroCreditos;
        this.actividadCursos = actividadCursos;
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Integer idCursos) {
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
    public int hashCode() {
        int hash = 0;
        hash += (idCursos != null ? idCursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idCursos == null && other.idCursos != null) || (this.idCursos != null && !this.idCursos.equals(other.idCursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Cursos[ idCursos=" + idCursos + " ]";
    }
    
}
