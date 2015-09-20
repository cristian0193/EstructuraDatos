package EjerciciosListasDoblemeEnlazadas;


public class Nodo {

    private int valorEntero;    
    public Nodo siguiente;
    public Nodo anterior; 
    private Estudiantes estudiante;
    private NotasSemestre nota;

    public Nodo(){
        valorEntero = 0;
        siguiente = null;
        anterior = null;
        estudiante = null;
        nota = null; 
    }
            
    public Nodo(Estudiantes study,NotasSemestre notas){
        this();
        this.estudiante = study;
        this.nota = notas;
        
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }            

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int codigo) {
        this.valorEntero = codigo;
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

     
    
