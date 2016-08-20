package Datos;

/**
 *
 * @author Usuario
 */
public class Notas {
    
    private int idNotas;
    private double nota1;
    private double nota2;
    private double nota3;
    private Estudiante estudiante;
    private Curso curso;

    public Notas(int idNotas, double nota1, double nota2, double nota3, Estudiante estudiante, Curso curso) {
        this.idNotas = idNotas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public int getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(int idNotas) {
        this.idNotas = idNotas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Notas{" + "idNotas=" + idNotas + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", estudiante=" + estudiante + ", curso=" + curso + '}';
    }
    
    
    
}
