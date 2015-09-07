package Corte_1;

/**
 * Este programa permite resolver el ejercicio 4, en el cual se asignan salones 
 * @author Bertulfo A. Prado Urrego
 * @version 1.0
 * @since 28Ago2015
 */
public class AsignacionSalones{

   //Se definen constantes para manejar el tamaño del arreglo. Facilmente se puede
   //modificar para realizar lectura de cada una de ellas
   
   static final int numeroTorres = 5;
   static final int pisoPorTorre = 6;
   static final int numeroSalonesPorPiso = 10;
   //Se supone que solo hay clases de 07:00 a 21:00, lo cual da un total
   //de 15 horas por día
   static final int horasPorDia = 15;
   
   static final int maximaOpcionMenu = 3;
   
   
   /*
   Valores de prueba 1
   static final int numeroTorres = 1;
   static final int pisoPorTorre = 1;
   static final int numeroSalonesPorPiso = 1;
   static final int horasPorDia = 1;
   static final int maximaOpcionMenu = 3;
   */
   
   /*
   Valores de prueba 2
   static final int numeroTorres = 2;
   static final int pisoPorTorre = 2;
   static final int numeroSalonesPorPiso = 3;
   static final int horasPorDia = 2;
   static final int maximaOpcionMenu = 3;
   */

	public static void main(String[] args) {
	   String salonClase[][][][] = new String[numeroTorres][pisoPorTorre][numeroSalonesPorPiso][horasPorDia];  
	   boolean llenoSalon = false;
	   int opcionMenu;
	   String menu = "Seleccione una opción\n\n"+
	                 "1.- Asignar salones al curso\n"+
	                 "2.- Consultar salón\n"+
	                 "3.- Salir\n\n";
	   do {
	      opcionMenu=leerOpcionMenu(menu,maximaOpcionMenu);
	      
	      switch (opcionMenu){
	         case 1:
	            if (llenoSalon) {
	               EntradaSalida.escribir("Los salones ya fueron asignados");
	               break;
	            }
	            llenoSalon = llenarSalones(numeroTorres,pisoPorTorre,
	                                       numeroSalonesPorPiso,horasPorDia,
	                                       salonClase);
	            break;
	         case 2:
	            mostrarAsignaturaSalon(numeroTorres,pisoPorTorre,
	                                   numeroSalonesPorPiso,horasPorDia,
	                                   salonClase);
	            break;
	         default: 
	            EntradaSalida.escribir("Finalizando programa...");
	      }
	
	   } while (opcionMenu != 3);
   }
 
	/**
    * Método que permite consultar la asignatura de una salón, para ello se debe
    * ingresar número de torre, número de piso, número de salón y hora del día
    * @param  numeroTorresMostrar          Número máximo de torres
    * @param  pisoPorTorreMostrar          Número máximo de pisos por cada torre
    * @param  numeroSalonesPorPisoMostrar  Número máximo de salones en cada piso
    * @param  horasPorDiaMostrar           Número máximo de horas del día 
    * @param  horasPorDiaMostrar           Arreglo en el cual se almacenaron las asignaturas
    * @return                              No retorna valores)
    */       
   private static void mostrarAsignaturaSalon (int numeroTorresMostrar,
                                               int pisoPorTorreMostrar,
                                               int numeroSalonesPorPisoMostrar,
                                               int horasPorDiaMostrar,
                                               String[][][][] salonClaseMostrar) {
      int torre,piso,salon,hora;
      String asignaturaAsignada;
      
      torre= leerParametroSalon("la TORRE",1,numeroTorresMostrar,"");
      piso = leerParametroSalon("el PISO",1,pisoPorTorreMostrar,"");
      salon= leerParametroSalon("el SALÓN",1,numeroSalonesPorPisoMostrar,"");
      hora = leerParametroSalon("la HORA",7,horasPorDiaMostrar+7-1," horas");

      asignaturaAsignada = salonClaseMostrar[torre-1][piso-1][salon-1][hora-7];

      if (asignaturaAsignada==null) {
         EntradaSalida.escribir("No hay asignatura o curso asignado en la "+
                     "torre "+torre+", salón "+salon+", piso "+piso+" a las "+
                     hora+":00 horas"); 
      }
      else {
         EntradaSalida.escribir(asignaturaAsignada.toUpperCase()+
                     " es la asignatura dictada en "+" la torre "+torre+
                     ", salón "+salon+", piso "+piso+" a las "+hora+":00 horas");   
      }                                      
   } //Finaliza método mostrarAsignaturaSalon
   
	/**
    * Método 
    * @param  mensaje      Descripción del tipo de parámetro que se está solicitando
    * @param  valorMinimo  Número mínimo del parámetro
    * @param  ValorMaximo  Número máximo del parámetro
    * @param  finMensaje   Mensaje que se coloca al finalizar la solicitud de ingreso del parámetro
    * @return int          Valor del parámetro ingresado
    */     
   private static int leerParametroSalon(String mensaje, int valorMinimo, 
                                         int ValorMaximo, String finMensaje ){
      int parametroSalon;
      String mensajeSalon = "Ingrese el valor para "+mensaje+", debe ser un entero "+
                            "entre "+valorMinimo+" y "+ValorMaximo+finMensaje+"\n\n";
		parametroSalon = EntradaSalida.leerEntero(mensajeSalon);
	
		//Valida que sea un entero entre los valores mínimo y máximo del parámetro
		while (parametroSalon < valorMinimo || parametroSalon > ValorMaximo) {
			parametroSalon = EntradaSalida.leerEntero(mensajeSalon);
		}
		return parametroSalon;
   } //Finaliza método leerParametroSalon
    
	/**
    * Método que permite asignar a los salones el curso o asignatura
    *    Facilmente se puede ajustar el programa para realizar ingresos parciales,
    *    es decir, llenar una torre o varias, parar el ingreso y continuar luego
    * @param  numeroTorresLlenar          Número máximo de torres
    * @param  pisoPorTorreLlenar          Número máximo de pisos por cada torre
    * @param  numeroSalonesPorPisoLlenar  Número máximo de salones en cada piso
    * @param  horasPorDiaLlenar           Número máximo de horas del día 
    * @param  salonClaseLlenar            Arreglo en el cual se almacenan las asignaturas ingresadas
    * @return boolean                     VERDADERO si la matriz se diligencia (o asigna)
    */   
   private static boolean llenarSalones (int numeroTorresLlenar,
                                         int pisoPorTorreLlenar,
                                         int numeroSalonesPorPisoLlenar,
                                         int horasPorDiaLlenar,
                                         String[][][][] salonClaseLlenar) {
      //boolean salonAsignado = false;
      
      for (int cantTorre=0;cantTorre<numeroTorresLlenar;cantTorre++) {
         for (int pisoTorre=0;pisoTorre<pisoPorTorreLlenar;pisoTorre++) {
            for (int salonPiso=0;salonPiso<numeroSalonesPorPisoLlenar;salonPiso++) {
               for (int horaDia=0;horaDia<horasPorDiaLlenar;horaDia++) {
                  salonClaseLlenar[cantTorre][pisoTorre][salonPiso][horaDia]=
                     EntradaSalida.leerCadena("Ingresar asignatura para: \n"+
                                              "   Torre "+(cantTorre+1)+"\n"+
                                              "   Piso  "+(pisoTorre+1)+"\n"+
                                              "   Salón "+(salonPiso+1)+"\n"+
                                              "   Hora  "+(horaDia+7)+"\n\n");
               }
            }
         }
      }
      //salonAsignado = true;
      //return salonAsignado;
      return true;                       
   } //Finaliza método llenarSalones
     
	/**
    * Método que muestra el menú y lee (por teclado) la opcion que el usuario
    * desea ejecutar
    * @param  opcionMenuLeer          Descripción del menú a mostrar en pantalla
    * @param  maximaOpcionMenuLeer    Número máximo de opciones qe tiene el menú
    * @return int                     Opción (del menú) seleccionada por el usuario
    */   
   private static int leerOpcionMenu(String opcionMenuLeer, 
                                     int maximaOpcionMenuLeer) {
      int opcionDelMenu;
		opcionDelMenu = EntradaSalida.leerEntero(opcionMenuLeer);
	
		//Valida que sea un entero entre 1 y el máximo de opciones
		while (opcionDelMenu < 1 || opcionDelMenu > maximaOpcionMenuLeer) {
			opcionDelMenu = EntradaSalida.leerEntero(opcionMenuLeer+"\nDebe ingresar" +
			                                         " un número entre 1 y "+
			                                         maximaOpcionMenu+ "\n\n");
		}
		return opcionDelMenu;
   } // Finaliza método leerOpcionMenu
}


 
