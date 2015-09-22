package EjerciciosListasDoblemeEnlazadas;

public class Estudiantes {

    final String noAsignada = "noAsignada";
    final double notaNoAsignada = -100.0;
    
    private int codigoEstudiante;
    private int identificacionEstudiante;
    private String Estudiante;
    private String nombreAsignatura[];
    private double notas[][];
    private double notaSemestre;
    private boolean estadoSemestre;

    public Estudiantes(int codigoEstudiante, int identificacionEstudiante, String Estudiante, int cantidadAsignatura,double notaSemestre, boolean estadoSemestre) {
        this.codigoEstudiante = codigoEstudiante;
        this.identificacionEstudiante = identificacionEstudiante;
        this.Estudiante = Estudiante;
        this.nombreAsignatura = new String[cantidadAsignatura];
        this.notas = new double[3][cantidadAsignatura];                  
        this.notaSemestre = notaSemestre;
        this.estadoSemestre = estadoSemestre;
    }   

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public void setIdentificacionEstudiante(int identificacionEstudiante) {
        this.identificacionEstudiante = identificacionEstudiante;
    }

    public String getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(String Estudiante) {
        this.Estudiante = Estudiante;
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

    // Inicio de arreglo de asignatura    
   private void iniciarAsignatura() {
      for (int contadorAsignatura=0;contadorAsignatura<nombreAsignatura.length;contadorAsignatura++) {
         nombreAsignatura[contadorAsignatura] = noAsignada;
      }
   }
   
   // Inicio de arreglo de notas 
   private void iniciarNota() {
      for (int contadorNotaFilas=0;contadorNotaFilas<notas.length;contadorNotaFilas++) {
         for (int contadorNotaColumnas=0;contadorNotaColumnas<notas.length;contadorNotaColumnas++) {
             notas[contadorNotaFilas][contadorNotaColumnas] = notaNoAsignada;
         }                    
      }
   }
    
}
