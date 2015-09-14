package EjercicioListaNodos;
/**
 * @author Usuario
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo cabeza;
    private int contador = 0;

    public Funciones adicionarNodo(int codigoEstudiante, String nombre, String identificacionEstudiante, int semestre, String materias) {
        Nodo nodo;

        nodo = new Nodo(codigoEstudiante,nombre,identificacionEstudiante,semestre,materias);

        if (cabeza == null) {
            cabeza = nodo;
            contador++;
        } else {
            nodo.siguiente = cabeza;
            cabeza = nodo;
            contador++;
        }
        return this;
    }

    public void mostrarLista(Nodo nodo) {
        int contador = 0;
        String datos;

        if (nodo != null) 
            {
                contador++;
                datos = "Codigo : " + nodo.getCodigo()+ "\n" +
                        "Nombre Estidiante : " + nodo.getNombreEstudiante()+ "\n" +
                        "identificacion : " + nodo.getIdentificacion()+ "\n" +
                        "Semestre : " + nodo.getSemestre()+ "\n" +
                        "Materias : " + nodo.getMaterias()+ "\n" ;                
                        mensajes.mostrarInformacion(datos);
                mostrarLista(nodo.getSiguiente());
            }        
    }

    public int contarNodo() {               
        return contador;        
    }
    
}
