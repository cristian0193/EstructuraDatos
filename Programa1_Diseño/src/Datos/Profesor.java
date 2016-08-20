package Datos;

/**
 *
 * @author Christian Rodriguez
 */
public class Profesor {

    private int idProfesor;
    private String nombreProfesor;
    private String apellidoProfesor;

    public Profesor(int idProfesor, String nombreProfesor, String apellidoProfesor) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idProfesor=" + idProfesor + ", nombreProfesor=" + nombreProfesor + ", apellidoProfesor=" + apellidoProfesor + '}';
    }

}
