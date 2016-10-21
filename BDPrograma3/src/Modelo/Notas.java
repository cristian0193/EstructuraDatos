package Modelo;

public class Notas{

    private Integer idNota;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Profesores idProfesor;
    private Estudiantes idEstudiante;

    public Notas() {
    }

    public Notas(Integer idNota) {
        this.idNota = idNota;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Profesores getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Profesores idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Estudiantes getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiantes idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNota != null ? idNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notas)) {
            return false;
        }
        Notas other = (Notas) object;
        if ((this.idNota == null && other.idNota != null) || (this.idNota != null && !this.idNota.equals(other.idNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Notas[ idNota=" + idNota + " ]";
    }
    
}
