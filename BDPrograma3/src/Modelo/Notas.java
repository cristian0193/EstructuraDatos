package Modelo;

public class Notas{
  
    private int idNota;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Cursos idCurso;
    private Estudiantes idEstudiante;

    public Notas() {
    }

    public Notas(int idNota) {
        this.idNota = idNota;
    }

    public int getIdNota() {
        return idNota;
    }

      public Notas(int idNota, Double nota1, Double nota2, Double nota3, Estudiantes idEstudiante,Cursos idCurso) {
        this.idNota = idNota;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
    }
    
    public void setIdNota(int idNota) {
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

    public Cursos getIdCursos() {
        return idCurso;
    }

    public void setIdCursos(Cursos idCurso) {
        this.idCurso = idCurso;
    }

    public Estudiantes getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiantes idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Modelo.Notas[ idNota=" + idNota + " ]";
    }
    
}
