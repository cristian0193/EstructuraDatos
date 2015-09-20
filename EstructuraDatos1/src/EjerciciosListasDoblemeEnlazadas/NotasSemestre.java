
package EjerciciosListasDoblemeEnlazadas;

public class NotasSemestre {
    
    private String nombreAsignatura[];
    private double notas[][];
    private double notaSemestre;
    private boolean estadoSemestre;

    public NotasSemestre(){        
        notaSemestre = 0.0;
        estadoSemestre = false;
        
    }
    
    public NotasSemestre(String[] nombreAsignatura, double[][] notas, double notaSemestre, boolean estadoSemestre) {
        this.nombreAsignatura = nombreAsignatura;
        this.notas = notas;
        this.notaSemestre = notaSemestre;
        this.estadoSemestre = estadoSemestre;
    }

    public String[] getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String[] nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double getNotaSemestre() {
        return notaSemestre;
    }

    public void setNotaSemestre(double notaSemestre) {
        this.notaSemestre = notaSemestre;
    }

    public boolean isEstadoSemestre() {
        return estadoSemestre;
    }

    public void setEstadoSemestre(boolean estadoSemestre) {
        this.estadoSemestre = estadoSemestre;
    }
    
    
    
    
    
}
