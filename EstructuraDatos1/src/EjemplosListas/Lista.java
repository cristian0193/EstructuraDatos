package EjemplosListas;

import javax.swing.JOptionPane;

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
       
       
       int opcion;
        
        do{
            opcion = lista.menu();
            switch( opcion ){
                case 1:
                    fun.adicionarNodo(mensajes.leerInt("Ingrese un numero :"));
                    break;
                case 2:
                    fun.mostrarLista(fun.cabeza);
                    break;                
                default:
                    mensajes.mostrarError("¡La opción no existe!");                                  
            }
        }while( opcion != 0);
                         
    }
    
    public int menu(){
        Mensajes entrada = new Mensajes();
        String cadena = "M  E  N  U\n "
                + "1) Adicionar nodo\n"
                + "2) Mostrar Lista\n"
                + "0) Salir.";
        
        return entrada.leerInt(cadena);                
    }    

}
