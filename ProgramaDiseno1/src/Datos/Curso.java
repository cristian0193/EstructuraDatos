package Datos;

/**
 *
 * @author Christian Rodriguez
 */
public class Curso {
    
    
    private int idCurso;
    private String nombreCurso;
    private int numeroCreditos;
    private String actividadesCurso;
    private Profesor profesor;

    public Curso(int idCurso, String nombreCurso,int numeroCreditos, String actividadesCurso, Profesor profesor) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.numeroCreditos = numeroCreditos;
        this.actividadesCurso = actividadesCurso;
        this.profesor = profesor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getActividadesCurso() {
        return actividadesCurso;
    }

    public void setActividadesCurso(String actividadesCurso) {
        this.actividadesCurso = actividadesCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    
    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", numeroCreditos=" + numeroCreditos + ", actividadesCurso=" + actividadesCurso + ", profesor=" + profesor + '}';
    }
    
}
