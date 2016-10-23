package Control;

import Modelo.Profesores;
import java.sql.ResultSet;

public class CRUD_Profesores {
    
    //METODO DE INSERTAR PROFESOR
    public static boolean insert_profesor(Profesores profesor) {
        String query = "";
        try {
            query = "INSERT INTO PROFESORES "
                    + "(ID_PROFESOR, "
                    + "NOMBRE_PROFESOR, "
                    + "APELLIDO_PROFESOR) "
                    + "VALUES "
                    + "(" + profesor.getIdProfesor() + " ,'" + profesor.getNombreProfesor() + "', '" + profesor.getApellidoProfesor() + "'); ";
            System.out.println(query);            
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            ConexionMySQL.insert(query);
            ConexionMySQL.cerrar();                       
            return true;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    //METODO DE CONSULTAR PROFESORES
    public static ResultSet Consultar_Profesores(){
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT * "
                + "FROM "
                + "PROFESORES "
                + "ORDER BY ID_PROFESOR ASC";
            
            System.out.println(query);                        
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            resultado = ConexionMySQL.select(query);                        
            System.out.println("CONSULTADO ...");
            return resultado;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CONSULTO...");
            return null;
        }
        
        
    }

    //METODO DE CONSULTAR PROFESORES
    public static ResultSet Consultar_Profesor(){
        String query = "";
        ResultSet resultado;
        try {
            query = "SELECT * "
                + "FROM "
                + "PROFESORES "
                + "ORDER BY ID_PROFESOR ASC";
            
            System.out.println(query);                        
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            resultado = ConexionMySQL.select(query);                        
            System.out.println("CONSULTADO ...");
            return resultado;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CONSULTO...");
            return null;
        }
        
        
    }
    
    
}

