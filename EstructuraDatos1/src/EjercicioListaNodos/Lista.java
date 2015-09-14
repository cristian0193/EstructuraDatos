package EjercicioListaNodos;

/**
 * @author Usuario
 */
public class Lista {
    
    public Nodo cabeza;
    Nodo nodo = new Nodo();
    
    public static void main(String[] args) {
                        
       Funciones fun = new Funciones();
       Lista lista = new Lista();
       Mensajes  mensajes = new Mensajes();
       
       int codigo;
       String nombre;
       String identificacion;
       int semestre;
       String materias;       
              
       int opcion;
        
        do{
            opcion = lista.menu();
            switch( opcion ){
                case 1:
                    
                    codigo = mensajes.leerInt("Ingrese el Codigo :");
                    nombre = mensajes.leerString("Ingrese un Nombre de Estudiante :");
                    identificacion = mensajes.leerString("Ingrese la Identificacion :");
                    semestre = mensajes.leerInt("Ingrese el Semestre :");
                    materias = mensajes.leerString("Ingrese las Materias :");
                                        
                    fun.adicionarNodo(codigo,nombre,identificacion,semestre,materias);
                    break;
                case 2:
                    fun.mostrarLista(fun.cabeza);
                    break;  
                case 3:
                    mensajes.mostrarInformacion("Cantidad de Nodos Ingresados : " + fun.contarNodo() );
                    break;  
                case 0:
                    System.exit(0);
                    break;
                default:
                    mensajes.mostrarError("¡La opción no existe!");                                  
            }
        }while( opcion != 0);
                         
    }
    
    public int menu(){
        Mensajes entrada = new Mensajes();
        String cadena = "M  E  N  U \n"
                + "1) Adicionar nodo \n"
                + "2) Mostrar Lista \n"
                + "3) Contar Nodos \n"
                + "0) Salir. ";
        
        return entrada.leerInt(cadena);                
    }    

}
