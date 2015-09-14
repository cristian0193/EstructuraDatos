package EjercicioListaNodos;

public class Nodo {

    private int codigo;
    private String nombreEstudiante;
    private String identificacion;
    private int semestre;
    private String materias;
    
    public Nodo siguiente;

    public Nodo(){
        codigo = 0;
        nombreEstudiante = "";
        identificacion = "";
        semestre = 0;
        materias = "";
        siguiente = null;
    }
            
    public Nodo(int codigoEstudiante, String nombre, String identificacionEstudiante, int semestre, String materias ){
        this();
        this.codigo = codigoEstudiante;
        this.nombreEstudiante = nombre; 
        this.identificacion = identificacionEstudiante; 
        this.semestre = semestre; 
        this.materias = materias; 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }       
    
}

     
    
