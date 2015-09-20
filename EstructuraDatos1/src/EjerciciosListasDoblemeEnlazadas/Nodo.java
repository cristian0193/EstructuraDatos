package EjerciciosListasDoblemeEnlazadas;


public class Nodo {

    public Nodo siguiente;
    public Nodo anterior;
    private Estudiantes estudiante;
    private NotasSemestre nota;

    public Nodo(){
        siguiente = null;
        anterior = null;
        estudiante = new Estudiantes();
        nota = new NotasSemestre();
    }
            
    public Nodo(Estudiantes estudiante){
        this();
        this.estudiante = estudiante;       
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }            
  
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }       

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public NotasSemestre getNota() {
        return nota;
    }

    public void setNota(NotasSemestre nota) {
        this.nota = nota;
    }
    
    
}

     
    
