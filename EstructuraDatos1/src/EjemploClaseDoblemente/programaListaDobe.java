package  EjemploClaseDoblemente;

/**
 * Esta clase crea una lista 
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 19Sep2015
 */
public class programaListaDobe {

    public static void main(String[] args) {
      ListaDoble listaDoble = new ListaDoble();
      Nodo  nodoBuscar;
      Estudiante estudianteNodo;
      
      listaDoble.mostrarContenidoLista();                          

      EntradaSalida.escribir("ADICIONAR AL INICIO...");
      listaDoble.addInicio(new Estudiante(2514,1113000001,"John Doe",(byte)1,3));
      listaDoble.addInicio(new Estudiante(39201,1113000002,"Jane Doe",(byte)4,4));
      listaDoble.mostrarContenidoLista();
    
      EntradaSalida.escribir("ADICIONAR AL FINAL...");
      listaDoble.addFinal(new Estudiante(10055,1113000123,"Pedro Pérez",(byte)10,8));
      listaDoble.addFinal(new Estudiante(39201,1113541072,"Karla Kyle",(byte)7,7));
      listaDoble.addFinal(new Estudiante(50201,1114057650,"Peter Páramo",(byte)2,9));
      listaDoble.mostrarContenidoLista();
     
      EntradaSalida.escribir("BUSCAR NODO...");
      nodoBuscar = listaDoble.buscarNodoPosicion(4);
      EntradaSalida.escribir("Nodo buscado = "+nodoBuscar.getEstudiante().toString());

      EntradaSalida.escribir("REMOVER AL INICIO...");
      listaDoble.removeInicio();
      listaDoble.mostrarContenidoLista();
       
      EntradaSalida.escribir("REMOVER AL FINAL...");
      listaDoble.removeFinal();
      listaDoble.mostrarContenidoLista();
     
      //Insertar notas y materias a John Doe 
      EntradaSalida.escribir("ASIGNAR MATERIAS Y NOTAS A JOHN DOE...");
      nodoBuscar = listaDoble.buscarNodoPosicion(1);
      estudianteNodo = nodoBuscar.getEstudiante();
      estudianteNodo.setAsignatura(asignarMaterias(estudianteNodo));
      estudianteNodo.setNota(asignarNotas(estudianteNodo));
      nodoBuscar.setEstudiante(estudianteNodo);
      
      for (int numNota=0;numNota<estudianteNodo.getNota().length;numNota++) {
         EntradaSalida.escribir("La nota de "+estudianteNodo.getAsignatura()[numNota]+
                                " es "+estudianteNodo.getNota()[numNota]);
      }
      
    }
    
    private static String[] asignarMaterias (Estudiante  estudianteMaterias) {
      String[] arregloMaterias = {"Cálculo","Algoritmia","Física"};
      return arregloMaterias;
    }
    
    private static double[] asignarNotas (Estudiante  estudianteNotas) {
      double[] arregloNotas = {0.5,3.8,1.4};
      return arregloNotas;
    }
}
