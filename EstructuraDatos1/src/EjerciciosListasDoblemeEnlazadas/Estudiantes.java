package EjerciciosListasDoblemeEnlazadas;

public class Estudiantes {
   
private int codigoEstudiante;
private int identificacionEstudiante;
private String Estudiante;

    public Estudiantes(){
        codigoEstudiante = 0;
        identificacionEstudiante = 0;
        Estudiante = "";
    }

    public Estudiantes(int codigoEstudiante, int identificacionEstudiante, String Estudiante) {
        this.codigoEstudiante = codigoEstudiante;
        this.identificacionEstudiante = identificacionEstudiante;
        this.Estudiante = Estudiante;
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
    


    
    

}
