package estructuradatos1;

import javax.swing.JOptionPane;


public class EjerciciosEstructura {
 

public static int cantidadEstudiantes = 0,longitud = 0;
public static String[] vectorNombres;
public static int[] vectorLongitud;
    
public static void main(String[] args) {
    
    cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Estudiantes :"));
    
    vectorNombres = new String[cantidadEstudiantes];
    vectorLongitud = new int[cantidadEstudiantes];
    String cadena = "", mensaje = "";
    
    for (int posicionVector = 0; posicionVector < vectorLongitud.length; posicionVector++) {
        
        vectorNombres[posicionVector]= JOptionPane.showInputDialog("Nombre de Estudiante : " +posicionVector+1);        
        cadena = vectorNombres[posicionVector];        
        vectorLongitud[posicionVector] = cadenaNombre(cadena);
    }
    
    for (int posicionVector2 = 0; posicionVector2 < vectorLongitud.length; posicionVector2++) {
        mensaje += "NOMBRE : "+vectorNombres[posicionVector2]+ " -----    LONGITUD : "+vectorLongitud[posicionVector2]+"\n";
    }
    
    mostrar(mensaje);
    
}    
    

public static int cadenaNombre(String nombre){    
    int longi = nombre.length();  
    return longi;
}
    
public static void mostrar(String mensaje){
     JOptionPane.showMessageDialog(null, mensaje);
}  
    
}
